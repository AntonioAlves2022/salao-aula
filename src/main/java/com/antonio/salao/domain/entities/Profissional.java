package com.antonio.salao.domain.entities;

import com.antonio.salao.domain.enums.Especialidade;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_profissionais")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profissional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
}
