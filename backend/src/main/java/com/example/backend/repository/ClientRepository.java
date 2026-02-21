package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}