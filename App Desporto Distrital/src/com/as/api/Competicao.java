package com.as.api;

import java.util.*;
import java.time.LocalDate;

import com.as.api.Utilidade.*;

/**
 * Serve para juntar os jogos de todas as jornadas, no entanto
 * � separada por escal�es, sendo estes, Infantil, Iniciado e por ai adiante. 
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-28
*/

@SuppressWarnings("deprecation")
public class Competicao {

// ===================== ATRIBUTOS =======================

	private int codigo;
	private String nome;
	private LocalDate inicio;
	private LocalDate fim;
	private Escalao escalao;
	
	private List<Equipa> equipas = new ArrayList<Equipa>();
	private List<Jogo> jogos = new ArrayList<Jogo>();
	
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
	 * do atributo <b>inicio</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public LocalDate getInicio() {
		return inicio;
	} //getInicio;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>inicio</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>LocalDate</b>.
	*/
	
	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	} //setInicio;

	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>fim</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public LocalDate getFim() {
		return fim;
	} //getFim;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>fim</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>LocalDate</b>.
	*/
	
	public void setFim(LocalDate fim) {
		this.fim = fim;
	} //setFim;
	
	
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
	 * <br>- A n�o aceita��o de uma equipa se esta j� existir na competi��o
	 * <br>- Caso a equipa a ser adicionada possuir um esca��o diferente da competi��o.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Equipa
	*/
	
	public void setEquipa (int index, Equipa equipa) {
		if (ProcurarEquipaPorCodigo(equipa.getCodigo()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado a competi��o '" + this.getNome() + "'!!!");
		
		if(equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("O escal�o da equipa n�o corresponde ao da competi��o!!");
		
		this.equipas.set(index, equipa);
	} //setEquipa;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>equipas</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Equipa</b>.
	 * <p>
	 * Tem como valida��o:
	 * <br>- A n�o aceita��o de uma equipa se esta j� existir na competi��o
	 * <br>- Caso a equipa a ser adicionada possuir um esca��o diferente da competi��o.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Equipa
	*/
	
	public void addEquipa(Equipa equipa) {
		if (ProcurarEquipaPorCodigo(equipa.getCodigo()) != -1)
			throw new IllegalArgumentException("A equipa '" + equipa.getNome() + "' ja foi adicionado a competi��o '" + this.getNome() + "'!!!");
			
		if(equipa.getEscalao() != this.getEscalao())
			throw new IllegalArgumentException("O escal�o da equipa n�o corresponde ao da competi��o!!");
			
		this.equipas.add(equipa);
	} //addEquipa;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar uma lista 
	 * do atributo <b>jogos</b> que n�o � acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Jogo
	*/
	
	public List<Jogo> getJogos() {
		return jogos;
	} //getJogos;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>jogos</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Jogo</b> 
	 * numa dada posi��o.
	 * <p>
	 * Tem como valida��o:
	 * <br>- Verificar se uma equipa ja est�
	 * a participar de mais de um jogo por jornada.
	 * <br>- A n�o aceita��o de um jogo se este j� existir na competi��o.
	 * <br>- Verificar caso um jogo possui uma equipa que n�o seja da
	 * competi��o.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Jogo
	*/
	
	public void setJogo (int index, Jogo jogo) {
		if (VerificarEquipaPorJornada(jogo))
			throw new IllegalArgumentException("Uma equipa do jogo '" + jogo.getCodigo() + "' ja pertence a jornada " + jogo.getJornada());
		
		if (ProcurarJogoPorCodigo(jogo.getCodigo()) != -1)
			throw new IllegalArgumentException("o jogo '" + jogo.getCodigo() + "' ja foi adicionado a competi��o '" + this.getNome() + "'!!!");
		
		if (!VerificarEquipaNaCompeticao(jogo))
			throw new IllegalArgumentException("O jogo n�o possui equipa da liga " + this.getNome());
		
		this.jogos.set(index, jogo);
	} //setJogo;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>jogos</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Jogo</b>..
	 * <p>
	 * Tem como valida��o:
	 * <br>- Verificar se uma equipa ja est�
	 * a participar de mais de um jogo por jornada.
	 * <br>- A n�o aceita��o de um jogo se este j� existir na competi��o.
	 * <br>- Verificar caso um jogo possui uma equipa que n�o seja da
	 * competi��o.
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Jogo
	*/
	
	public void addJogo (Jogo jogo) {
		if (VerificarEquipaPorJornada(jogo))
			throw new IllegalArgumentException("Uma equipa do jogo '" + jogo.getCodigo() + "' ja pertence a jornada " + jogo.getJornada());
		
		if (ProcurarJogoPorCodigo(jogo.getCodigo()) != -1)
			throw new IllegalArgumentException("o jogo '" + jogo.getCodigo() + "' ja foi adicionado a competi��o '" + this.getNome() + "'!!!");
		
		if (!VerificarEquipaNaCompeticao(jogo))
			throw new IllegalArgumentException("O jogo n�o possui equipa da liga " + this.getNome());
		
		this.jogos.add(jogo);
	} //addJogo;

// =================== CONSTRUTORES ======================

	//Construtor sem parametros;
	public Competicao () {
		
	} //Construtor Competicao;

	//Construtor com parametros;
	public Competicao(int codigoIdentificador, String nome, LocalDate inicio, LocalDate fim, Escalao escalao) {
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
	 * Mostra informa��es relativa a classe <b>Competicao</b>.
	 * 
	 * @deprecated 
	 * @since 2020-05-28
	*/
		
	public String MostrarInformacao () {
		String result = "";
		
		result += "Codigo: " + this.getCodigo() + "\n";
		result += "Nome: " + this.getNome() + "\n";
		result += "Escal�o: " + this.getEscalao().toString() + "\n";
		result += "Inicio/Fim: " + this.getInicio() + " | " +  this.getFim() + "\n";
		result += "Equipas (" + this.getEquipas().size() + ") \n";
		result += "Jogos (" + this.getJogos().size() + ") \n\n";
		
		return result;
	} //MostrarInformacao;
	
	/**
	 * Lista informa��es relativa a <b>equipas</b> que est�o
	 * adicionados na classe <b>Competicao</b>
	*/
	
	public String MostrarEquipas () {
		String result = "Equipas (" + equipas.size() + ") \n\n";
		
		for(Equipa equipa : equipas) {
			result += equipa.MostrarInformacao();
		}
		
		return result;
		
	} //MostrarEquipas;
	
	/**
	 * Lista informa��es relativa a <b>jogos</b> que est�o
	 * adicionados na classe <b>Competicao</b> numa certa jornada
	*/
	
	public String MostrarJogosPorJornada (int jornada) {
		String result = "";
		
		for (Jogo jogo : jogos) {
			if (jogo.getJornada() == jornada)
				result += jogo.MostrarInformacao();
		}
		
		return result;
		
	} //MostrarJogosPorJornada;
	
	
	/**
	 * Eliminar uma equipa baseado no codigo.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarEquipaPorCodigo()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe equipa.
	*/
	
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

	/**
	 * Editar uma equipa baseado no codigo.
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
	
	
	/**
	 * Eliminar um jogo baseado no codigo.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarJogoPorCodigo()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe jogo.
	*/
 	
	public boolean EliminarJogo (int codigo) {
		int aux = ProcurarJogoPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		jogos.remove(aux);
		return true;
		
	} //EliminarJogo;

	/**
	 * Editar um jogo baseado no codigo.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarJogoPorCodigo()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe jogo.
	*/
	
	public boolean EditarJogo (int codigo, Jogo jogo) {
		int aux = ProcurarJogoPorCodigo(codigo);
		
		if (aux == -1)
			return false;
		
		jogos.set(aux, jogo);
		return true;
		
	} //EditarJogo;
	
	/**
	 * Um m�todo de auxiliar que procura por um jogo dado um codigo
	 * e retorna -1 caso n�o encontre, e se encontrar ele retorna
	 * a posi��o no <b>ArrayList</b>
	*/
	
	private int ProcurarJogoPorCodigo (int codigo) {
		
		for (int i = 0; i < jogos.size(); i++) {
			if (jogos.get(i).getCodigo() == codigo)
				return i;
		}
		
		return -1;
	} //ProcurarJogoPorCodigo;
	
	
	/**
	 * M�todo auxiliar usado para validar se uma certa equipa ja esta
	 * na competi��o.
	*/
	
	private boolean VerificarEquipaNaCompeticao (Jogo jogo) {
		int auxCodigoEquipaVisitada = jogo.getEquipaVisitada().getCodigo();
		int auxCodigoEquipaVisitante = jogo.getEquipaVisitante().getCodigo();
		
		int auxEquipaVisitada = ProcurarEquipaPorCodigo(auxCodigoEquipaVisitada);
		int auxEquipaVisitante = ProcurarEquipaPorCodigo(auxCodigoEquipaVisitante);
		
		if (auxEquipaVisitada != -1 && auxEquipaVisitante != -1) 
			return true;
		
		return false;
	} //VerificarEquipa;

	/**
	 * M�todo auxiliar para verificar se uma equipa esta em mais do
	 * que um jogo na mesma joprnada.
	*/
	
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

	/**
	 * M�todo para atualizar as informa��es do rank das equipas 
	 * na competi��o.
	*/
	
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
	
// ============== M�TODOS COMPLEMENTARES =================

	/**
	 * Comprimi todas as informa��es da classe e as
	 * transforma em formato <b>String</b>
	*/
	
    // ----> toString()
	@Override
 	public String toString() {
		return "Competicao [codigoIdentificador=" + codigo + ", nome=" + nome + ", inicio=" + inicio
				+ ", fim=" + fim + ", escalao=" + escalao + ", equipas=" + equipas + ", jogos=" + jogos + "]";
	}//Override toString;
	
} //Class Competicao;






























