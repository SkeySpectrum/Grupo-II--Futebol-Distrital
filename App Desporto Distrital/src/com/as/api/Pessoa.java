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
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>numeroCartaoCidadao</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getNumeroCartaoCidadao() {
		return numeroCartaoCidadao;
	} //getNumeroCartaoCidadao;

	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>numeroCartaoCidadao</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setNumeroCartaoCidadao(int numeroCartaoCidadao) {
		this.numeroCartaoCidadao = numeroCartaoCidadao;
	} //setNumeroCartaoCidadao;

	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>nome</b> que não é acessivel a
	 * outras classes.
	*/
	
	public String getNome() {
		return nome;
	} //getNome;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>nome</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>dataNascimento</b> que não é acessivel a
	 * outras classes.
	*/
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	} //getDataNascimento;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>dataNascimento</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>LocalDate</b>.
	*/
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	} //setDataNascimento;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>contacto</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getContacto() {
		return contacto;
	} //getContacto;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>contacto</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setContacto(int contacto) {
		this.contacto = contacto;
	} //setContacto;


	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>email</b> que não é acessivel a
	 * outras classes.
	*/
	
	public String getEmail() {
		return email;
	} //getEmail;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>email</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setEmail(String email) {
		this.email = email;
	} //setEmail;

// ============== MÉTODOS COMPLEMENTARES =================
	
	/**
	 * Comprimi todas as informações da classe e as
	 * transforma em formato <b>String</b>
	*/
	
    // ----> toString()
	@Override
	public String toString() {
		return "Pessoa [numeroCartaoCidadao=" + numeroCartaoCidadao + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", contacto=" + contacto + ", email=" + email + "]";
	} //Override toString;

	/**
	 * É usado para fazer uma comparação entre objectos, neste caso 
	 * é mais usado para fazer uma ordenação;
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






























