package com.antonio.salao.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ClienteRequestDTO(
        @NotBlank(message = "Nome é obrigatório")
        @Size(min=3, max = 50)
        String nome,

        @NotBlank(message = "Telefone é obrigatório")
        @Size(min = 11, max = 11)
        String telefone,

        @NotBlank(message = "E-mail obrigatório")
        @Email
        String email,

        @NotBlank(message = "Senha é obrigatória")
        @Size(min=8, max=32)
        String senha
) {
}
