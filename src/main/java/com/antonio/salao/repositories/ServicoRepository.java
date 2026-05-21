package com.antonio.salao.repositories;


import com.antonio.salao.domain.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ServicoRepository extends JpaRepository<Servico, Long> {
    boolean existsByNome(String nome);

}
