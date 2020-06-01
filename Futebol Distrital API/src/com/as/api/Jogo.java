package com.as.api;

import java.time.LocalDate;
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
	private LocalDate data;
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
	
	public LocalDate getData() {
		return data;
	} //getData;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>data</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>LocalDate</b>.
	*/
	
	public void setData(LocalDate data) {
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
	 * @see com.as.api.Arbitro
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
	 * @see com.as.api.Arbitro
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
	 * @see com.as.api.Arbitro
	*/
	
	public void addArbitro(Arbitro arbitro) {
		if (ProcurarArbitroPorCodigo(arbitro.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Arbitro '" + arbitro.getNome() + "' ja existe no jogo '" + this.getCodigo());
		
		this.arbitros.add(arbitro);
	} //addArbitros;
	
// =================== CONSTRUTORES ======================

	//Construtor sem parametro;
	public Jogo () {
		
	} //Construtor Jogo;

	//Construtor com parametro;
	public Jogo(int codigoIndentificador, Equipa equipaVisitada, Equipa equipaVisitante, LocalDate data, int jornada, Arbitro arbitro) {
		super();
		this.setCodigo(codigoIndentificador);
		this.setEquipaVisitada(equipaVisitada);
		this.setEquipaVisitante(equipaVisitante);
		this.setData(data); 
		this.setJornada(jornada);
		this.addArbitro(arbitro);
	} //Construtor Jogo;
	
// =================== COMPORTAMENTOS ===================

	/**
	 * Mostra informa��es relativa a classe <b>Jogo</b>.
	 * 
	 * @deprecated 
	 * @since 2020-05-28
	*/
	
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
	
	
	/**
	 * Eliminar um arbitro baseado no numero de cart�o.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarArbitroPorCodigo()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe arbitro.
	*/
	
  	public boolean EliminarArbitro (int codigo) {
		int aux = ProcurarArbitroPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		arbitros.remove(aux);
		return true;
		
	} //EliminarArbitro;
  	
	/**
	 * Editar um arbitro baseado no numero de cart�o.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarArbitroPorCodigo()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe arbitro.
	*/
  	
	public boolean EditarArbitro (int codigo, Arbitro arbitro) {
		int aux = ProcurarArbitroPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		arbitros.set(aux, arbitro);
		return true;
		
	} //EditarArbitro;
	
	/**
	 * Um m�todo de auxiliar que procura por um arbitro dado um numero de
	 * cart�o e retorna -1 caso n�o encontre, e se encontrar ele retorna
	 * a posi��o no <b>ArrayList</b>
	*/
	
	private int ProcurarArbitroPorCodigo (int codigo) {
		
		for (int i = 0; i < arbitros.size(); i++) {
			if (arbitros.get(i).getNumeroCartaoCidadao() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarArbitroPorCodigo;
	
	
	/**
	 * Adiciona golos marcados a uma equipa, e recebe o codigo da equipa para
	 * identificar qual dever� adicionar golos
	*/
	
	public void AdicionarGolo (int codigo) {
		
		if (this.getEquipaVisitada().getCodigo() == codigo)
			this.goloEquipaVisitada += 1;
		
		if (this.getEquipaVisitante().getCodigo() == codigo)
			this.goloEquipaVisitante += 1;
		
	} //AdicionarGolo;
	
	/**
	 * Remove golos marcados a uma equipa, e recebe o codigo da equipa para
	 * identificar qual dever� remover golos
	*/
	
	public void RemoverGolo (int codigo) {
		
		if (this.getEquipaVisitada().getCodigo() == codigo)
			this.goloEquipaVisitada -= 1;
		
		if (this.getEquipaVisitante().getCodigo() == codigo)
			this.goloEquipaVisitante -= 1;
		
	} //AdicionarGolo;

// ============== M�TODOS COMPLEMENTARES =================

	/**
	 * Comprimi todas as informa��es da classe e as
	 * transforma em formato <b>String</b>
	*/
	
    // ----> toString()
	@Override
	public String toString() {
		return "Jogo [codigoIndentificador=" + codigo + ", equipaVisitada=" + equipaVisitada
				+ ", equipaVisitante=" + equipaVisitante + ", goloEquipaVisitada=" + goloEquipaVisitada
				+ ", goloEquipaVisitante=" + goloEquipaVisitante + ", data=" + data + ", jornada=" + jornada
				+ ", arbitros=" + arbitros + "]";
	}//Override toString;
	
	/**
	 * � usado para fazer uma compara��o entre objectos, neste caso 
	 * � mais usado para fazer uma ordena��o;
	*/
	
	// ----> compareTo()
	@Override
	public int compareTo(Jogo obj) {
		// 0 - iguais
		// 1 - maior do que estou a comparar
		// -1 - menor do que estou a comparar
		
		if (obj.jornada > this.jornada)
			return 1;
		
		if (obj.jornada < this.jornada)
			return -1;
		
		
		if (obj.codigo > this.codigo)
			return 1;
		
		if (obj.codigo < this.codigo)
			return -1;
		
		return 0;
		
	} //Override compareTo;
	
} //Class Jogo;



































