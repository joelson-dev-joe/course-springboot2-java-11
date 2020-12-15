package com.joemarvi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joemarvi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
