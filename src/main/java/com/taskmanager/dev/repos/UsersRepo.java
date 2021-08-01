package com.taskmanager.dev.repos;

import com.taskmanager.dev.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
