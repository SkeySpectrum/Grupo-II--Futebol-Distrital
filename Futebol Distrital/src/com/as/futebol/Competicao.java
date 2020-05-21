package com.as.futebol;

import java.util.*;

import com.as.futebol.Equipa.Escalao;

public class Competicao {

    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigoIdentificador;
	private String nome;
	private Date inicio;
	private Date fim;
	private Escalao escalao;
	private List<Equipa> equipas = new ArrayList<Equipa>();
	private List<Jogo> jogos = new ArrayList<Jogo>();
	
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
	
	
	public Date getInicio() {
		return inicio;
	} //getInicio;
	
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	} //setInicio;

	
	public Date getFim() {
		return fim;
	} //getFim;
	
	public void setFim(Date fim) {
		this.fim = fim;
	} //setFim;
	
	
	public Escalao getEscalao() {
		return escalao;
	} //getEscalao;
	
	public void setEscalao(Escalao escalao) {
		this.escalao = escalao;
	} //setEscalao;
	
	
	public List<Equipa> getEquipas() {
		return equipas;
	} //getEquipas;
	
	public void setEquipa (int index, Equipa equipa) {
		if (ProcurarEquipaPorCodigo(equipa.getCodigoIndentificador()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado a competição '" + this.getNome() + "'!!!");
		
		if(equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("O escalão da equipa não corresponde ao da competição!!");
		
		this.equipas.set(index, equipa);
	} //setEquipa;
	
	public void addEquipa(Equipa equipa) {
		if (ProcurarEquipaPorCodigo(equipa.getCodigoIndentificador()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado a competição '" + this.getNome() + "'!!!");
			
		if(equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("O escalão da equipa não corresponde ao da competição!!");
			
		this.equipas.add(equipa);
	} //addEquipa;
	
	
	public List<Jogo> getJogos() {
		return jogos;
	} //getJogos;
	
	public void setJogo (int index, Jogo jogo) {
		if (ProcurarJogoPorCodigo(jogo.getCodigoIndentificador()) != -1)
			throw new IllegalArgumentException("o jogo '" + jogo.getCodigoIndentificador() + "' ja foi adicionado a competição '" + this.getNome() + "'!!!");
		
		if (!VerificarEquipaNaCompeticao(jogo))
			throw new IllegalArgumentException("O jogo não possui equipa da liga " + this.getNome());
		
		this.jogos.set(index, jogo);
	} //setJogo;
	
	public void addJogo (Jogo jogo) {
		if (ProcurarJogoPorCodigo(jogo.getCodigoIndentificador()) != -1)
			throw new IllegalArgumentException("o jogo '" + jogo.getCodigoIndentificador() + "' ja foi adicionado a competição '" + this.getNome() + "'!!!");
		
		if (!VerificarEquipaNaCompeticao(jogo))
			throw new IllegalArgumentException("O jogo não possui equipa da liga " + this.getNome());
		
		this.jogos.add(jogo);
	} //addJogo;

    // =======================================================
    // =================== CONSTRUTORES ======================
    // =======================================================

	//Construtor sem parametros;
	public Competicao () {
		
	} //Construtor Competicao;

	//Construtor com parametros;
	public Competicao(int codigoIdentificador, String nome, Date inicio, Date fim, Escalao escalao) {
		super();
		this.setCodigoIdentificador(codigoIdentificador);
		this.setNome(nome);
		this.setInicio(inicio);
		this.setFim(fim);
		this.setEscalao(escalao);
	}//Construtor Competicao;
	
    // =======================================================
    // =================== .COMPORTAMENTOS ===================
    // =======================================================

	public String MostrarInformacao () {
		String result = "";
		
		result += "Codigo: " + this.getCodigoIdentificador() + "\n";
		result += "Nome: " + this.getNome() + "\n";
		result += "Escalão: " + this.getEscalao().toString() + "\n";
		result += "Inicio/Fim: " + this.getInicio() + " | " +  this.getFim() + "\n";
		result += "Equipas (" + this.getEquipas().size() + ") \n";
		result += "Jogos (" + this.getJogos().size() + ") \n\n";
		
		return result;
	} //MostrarInformacao;
	
	
	public String MostrarEquipas () {
		String result = "Equipas (" + equipas.size() + ") \n\n";
		
		for(Equipa equipa : equipas) {
			
			result += equipa.MostrarInformacao();
			/*result += equipa.getNome() + " | ";
			result += "Jogador: (" + equipa.getJogadores().size() + ") | ";
			result += "Treinador: (" + equipa.getTreinadores().size() + ") | ";
			result += equipa.getEscalao().toString() + "\n\n";*/
		}
		
		return result;
		
	} //MostrarEquipas;
	
	public String MostrarJogosPorJornada (int jornada) {
		String result = "";
		
		for (int i = 0; i < jogos.size(); i++) {
			if (jogos.get(i).getJornada() == jornada) {
				result += jogos.get(i).MostrarInformacao();
			}
		}
		
		return result;
		
	} //MostrarJogosPorJornada;
	
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
	
	
	public boolean EliminarJogo (int codigo) {
		int aux = ProcurarEquipaPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		equipas.remove(aux);
		return true;
		
	} //EliminarJogo;

	public boolean EditarJogo (int codigo, Jogo jogo) {
		int aux = ProcurarJogoPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		jogos.set(aux, jogo);
		return true;
		
	} //EditarJogo;
	
	private int ProcurarJogoPorCodigo (int codigo) {
		
		for (int i = 0; i < jogos.size(); i++) {
			if (jogos.get(i).getCodigoIndentificador() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarJogoPorCodigo;
	
	
	private boolean VerificarEquipaNaCompeticao (Jogo jogo) {
		int auxCodigoEquipaVisitada = jogo.getEquipaVisitada().getCodigoIndentificador();
		int auxCodigoEquipaVisitante = jogo.getEquipaVisitante().getCodigoIndentificador();
		
		int auxEquipaVisitada = ProcurarEquipaPorCodigo(auxCodigoEquipaVisitada);
		int auxEquipaVisitante = ProcurarEquipaPorCodigo(auxCodigoEquipaVisitante);
		
		if (auxEquipaVisitada != -1 && auxEquipaVisitante != -1) 
			return true;
		
		return false;
	} //VerificarEquipa;
	
	//private int 
    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES =================
    // =======================================================

    // ----> toString()

    // ----> equals()
	
} //Class Competicao;






























