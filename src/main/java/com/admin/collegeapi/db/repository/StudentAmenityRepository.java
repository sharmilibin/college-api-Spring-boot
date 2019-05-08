package com.admin.collegeapi.db.repository;

import com.admin.collegeapi.db.entity.StudentAmenities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAmenityRepository extends JpaRepository<StudentAmenities,Integer> {
}
