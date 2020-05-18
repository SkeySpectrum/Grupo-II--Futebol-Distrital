package com.as.futebol.utilidades;

public class Habilitacao {

	public enum TipoHabilitacao { Ensino, Outro } //Enum TipoHabilitacao;
	
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String nome;
	private String descricao;
	private TipoHabilitacao tipo;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ================
    // =======================================================

	public String getNome() {
		return nome;
	} //getNome;
	
	public void setNome(String nome) {
		this.nome = nome;
	} //setNome:
		
	
	public String getDescricao() {
		return descricao;
	} //getDescricao;
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} //setDescricao;
	
	
	public TipoHabilitacao getTipo() {
		return tipo;
	} //getTipo;
	
	public void setTipo(TipoHabilitacao tipo) {
		this.tipo = tipo;
	} //setTipo;


    // =======================================================
    // =================== CONSTRUTORES ======================
    // =======================================================

	//Construtor com parametros
	public Habilitacao(String nome, String descricao, TipoHabilitacao tipo) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.tipo = tipo;
	} //Construtor Habilitacao;

    // =======================================================
    // =================== .COMPORTAMENTOS ===================
    // =======================================================



    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES =================
    // =======================================================

    // ----> toString()

    // ----> equals()
	
} //Class Habilitacao;





























