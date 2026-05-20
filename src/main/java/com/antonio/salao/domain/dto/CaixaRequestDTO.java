package com.antonio.salao.domain.dto;

import com.antonio.salao.domain.enums.TipoMovimento;

import java.math.BigDecimal;

public record CaixaRequestDTO(
        BigDecimal valor,
        String descricao,
        TipoMovimento tipoMovimento
) {
}
