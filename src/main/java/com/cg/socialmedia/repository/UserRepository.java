package com.cg.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.socialmedia.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Custom query
    User findByUsername(String username);
}