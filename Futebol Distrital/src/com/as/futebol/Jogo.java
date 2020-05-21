package com.as.futebol;

import java.util.*;

public class Jogo {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigoIndentificador;
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

	public int getCodigoIndentificador() {
		return codigoIndentificador;
	} //getCodigoIndentificador;

	public void setCodigoIndentificador(int codigoIndentificador) {
		this.codigoIndentificador = codigoIndentificador;
	} //setCodigoIndentificador;
	
	
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

	public int getGoloEquipaVisitante() {
		return goloEquipaVisitante;
	} //getGoloEquipaVisitante;

	
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

	public String MostrarInformacao () {
		String result = "";
		
		result += getCodigoIndentificador() + " | ";
		result += getJornada() + " | ";
		result += getData() + " | ";
		result += getArbitros() + " | ";
		result += getEquipaVisitada().getNome() + " | ";
		result += getEquipaVisitante().getNome() + " | ";
		result += getGoloEquipaVisitada() + " | ";
		result += getGoloEquipaVisitante() + " | ";
		
		return result;
		
	} //MostrarInformacao;

	
  	public boolean EliminarArbitro (int codigo) {
		int aux = ProcurarArbitroPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		arbitros.remove(aux);
		return true;
		
	} //EliminarArbitro;

	public boolean EditarArbitro (int codigo, Arbitro arbitro) {
		int aux = ProcurarArbitroPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		arbitros.set(aux, arbitro);
		return true;
		
	} //EditarArbitro;
	
	private int ProcurarArbitroPorCodigo (int codigo) {
		
		for (int i = 0; i < arbitros.size(); i++) {
			if (arbitros.get(i).getNumeroCartaoCidadao() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarArbitroPorCodigo;
	
	
	void AdicionarGolo (int codigo) {
		
		if (this.getEquipaVisitada().getCodigoIndentificador() != codigo || this.getEquipaVisitante().getCodigoIndentificador() != codigo)
			return;
		
		if (this.getEquipaVisitada().getCodigoIndentificador() == codigo)
			this.goloEquipaVisitada += 1;
		
		if (this.getEquipaVisitante().getCodigoIndentificador() == codigo)
			this.goloEquipaVisitante += 1;
		
	} //AdicionarGolo;
	
	void RemoverGolo (int codigo) {
		
		if (this.getEquipaVisitada().getCodigoIndentificador() != codigo || this.getEquipaVisitante().getCodigoIndentificador() != codigo)
			return;
		
		if (this.getEquipaVisitada().getCodigoIndentificador() == codigo)
			this.goloEquipaVisitada -= 1;
		
		if (this.getEquipaVisitante().getCodigoIndentificador() == codigo)
			this.goloEquipaVisitante -= 1;
		
	} //AdicionarGolo;
	
    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES =================
    // =======================================================

    // ----> toString()

    // ----> equals()
	
} //Class Jogo;



































