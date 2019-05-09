package com.admin.collegeapi.controllers;


import com.admin.collegeapi.db.entity.RoleEntity;
import com.admin.collegeapi.db.entity.UserEntity;
import com.admin.collegeapi.db.repository.RolesRepository;
import com.admin.collegeapi.db.repository.UserRepository;
import com.admin.collegeapi.domain.Role;
import com.admin.collegeapi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class AdminController {

    private final UserRepository userRepository;
    private final RolesRepository rolesRepository;

    @Autowired
    public AdminController(UserRepository userRepository, RolesRepository rolesRepository) {
        this.userRepository = userRepository;
        this.rolesRepository = rolesRepository;
    }

    @PostMapping("/login")
    public UserEntity login() {
        return new UserEntity();
    }

    @PostMapping("/signup")
    public UserEntity signup(@RequestBody @Valid User user){

        UserEntity userEntity = new UserEntity();

        userEntity.setEmail(user.getEmail());
        userEntity.setUserName(user.getName());
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        userEntity.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userEntity.setRole(rolesRepository.findByRoleName(user.getRole().name()));

        return userRepository.save(userEntity);
    }

    @PostMapping("/roles")
    public RoleEntity createRole(@RequestBody @Valid Role role) {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleName(role.getRoleName());
        roleEntity.setRoleDescription(role.getRoleDescription());
        return rolesRepository.save(roleEntity);
    }

    @GetMapping("/users")
    public List<UserEntity> users(){

        return userRepository.findAll();
    }

    @GetMapping("/users/{userId}")
    public UserEntity users(@PathVariable Integer userId){

        return userRepository.findById(userId).orElse(null);
    }

    @GetMapping("/users/email/{email}")
    public UserEntity users(@PathVariable String email){

        return userRepository.findByEmail(email);
    }


    /**
     * Create new controller name - StudentController
     * create new table - student (first_name, last_name, about, email )
     * create new entity class called StudentEntity - UserEntity
     * create new domain class called Student - User
     * create new repository class called StudentRepository - UserRepository
     * In StudentController create 1 post path for register - save the student in database
     * 2. get path - find all students and return back
     *
     */


}

