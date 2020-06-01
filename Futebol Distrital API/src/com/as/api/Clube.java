package com.as.api;

import java.time.LocalDate;
import java.util.*;

import com.as.api.Utilidade.*;

/**
 * O clube � composto por varias equipas, as equipas podem ser de diversos escal�es.
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-29
*/

@SuppressWarnings("deprecation")
public class Clube {
	
// ===================== ATRIBUTOS =======================

	private int codigo;
	private String nome;
	private LocalDate dataFundacao;
	private Escalao escalao;
	private CorEquipamento corEquipamento;
	private int contacto;
	private String email;
	private String morada;
	private List<Equipa> equipas = new ArrayList<Equipa>();
	
// ============ ACESSORES e MODIFICADORES ================

	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>codigo</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getCodigo() {
		return codigo;
	} //getCodigo;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>codigo</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	} //setCodigo;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>nome</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public String getNome() {
		return nome;
	} //getNome;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>nome</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>dataFundacao</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public LocalDate getDataFundacao() {
		return dataFundacao;
	} //getDataFundacao
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>dataFundacao</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>LocalDate</b>.
	*/
	
	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	} //setDataFundacao;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>escalao</b> que n�o � acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Utilidade.Escalao
	*/
	
	public Escalao getEscalao() {
		return escalao;
	} //getEscalao;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>escalao</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo Enum <b>Escalao</b>.
	 * 
	 * @see com.as.api.Utilidade.Escalao
	*/
	
	public void setEscalao(Escalao escalao) {
		this.escalao = escalao;
	} //setEscalao;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>corEquipamento</b> que n�o � acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Utilidade.CorEquipamento
	*/
	
	public CorEquipamento getCorEquipamento() {
		return corEquipamento;
	} //getCorEquipamento;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>corEquipamento</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo Enum <b>Escalao</b>.
	 * 
	 * @see com.as.api.Utilidade.CorEquipamento
	*/
	
	public void setCorEquipamento(CorEquipamento corEquipamento) {
		this.corEquipamento = corEquipamento;
	} //setCorEquipamento;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>contacto</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getContacto() {
		return contacto;
	} //getContacto;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>contacto</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setContacto(int contacto) {
		this.contacto = contacto;
	} //setContacto;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>email</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public String getEmail() {
		return email;
	} //getEmail;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>email</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setEmail(String email) {
		this.email = email;
	} //setEmail;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>morada</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public String getMorada() {
		return morada;
	} //getMorada;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>morada</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setMorada(String morada) {
		this.morada = morada;
	} //setMorada;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar uma lista 
	 * do atributo <b>equipas</b> que n�o � acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Equipa
	*/
	
	public List<Equipa> getEquipas() {
		return equipas;
	} //getEquipas;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>equipas</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Equipa</b> 
	 * numa dada posi��o.
	 * <p>
	 * Tem como valida��o:
	 * <br>- Equipa possuir mais do que 1 jogador
	 * <br>- Equipa possuir mais do que 1 treinador
	 * <br>- Caso a equipa ja exista no clube
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Equipa
	*/
	
	public void setEquipa(int index, Equipa equipa) {
		if (equipa.getJogadores().size() < 1 || equipa.getTreinadores().size() < 1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' n�o possui jogadores ou treinadores o suficiente!!!");
		
		if (ProcurarEquipaPorCodigo(equipa.getCodigo()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado ao clube '" + this.getNome() + "'!!!");
		
		if (equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' n�o � do mesmo escal�o que o clube '" + this.getNome() + "'!!!");
		
		this.equipas.set(index, equipa);
	} //setEquipas;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>equipas</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Equipa</b>.
	 * <p>
	 * Tem como valida��o:
	 * <br>- Equipa possuir mais do que 1 jogador
	 * <br>- Equipa possuir mais do que 1 treinador
	 * <br>- Caso a equipa ja exista no clube
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Equipa
	*/
	
	public void addEquipa(Equipa equipa) {	
		if (equipa.getJogadores().size() < 1 || equipa.getTreinadores().size() < 1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' n�o possui jogadores ou treinadores o suficiente!!!");
			
		if (ProcurarEquipaPorCodigo(equipa.getCodigo()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado ao clube '" + this.getNome() + "'!!!");
		
		if (equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' n�o � do mesmo escal�o que o clube '" + this.getNome() + "'!!!");
		
		
		this.equipas.add(equipa);
	} //addEquipas;

// =================== CONSTRUTORES ======================
	
	//Construtor sem parametro;
	public Clube () {
		
	} //Construtor Clube;

	//Construtor com parametro;
 	public Clube(int codigoIdentificador, String nome, LocalDate dataFundacao, Escalao escalao,
			CorEquipamento corEquipamento, int contacto, String email, String morada) {
		super();
		this.codigo = codigoIdentificador;
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.escalao = escalao;
		this.corEquipamento = corEquipamento;
		this.contacto = contacto;
		this.email = email;
		this.morada = morada;
	} //Construtor Clube;
	
// =================== COMPORTAMENTOS ===================

	/**
	 * Mostra informa��es relativa a classe <b>Jogo</b>.
	 * 
	 * @deprecated 
	 * @since 2020-05-28
	*/
 	
 	public String MostrarInformacao() {
 		String result = "";
 		
 		result += "Clube: " + this.getNome() + "\n";
 		result += "Codigo: " + this.getCodigo() + "\n";
 		result += "Equipas (" + this.getEquipas().size() + ") \n";
 		result += "Email: " + this.getEmail() + "\n";
 		result += "Morada: " + this.getMorada() + "\n";
 		result += "Contacto: " + this.getContacto() + "\n";
 		result += "Equipamento: " + this.getCorEquipamento() + "\n";
 		result += "Funda��o: " + this.getDataFundacao() + "\n";
 		result += "Escal�o: " + this.getEscalao() + "\n\n";
 		
 		return result;
 	} //MostrarInformacao;
 
	/**
	 * Lista informa��es relativa a <b>equipas</b> que est�o
	 * adicionados na classe <b>Cluble</b>
	*/
	
	public String MostrarEquipas () {
		String result = "Equipas (" + equipas.size() + ") \n\n";
		
		for(Equipa equipa : equipas) {
			result += equipa.MostrarInformacao();
		}
		
		return result;
		
	} //MostrarEquipas;
 	
	
 	/**
 	 * Serve para determinar o numero de jogadores que o clube possui
 	 * ao verificar em cada equipa que foi adicionado ao clube.
 	*/
 	
	public int CalcularNumeroDeJogadores () {
		int aux = 0;
		
		for (Equipa equipa : equipas) {
			aux += equipa.getJogadores().size();
		}
		
		return aux;
		
	} //CalcularNumeroDeJogadores;
	
 	/**
 	 * Serve para determinar o numero de treinadores que o clube possui
 	 * ao verificar em cada equipa que foi adicionado ao clube.
 	*/
	
	public int CalcularNumeroDeTreinadores () {
		int aux = 0;
		
		for (Equipa equipa : equipas) {
			aux += equipa.getTreinadores().size();
		}
		
		return aux;
		
	} //CalcularNumeroDeTreinadores;
	
	
	/**
	 * Eliminar um equipa baseado no codigo.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarEquipaPorCodigo()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe equipa.
	*/
	
  	public boolean EliminarEquipa (int codigo) {
		int aux = ProcurarEquipaPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		equipas.remove(aux);
		return true;
		
	} //EliminarEquipa;

	/**
	 * Editar um equipa baseado no codigo.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarEquipaPorCodigo()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe equipa.
	*/
  	
	public boolean EditarEquipa (int codigo, Equipa equipa) {
		int aux = ProcurarEquipaPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		equipas.set(aux, equipa);
		return true;
		
	} //EditarEquipa;
	
	/**
	 * Um m�todo de auxiliar que procura por uma equipa dado um codigo
	 * e retorna -1 caso n�o encontre, e se encontrar ele retorna
	 * a posi��o no <b>ArrayList</b>
	*/
	
	private int ProcurarEquipaPorCodigo (int codigo) {
		
		for (int i = 0; i < equipas.size(); i++) {
			if (equipas.get(i).getCodigo() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarEquipaPorCodigo;

// ============== M�TODOS COMPLEMENTARES =================

	/**
	 * Comprimi todas as informa��es da classe e as
	 * transforma em formato <b>String</b>
	*/
	
    // ----> toString()
	@Override
	public String toString() {
		return "Clube [codigoIdentificador=" + codigo + ", nome=" + nome + ", dataFundacao=" + dataFundacao
				+ ", escalao=" + escalao + ", corEquipamento=" + corEquipamento + ", contacto=" + contacto + ", email="
				+ email + ", morada=" + morada + ", equipas=" + equipas + "]";
	} //Override toString;
	
} //Class Clube;




































