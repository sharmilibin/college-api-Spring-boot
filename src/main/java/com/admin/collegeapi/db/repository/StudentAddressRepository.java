package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.StudentAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAddressRepository extends JpaRepository<StudentAddressEntity,Integer> {
}
