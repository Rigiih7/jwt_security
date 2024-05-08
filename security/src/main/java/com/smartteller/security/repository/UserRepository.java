package com.smartteller.security.repository;

import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(int id);
}
