package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.RolePermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionRepository extends JpaRepository<RolePermissionEntity,Integer> {
}
