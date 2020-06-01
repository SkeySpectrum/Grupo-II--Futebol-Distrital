package com.as.api;

import java.time.LocalDate;

/**
 * Uma classe abstrata que serve de base para as classes <b>Jogador</b>
 * <b>Treinador</b> e </b>Arbitro</b>;
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-29
*/

public abstract class Pessoa implements Comparable<Pessoa> {

// ===================== ATRIBUTOS =======================

	private int numeroCartaoCidadao;
	private String nome;
	private LocalDate dataNascimento;
	private int contacto;
	private String email;
	
// ============ ACESSORES e MODIFICADORES ================

	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>numeroCartaoCidadao</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getNumeroCartaoCidadao() {
		return numeroCartaoCidadao;
	} //getNumeroCartaoCidadao;

	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>numeroCartaoCidadao</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setNumeroCartaoCidadao(int numeroCartaoCidadao) {
		this.numeroCartaoCidadao = numeroCartaoCidadao;
	} //setNumeroCartaoCidadao;

	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>nome</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public String getNome() {
		return nome;
	} //getNome;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>nome</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>dataNascimento</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	} //getDataNascimento;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>dataNascimento</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>LocalDate</b>.
	*/
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	} //setDataNascimento;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>contacto</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getContacto() {
		return contacto;
	} //getContacto;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>contacto</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setContacto(int contacto) {
		this.contacto = contacto;
	} //setContacto;


	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>email</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public String getEmail() {
		return email;
	} //getEmail;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>email</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setEmail(String email) {
		this.email = email;
	} //setEmail;

// ============== M�TODOS COMPLEMENTARES =================
	
	/**
	 * Comprimi todas as informa��es da classe e as
	 * transforma em formato <b>String</b>
	*/
	
    // ----> toString()
	@Override
	public String toString() {
		return "Pessoa [numeroCartaoCidadao=" + numeroCartaoCidadao + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", contacto=" + contacto + ", email=" + email + "]";
	} //Override toString;

	/**
	 * � usado para fazer uma compara��o entre objectos, neste caso 
	 * � mais usado para fazer uma ordena��o;
	*/

	// ----> compareTo()
	@Override
	public int compareTo(Pessoa obj) {
		// 0 - iguais
		// 1 - maior do que estou a comparar
		// -1 - menor do que estou a comparar
		return obj.nome.compareTo(this.nome) * -1;
	}

} //Class Pessoa;






























