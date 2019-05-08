package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.MarkEntity;
import com.admin.collegeapi.db.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarkRepository extends JpaRepository<MarkEntity,Integer> {
    MarkEntity findByStudentId(Integer studentId);

}
