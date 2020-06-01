package com.as.api;

import java.time.LocalDate;
import com.as.api.Utilidade.*;

/**
 * Usado na classe Equipa.
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-29
*/

public class Jogador extends Pessoa {

// ===================== ATRIBUTOS =======================

	private int numero;
	private PePreferido pePreferido;
	private Posicao posicao;

// ============ ACESSORES e MODIFICADORES ================

	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>numero</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getNumero() {
		return numero;
	} //getNumero;

	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>numero</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setNumero(int numero) {
		this.numero = numero;
	} //setNumero;

	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>pePreferido</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Utilidade.PePreferido
	*/
	
	public PePreferido getPePreferido() {
		return pePreferido;
	} //getPePreferido;

	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>pePreferido</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>PePreferido</b>.
	 * 
	 * @see com.as.api.Utilidade.PePreferido
	*/
	
	public void setPePreferido(PePreferido pePreferido) {
		this.pePreferido = pePreferido;
	} //setPePreferido;

	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>posicao</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Utilidade.Posicao
	*/
	
	public Posicao getPosicao() {
		return posicao;
	} //getPosicao;

	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>posicao</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Posicao</b>.
	 * 
	 * @see com.as.api.Utilidade.Posicao
	*/
	
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	} //setPosicao;

// =================== CONSTRUTORES ======================

	//Construtor com parametros;
	public Jogador() {
		
	}//Construtor Jogador;

	//Construtor com parametros;
	public Jogador(String nome, LocalDate dataNascimento, int contacto, String email, int numeroCartaoCidadao, PePreferido pePreferido, Posicao posicao, int numero) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setEmail(email);
		super.setContacto(contacto);
		super.setNumeroCartaoCidadao(numeroCartaoCidadao);
		
		this.setPePreferido(pePreferido);
		this.setPosicao(posicao);
		this.setNumero(numero);
	} //Construtor Jogador;

// =================== COMPORTAMENTOS ===================

	/**
	 * Mostra informações relativa a classe <b>Jogador</b>.
	 * 
	 * @deprecated 
	 * @since 2020-05-28
	*/
	
	public String MostrarInformacao () {
		String resultado = "";
		
		resultado += "Nome: " + super.getNome() + "\n";
		resultado += "Email: " + super.getEmail() + "\n";
		resultado += "Contacto: " + super.getContacto() + "\n";
		resultado += "Data Nascimento: " + super.getDataNascimento() + "\n";
		resultado += "Numero Cartão Cidadão: " + super.getNumeroCartaoCidadao() + "\n";
		
		resultado += "Pé Preferido: " + this.pePreferido.toString() + "\n";
		resultado += "Posição: " + this.posicao.toString() + "\n";
		resultado += "Numero Jogador: " + this.numero + "\n\n";
		
		return resultado;
		
	} //MostrarInformacao;

// ============== MÉTODOS COMPLEMENTARES =================

	/**
	 * Comprimi todas as informações da classe e as
	 * transforma em formato <b>String</b>
	*/
	
    // ----> toString()
	@Override
	public String toString() {
		return "Jogador [numero=" + numero + ", pePreferido=" + pePreferido + ", posicao=" + posicao
				+ ", getNumeroCartaoCidadao()=" + getNumeroCartaoCidadao() + ", getNome()=" + getNome()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getContacto()=" + getContacto() + ", getEmail()="
				+ getEmail() + "]";
	} //Override toString;
	
} //Class Jogador;































