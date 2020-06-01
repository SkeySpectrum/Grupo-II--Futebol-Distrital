package com.as.api;

import java.time.LocalDate;
import java.util.*;

/**
 * Usado na classe Jogo.
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-29
*/

public class Arbitro extends Pessoa {

// ===================== ATRIBUTOS =======================

	private List<Habilitacao> habilitacao = new ArrayList<Habilitacao>();

// ============ ACESSORES e MODIFICADORES ================

	/**
	 * Este método tem o propósito de retornar uma lista 
	 * do atributo <b>habilitacao</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Habilitacao
	*/
	
	public List<Habilitacao> getHabilitacao() {
		return habilitacao;
	} //getHabilitacao;

	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>habilitacao</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Habilitacao</b> 
	 * numa dada posição.
	 * 
	 * @see com.as.api.Habilitacao
	*/
	
	public void setHabilitacao(int index, Habilitacao habilitacao) {
		this.habilitacao.set(index, habilitacao);
	} //setHabilitacao;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>habilitacao</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Habilitacao</b>.
	 * 
	 * @see com.as.api.Habilitacao
	*/
	
	public void addHabilitacao(Habilitacao habilitacao) {
		this.habilitacao.add(habilitacao);
	} //addHabilitacao;

// =================== CONSTRUTORES ======================

	//Construtor sem parametros;
	public Arbitro() {
		
	} //Construtor Arbitro;
	
	//Construtor com parametros;
	public Arbitro(String nome, LocalDate dataNascimento, int contacto, String email, int numeroCartaoCidadao, Habilitacao habilitacao) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setEmail(email);
		super.setContacto(contacto);
		super.setNumeroCartaoCidadao(numeroCartaoCidadao);
		this.habilitacao.add(habilitacao);
	} //Construtor Arbitro;

// =================== COMPORTAMENTOS ===================

	/**
	 * Mostra informações relativa a classe <b>Arbitro</b>.
	 * 
	 * @deprecated 
	 * @since 2020-05-28
	*/
	
	public String MostrarInformacao () {
		String result = "";
		
		result += "Nome: " + super.getNome() + "\n";
		result += "Email: " + super.getEmail() + "\n";
		result += "Contacto: " + super.getContacto() + "\n";
		result += "Data Nascimento: " + super.getDataNascimento() + "\n";
		result += "Cartão Cidadão: " + super.getNumeroCartaoCidadao() + "\n\n";
		
		result += "Habilitacao:\n";
		for (Habilitacao h : habilitacao) {
			result += h.MostrarInformacao();
		}
		
		return result;
		
	} //MostrarInformacao;

// ============== MÉTODOS COMPLEMENTARES =================

	/**
	 * Comprimi todas as informações da classe e as
	 * transforma em formato <b>String</b>
	*/
	
    // ----> toString()
	@Override
	public String toString() {
		return "Arbitro [habilitacao=" + habilitacao + ", getNumeroCartaoCidadao()=" + getNumeroCartaoCidadao()
				+ ", getNome()=" + getNome() + ", getDataNascimento()=" + getDataNascimento() + ", getContacto()="
				+ getContacto() + ", getEmail()=" + getEmail() + "]";
	}//Override toString;
	
} //Class Arbitro;









































