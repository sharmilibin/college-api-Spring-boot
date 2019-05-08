package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.FeesPaidEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeesPaidRepository extends JpaRepository<FeesPaidEntity,Integer> {
}
