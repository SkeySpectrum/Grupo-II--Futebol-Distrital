package com.as.futebol;

import com.as.futebol.Equipa.Escalao;

import java.util.*;

public class Clube {

	public enum CorEquipamento { Azul, Vermelho, Riscas, Outro }
	
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigoIdentificador;
	private String nome;
	private Date dataFundacao;
	private Escalao escalao;
	private CorEquipamento corEquipamento;
	private String contacto;
	private String email;
	private String morada;
	private List<Equipa> equipas = new ArrayList<Equipa>();
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ================
    // =======================================================

	public int getCodigoIdentificador() {
		return codigoIdentificador;
	} //getCodigoIdentificador;
	
	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	} //setCodigoIdentificador;
	
	
	public String getNome() {
		return nome;
	} //getNome;
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome;
	
	
	public Date getDataFundacao() {
		return dataFundacao;
	} //getDataFundacao
	
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	} //setDataFundacao;
	
	
	public Escalao getEscalao() {
		return escalao;
	} //getEscalao;
	
	public void setEscalao(Escalao escalao) {
		this.escalao = escalao;
	} //setEscalao;
	
	
	public CorEquipamento getCorEquipamento() {
		return corEquipamento;
	} //getCorEquipamento;
	
	public void setCorEquipamento(CorEquipamento corEquipamento) {
		this.corEquipamento = corEquipamento;
	} //setCorEquipamento;
	
	
	public String getContacto() {
		return contacto;
	} //getContacto;
	
	public void setContacto(String contacto) {
		this.contacto = contacto;
	} //setContacto;
	
	
	public String getEmail() {
		return email;
	} //getEmail;
	
	public void setEmail(String email) {
		this.email = email;
	} //setEmail;
	
	
	public String getMorada() {
		return morada;
	} //getMorada;
	
	public void setMorada(String morada) {
		this.morada = morada;
	} //setMorada;
	
	
	public List<Equipa> getEquipas() {
		return equipas;
	} //getEquipas;
	
	public void setEquipas(int index, Equipa equipa) {
		this.equipas.set(index, equipa);
	} //setEquipas;
	
	public void addEquipas(Equipa equipa) {
		this.equipas.add(equipa);
	} //addEquipas;

    // =======================================================
    // =================== CONSTRUTORES ======================
    // =======================================================



    // =======================================================
    // =================== .COMPORTAMENTOS ===================
    // =======================================================

	public int CalcularNumeroDeJogadores () {
		int aux = 0;
		
		for (Equipa equipa : equipas) {
			aux += equipa.getJogadores().size();
		}
		
		return aux;
		
	} //CalcularNumeroDeJogadores;
	
	public int CalcularNumeroDeTreinadores () {
		int aux = 0;
		
		for (Equipa equipa : equipas) {
			aux += equipa.getTreinadores().size();
		}
		
		return aux;
		
	} //CalcularNumeroDeTreinadores;
	
	
  	public boolean EliminarEquipa (int codigo) {
		int aux = ProcurarEquipaPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		equipas.remove(aux);
		return true;
		
	} //EliminarEquipa;

	public boolean EditarEquipa (int codigo, Equipa equipa) {
		int aux = ProcurarEquipaPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		equipas.set(aux, equipa);
		return true;
		
	} //EditarEquipa;
	
	private int ProcurarEquipaPorCodigo (int codigo) {
		
		for (int i = 0; i < equipas.size(); i++) {
			if (equipas.get(i).getCodigoIndentificador() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarEquipaPorCodigo;

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES =================
    // =======================================================

    // ----> toString()

    // ----> equals()
	
} //Class Clube;




































