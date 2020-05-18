package com.as.futebol;

import com.as.futebol.utilidades.*;
import java.util.*;

public class Treinador extends Pessoa {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private List<Habilitacao> habilitacao = new ArrayList<Habilitacao>();;

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

	public Treinador () {
		
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

    // =======================================================
    // =================== .COMPORTAMENTOS ===================
    // =======================================================

	public String MostrarInformacao () {
		String resultado = "";
		
		resultado += "Treinador " + super.getNome() + ":\n";
		resultado += "Altura: " + super.getEmail() + "\n";
		resultado += "Peso: " + super.getContacto() + "\n";
		resultado += "Data Nascimento: " + super.getDataNascimento() + "\n";
		resultado += "Numero Cartão Cidadão: " + super.getNumeroCartaoCidadao() + "\n\n";
		
		resultado += "Habilitacao:\n";
		for (Habilitacao h : habilitacao) {
			resultado += h.getTipo().toString() + " | ";
			resultado += h.getNome() + " | ";
			resultado += h.getDescricao() + "\n";
		}
		
		resultado += "\n\n";
		
		return resultado;
		
	} //MostrarInformacao;

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES =================
    // =======================================================

    // ----> toString()

    // ----> equals()
	
} //Class Treinador;






































