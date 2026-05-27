package com.antonio.salao.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(RegraNegocioException.class)
    public ResponseEntity<?> handleRegraNegocio(RegraNegocioException ex){
        Map<String, Object> erro = new HashMap<>();
        erro.put("data_hora", LocalDateTime.now());
        erro.put("status_code", 400);
        erro.put("message", ex.getMessage());
        return ResponseEntity.badRequest().body(erro);
    }

    @ExceptionHandler
    public ResponseEntity<?>
    handleNotFound(RecursoNaoEncontradoException ex){
        Map<String, Object> erro = new HashMap<>();
        erro.put("data_hora", LocalDateTime.now());
        erro.put("status_code", 404);
        erro.put("message", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
    }
}
