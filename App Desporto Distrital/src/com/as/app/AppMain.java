package com.as.app;

import java.time.LocalDate;

import com.as.api.*;
import com.as.api.Utilidade.*;

public class AppMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Data;
		LocalDate date011 = LocalDate.of(2001, 03, 02);
		
		// Habilitação;
		Habilitacao habilitacao1 = new Habilitacao("Nome", "Descrição", TipoHabilitacao.Ensino);
		
		// Jogadores;
		Jogador jogador1  = new Jogador("Jogador 1",  date011 = LocalDate.of(2001, 03, 02), 925103101, "jogador1@email.com",  463903301, PePreferido.Direita,  Posicao.Defesa, 		1);
		Jogador jogador2  = new Jogador("Jogador 2",  date011 = LocalDate.of(1997, 03, 02), 925103102, "jogador2@email.com",  463903302, PePreferido.Esquerda, Posicao.Defesa, 		2);
		Jogador jogador3  = new Jogador("Jogador 3",  date011 = LocalDate.of(1998, 03, 02), 925103103, "jogador3@email.com",  463903303, PePreferido.Direita,  Posicao.Defesa, 		3);
		Jogador jogador4  = new Jogador("Jogador 4",  date011 = LocalDate.of(1998, 03, 02), 925103104, "jogador4@email.com",  463903304, PePreferido.Esquerda, Posicao.Defesa, 		4);
		Jogador jogador5  = new Jogador("Jogador 5",  date011 = LocalDate.of(2000, 03, 02), 925103105, "jogador5@email.com",  463903305, PePreferido.Direita,  Posicao.Defesa, 		5);
		Jogador jogador6  = new Jogador("Jogador 6",  date011 = LocalDate.of(2000, 03, 02), 925103106, "jogador6@email.com",  463903306, PePreferido.Esquerda, Posicao.Avançado, 	6);
		Jogador jogador7  = new Jogador("Jogador 7",  date011 = LocalDate.of(2001, 03, 02), 925103107, "jogador7@email.com",  463903307, PePreferido.Direita,  Posicao.Avançado, 	7);
		Jogador jogador8  = new Jogador("Jogador 8",  date011 = LocalDate.of(2001, 03, 02), 925103108, "jogador8@email.com",  463903308, PePreferido.Esquerda, Posicao.Avançado, 	8);
		Jogador jogador9  = new Jogador("Jogador 9",  date011 = LocalDate.of(1997, 03, 02), 925103109, "jogador9@email.com",  463903309, PePreferido.Direita,  Posicao.Avançado, 	9);
		Jogador jogador10 = new Jogador("Jogador 10", date011 = LocalDate.of(1999, 03, 02), 925103110, "jogador10@email.com", 463903310, PePreferido.Esquerda, Posicao.Avançado, 	10);
		Jogador jogador11 = new Jogador("Jogador 11", date011 = LocalDate.of(1999, 03, 02), 925103111, "jogador11@email.com", 463903311, PePreferido.Direita,  Posicao.GuardaRedes, 	11);
		Jogador jogador12 = new Jogador("Jogador 12", date011 = LocalDate.of(2001, 03, 02), 925103112, "jogador12@email.com", 463903312, PePreferido.Esquerda, Posicao.GuardaRedes, 	12);
		Jogador jogador13 = new Jogador("Jogador 13", date011 = LocalDate.of(2001, 03, 02), 925103113, "jogador13@email.com", 463903313, PePreferido.Direita,  Posicao.GuardaRedes, 	13);
		Jogador jogador14 = new Jogador("Jogador 14", date011 = LocalDate.of(2001, 03, 02), 925103114, "jogador14@email.com", 463903314, PePreferido.Esquerda, Posicao.GuardaRedes, 	14);
		Jogador jogador15 = new Jogador("Jogador 15", date011 = LocalDate.of(2001, 03, 02), 925103115, "jogador15@email.com", 463903315, PePreferido.Direita,  Posicao.GuardaRedes, 	15);		
		
		// Treinadores;
		Treinador treinador1 = new Treinador ("Treinador 1", date011 = LocalDate.of(1991, 03, 02), 925102101, "treinador1@mail.com", 463902301, habilitacao1);
		Treinador treinador2 = new Treinador ("Treinador 2", date011 = LocalDate.of(1993, 03, 02), 925102102, "treinador2@mail.com", 463902302, habilitacao1);
		Treinador treinador3 = new Treinador ("Treinador 3", date011 = LocalDate.of(1994, 03, 02), 925102103, "treinador3@mail.com", 463902303, habilitacao1);
		Treinador treinador4 = new Treinador ("Treinador 4", date011 = LocalDate.of(1994, 03, 02), 925102104, "treinador4@mail.com", 463902304, habilitacao1);
		Treinador treinador5 = new Treinador ("Treinador 5", date011 = LocalDate.of(1992, 03, 02), 925102105, "treinador5@mail.com", 463902305, habilitacao1);
		
		// Arbitros;
		Arbitro arbitro1 = new Arbitro("Arbitro 1", date011 = LocalDate.of(1992, 03, 02), 925101101, "arbitro1@mail.com", 463901301, habilitacao1);
		Arbitro arbitro2 = new Arbitro("Arbitro 2", date011 = LocalDate.of(1989, 03, 02), 925101102, "arbitro2@mail.com", 463901302, habilitacao1);
		Arbitro arbitro3 = new Arbitro("Arbitro 3", date011 = LocalDate.of(1990, 03, 02), 925101103, "arbitro3@mail.com", 463901303, habilitacao1);
		Arbitro arbitro4 = new Arbitro("Arbitro 4", date011 = LocalDate.of(1993, 03, 02), 925101104, "arbitro4@mail.com", 463901304, habilitacao1);
		//Arbitro arbitro5 = new Arbitro("Arbitro 5", date011 = LocalDate.of(1994, 03, 02), 925101105, "arbitro5@mail.com", 463901305, habilitacao1);
		
		// Equipas;
		Equipa equipa1 = new Equipa(1101, "Equipa 1", 	Escalao.Iniciado);
		Equipa equipa2 = new Equipa(1102, "Equipa 2", 	Escalao.Iniciado);
		Equipa equipa3 = new Equipa(1103, "Equipa 3", 	Escalao.Iniciado);
		Equipa equipa4 = new Equipa(1104, "Equipa 4", 	Escalao.Iniciado);
		Equipa equipa5 = new Equipa(1105, "Equipa 5", 	Escalao.Juvenil);
		
		// Add Equipa Info;
		equipa1 = AddJogador(jogador1, 		equipa1);
		equipa1 = AddJogador(jogador6, 		equipa1);
		equipa1 = AddJogador(jogador6, 		equipa1);
		equipa1 = AddJogador(jogador11, 	equipa1);
		equipa1 = AddTreinador(treinador1, 	equipa1);
		
		equipa2 = AddJogador(jogador2, 		equipa2);
		equipa2 = AddJogador(jogador7, 		equipa2);
		equipa2 = AddJogador(jogador12, 	equipa2);
		equipa2 = AddTreinador(treinador2, 	equipa2);
		equipa2 = AddTreinador(treinador2, 	equipa2);
		
		equipa3 = AddJogador(jogador3, 		equipa3);
		equipa3 = AddJogador(jogador8, 		equipa3);
		equipa3 = AddJogador(jogador13, 	equipa3);
		equipa3 = AddTreinador(treinador3, 	equipa3);
		
		equipa4 = AddJogador(jogador4, 		equipa4);
		equipa4 = AddJogador(jogador9, 		equipa4);
		equipa4 = AddJogador(jogador14, 	equipa4);
		equipa4 = AddTreinador(treinador4, 	equipa4);
		
		/*equipa5 = AddJogador(jogador5, 		equipa5);
		equipa5 = AddJogador(jogador10, 	equipa5);
		equipa5 = AddJogador(jogador15, 	equipa5);*/
		equipa5 = AddTreinador(treinador5, 	equipa5);
		
		// Clubes;
		Clube clube1 = new Clube(1201, "Clube 1", date011 = LocalDate.of(1970, 03, 02), Escalao.Iniciado, CorEquipamento.Azul, 		925104101, "clube1@mail.com", "Morada 1");
		Clube clube2 = new Clube(1202, "Clube 2", date011 = LocalDate.of(1980, 03, 02), Escalao.Iniciado, CorEquipamento.Vermelho, 	925104102, "clube2@mail.com", "Morada 2");
		Clube clube3 = new Clube(1203, "Clube 3", date011 = LocalDate.of(1985, 03, 02), Escalao.Iniciado, CorEquipamento.Riscas, 	925104103, "clube3@mail.com", "Morada 3");
		Clube clube4 = new Clube(1204, "Clube 4", date011 = LocalDate.of(1995, 03, 02), Escalao.Iniciado, CorEquipamento.Amarelho, 	925104104, "clube4@mail.com", "Morada 4");
		Clube clube5 = new Clube(1205, "Clube 5", date011 = LocalDate.of(2001, 03, 02), Escalao.Juvenil,  CorEquipamento.Branco, 	925104105, "clube5@mail.com", "Morada 5");
		
		// Add Clube Info;
		clube1 = AddEquipa(equipa1, clube1);
		clube2 = AddEquipa(equipa2, clube2);
		clube3 = AddEquipa(equipa3, clube3);
		clube4 = AddEquipa(equipa4, clube4);
		clube4 = AddEquipa(equipa4, clube4);
		clube5 = AddEquipa(equipa5, clube5);
		
		// Equipa;
		equipa5 = AddJogador(jogador5, 		equipa5);
		equipa5 = AddJogador(jogador10, 	equipa5);
		equipa5 = AddJogador(jogador15, 	equipa5);
		
		clube5 = AddEquipa(equipa5, clube5);
		
		// Jogos;
		Jogo jogo1 = new Jogo();
		Jogo jogo2 = new Jogo();
		Jogo jogo3 = new Jogo();
		Jogo jogo4 = new Jogo();
		
		jogo1 = InitJogo(jogo1,1301, equipa1, equipa2, date011, 1, arbitro1);
		jogo2 = InitJogo(jogo2, 1302, equipa3, equipa4, date011, 1, arbitro2);
		jogo3 = InitJogo(jogo3, 1303, equipa1, equipa3, date011, 2, arbitro3);
		jogo4 = InitJogo(jogo4, 1304, equipa2, equipa4, date011, 2, arbitro4);
		jogo4 = InitJogo(jogo4, 1304, equipa5, equipa5, date011, 2, arbitro4);
		
		jogo1.AdicionarGolo(equipa1.getCodigo());
		jogo1.AdicionarGolo(equipa2.getCodigo());
		jogo1.AdicionarGolo(equipa2.getCodigo());
		
		jogo2.AdicionarGolo(equipa3.getCodigo());
		jogo2.AdicionarGolo(equipa4.getCodigo());
		
		jogo3.AdicionarGolo(equipa1.getCodigo());
		jogo3.AdicionarGolo(equipa3.getCodigo());
		
		jogo4.AdicionarGolo(equipa2.getCodigo());
		jogo4.AdicionarGolo(equipa2.getCodigo());
		jogo4.AdicionarGolo(equipa4.getCodigo());
		jogo4.AdicionarGolo(equipa4.getCodigo());
		jogo4.AdicionarGolo(equipa4.getCodigo());

		// Competição;
		Competicao competicao1 = new Competicao(1401, "Competição 1", date011 = LocalDate.of(2020, 03, 02), date011 = LocalDate.of(2020, 06, 02), Escalao.Iniciado);
		
		// Add Competição Info;
		competicao1 = AddEquipaCompeticao(equipa1, competicao1);
		competicao1 = AddEquipaCompeticao(equipa2, competicao1);
		competicao1 = AddEquipaCompeticao(equipa3, competicao1);
		competicao1 = AddEquipaCompeticao(equipa4, competicao1);
		competicao1 = AddEquipaCompeticao(equipa4, competicao1);
		competicao1 = AddEquipaCompeticao(equipa5, competicao1);
		
		competicao1 = AddJogoCompeticao(jogo1, competicao1);
		competicao1 = AddJogoCompeticao(jogo2, competicao1);
		competicao1 = AddJogoCompeticao(jogo3, competicao1);
		competicao1 = AddJogoCompeticao(jogo3, competicao1);
		competicao1 = AddJogoCompeticao(jogo4, competicao1);
		
		System.out.println();
		System.out.println("//=============== COMPETIÇÃO ===============//");
		System.out.println();
		
		System.out.println(competicao1.ClassificaoCompeticao());
		System.out.println(competicao1.MostrarEquipas());
		System.out.println(competicao1.MostrarJogosPorJornada(1));
		System.out.println(competicao1.MostrarJogosPorJornada(2));
		
		System.out.println();
		System.out.println("//=============== CLUBES ===============//");
		System.out.println();
		
		System.out.println(clube1.MostrarInformacao());
		System.out.println("Jogadores (" + clube1.CalcularNumeroDeJogadores() + ")");
		System.out.println("Treinadores (" + clube1.CalcularNumeroDeTreinadores() + ")");
		
		System.out.println();
		System.out.println("//=============== JOGADOR/Arbitro/Treinador ===============//");
		System.out.println();
		
		System.out.println(jogador1.MostrarInformacao());
		System.out.println(arbitro1.MostrarInformacao());
		System.out.println(treinador1.MostrarInformacao());

		
	} //main;
	
	
	public static Equipa AddJogador(Jogador jogador, Equipa equipa) {
		try {
			equipa.addJogador(jogador);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return equipa;
	} //AddJogador;
	
	public static Equipa AddTreinador(Treinador treinador, Equipa equipa) {
		try {
			equipa.addTreinador(treinador);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return equipa;	
	} //AddTreinador;
	
	public static Clube AddEquipa(Equipa equipa, Clube clube) {
		try {
			clube.addEquipa(equipa);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return clube;	
	} //AddEquipa;
	
	
	public static Competicao AddEquipaCompeticao(Equipa equipa, Competicao competicao) {
		try {
			competicao.addEquipa(equipa);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return competicao;	
	} //AddEquipaCompeticao;
	
	public static Competicao AddJogoCompeticao(Jogo jogo, Competicao competicao) {
		try {
			competicao.addJogo(jogo);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return competicao;	
	} //AddJogoCompeticao;

	
	public static Jogo InitJogo(Jogo jogo, int numero, Equipa equipa1, Equipa equipa2, LocalDate date011, int jornada, Arbitro arbitro1) {
		try {
			jogo = new Jogo(numero, equipa1, equipa2, date011, jornada, arbitro1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return jogo;	
	} //InitJogo;
	
} //Class Execute;























