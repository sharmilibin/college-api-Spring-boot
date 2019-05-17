package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.RoleEntity;
import com.admin.collegeapi.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


// actual connection to database
// and actual execution of queries will happen
// here
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUserId(Integer userId);

    UserEntity findByUserName(String username);
    // UserEntity findByUserRole(String role);
    Boolean existsByUserName(String username);


    Boolean existsByEmail(String email);


    List<UserEntity> findByRole(RoleEntity role);

}