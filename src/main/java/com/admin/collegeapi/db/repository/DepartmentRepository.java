package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.DeparmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DeparmentEntity,Integer> {
}
