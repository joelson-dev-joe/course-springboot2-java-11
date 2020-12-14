package com.joemarvi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joemarvi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
