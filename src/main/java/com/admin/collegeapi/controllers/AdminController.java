package com.admin.collegeapi.controllers;


import com.admin.collegeapi.db.entity.*;
import com.admin.collegeapi.db.repository.DepartmentRepository;
import com.admin.collegeapi.db.repository.MarkRepository;
import com.admin.collegeapi.db.repository.RolesRepository;
import com.admin.collegeapi.db.repository.UserRepository;
import com.admin.collegeapi.domain.Department;
import com.admin.collegeapi.domain.Mark;
import com.admin.collegeapi.domain.Role;
import com.admin.collegeapi.domain.response.DepartmentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/admin")
//@Secured("ROLE_ADMIN")
public class AdminController {

    private final UserRepository userRepository;
    private final RolesRepository rolesRepository;
    private final MarkRepository markRepository;
    private final DepartmentRepository departmentRepository;

    @Autowired
    public AdminController(UserRepository userRepository, RolesRepository rolesRepository, MarkRepository markRepository, DepartmentRepository departmentRepository) {
        this.userRepository = userRepository;
        this.rolesRepository = rolesRepository;
        this.markRepository = markRepository;
        this.departmentRepository = departmentRepository;
    }

//    @PostMapping("/login")
//    public UserEntity login() {
//        return new UserEntity();
//    }
//
//    @PostMapping("/signup")
//    public ResponseEntity signup(@RequestBody @Valid User user){
//
//        UserEntity userEntity = new UserEntity();
//
//        userEntity.setEmail(user.getEmail());
//        userEntity.setUserName(user.getName());
//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        userEntity.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        userEntity.setRole(rolesRepository.findByRoleName(user.getRole().name()));
//
//        return ResponseEntity.ok(userRepository.save(userEntity).getUserId());
//    }

    @PostMapping("/roles")
    public RoleEntity createRole(@RequestBody @Valid Role role) {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleName(role.getRoleName());
        roleEntity.setRoleDescription(role.getRoleDescription());
        return rolesRepository.save(roleEntity);
    }

    @GetMapping("/users")
    @Secured("ROLE_STUDENT")
    public List<String> users(){

        return userRepository.findAll().stream().map(UserEntity::getUserName).collect(Collectors.toList());
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/users/{userId}")
    public UserEntity users(@PathVariable Integer userId){

        return userRepository.findById(userId).orElse(null);
    }

    @GetMapping("/users/email/{name}")
    public UserEntity users(@PathVariable String name){

        return userRepository.findByUserName(name);
    }
//    @GetMapping("/users/role")
//    public UserEntity Users(@PathVariable String role )
//    {
//        UserEntity byUserRole = userRepository.findByUserRole(role);
//        return byUserRole;
//    }



    @GetMapping("/users/role/{roleName}")
    public List<String> getUsernamesByRoleName(@PathVariable String roleName ) {


        return userRepository.findByRole(rolesRepository
                .findByRoleName(roleName).get())
                .stream()
                .map(userEntity -> userEntity.getUserName())
                .collect(Collectors.toList());
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

    /**
     * 1. Get Marks => post marks
     * 2. Get Marks by semester
     * 3. Get Marks by year
     * 4. Get Internal Marks
     * 5. Get fees => post fees
     * 6. by year, by semester
     * 7. get fees paid
     * 8. get fees to pay
     * 9. get profile
     * 10. edit profile => put profile
      */


    @PostMapping("/users/marks")
    public MarkEntity createStudentMarks(@RequestBody @Valid Mark mark)
    {
        MarkEntity markEntity= new MarkEntity();
        markEntity.setStudentId(mark.getStudentId());
        markEntity.setSubjectCode(mark.getSubjectCode());
        markEntity.setMarksObtained(mark.getMarksObtained());
        markEntity.setMarksTotal(mark.getMarksTotal());
        markEntity.setExamType(mark.getExamType());
        markEntity.setYear(mark.getYear());
        markEntity.setSemester(mark.getSemester());


        return markRepository.save(markEntity);

    }

    @PostMapping("/users/department")
    public DepartmentResponse createDepartment(@RequestBody @Valid Department department)

   {
       DepartmentEntity departmentEntity = new DepartmentEntity();
       departmentEntity.setDepartmentCode(department.getDepartmentCode());
       departmentEntity.setDepartmentName(department.getDepartmentName());



       DepartmentEntity departmentEntity1 =  departmentRepository.save(departmentEntity);

       DepartmentResponse response = new DepartmentResponse();
       response.setDeptCode(departmentEntity1.getDepartmentCode());
       response.setDeptName(departmentEntity1.getDepartmentName());

       return response;

       // return departmentRepository.save(departmentEntity);

   }

 /*  @PostMapping("/users/fees")
    public FeesMatrixEntity createFeesMatrix(@RequestBody @Valid FeesMatrix feesMatrix){


   }
*/


}

