package com.as.futebol.utilidades;

import java.util.*;

public abstract class Pessoa implements Comparable<Pessoa> {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int numeroCartaoCidadao;
	private String nome;
	private Date dataNascimento;
	private int contacto;
	private String email;
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ================
    // =======================================================

	public int getNumeroCartaoCidadao() {
		return numeroCartaoCidadao;
	} //getNumeroCartaoCidadao;

	public void setNumeroCartaoCidadao(int numeroCartaoCidadao) {
		this.numeroCartaoCidadao = numeroCartaoCidadao;
	} //setNumeroCartaoCidadao;
	
	
	public String getNome() {
		return nome;
	} //getNome;
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome;
	
	
	public Date getDataNascimento() {
		return dataNascimento;
	} //getDataNascimento;
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	} //setDataNascimento;
	
	
	public int getContacto() {
		return contacto;
	} //getContacto;
	
	public void setContacto(int contacto) {
		this.contacto = contacto;
	} //setContacto;


	public String getEmail() {
		return email;
	} //getEmail;
	
	public void setEmail(String email) {
		this.email = email;
	} //setEmail;

    // =======================================================
    // =================== CONSTRUTORES ======================
    // =======================================================


	
    // =======================================================
    // =================== .COMPORTAMENTOS ===================
    // =======================================================



    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES =================
    // =======================================================

	
    // ----> toString()

    // ----> equals()

	// ----> compareTo()
	@Override
	public int compareTo(Pessoa obj) {
		// TODO Auto-generated method stub
		// 0 - iguais
		// 1 - maior do que estou a comparar
		// -1 - menor do que estou a comparar
		return 0;
	}
	
} //Class Pessoa;






























