package com.css.declare.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<S_User, String> {
    @Query("SELECT u FROM UserEntity AS u WHERE u.username = :username")
    S_User findByUsername(@Param("username") String username);
}
