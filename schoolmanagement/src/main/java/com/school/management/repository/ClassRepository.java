package com.school.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.management.model.ClassModel;

public interface ClassRepository extends JpaRepository<ClassModel, Integer> {

}
