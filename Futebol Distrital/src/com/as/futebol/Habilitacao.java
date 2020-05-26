package com.as.futebol;

import com.as.futebol.Utilidade.*;

public class Habilitacao {

// ===================== ATRIBUTOS =======================

	private String nome;
	private String descricao;
	private TipoHabilitacao tipo;

// ============ ACESSORES e MODIFICADORES ================

	public String getNome() {
		return nome;
	} //getNome;
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome:
		
	
	public String getDescricao() {
		return descricao;
	} //getDescricao;
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} //setDescricao;
	
	
	public TipoHabilitacao getTipo() {
		return tipo;
	} //getTipo;
	
	public void setTipo(TipoHabilitacao tipo) {
		this.tipo = tipo;
	} //setTipo;

// =================== CONSTRUTORES ======================

	//Construtor sem parametros;
	public Habilitacao() {

	} //Construtor Habilitacao;
	
	//Construtor com parametros;
	public Habilitacao(String nome, String descricao, TipoHabilitacao tipo) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.tipo = tipo;
	} //Construtor Habilitacao;

// =================== COMPORTAMENTOS ===================

	public String MostrarInformacao () {
		String result = "";
		
		result += this.getTipo().toString() + " | ";
		result += this.getNome() + " | ";
		result += this.getDescricao() + "\n";
		
		return result;
	} //MostrarInformacao;


// ============== MÉTODOS COMPLEMENTARES =================

    // ----> toString()
	@Override
	public String toString() {
		return "Habilitacao [nome=" + nome + ", descricao=" + descricao + ", tipo=" + tipo + "]";
	} //Override toString;
	
} //Class Habilitacao;





























