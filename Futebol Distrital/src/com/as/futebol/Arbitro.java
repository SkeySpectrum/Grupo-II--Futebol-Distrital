package com.as.futebol;

import com.as.futebol.utilidades.*;
import java.util.*;

public class Arbitro extends Pessoa {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private List<Habilitacao> habilitacao = new ArrayList<Habilitacao>();

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ================
    // =======================================================

	public List<Habilitacao> getHabilitacao() {
		return habilitacao;
	} //getHabilitacao;

	public void setHabilitacao(int index, Habilitacao habilitacao) {
		this.habilitacao.set(index, habilitacao);
	} //setHabilitacao;
	
	public void addHabilitacao(Habilitacao habilitacao) {
		this.habilitacao.add(habilitacao);
	} //addHabilitacao;

    // =======================================================
    // =================== CONSTRUTORES ======================
    // =======================================================

	//Construtor sem parametros;
	public Arbitro() {
		
	} //Construtor Arbitro;
	
	//Construtor com parametros;
	public Arbitro(String nome, Date dataNascimento, int contacto, String email, int numeroCartaoCidadao, Habilitacao habilitacao) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setEmail(email);
		super.setContacto(contacto);
		super.setNumeroCartaoCidadao(numeroCartaoCidadao);
		this.habilitacao.add(habilitacao);
	} //Construtor Arbitro;

    // =======================================================
    // =================== .COMPORTAMENTOS ===================
    // =======================================================

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

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES =================
    // =======================================================

    // ----> toString()

    // ----> equals()
	
} //Class Arbitro;









































