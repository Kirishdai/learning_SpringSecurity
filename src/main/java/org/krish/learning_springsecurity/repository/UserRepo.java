package org.krish.learning_springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.krish.learning_springsecurity.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
