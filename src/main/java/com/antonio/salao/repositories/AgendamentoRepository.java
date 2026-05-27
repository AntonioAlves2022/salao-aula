package com.antonio.salao.repositories;



import com.antonio.salao.domain.entities.Agendamento;
import com.antonio.salao.domain.entities.Profissional;
import com.antonio.salao.domain.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDateTime;
import java.util.List;


public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    boolean existsByProfissionalAndAgendamento(
            Profissional profissional,
            Agendamento agendamento
    );

    List<Agendamento> findByStatus(Status status);

    List<Agendamento> findDataAgendamentoBetween(
            LocalDateTime dataInicial,
            LocalDateTime dataFinal

    );


}
