package com.as.futebol;

import java.util.*;
import com.as.futebol.Utilidade.*;

public class Equipa {
	
// ===================== ATRIBUTOS =======================
	
	private int codigoIndentificador;
	private String nome;
	private Escalao escalao;
	
	List<Jogador> jogadores = new ArrayList<Jogador>();
	List<Treinador> treinadores = new ArrayList<Treinador>();

// ============ ACESSORES e MODIFICADORES ================

	public int getCodigoIndentificador() {
		return codigoIndentificador;
	} //getCodigoIndentificador;

	public void setCodigoIndentificador(int codigoIndentificador) {
		this.codigoIndentificador = codigoIndentificador;
	} //setCodigoIndentificador;
	
	
	public String getNome() {
		return nome;
	} //getNome;
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome;
		

	public Escalao getEscalao() {
		return escalao;
	} //getEscalao;

	public void setEscalao(Escalao escalao) {
		this.escalao = escalao;
	} //setEscalao;
	
	
	public List<Jogador> getJogadores() {
		return jogadores;
	} //getJogadores;
	
	public void setJogador(int index, Jogador jogador) {
		if (ProcurarJogadorByNumeroCartao(jogador.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Jogador '" + jogador.getNome() + "' ja foi adicionado a equipa '" + this.getNome() + "'!!!");
		
		this.jogadores.set(index, jogador);
	} //setJogadores;
	
	public void addJogador(Jogador jogador) {
		if (ProcurarJogadorByNumeroCartao(jogador.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Jogador '" + jogador.getNome() + "' ja foi adicionado a equipa '" + this.getNome() + "'!!!");
		
		this.jogadores.add(jogador);
	} //addJogadores;
	
	
	public List<Treinador> getTreinadores() {
		return treinadores;
	} //getTreinadores;
	
	public void setTreinador(int index, Treinador treinador) {
		if (ProcurarTreinadorByNumeroCartao(treinador.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Treinador '" + treinador.getNome() + "' ja foi adicionado a equipa '" + this.getNome() + "'!!!");
		
		this.treinadores.set(index, treinador);
	} //setTreinadores;
	
	public void addTreinador(Treinador treinador) {
		if (ProcurarTreinadorByNumeroCartao(treinador.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Treinador '" + treinador.getNome() + "' ja foi adicionado a equipa '" + this.getNome() + "'!!!");
		
		this.treinadores.add( treinador);
	} //addTreinadores;

// =================== CONSTRUTORES ======================

	//Construtor sem parametros;
	public Equipa () {
		
	} //Construtor Equipa;
	
	//Construtor com parametros;
	public Equipa(int codigoIndentificador, String nome, Escalao escalao) {
		super();
		this.setCodigoIndentificador(codigoIndentificador);
		this.setNome(nome);
		this.setEscalao(escalao);
	} //Construtor Equipa;

// =================== COMPORTAMENTOS ===================

	public String MostrarInformacao () {
		String resultado = "";
		
		resultado += "Equipa: " + this.getNome() + "\n";
		resultado += "Código: " + this.getCodigoIndentificador() + "\n";
		resultado += "Escalão: " + this.getEscalao() + "\n";
		resultado += "Jogadores (" + this.getJogadores().size() + ") \n";
		resultado += "Treinadores (" + this.getTreinadores().size() + ") \n\n";
		
		return resultado;
		
	} //MostrarInformacao;
	
	public String MostrarJogadores () {
		String resultado = "";
		
		this.jogadores.sort(null);
		
		for(Jogador j : jogadores) {
			resultado += j.MostrarInformacao();
		}
		
		return resultado;
	} //MostrarJogadores;
	
	public String MostrarTreinadores () {
		String resultado = "";
		
		for(Treinador t : treinadores) {
			resultado += t.MostrarInformacao();
		}
		
		return resultado;
	} //MostrarTreinadores;
	
	
	public boolean EliminarJogador(int numeroCartao) {
		int aux = ProcurarJogadorByNumeroCartao(numeroCartao);
		
		if (aux == -1)
			return false;
			
		this.jogadores.remove(aux);
		return true;
		
	} //EliminarJogador;
	
	public boolean EditarJogador (int numeroCartao, Jogador jogador) {
		int aux = ProcurarJogadorByNumeroCartao(numeroCartao);
		
		if (aux == -1)
			return false;
		
		this.setJogador(aux, jogador);
		
		return true;
	} //EditarJogador;
	
	private int ProcurarJogadorByNumeroCartao(int numeroCartao) {
		for (int i = 0; i < jogadores.size(); i++) {
			if (jogadores.get(i).getNumeroCartaoCidadao() == numeroCartao)
				return i;
		}
		
		return -1;
	} //ProcurarJogadorByNumeroCartao;
	
	
	public boolean EliminarTreinador(int numeroCartao) {
		
		int aux = ProcurarTreinadorByNumeroCartao(numeroCartao);
		
		if (aux == -1)
			return false;
			
		this.treinadores.remove(aux);
		return true;
		
	} //EliminarTreinador;

	public boolean EditarTreinador (int numeroCartao, Treinador treinador) {
		int aux = ProcurarTreinadorByNumeroCartao(numeroCartao);
		
		if (aux == -1)
			return false;
		
		this.setTreinador(aux, treinador);
		
		return true;
	} //EditarJogador;
	
	private int ProcurarTreinadorByNumeroCartao(int numeroCartao) {
		for (int i = 0; i < this.treinadores.size(); i++) {
			if (this.treinadores.get(i).getNumeroCartaoCidadao() == numeroCartao)
				return i;
		}
		
		return -1;
	} //ProcurarTreinadorByNumeroCartao;


    // ============== MÉTODOS COMPLEMENTARES =================

    // ----> toString()
	@Override
	public String toString() {
		return "Equipa [codigoIndentificador=" + codigoIndentificador + ", nome=" + nome + ", escalao=" + escalao
				+ ", jogadores=" + jogadores + ", treinadores=" + treinadores + "]";
	}//Override toString;
	
} //Class Equipa;































