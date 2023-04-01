package com.remedios.estudo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.estudo.remedio.DadosCadastroRemedio;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	@PostMapping // Envio de dados
	public void cadastrar(@RequestBody DadosCadastroRemedio dados) {
		System.out.println(dados);
	}

}
