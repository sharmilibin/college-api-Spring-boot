package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  StudentRepository extends JpaRepository<StudentEntity,Integer> {

}
