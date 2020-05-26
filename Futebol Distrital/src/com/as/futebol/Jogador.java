package com.as.futebol;

import java.util.*;
import com.as.futebol.Utilidade.*;

public class Jogador extends Pessoa {

// ===================== ATRIBUTOS =======================

	private int numero;
	private PePreferido pePreferido;
	private Posicao posicao;

// ============ ACESSORES e MODIFICADORES ================

	public int getNumero() {
		return numero;
	} //getNumero;

	public void setNumero(int numero) {
		this.numero = numero;
	} //setNumero;

	
	public PePreferido getPePreferido() {
		return pePreferido;
	} //getPePreferido;

	public void setPePreferido(PePreferido pePreferido) {
		this.pePreferido = pePreferido;
	} //setPePreferido;

	
	public Posicao getPosicao() {
		return posicao;
	} //getPosicao;

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	} //setPosicao;

// =================== CONSTRUTORES ======================

	//Construtor com parametros;
	public Jogador() {
		
	}//Construtor Jogador;

	//Construtor com parametros;
	public Jogador(String nome, Date dataNascimento, int contacto, String email, int numeroCartaoCidadao, PePreferido pePreferido, Posicao posicao, int numero) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setEmail(email);
		super.setContacto(contacto);
		super.setNumeroCartaoCidadao(numeroCartaoCidadao);
		
		this.pePreferido = pePreferido;
		this.posicao = posicao;
		this.numero = numero;
	} //Construtor Jogador;

// =================== .COMPORTAMENTOS ===================

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

    // ----> toString()
	@Override
	public String toString() {
		return "Jogador [numero=" + numero + ", pePreferido=" + pePreferido + ", posicao=" + posicao
				+ ", getNumeroCartaoCidadao()=" + getNumeroCartaoCidadao() + ", getNome()=" + getNome()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getContacto()=" + getContacto() + ", getEmail()="
				+ getEmail() + "]";
	}//Override toString;
	
} //Class Jogador;































