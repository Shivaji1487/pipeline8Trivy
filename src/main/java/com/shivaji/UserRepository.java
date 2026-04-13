package com.shivaji.repository;

import com.shivaji.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // This allows us to find a user by their username for the login logic
    User findByUsername(String username);
}