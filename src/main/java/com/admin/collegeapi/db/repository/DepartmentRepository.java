package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Integer> {

    DepartmentEntity findByDepartmentCode(String departmentCode);

}
