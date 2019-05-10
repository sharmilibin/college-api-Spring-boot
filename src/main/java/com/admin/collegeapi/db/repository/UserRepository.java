package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;



// actual connection to database
// and actual execution of queries will happen
// here
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUserName(String username);

}