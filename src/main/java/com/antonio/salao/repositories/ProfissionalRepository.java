package com.antonio.salao.repositories;

import com.antonio.salao.domain.entities.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
    boolean existsByEmail(String email);
    Optional<Profissional> findByNome(String nome);
    Optional<Profissional> findById(Long id);
}
