package com.as.futebol;

import java.util.*;
import com.as.futebol.Utilidade.*;

/**
 * Serve para juntar os jogos de todas as jornadas, no entanto
 * é separada por escalões, sendo estes, Infantil, Iniciado e por ai adiante. 
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-28
*/

public class Competicao {

// ===================== ATRIBUTOS =======================

	private int codigo;
	private String nome;
	private Date inicio;
	private Date fim;
	private Escalao escalao;
	
	private List<Equipa> equipas = new ArrayList<Equipa>();
	private List<Jogo> jogos = new ArrayList<Jogo>();
	
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
	 * do atributo <b>inicio</b> que não é acessivel a
	 * outras classes.
	*/
	
	public Date getInicio() {
		return inicio;
	} //getInicio;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>inicio</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Date</b>.
	*/
	
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	} //setInicio;

	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>fim</b> que não é acessivel a
	 * outras classes.
	*/
	
	public Date getFim() {
		return fim;
	} //getFim;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>fim</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Date</b>.
	*/
	
	public void setFim(Date fim) {
		this.fim = fim;
	} //setFim;
	
	
	/**
	 * Este método tem o propósito de retornar o valor 
	 * do atributo <b>escalao</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.futebol.Utilidade.Escalao
	*/
	
	public Escalao getEscalao() {
		return escalao;
	} //getEscalao;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>escalao</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo Enum <b>Escalao</b>.
	 * 
	 * @see com.as.futebol.Utilidade.Escalao
	*/
	
	public void setEscalao(Escalao escalao) {
		this.escalao = escalao;
	} //setEscalao;
	
	
	/**
	 * Este método tem o propósito de retornar uma lista 
	 * do atributo <b>equipas</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.futebol.Equipa
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
	 * <br>- A não aceitação de uma equipa se esta já existir na competição
	 * <br>- Caso a equipa a ser adicionada possuir um escação diferente da competição.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.futebol.Equipa
	*/
	
	public void setEquipa (int index, Equipa equipa) {
		if (ProcurarEquipaPorCodigo(equipa.getCodigo()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado a competição '" + this.getNome() + "'!!!");
		
		if(equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("O escalão da equipa não corresponde ao da competição!!");
		
		this.equipas.set(index, equipa);
	} //setEquipa;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>equipas</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Equipa</b>.
	 * <p>
	 * Tem como validação:
	 * <br>- A não aceitação de uma equipa se esta já existir na competição
	 * <br>- Caso a equipa a ser adicionada possuir um escação diferente da competição.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.futebol.Equipa
	*/
	
	public void addEquipa(Equipa equipa) {
		if (ProcurarEquipaPorCodigo(equipa.getCodigo()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado a competição '" + this.getNome() + "'!!!");
			
		if(equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("O escalão da equipa não corresponde ao da competição!!");
			
		this.equipas.add(equipa);
	} //addEquipa;
	
	
	/**
	 * Este método tem o propósito de retornar uma lista 
	 * do atributo <b>jogos</b> que não é acessivel a
	 * outras classes.
	 * 
	 * @see com.as.futebol.Jogo
	*/
	
	public List<Jogo> getJogos() {
		return jogos;
	} //getJogos;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>jogos</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Jogo</b> 
	 * numa dada posição.
	 * <p>
	 * Tem como validação:
	 * <br>- Verificar se uma equipa ja está
	 * a participar de mais de um jogo por jornada.
	 * <br>- A não aceitação de um jogo se este já existir na competição.
	 * <br>- Verificar caso um jogo possui uma equipa que não seja da
	 * competição.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.futebol.Jogo
	*/
	
	public void setJogo (int index, Jogo jogo) {
		if (VerificarEquipaPorJornada(jogo))
			throw new IllegalArgumentException("Uma equipa do jogo '" + jogo.getCodigo() + "' ja pertence a jornada " + jogo.getJornada());
		
		if (ProcurarJogoPorCodigo(jogo.getCodigo()) != -1)
			throw new IllegalArgumentException("o jogo '" + jogo.getCodigo() + "' ja foi adicionado a competição '" + this.getNome() + "'!!!");
		
		if (!VerificarEquipaNaCompeticao(jogo))
			throw new IllegalArgumentException("O jogo não possui equipa da liga " + this.getNome());
		
		this.jogos.set(index, jogo);
	} //setJogo;
	
	/**
	 * Este método tem o propósito de alterar o valor 
	 * do atributo <b>jogos</b> que não é acessivel a
	 * outras classes ao receber um valor do tipo <b>Jogo</b>..
	 * <p>
	 * Tem como validação:
	 * <br>- Verificar se uma equipa ja está
	 * a participar de mais de um jogo por jornada.
	 * <br>- A não aceitação de um jogo se este já existir na competição.
	 * <br>- Verificar caso um jogo possui uma equipa que não seja da
	 * competição.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.futebol.Jogo
	*/
	
	public void addJogo (Jogo jogo) {
		if (VerificarEquipaPorJornada(jogo))
			throw new IllegalArgumentException("Uma equipa do jogo '" + jogo.getCodigo() + "' ja pertence a jornada " + jogo.getJornada());
		
		if (ProcurarJogoPorCodigo(jogo.getCodigo()) != -1)
			throw new IllegalArgumentException("o jogo '" + jogo.getCodigo() + "' ja foi adicionado a competição '" + this.getNome() + "'!!!");
		
		if (!VerificarEquipaNaCompeticao(jogo))
			throw new IllegalArgumentException("O jogo não possui equipa da liga " + this.getNome());
		
		this.jogos.add(jogo);
	} //addJogo;

// =================== CONSTRUTORES ======================

	//Construtor sem parametros;
	public Competicao () {
		
	} //Construtor Competicao;

	//Construtor com parametros;
	public Competicao(int codigoIdentificador, String nome, Date inicio, Date fim, Escalao escalao) {
		super();
		this.setCodigo(codigoIdentificador);
		this.setNome(nome);
		this.setInicio(inicio);
		this.setFim(fim);
		this.setEscalao(escalao);
	}//Construtor Competicao;

// =================== COMPORTAMENTOS ===================
	
	public String ClassificaoCompeticao () {
		String result = "Equipas (" + equipas.size() + ") \n";
		
		UpdateCompeticao();
		
		this.equipas.sort(null);
		
		for(Equipa equipa : equipas) {
			result += "Nome: " + equipa.getNome() + "\n";
			result += "Codigo: " + equipa.getCodigo() + "\n";
			result += "V/E/F: " + equipa.getVitoria() + " | " + equipa.getEmpate() + " | " + equipa.getFracasso() + "\n";
			result += "M/S: " + equipa.getGoloMarcado() + " | " + equipa.getGoloSofrido() + "\n\n";
		}
		
		return result;
	}
	
	/**
	 * Mostra informações relativa a classe <b>Competicao</b>.
	 * 
	 * @deprecated 
	 * @since 2020-05-28
	*/
		
	public String MostrarInformacao () {
		String result = "";
		
		result += "Codigo: " + this.getCodigo() + "\n";
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
		
		for (Jogo jogo : jogos) {
			if (jogo.getJornada() == jornada)
				result += jogo.MostrarInformacao();
		}
		
		return result;
		
	} //MostrarJogosPorJornada;
	
	
  	public boolean EliminarEquipa (int codigo) {
		int aux = ProcurarEquipaPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		for(Jogo jogo : jogos) {
			if (jogo.getEquipaVisitada().getCodigo() == equipas.get(aux).getCodigo())
				return false;
			
			if (jogo.getEquipaVisitante().getCodigo() == equipas.get(aux).getCodigo())
				return false;
		}
		
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
	
	
 	private int ProcurarEquipaPorCodigo (int codigo) {
		
		for (int i = 0; i < equipas.size(); i++) {
			if (equipas.get(i).getCodigo() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarEquipaPorCodigo;
	
	private int ProcurarJogoPorCodigo (int codigo) {
		
		for (int i = 0; i < jogos.size(); i++) {
			if (jogos.get(i).getCodigo() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarJogoPorCodigo;
	
	
	private boolean VerificarEquipaNaCompeticao (Jogo jogo) {
		int auxCodigoEquipaVisitada = jogo.getEquipaVisitada().getCodigo();
		int auxCodigoEquipaVisitante = jogo.getEquipaVisitante().getCodigo();
		
		int auxEquipaVisitada = ProcurarEquipaPorCodigo(auxCodigoEquipaVisitada);
		int auxEquipaVisitante = ProcurarEquipaPorCodigo(auxCodigoEquipaVisitante);
		
		if (auxEquipaVisitada != -1 && auxEquipaVisitante != -1) 
			return true;
		
		return false;
	} //VerificarEquipa;

	private boolean VerificarEquipaPorJornada(Jogo _jogo) {
		for(Jogo jogo : jogos) {
			if (jogo.getJornada() == _jogo.getJornada()) {
				if(jogo.getEquipaVisitada().getCodigo() == _jogo.getEquipaVisitada().getCodigo())
					return true;
						
				if(jogo.getEquipaVisitante().getCodigo() == _jogo.getEquipaVisitante().getCodigo())
					return true;
			}
		}
		
		return false;
	}

	private void UpdateCompeticao() {
		
		for (Jogo jogo : jogos) {
			jogo.getEquipaVisitada().AddGoloMarcado(jogo.getGoloEquipaVisitada());
			jogo.getEquipaVisitante().AddGoloMarcado(jogo.getGoloEquipaVisitante());
			
			jogo.getEquipaVisitada().AddGoloSofrido(jogo.getGoloEquipaVisitante());
			jogo.getEquipaVisitante().AddGoloSofrido(jogo.getGoloEquipaVisitada());

			if (jogo.getGoloEquipaVisitada() < jogo.getGoloEquipaVisitante()) {
				jogo.getEquipaVisitante().AddVitoria(); 
				jogo.getEquipaVisitada().AddFracasso(); 
			}
			
			if (jogo.getGoloEquipaVisitada() > jogo.getGoloEquipaVisitante()) {
				jogo.getEquipaVisitada().AddVitoria();
				jogo.getEquipaVisitante().AddFracasso();
			}
			
			if (jogo.getGoloEquipaVisitada() == jogo.getGoloEquipaVisitante()) {
				jogo.getEquipaVisitante().AddEmpate();
				jogo.getEquipaVisitada().AddEmpate();
			}
		}
		
	} //UpdateCompeticao;
	
// ============== MÉTODOS COMPLEMENTARES =================

    // ----> toString()
	@Override
 	public String toString() {
		return "Competicao [codigoIdentificador=" + codigo + ", nome=" + nome + ", inicio=" + inicio
				+ ", fim=" + fim + ", escalao=" + escalao + ", equipas=" + equipas + ", jogos=" + jogos + "]";
	}//Override toString;
	
} //Class Competicao;






























