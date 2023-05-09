package com.example.api.paciente;

import com.example.api.endereco.DadosAtualizacaoEndereco;
import jakarta.validation.Valid;

public record DadosAtualizacaoPaciente(Long id,
                                       String nome,
                                       String telefone,
                                       @Valid DadosAtualizacaoEndereco endereco) {
}
