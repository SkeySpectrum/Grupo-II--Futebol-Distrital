package com.as.api;

import java.util.*;
import com.as.api.Utilidade.*;

/**
 * Composto por <b>jogadores</b> e <b>treinadores</b>, assim como outros atributos, tais como codigo indentificaor.
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-29
*/

@SuppressWarnings("deprecation")
public class Equipa implements Comparable<Equipa> {
	
// ===================== ATRIBUTOS =======================
	
	private int codigo;
	private String nome;
	private Escalao escalao;
	
	private int goloMarcado;
	private int goloSofrido;
	private int vitoria;
	private int fracasso;
	private int empate;
	
	List<Jogador> jogadores = new ArrayList<Jogador>();
	List<Treinador> treinadores = new ArrayList<Treinador>();

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
	 * outras classes ao receber um valor do tipo <b>Escalao</b>.
	 * 
	 * @see com.as.api.Utilidade.Escalao
	*/
	
	public void setEscalao(Escalao escalao) {
		this.escalao = escalao;
	} //setEscalao;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>goloMarcado</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getGoloMarcado() {
		return goloMarcado;
	} //getGoloMarcado;
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>goloSofrido</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getGoloSofrido() {
		return goloSofrido;
	} //getGoloSofrido;
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>vitoria</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getVitoria() {
		return vitoria;
	} //getVitoria;
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>fracasso</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getFracasso() {
		return fracasso;
	} //getFracasso;
	
	/**
	 * Este m�todo tem o prop�sito de retornar o valor 
	 * do atributo <b>empate</b> que n�o � acessivel a
	 * outras classes.
	*/
	
	public int getEmpate() {
		return empate;
	} //getEmpate;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar uma lista 
	 * do atributo <b>jogadores</b> que n�o � acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Jogador
	*/
	
	public List<Jogador> getJogadores() {
		return jogadores;
	} //getJogadores;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>jogadores</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Jogador</b> 
	 * numa dada posi��o.
	 * <p>
	 * Tem como valida��o:
	 * <br>- Caso o jogador ja exista na equipa
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Jogador
	*/
	
	public void setJogador(int index, Jogador jogador) {
		if (ProcurarJogadorByNumeroCartao(jogador.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Jogador '" + jogador.getNome() + "' ja foi adicionado a equipa '" + this.getNome() + "'!!!");
		
		this.jogadores.set(index, jogador);
	} //setJogadores;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>jogadores</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Arbitro</b>.
	 * <p>
	 * Tem como valida��o:
	 * <br>- Caso o jogador ja exista na equipa
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Jogador
	*/
	
	public void addJogador(Jogador jogador) {
		if (ProcurarJogadorByNumeroCartao(jogador.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Jogador '" + jogador.getNome() + "' ja foi adicionado a equipa '" + this.getNome() + "'!!!");
		
		this.jogadores.add(jogador);
	} //addJogadores;
	
	
	/**
	 * Este m�todo tem o prop�sito de retornar uma lista 
	 * do atributo <b>treinadores</b> que n�o � acessivel a
	 * outras classes.
	 * 
	 * @see com.as.api.Treinador
	*/
	
	public List<Treinador> getTreinadores() {
		return treinadores;
	} //getTreinadores;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>treinadores</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Treinador</b> 
	 * numa dada posi��o.
	 * <p>
	 * Tem como valida��o:
	 * <br>- Caso o Treinador ja exista na equipa
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Treinador
	*/
	
	public void setTreinador(int index, Treinador treinador) {
		if (ProcurarTreinadorByNumeroCartao(treinador.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Treinador '" + treinador.getNome() + "' ja foi adicionado a equipa '" + this.getNome() + "'!!!");
		
		this.treinadores.set(index, treinador);
	} //setTreinadores;
	
	/**
	 * Este m�todo tem o prop�sito de alterar o valor 
	 * do atributo <b>treinadores</b> que n�o � acessivel a
	 * outras classes ao receber um valor do tipo <b>Treinador</b>.
	 * <p>
	 * Tem como valida��o:
	 * <br>- Caso o treinador ja exista na equipa
	 * 
	 * @throws IllegalArgumentException
	 * 
	 * @see com.as.api.Treinador
	*/
	
	public void addTreinador(Treinador treinador) {
		if (ProcurarTreinadorByNumeroCartao(treinador.getNumeroCartaoCidadao()) != -1)
			throw new IllegalArgumentException("O Treinador '" + treinador.getNome() + "' ja foi adicionado a equipa '" + this.getNome() + "'!!!");
		
		this.treinadores.add( treinador);
	} //addTreinadores;

// =================== CONSTRUTORES ======================

	//Construtor sem parametros;
	public Equipa () {
		
	} //Construtor Equipa;
	
	//Construtor com parametros;
	public Equipa(int codigoIndentificador, String nome, Escalao escalao) {
		super();
		this.setCodigo(codigoIndentificador);
		this.setNome(nome);
		this.setEscalao(escalao);
	} //Construtor Equipa;

// =================== COMPORTAMENTOS ===================

	/**
	 * Mostra informa��es relativa a classe <b>Equipa</b>.
	 * 
	 * @deprecated 
	 * @since 2020-05-28
	*/
	
	public String MostrarInformacao () {
		String resultado = "";
		
		resultado += "Equipa: " + this.getNome() + "\n";
		resultado += "C�digo: " + this.getCodigo() + "\n";
		resultado += "Escal�o: " + this.getEscalao() + "\n";
		resultado += "Jogadores (" + this.getJogadores().size() + ") \n";
		resultado += "Treinadores (" + this.getTreinadores().size() + ") \n\n";
		
		return resultado;
		
	} //MostrarInformacao;
	
	/**
	 * Lista informa��es relativa a <b>jogadores</b> que est�o
	 * adicionados na classe <b>Equipa</b>
	*/
	
	public String MostrarJogadores () {
		String resultado = "";
		
		this.jogadores.sort(null);
		
		for(Jogador j : jogadores) {
			resultado += j.MostrarInformacao();
		}
		
		return resultado;
	} //MostrarJogadores;
	
	/**
	 * Lista informa��es relativa a <b>treinadores</b> que est�o
	 * adicionados na classe <b>Equipa</b>
	 * 
	 * @return result
	*/
	
	public String MostrarTreinadores () {
		String result = "";
		
		for(Treinador t : treinadores) {
			result += t.MostrarInformacao();
		}
		
		return result;
	} //MostrarTreinadores;

	/**
	 * Eliminar um jogador baseado no numero de cart�o.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarJogadorByNumeroCartao()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe jogador.
	*/
	
	public boolean EliminarJogador(int numeroCartao) {
		int aux = ProcurarJogadorByNumeroCartao(numeroCartao);
		
		if (aux == -1)
			return false;
			
		this.jogadores.remove(aux);
		return true;
		
	} //EliminarJogador;
	
	/**
	 * Editar um jogador baseado no numero de cart�o.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarJogadorByNumeroCartao()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe jogador.
	*/
	
	public boolean EditarJogador (int numeroCartao, Jogador jogador) {
		int aux = ProcurarJogadorByNumeroCartao(numeroCartao);
		
		if (aux == -1)
			return false;
		
		this.setJogador(aux, jogador);
		
		return true;
	} //EditarJogador;
	
	/**
	 * Um m�todo de auxiliar que procura por um jogador dado um numero de
	 * cart�o e retorna -1 caso n�o encontre, e se encontrar ele retorna
	 * a posi��o no <b>ArrayList</b>
	*/
	
	private int ProcurarJogadorByNumeroCartao(int numeroCartao) {
		for (int i = 0; i < jogadores.size(); i++) {
			if (jogadores.get(i).getNumeroCartaoCidadao() == numeroCartao)
				return i;
		}
		
		return -1;
	} //ProcurarJogadorByNumeroCartao;
	
	
	/**
	 * Eliminar um treinador baseado no numero de cart�o.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarTreinadorByNumeroCartao()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe treinador.
	*/
	
	public boolean EliminarTreinador(int numeroCartao) {
		
		int aux = ProcurarTreinadorByNumeroCartao(numeroCartao);
		
		if (aux == -1)
			return false;
			
		this.treinadores.remove(aux);
		return true;
		
	} //EliminarTreinador;

	/**
	 * Editar um treinador baseado no numero de cart�o.
	 * <p>
	 * Este m�todo tem como auxiliar um m�todo <b>ProcurarTreinadorByNumeroCartao()</b>,
	 * ap�s receber o parametro de valida��o ele verifica, caso o valor seja igual -1
	 * quer dizer que n�o existe treinador.
	*/
	
	public boolean EditarTreinador (int numeroCartao, Treinador treinador) {
		int aux = ProcurarTreinadorByNumeroCartao(numeroCartao);
		
		if (aux == -1)
			return false;
		
		this.setTreinador(aux, treinador);
		
		return true;
	} //EditarJogador;
	
	/**
	 * Um m�todo de auxiliar que procura por um treinador dado um numero de
	 * cart�o e retorna -1 caso n�o encontre, e se encontrar ele retorna
	 * a posi��o no <b>ArrayList</b>
	*/
	
	private int ProcurarTreinadorByNumeroCartao(int numeroCartao) {
		for (int i = 0; i < this.treinadores.size(); i++) {
			if (this.treinadores.get(i).getNumeroCartaoCidadao() == numeroCartao)
				return i;
		}
		
		return -1;
	} //ProcurarTreinadorByNumeroCartao;

	
	/**
	 * Faz um reset nos dados usados pela classe <b>Competicao</b>
	 * no rank das equipas.
	*/
	
	public void RemoverDadosdeCompeticao() {
		this.empate = 0;
		this.vitoria = 0;
		this.fracasso = 0;
		this.goloMarcado = 0;
		this.goloSofrido = 0;
	} //RemoverDadosdeCompeticao;
	
	/**
	 * Adiciona golos marcados pela equipa durante os jogos
	*/
	
	public void AddGoloMarcado(int ponto) {
		this.goloMarcado += ponto;
	} //AddGoloMarcado;
	
	/**
	 * Adiciona golos sofridos pela equipa durante os jogos
	*/
	
	public void AddGoloSofrido(int ponto) {
		this.goloSofrido += ponto;
	} //AddPonto;
	
	/**
	 * Adiciona pontos a <b>vitoria</b> pelos jogos ganhos
	*/
	
	public void AddVitoria() {
		this.vitoria += 1;
	} //AddVitoria;
	
	/**
	 * Adiciona pontos a <b>fracasso</b> pelos jogos perdidos
	*/
	
	public void AddFracasso() {
		this.fracasso += 1;
	} //AddFracasso;
	
	/**
	 * Adiciona pontos a <b>empate</b> pelos jogos empatados
	*/
	
	public void AddEmpate() {
		this.empate += 1;
	} //AddEmpate;

// ============== M�TODOS COMPLEMENTARES =================

	/**
	 * Comprimi todas as informa��es da classe e as
	 * transforma em formato <b>String</b>
	*/
	
    // ----> toString()
	@Override
	public String toString() {
		return "Equipa [codigoIndentificador=" + codigo + ", nome=" + nome + ", escalao=" + escalao
				+ ", jogadores=" + jogadores + ", treinadores=" + treinadores + "]";
	}//Override toString;

	/**
	 * � usado para fazer uma compara��o entre objectos, neste caso 
	 * � mais usado para fazer uma ordena��o;
	*/
	
	// ----> compareTo()
	@Override
	public int compareTo(Equipa obj) {
		// 0 - iguais
		// 1 - maior do que estou a comparar
		// -1 - menor do que estou a comparar
		
		if ((obj.escalao.toString().compareTo(this.escalao.toString()) * -1) != 0)
			return obj.escalao.toString().compareTo(this.escalao.toString()) * -1;
		
		if (obj.vitoria > this.vitoria)
			return 1;
		
		if (obj.vitoria < this.vitoria)
			return -1;
			
		
		if (obj.empate > this.empate)
			return 1;
		
		if (obj.empate < this.empate)
			return -1;
		
		int objDiferenca = obj.goloMarcado - obj.goloSofrido;
		int thisDiferenca = this.goloMarcado - this.goloSofrido;
		
		if (objDiferenca < 0)
			objDiferenca *= -1;
		
		if (thisDiferenca > 0)
			thisDiferenca *= -1;
		
		if (objDiferenca < thisDiferenca)
			return -1;
		
		if (objDiferenca > thisDiferenca)
			return 1;
		
		return obj.nome.compareTo(this.nome) * -1;
		
	} //Override compareTo;
	
} //Class Equipa;































