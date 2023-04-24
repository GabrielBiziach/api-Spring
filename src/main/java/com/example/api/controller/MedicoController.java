package com.example.api.controller;

import com.example.api.medico.DadosCadastroMedico;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)

    @ResponseBody
    public void create(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);
    }
}
