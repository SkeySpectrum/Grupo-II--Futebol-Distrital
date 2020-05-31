package com.as.futebol;

import java.util.*;

/**
 * O Jogo � composto por duas equipas do mesmo escal�o 
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
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>codigo</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getCodigo() {
		return codigo;
	} //getCodigoIndentificador;

	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>codigo</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	} //setCodigoIndentificador;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>equipaVisitada</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public Equipa getEquipaVisitada() {
		return equipaVisitada;
	} //getEquipaVisitada;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>equipaVisitada</b> que n�o � acessivel a
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
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>equipaVisitante</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public Equipa getEquipaVisitante() {
		return equipaVisitante;
	} //getEquipaVisitante;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>equipaVisitante</b> que n�o � acessivel a
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
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>goloEquipaVisitada</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getGoloEquipaVisitada() {
		return goloEquipaVisitada;
	} //getGoloEquipaVisitada;

	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>goloEquipaVisitante</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getGoloEquipaVisitante() {
		return goloEquipaVisitante;
	} //getGoloEquipaVisitante;

	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>data</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public Date getData() {
		return data;
	} //getData;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>data</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Date</b>.
	*/
	
	public void setData(Date data) {
		this.data = data;
	} //setData;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>jornada</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getJornada() {
		return jornada;
	} //getJornada;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>jornada</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setJornada(int jornada) {
		this.jornada = jornada;
	} //setJornada;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar uma lista 
	 * do atributo <b>arbitros</b> que n�o � acessivel a
	 * outras classes.
	 * 
	 * @see com.as.futebol.Arbitro
	*/
	
	public List<Arbitro> getArbitros() {
		return arbitros;
	} //getArbitros;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>arbitros</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Arbitro</b> 
	 * numa dada posi��o.
	 * <p>
	 * Tem como valida��o:
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
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>arbitros</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Arbitro</b>.
	 * <p>
	 * Tem como valida��o:
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
	
// ============== M�TODOS COMPLEMENTARES =================

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



































