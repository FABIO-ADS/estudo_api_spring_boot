package com.remedios.estudo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.estudo.remedio.DadosCadastroRemedio;
import com.remedios.estudo.remedio.Remedio;
import com.remedios.estudo.remedio.RemedioRepository;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	// Injeção de dependência
	@Autowired
	private RemedioRepository repository;
	
	@PostMapping // Envio de dados
	public void cadastrar(@RequestBody @Valid DadosCadastroRemedio dados) {
		repository.save(new Remedio(dados));
	}

}
