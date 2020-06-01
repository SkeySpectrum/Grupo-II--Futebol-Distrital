package com.as.api;

/**
 * Reune um conjunto de utilidades para serem 
 * usados por todo o projeto.
 * 
 * @author Serge Silva
 * @author Alex Pires
 * 
 * @version 1.0
 * @since 2020-05-29
*/

public class Utilidade {

// ============== Enum =================
	
	/**
	 * Lista de possiveis pernas que poderiam ser preferidas jogador.
	*/
	public enum PePreferido { Esquerda, Direita } //Enum PePreferido;
	
	/**
	 * Lista de possiveis posições que poderiam ser escolhidas para o jogador.
	*/
	public enum Posicao {Defesa, Avançado, GuardaRedes} //Enum Posicao;
	
	/**
	 * Lista de possiveis cores de equipamento.
	*/
	public enum CorEquipamento { Azul, Vermelho, Amarelho, Verde, Preto, Branco, Xadrez, Riscas, Outro } //Enum CorEquipamento;
	
	/**
	 * Lista de possiveis escalões que poderiam ser escolhidas.
	*/
	public enum Escalao { Infantil, Iniciado, Juvenil, Outro } //Enum Escalao;
	
	/**
	 * Lista de possiveis tipos de habilitação.
	*/
	public enum TipoHabilitacao { Ensino, Outro } //Enum TipoHabilitacao;
	
} // Class Utilidade;