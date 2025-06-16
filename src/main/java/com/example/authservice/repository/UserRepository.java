package com.example.authservice.repository;

import com.example.authservice.dto.LogOutRequest;
import com.example.authservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public boolean existsByEmail(String email);

    public Optional<User> findByEmail(String email);

    public Optional<User> findById(Long id);
}
