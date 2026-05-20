package com.antonio.salao.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, unique = true, length = 11)
    private String telefone;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, length = 24)
    private String senha;

}
