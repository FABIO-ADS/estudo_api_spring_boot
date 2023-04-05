package com.remedios.estudo.remedio;

import javax.validation.constraints.NotNull;

// Determinar quais campos poderão ser atualizados
public record DadosAtualizarRemedio(
		
		@NotNull // pois não é uma String, senao poderia ser NotBlank
		Long id, 
		
		String nome, 
		
		Via via, 
		
		Laboratorio laboratorio
		
		) {

}
