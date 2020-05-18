package com.as.futebol;

import java.util.*;

public class Jogo {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private Equipa equipaVisitada;
	private Equipa equipaVisitante;
	private int goloEquipaVisitada;
	private int goloEquipaVisitante;
	private Date data;
	private int jornada;
	private List<Arbitro> arbitros = new ArrayList<Arbitro>();

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ================
    // =======================================================

	public Equipa getEquipaVisitada() {
		return equipaVisitada;
	} //getEquipaVisitada;
	
	public void setEquipaVisitada(Equipa equipaVisitada) {
		this.equipaVisitada = equipaVisitada;
	} //setEquipaVisitada;
	
	
	public Equipa getEquipaVisitante() {
		return equipaVisitante;
	} //getEquipaVisitante;
	
	public void setEquipaVisitante(Equipa equipaVisitante) {
		this.equipaVisitante = equipaVisitante;
	} //setEquipaVisitante;
	
	
	public int getGoloEquipaVisitada() {
		return goloEquipaVisitada;
	} //getGoloEquipaVisitada;
	
	public void setGoloEquipaVisitada(int goloEquipaVisitada) {
		this.goloEquipaVisitada = goloEquipaVisitada;
	} //setGoloEquipaVisitada
	
	
	public int getGoloEquipaVisitante() {
		return goloEquipaVisitante;
	} //getGoloEquipaVisitante;
	
	public void setGoloEquipaVisitante(int goloEquipaVisitante) {
		this.goloEquipaVisitante = goloEquipaVisitante;
	} //setGoloEquipaVisitante;
	
	
	public Date getData() {
		return data;
	} //getData;
	
	public void setData(Date data) {
		this.data = data;
	} //setData;
	
	
	public int getJornada() {
		return jornada;
	} //getJornada;
	
	public void setJornada(int jornada) {
		this.jornada = jornada;
	} //setJornada;
	
	
	public List<Arbitro> getArbitros() {
		return arbitros;
	} //getArbitros;
	
	public void setArbitros(int index, Arbitro arbitro) {
		this.arbitros.set(index, arbitro);
	} //setArbitros;

	public void addArbitros(Arbitro arbitro) {
		this.arbitros.add(arbitro);
	} //addArbitros;
	
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
	
} //Class Jogo;



































