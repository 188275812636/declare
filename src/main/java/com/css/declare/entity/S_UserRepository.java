package com.css.declare.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface S_UserRepository extends JpaRepository<S_User, String> {
    @Query("SELECT u FROM S_User AS u WHERE u.sjhm = :sjhm AND u.pwd = :pwd AND u.yxbz='Y'")
    S_User findBySjhmAndAndPwd(@Param("sjhm") String sjhm,@Param("pwd") String pwd);
}
