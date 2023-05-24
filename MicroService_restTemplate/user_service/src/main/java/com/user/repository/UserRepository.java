package com.user.repository;

import com.user.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
}
