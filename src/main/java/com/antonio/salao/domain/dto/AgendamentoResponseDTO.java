package com.antonio.salao.domain.dto;

import com.antonio.salao.domain.enums.Status;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record AgendamentoResponseDTO(
        Long id,
        Long idCliente,
        Long idProfissional,
        Long idServico,
        LocalDateTime dataAgendamento,
        Status status
) {
}
