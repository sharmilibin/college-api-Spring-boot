package com.admin.collegeapi.controllers;


import com.admin.collegeapi.db.entity.UserEntity;
import com.admin.collegeapi.db.repository.UserRepository;
import com.admin.collegeapi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class AdminController {

    private final UserRepository userRepository;

    @Autowired
    public AdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/signup")
    public UserEntity signup(@RequestBody @Valid User user){

        UserEntity userEntity = new UserEntity();

        userEntity.setEmail(user.getEmail());
        userEntity.setDateOfBirth(user.getDob());
        userEntity.setDepartment(user.getDepartment().name());
        userEntity.setRole(user.getUserType().name());
        userEntity.setUserName(user.getName());


        return userRepository.save(userEntity);
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

