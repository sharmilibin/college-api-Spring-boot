package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<RoleEntity,Integer> {
}
