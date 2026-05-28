package com.antonio.salao.controllers;

import com.antonio.salao.domain.dto.ClienteRequestDTO;
import com.antonio.salao.domain.dto.ClienteResponseDTO;
import com.antonio.salao.exceptions.RegraNegocioException;
import com.antonio.salao.services.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService service;
    @PostMapping
    public ClienteResponseDTO salvar(
            @RequestBody @Valid ClienteRequestDTO dto
            ) throws RegraNegocioException {
        return service.salvar(dto);
    }

    @GetMapping
    public List<ClienteResponseDTO> listar(){
        return service.listar();
    }


}
