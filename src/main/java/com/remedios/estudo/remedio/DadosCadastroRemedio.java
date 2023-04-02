package com.remedios.estudo.remedio;

import java.time.LocalDate;

import javax.persistence.Enumerated;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;

// DTO
// Validations

public record DadosCadastroRemedio(
	
	@NotBlank // Não permite vazio
	String nome, 
	
	// Enun => Constante fixa, tem que criar o enum
	@Enumerated
	Via via,
	
	@NotBlank // Não permite vazio
	String lote,
	
	// int não permite null por padrão
	int quantidade, 
	
	@Future // Não permite datas passadas
	LocalDate validade, 
	
	// Enun => Constante fixa, tem que criar o enum
	@Enumerated
	Laboratorio laboratorio) {
	
}
