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
		String resultado = "";
		
		resultado += "Arbitro Info:\n";
		resultado += super.getNome();
		resultado += super.getEmail();
		resultado += super.getContacto();
		resultado += super.getDataNascimento();
		resultado += super.getNumeroCartaoCidadao();
		
		resultado += "\n";
		
		resultado += "Habilitacao:\n";
		for (Habilitacao h : habilitacao) {
			resultado += h.getTipo().toString() + " | ";
			resultado += h.getNome() + " | ";
			resultado += h.getDescricao() + " | ";
			resultado += "\n";
		}
		
		return resultado;
		
	} //MostrarInformacao;

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES =================
    // =======================================================

    // ----> toString()

    // ----> equals()
	
} //Class Arbitro;









































