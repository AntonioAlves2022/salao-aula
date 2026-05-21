package com.antonio.salao.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginRequestDTO(
        @NotBlank(message = "Preencha o e-mail")
        @Email(message = "E-mail inválido")
        String email,
        @NotBlank(message = "Informe a senha")
        String senha
) {
}
