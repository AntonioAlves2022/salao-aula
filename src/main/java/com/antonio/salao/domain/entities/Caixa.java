package com.antonio.salao.domain.entities;

import com.antonio.salao.domain.enums.TipoMovimento;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity()
@Table(name = "tbl_caixa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Caixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataMovimento;
    @Enumerated(EnumType.STRING)
    private TipoMovimento movimento;

    private BigDecimal valor;

    private String descricao;

    @ManyToOne
    private Agendamento agendamento;
}
