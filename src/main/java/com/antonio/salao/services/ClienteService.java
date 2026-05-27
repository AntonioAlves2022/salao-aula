package com.antonio.salao.services;

import com.antonio.salao.domain.dto.ClienteRequestDTO;
import com.antonio.salao.domain.dto.ClienteResponseDTO;
import com.antonio.salao.domain.entities.Cliente;
import com.antonio.salao.repositories.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteResponseDTO salvar(ClienteRequestDTO dto){
        Cliente cliente = Cliente.builder()
                .nome(dto.nome())
                .telefone(dto.telefone())
                .email(dto.email())
                .senha(dto.senha())
                .build();
        repository.save(cliente);

        return new ClienteResponseDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getEmail()
        );
    }
}
