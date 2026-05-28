package com.antonio.salao.repositories;

import com.antonio.salao.domain.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findById(Long id);
    boolean existsByEmail(String email);
    boolean existsByTelefone(String telefone);
}
