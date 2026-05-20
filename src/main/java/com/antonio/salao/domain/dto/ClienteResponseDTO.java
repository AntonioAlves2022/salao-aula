package com.antonio.salao.domain.dto;

public record ClienteResponseDTO(
        Long id,
        String nome,
        String telefone,
        String email
) {
}
