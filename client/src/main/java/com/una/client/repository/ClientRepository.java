package com.una.client.repository;

import com.una.client.dto.ClientDto;
import com.una.client.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
