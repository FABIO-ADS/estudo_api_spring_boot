package com.remedios.estudo.remedio;

import java.time.LocalDate;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(id, laboratorio, lote, nome, quantidade, validade, via);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Remedio other = (Remedio) obj;
		return Objects.equals(id, other.id) && laboratorio == other.laboratorio && Objects.equals(lote, other.lote)
				&& Objects.equals(nome, other.nome) && quantidade == other.quantidade
				&& Objects.equals(validade, other.validade) && via == other.via;
	}

	public Remedio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Remedio(Long id, String nome, Via via, String lote, int quantidade, LocalDate validade,
			Laboratorio laboratorio) {
		super();
		this.id = id;
		this.nome = nome;
		this.via = via;
		this.lote = lote;
		this.quantidade = quantidade;
		this.validade = validade;
		this.laboratorio = laboratorio;
	}

	
	
}
