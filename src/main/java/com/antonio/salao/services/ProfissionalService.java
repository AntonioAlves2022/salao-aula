package com.antonio.salao.services;

import com.antonio.salao.domain.dto.ProfissionalRequestDTO;
import com.antonio.salao.domain.dto.ProfissionalResponseDTO;
import com.antonio.salao.domain.entities.Profissional;
import com.antonio.salao.exceptions.RecursoNaoEncontradoException;
import com.antonio.salao.repositories.ProfissionalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfissionalService {
    private final ProfissionalRepository repository;

    public ProfissionalResponseDTO salvar(ProfissionalRequestDTO dto){
        Profissional prof = Profissional.builder()
                .nome(dto.nome())
                .email(dto.email())
                .especialidade(dto.especialidade())
                .build();
        repository.save(prof);

        return new ProfissionalResponseDTO(
                prof.getId(),
                prof.getNome(),
                prof.getEmail(),
                prof.getEspecialidade()
        );
    }

    public List<ProfissionalResponseDTO> listar(){
        return repository.findAll()
                .stream()
                .map(
                        pro -> new ProfissionalResponseDTO(
                                pro.getId(),
                                pro.getNome(),
                                pro.getEmail(),
                                pro.getEspecialidade()
                        )
                ).toList();
    }

    public ProfissionalResponseDTO buscarPorId(Long id){
        Profissional pro =  repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Profissional não encontrado")
                );
        return new ProfissionalResponseDTO(
                pro.getId(),
                pro.getNome(),
                pro.getEmail(),
                pro.getEspecialidade()
        );
    }
// Implementem a busca por nome
    public ProfissionalResponseDTO buscarPorNome(String nome){
        Profissional pro = repository.findByNome(nome)
                .orElseThrow(()-> new RecursoNaoEncontradoException("Não existe um profissional com este nome!"));

        return new ProfissionalResponseDTO(
                pro.getId(),
                pro.getNome(),
                pro.getEmail(),
                pro.getEspecialidade()
        );
    }
}
