package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository<RoleEntity,Integer> {

    Optional<RoleEntity> findByRoleName(String roleName);
}
