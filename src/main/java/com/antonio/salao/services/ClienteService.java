package com.antonio.salao.services;

import com.antonio.salao.domain.dto.ClienteRequestDTO;
import com.antonio.salao.domain.dto.ClienteResponseDTO;
import com.antonio.salao.domain.entities.Cliente;
import com.antonio.salao.exceptions.RecursoNaoEncontradoException;
import com.antonio.salao.exceptions.RegraNegocioException;
import com.antonio.salao.repositories.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteResponseDTO salvar(ClienteRequestDTO dto) throws RegraNegocioException {
        // Validação do E-mail
        if(repository.existsByEmail(dto.email())){
            throw new RegraNegocioException("E-mail já cadastrado");
        }

        if(repository.existsByTelefone(dto.telefone())){
            throw new RegraNegocioException("Telefone já cadastrado");
        }

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

    //listar
    public List<ClienteResponseDTO> listar(){
        return repository.findAll().stream().map(
                cliente -> new ClienteResponseDTO(
                        cliente.getId(),
                        cliente.getNome(),
                        cliente.getTelefone(),
                        cliente.getEmail())
                ).toList();

    }

    // Buscar por Id
    public ClienteResponseDTO buscarPorId(Long id){
        Cliente cliente = repository
                .findById(id)
                .orElseThrow(()-> new RecursoNaoEncontradoException("Cliente não encontrado"));
    }
}
