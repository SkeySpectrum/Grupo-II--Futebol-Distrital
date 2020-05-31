package com.as.futebol;

import java.util.*;

/**
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-29
*/

public class Treinador extends Pessoa {

// ===================== ATRIBUTOS =======================

	private List<Habilitacao> habilitacao = new ArrayList<Habilitacao>();

// ============ ACESSORES e MODIFICADORES ================

	/**
	 * Este m�todo tem o prop�sito de retornar uma lista 
	 * do atributo <b>habilitacao</b> que n�o � acessivel a
	 * outras classes.
	 * 
	 * @see com.as.futebol.Habilitacao
	*/
	
	public List<Habilitacao> getHabilitacao() {
		return habilitacao;
	} //getHabilitacao;

	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>habilitacao</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Habilitacao</b> 
	 * numa dada posi��o.
	 * 
	 * @see com.as.futebol.Habilitacao
	*/
	
	public void setHabilitacao(int index, Habilitacao habilitacao) {
		this.habilitacao.set(index, habilitacao);
	} //setHabilitacao;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>habilitacao</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Habilitacao</b>.
	 * 
	 * @see com.as.futebol.Habilitacao
	*/
	
	
	public void addHabilitacao(Habilitacao habilitacao) {
		this.habilitacao.add(habilitacao);
	} //addHabilitacao;

// =================== CONSTRUTORES ======================

	//Construtor sem parametros;
	public Treinador () {
		super();
	} //Construtor Treinador;
	
	//Construtor com parametros;
	public Treinador(String nome, Date dataNascimento, int contacto, String email, int numeroCartaoCidadao, Habilitacao habilitacao) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setEmail(email);
		super.setContacto(contacto);
		super.setNumeroCartaoCidadao(numeroCartaoCidadao);
		this.habilitacao.add(habilitacao);
	} //Construtor Treinador;

// =================== COMPORTAMENTOS ===================
	
	/**
	 * Mostra informa��es relativa a classe <b>Treinador</b>.
	 * 
	 * @deprecated 
	 * @since 2020-05-28
	*/
	
// =================== COMPORTAMENTOS ===================

	public String MostrarInformacao () {
		String result = "";
		
		result += "Nome: " + super.getNome() + "\n";
		result += "Email: " + super.getEmail() + "\n";
		result += "Contacto: " + super.getContacto() + "\n";
		result += "Data Nascimento: " + super.getDataNascimento() + "\n";
		result += "Cart�o Cidad�o: " + super.getNumeroCartaoCidadao() + "\n\n";
		
		result += "Habilitacao:\n";
		for (Habilitacao h : habilitacao) {
			result += h.MostrarInformacao();
		}
		
		result += "\n\n";
		
		return result;
		
	} //MostrarInformacao;

// ============== M�TODOS COMPLEMENTARES =================

    // ----> toString()
	@Override
	public String toString() {
		return "Treinador [habilitacao=" + habilitacao + ", getNumeroCartaoCidadao()=" + getNumeroCartaoCidadao()
				+ ", getNome()=" + getNome() + ", getDataNascimento()=" + getDataNascimento() + ", getContacto()="
				+ getContacto() + ", getEmail()=" + getEmail() + "]";
	} //Override toString;

} //Class Treinador;






































