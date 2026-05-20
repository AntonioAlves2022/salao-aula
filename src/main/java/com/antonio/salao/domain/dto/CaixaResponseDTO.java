package com.antonio.salao.domain.dto;

import com.antonio.salao.domain.enums.TipoMovimento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CaixaResponseDTO(
        Long id,
        LocalDateTime dataMovimento,
        BigDecimal valor,
        String descricao,
        TipoMovimento tipoMovimento
) {
}
