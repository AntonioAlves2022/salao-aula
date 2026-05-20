package com.antonio.salao.domain.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record AgendamentoRequestDTO(
        @NotNull
        Long idCliente,

        @NotNull
        Long idProfissional,

        @NotNull
        Long idServico,

        @NotNull
        @Future
        LocalDateTime dataAgendamento
) {
}
