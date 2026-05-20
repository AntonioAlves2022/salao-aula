package com.antonio.salao.domain.dto;

import java.math.BigDecimal;

public record ServicoResponseDTO(
        Long id,
        String nome,
        BigDecimal preco,
        Integer duracao
) {
}
