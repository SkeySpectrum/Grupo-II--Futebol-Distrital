package com.as.futebol;

import java.util.*;

/**
 * O Jogo é composto por duas equipas do mesmo escalão 
 * e possui certos atributos, como a quantidade de golos 
 * que cada equipa possui.
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-29
*/

public class Jogo implements Comparable<Jogo> {

// ===================== ATRIBUTOS =======================

	private int codigo;
	private Equipa equipaVisitada;
	private Equipa equipaVisitante;
	private int goloEquipaVisitada;
	private int goloEquipaVisitante;
	private Date data;
	private int jornada;
	private List<Arbitro> arbitros = new ArrayList<Arbitro>();

// ============ ACESSORES e MODIFICADORES ================

	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>codigo</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getCodigo() {
		return codigo;
	} //getCodigoIndentificador;

	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>codigo</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	} //setCodigoIndentificador;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>equipaVisitada</b> que não é acessivel a
	 * outras classes.
	*/
	
	public Equipa getEquipaVisitada() {
		return equipaVisitada;
	} //getEquipaVisitada;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>equipaVisitada</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Equipa</b>.
	*/
	
	public void setEquipaVisitada(Equipa equipaVisitada) {
		if (this.getEquipaVisitante() != null) {
			if (this.getEquipaVisitante().getCodigo() == equipaVisitada.getCodigo())
				throw new IllegalArgumentException("A equipa '" + equipaVisitada.getNome() + "' ja foi adicionada ao jogo '" + this.getCodigo());
		}
			
		this.equipaVisitada = equipaVisitada;
	} //setEquipaVisitada;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>equipaVisitante</b> que não é acessivel a
	 * outras classes.
	*/
	
	public Equipa getEquipaVisitante() {
		return equipaVisitante;
	} //getEquipaVisitante;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>equipaVisitante</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Equipa</b>.
	*/
	
	public void setEquipaVisitante(Equipa equipaVisitante) {
		if (this.getEquipaVisitada() != null) {
			if (this.getEquipaVisitada().getCodigo() == equipaVisitante.getCodigo())
				throw new IllegalArgumentException("A equipa '" + equipaVisitada.getNome() + "' ja foi adicionada ao jogo '" + this.getCodigo());
		}
		
		this.equipaVisitante = equipaVisitante;
	} //setEquipaVisitante;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>goloEquipaVisitada</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getGoloEquipaVisitada() {
		return goloEquipaVisitada;
	} //getGoloEquipaVisitada;

	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>goloEquipaVisitante</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getGoloEquipaVisitante() {
		return goloEquipaVisitante;
	} //getGoloEquipaVisitante;

	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>data</b> que não é acessivel a
	 * outras classes.
	*/
	
	public Date getData() {
		return data;
	} //getData;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>data</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Date</b>.
	*/
	
	public void setData(Date data) {
		this.data = data;
	} //setData;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>jornada</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getJornada() {
		return jornada;
	} //getJornada;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>jornada</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setJornada(int jornada) {
		this.jornada = jornada;
	} //setJornada;
	
	
	/**
	 * Este método tem o propósito de retornar uma lista 
	 * do atributo <b>arbitros</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.futebol.Arbitro
	*/
	
	public List<Arbitro> getArbitros() {
		return arbitros;
	} //getArbitros;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>arbitros</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Arbitro</b> 
	 * numa dada posição.
	 * <p>
	 * Tem como validação:
	 * <br>- Caso o treinador ja exista no jogo
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.futebol.Arbitro
	*/
	
	public void setArbitros(int index, Arbitro arbitro) {
		if (ProcurarArbitroPorCodigo(arbitro.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Arbitro '" + arbitro.getNome() + "' ja existe no jogo '" + this.getCodigo());
		
		this.arbitros.set(index, arbitro);
	} //setArbitros;

	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>arbitros</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Arbitro</b>.
	 * <p>
	 * Tem como validação:
	 * <br>- Caso o treinador ja exista no jogo
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.futebol.Arbitro
	*/
	
	public void addArbitros(Arbitro arbitro) {
		if (ProcurarArbitroPorCodigo(arbitro.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Arbitro '" + arbitro.getNome() + "' ja existe no jogo '" + this.getCodigo());
		
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
		this.setCodigo(codigoIndentificador);
		this.setEquipaVisitada(equipaVisitada);
		this.setEquipaVisitante(equipaVisitante);
		this.setData(data); 
		this.setJornada(jornada);
		this.arbitros = arbitros;
	} //Construtor Jogo;
	
// =================== COMPORTAMENTOS ===================

	public String MostrarInformacao () {
		String result = "";

		result += "Jornada: " 			+ this.getJornada() 					+ "\n";
		result += "Codigo: " 			+ this.getCodigo() 		+ "\n";
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
	
	
	public void AdicionarGolo (int codigo) {
		
		if (this.getEquipaVisitada().getCodigo() == codigo)
			this.goloEquipaVisitada += 1;
		
		if (this.getEquipaVisitante().getCodigo() == codigo)
			this.goloEquipaVisitante += 1;
		
	} //AdicionarGolo;
	
	public void RemoverGolo (int codigo) {
		
		if (this.getEquipaVisitada().getCodigo() == codigo)
			this.goloEquipaVisitada -= 1;
		
		if (this.getEquipaVisitante().getCodigo() == codigo)
			this.goloEquipaVisitante -= 1;
		
	} //AdicionarGolo;

	
	private int ProcurarArbitroPorCodigo (int codigo) {
		
		for (int i = 0; i < arbitros.size(); i++) {
			if (arbitros.get(i).getNumeroCartaoCidadao() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarArbitroPorCodigo;
	
// ============== MÉTODOS COMPLEMENTARES =================

    // ----> toString()
	@Override
	public String toString() {
		return "Jogo [codigoIndentificador=" + codigo + ", equipaVisitada=" + equipaVisitada
				+ ", equipaVisitante=" + equipaVisitante + ", goloEquipaVisitada=" + goloEquipaVisitada
				+ ", goloEquipaVisitante=" + goloEquipaVisitante + ", data=" + data + ", jornada=" + jornada
				+ ", arbitros=" + arbitros + "]";
	}//Override toString;
	
	// ----> compareTo()
	@Override
	public int compareTo(Jogo obj) {
		// 0 - iguais
		// 1 - maior do que estou a comparar
		// -1 - menor do que estou a comparar
		
		if (obj.jornada < this.jornada)
			return 1;
		
		if (obj.jornada > this.jornada)
			return -1;
		
		
		if (obj.codigo < this.codigo)
			return 1;
		
		if (obj.codigo > this.codigo)
			return -1;
		
		return 0;
		
	} //Override compareTo;
	
} //Class Jogo;



































