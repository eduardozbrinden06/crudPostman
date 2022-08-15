package com.example.persona.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.persona.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {



}
