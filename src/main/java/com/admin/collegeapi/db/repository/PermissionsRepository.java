package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionsRepository extends JpaRepository<PermissionEntity,Integer> {
}
