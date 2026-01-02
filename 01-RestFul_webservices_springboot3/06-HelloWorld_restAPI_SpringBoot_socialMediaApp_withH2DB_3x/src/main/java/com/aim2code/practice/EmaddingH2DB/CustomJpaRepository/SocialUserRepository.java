package com.aim2code.practice.EmaddingH2DB.CustomJpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aim2code.practice.EmaddingH2DB.Entity.Social_User;

public interface SocialUserRepository extends JpaRepository<Social_User, Integer> {

}
