package com.remedios.estudo.remedio;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// ENTIDADE
@Table(name="Remedio")
@Entity(name="remedio")
public class Remedio {
	
	public Remedio(DadosCadastroRemedio dados) {
		this.nome=dados.nome();
		this.via=dados.via();
		this.lote=dados.lote();
		this.quantidade=dados.quantidade();
		this.validade=dados.validade();
		this.laboratorio=dados.laboratorio();		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome; 
	
	// Enun => Constante fixa, tem que criar o enum
	@Enumerated(EnumType.STRING)
	private Via via;	
	
	private String lote;
	private int quantidade; 
	private LocalDate validade; 
	
	// Enun => Constante fixa, tem que criar o enum
	@Enumerated(EnumType.STRING)
	private Laboratorio laboratorio;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Via getVia() {
		return via;
	}

	public void setVia(Via via) {
		this.via = via;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	
}
