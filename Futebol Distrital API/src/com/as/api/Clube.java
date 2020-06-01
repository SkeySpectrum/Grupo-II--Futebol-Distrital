package com.as.api;

import java.time.LocalDate;
import java.util.*;

import com.as.api.Utilidade.*;

/**
 * O clube é composto por varias equipas, as equipas podem ser de diversos escalões.
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
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>codigo</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getCodigo() {
		return codigo;
	} //getCodigo;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>codigo</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	} //setCodigo;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>nome</b> que não é acessivel a
	 * outras classes.
	*/
	
	public String getNome() {
		return nome;
	} //getNome;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>nome</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>dataFundacao</b> que não é acessivel a
	 * outras classes.
	*/
	
	public LocalDate getDataFundacao() {
		return dataFundacao;
	} //getDataFundacao
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>dataFundacao</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>LocalDate</b>.
	*/
	
	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	} //setDataFundacao;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>escalao</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Utilidade.Escalao
	*/
	
	public Escalao getEscalao() {
		return escalao;
	} //getEscalao;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>escalao</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo Enum <b>Escalao</b>.
	 * 
	 * @see com.as.api.Utilidade.Escalao
	*/
	
	public void setEscalao(Escalao escalao) {
		this.escalao = escalao;
	} //setEscalao;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>corEquipamento</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Utilidade.CorEquipamento
	*/
	
	public CorEquipamento getCorEquipamento() {
		return corEquipamento;
	} //getCorEquipamento;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>corEquipamento</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo Enum <b>Escalao</b>.
	 * 
	 * @see com.as.api.Utilidade.CorEquipamento
	*/
	
	public void setCorEquipamento(CorEquipamento corEquipamento) {
		this.corEquipamento = corEquipamento;
	} //setCorEquipamento;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>contacto</b> que não é acessivel a
	 * outras classes.
	*/
	
	public int getContacto() {
		return contacto;
	} //getContacto;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>contacto</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>int</b>.
	*/
	
	public void setContacto(int contacto) {
		this.contacto = contacto;
	} //setContacto;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>email</b> que não é acessivel a
	 * outras classes.
	*/
	
	public String getEmail() {
		return email;
	} //getEmail;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>email</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setEmail(String email) {
		this.email = email;
	} //setEmail;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>morada</b> que não é acessivel a
	 * outras classes.
	*/
	
	public String getMorada() {
		return morada;
	} //getMorada;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>morada</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>String</b>.
	*/
	
	public void setMorada(String morada) {
		this.morada = morada;
	} //setMorada;
	
	
	/**
	 * Este método tem o propósito de retornar uma lista 
	 * do atributo <b>equipas</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Equipa
	*/
	
	public List<Equipa> getEquipas() {
		return equipas;
	} //getEquipas;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>equipas</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Equipa</b> 
	 * numa dada posição.
	 * <p>
	 * Tem como validação:
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
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' não possui jogadores ou treinadores o suficiente!!!");
		
		if (ProcurarEquipaPorCodigo(equipa.getCodigo()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado ao clube '" + this.getNome() + "'!!!");
		
		if (equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' não é do mesmo escalão que o clube '" + this.getNome() + "'!!!");
		
		this.equipas.set(index, equipa);
	} //setEquipas;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>equipas</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Equipa</b>.
	 * <p>
	 * Tem como validação:
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
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' não possui jogadores ou treinadores o suficiente!!!");
			
		if (ProcurarEquipaPorCodigo(equipa.getCodigo()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado ao clube '" + this.getNome() + "'!!!");
		
		if (equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' não é do mesmo escalão que o clube '" + this.getNome() + "'!!!");
		
		
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
	 * Mostra informações relativa a classe <b>Jogo</b>.
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
 		result += "Fundação: " + this.getDataFundacao() + "\n";
 		result += "Escalão: " + this.getEscalao() + "\n\n";
 		
 		return result;
 	} //MostrarInformacao;
 
	/**
	 * Lista informações relativa a <b>equipas</b> que estão
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
	 * Este método tem como auxiliar um método <b>ProcurarEquipaPorCodigo()</b>,
	 * após receber o parametro de validação ele verifica, caso o valor seja igual -1
	 * quer dizer que não existe equipa.
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
	 * Este método tem como auxiliar um método <b>ProcurarEquipaPorCodigo()</b>,
	 * após receber o parametro de validação ele verifica, caso o valor seja igual -1
	 * quer dizer que não existe equipa.
	*/
  	
	public boolean EditarEquipa (int codigo, Equipa equipa) {
		int aux = ProcurarEquipaPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		equipas.set(aux, equipa);
		return true;
		
	} //EditarEquipa;
	
	/**
	 * Um método de auxiliar que procura por uma equipa dado um codigo
	 * e retorna -1 caso não encontre, e se encontrar ele retorna
	 * a posição no <b>ArrayList</b>
	*/
	
	private int ProcurarEquipaPorCodigo (int codigo) {
		
		for (int i = 0; i < equipas.size(); i++) {
			if (equipas.get(i).getCodigo() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarEquipaPorCodigo;

// ============== MÉTODOS COMPLEMENTARES =================

	/**
	 * Comprimi todas as informações da classe e as
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




































