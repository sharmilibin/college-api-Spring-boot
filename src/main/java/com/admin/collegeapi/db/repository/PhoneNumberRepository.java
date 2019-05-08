package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.PhoneNumberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumberEntity,Integer> {
}
