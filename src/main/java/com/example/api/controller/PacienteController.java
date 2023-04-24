package com.example.api.controller;

import com.example.api.paciente.DadosCadastroPaciente;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void create(@RequestBody DadosCadastroPaciente dados) {
        System.out.println(dados);
    }
}
