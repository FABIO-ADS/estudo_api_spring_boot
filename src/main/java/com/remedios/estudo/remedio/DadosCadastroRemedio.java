package com.remedios.estudo.remedio;


public record DadosCadastroRemedio(
	
	String nome, 
	
	// Enun => Constante fixa, tem que criar o enum
	Via via,
	
	String lote, 
	String quantidade, 
	String validade, 
	
	// Enun => Constante fixa, tem que criar o enum
	Laboratorio laboratorio) {
	
}
