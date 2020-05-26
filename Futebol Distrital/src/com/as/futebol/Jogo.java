package com.as.futebol;

import java.util.*;

public class Jogo {

// ===================== ATRIBUTOS =======================

	private int codigoIndentificador;
	private Equipa equipaVisitada;
	private Equipa equipaVisitante;
	private int goloEquipaVisitada;
	private int goloEquipaVisitante;
	private Date data;
	private int jornada;
	private List<Arbitro> arbitros = new ArrayList<Arbitro>();

// ============ ACESSORES e MODIFICADORES ================

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
		if (this.getEquipaVisitante() != null) {
			if (this.getEquipaVisitante().getCodigoIndentificador() == equipaVisitada.getCodigoIndentificador())
				throw new IllegalArgumentException("A equipa '" + equipaVisitada.getNome() + "' ja foi adicionada ao jogo '" + this.getCodigoIndentificador());
		}
			
		this.equipaVisitada = equipaVisitada;
	} //setEquipaVisitada;
	
	
	public Equipa getEquipaVisitante() {
		return equipaVisitante;
	} //getEquipaVisitante;
	
	public void setEquipaVisitante(Equipa equipaVisitante) {
		if (this.getEquipaVisitada() != null) {
			if (this.getEquipaVisitada().getCodigoIndentificador() == equipaVisitante.getCodigoIndentificador())
				throw new IllegalArgumentException("A equipa '" + equipaVisitada.getNome() + "' ja foi adicionada ao jogo '" + this.getCodigoIndentificador());
		}
		
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
		if (ProcurarArbitroPorCodigo(arbitro.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Arbitro '" + arbitro.getNome() + "' ja existe no jogo '" + this.getCodigoIndentificador());
		
		this.arbitros.set(index, arbitro);
	} //setArbitros;

	public void addArbitros(Arbitro arbitro) {
		if (ProcurarArbitroPorCodigo(arbitro.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Arbitro '" + arbitro.getNome() + "' ja existe no jogo '" + this.getCodigoIndentificador());
		
		this.arbitros.add(arbitro);
	} //addArbitros;
	
// =================== CONSTRUTORES ======================

	//Construtor sem parametro;
	public Jogo () {
		
	} //Construtor Jogo;

	//Construtor com parametro;
	public Jogo(int codigoIndentificador, Equipa equipaVisitada, Equipa equipaVisitante, Date data, int jornada,
			List<Arbitro> arbitros) {
		super();
		this.setCodigoIndentificador(codigoIndentificador);
		this.setEquipaVisitada(equipaVisitada);
		this.setEquipaVisitante(equipaVisitante);
		this.setData(data); 
		this.setJornada(jornada);
		this.arbitros = arbitros;
	} //Construtor Jogo;
	
// =================== .COMPORTAMENTOS ===================

	public String MostrarInformacao () {
		String result = "";

		result += "Jornada: " 			+ this.getJornada() 					+ "\n";
		result += "Codigo: " 			+ this.getCodigoIndentificador() 		+ "\n";
		result += "Data: " 				+ this.getData() 						+ "\n";
		result += "Arbitros (" 			+ this.getArbitros().size() 			+ ") \n";
		result += "Equipa Visitada: " 	+ this.getEquipaVisitada().getNome() 	+ " | " + this.getGoloEquipaVisitada() 	+ "\n";
		result += "Equipa Visitante: " 	+ this.getEquipaVisitante().getNome() 	+ " | " + this.getGoloEquipaVisitante() + "\n\n";
		
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
	
	
	public void AdicionarGolo (int codigo) {
		
		if (this.getEquipaVisitada().getCodigoIndentificador() == codigo)
			this.goloEquipaVisitada += 1;
		
		if (this.getEquipaVisitante().getCodigoIndentificador() == codigo)
			this.goloEquipaVisitante += 1;
		
	} //AdicionarGolo;
	
	
	public void RemoverGolo (int codigo) {
		
		if (this.getEquipaVisitada().getCodigoIndentificador() == codigo)
			this.goloEquipaVisitada -= 1;
		
		if (this.getEquipaVisitante().getCodigoIndentificador() == codigo)
			this.goloEquipaVisitante -= 1;
		
	} //AdicionarGolo;

	

// ============== MÉTODOS COMPLEMENTARES =================

    // ----> toString()
	@Override
	public String toString() {
		return "Jogo [codigoIndentificador=" + codigoIndentificador + ", equipaVisitada=" + equipaVisitada
				+ ", equipaVisitante=" + equipaVisitante + ", goloEquipaVisitada=" + goloEquipaVisitada
				+ ", goloEquipaVisitante=" + goloEquipaVisitante + ", data=" + data + ", jornada=" + jornada
				+ ", arbitros=" + arbitros + "]";
	}//Override toString;
	
} //Class Jogo;



































