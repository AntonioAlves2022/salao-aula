package com.antonio.salao.domain.dto;

import java.math.BigDecimal;

public record ServicoRequestDTO(
        String nome,
        BigDecimal preco,
        Integer duracao
) {
}
