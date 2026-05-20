package com.antonio.salao.domain.dto;

import com.antonio.salao.domain.enums.Especialidade;

public record ProfissionalResponseDTO(
        Long id,
        String nome,
        String email,
        Especialidade especialidade
) {
}
