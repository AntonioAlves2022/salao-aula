package com.antonio.salao.repositories;

import com.antonio.salao.domain.entities.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProfissionaRepository extends JpaRepository<Profissional, Long> {
    boolean existsByEmail(String email);
}
