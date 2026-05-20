package com.antonio.salao.domain.entities;

import com.antonio.salao.domain.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_agendamentos")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Profissional profissional;

    @ManyToOne
    private Servico servico;

    private LocalDateTime dataAgendamento;

    @Enumerated(EnumType.STRING)
    private Status statusAgendamento;

}
