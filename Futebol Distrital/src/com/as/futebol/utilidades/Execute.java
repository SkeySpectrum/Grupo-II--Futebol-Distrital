package com.as.futebol.utilidades;

import java.util.*;
import com.as.futebol.*;
import com.as.futebol.Equipa.*;
import com.as.futebol.Jogador.*;
import com.as.futebol.utilidades.Habilitacao.*;

public class Execute {

	public static void main(String[] args) {
		//Date
		Date date01 = new Date(000630307010);
		
		//Habilitação
		Habilitacao habilitacao1 = new Habilitacao("Nome", "Descrição", TipoHabilitacao.Outro);
		Habilitacao habilitacao2 = new Habilitacao("Nome", "Descrição", TipoHabilitacao.Ensino);
		
		//Jogadores;
		Jogador jogador1 = new Jogador("Serge", date01, 928374930, "sergemail@email.com", 7283740, PePreferido.Direita, Posicao.GuardaRedes, 27);
		Jogador jogador2 = new Jogador("Alex", date01, 928374930, "alexmail@email.com", 3647383, PePreferido.Esquerda, Posicao.Defesa, 17);
		Jogador jogador3 = new Jogador("Tiago", date01, 928374930, "tiagomail@email.com", 46653543, PePreferido.Direita, Posicao.Avançado, 12);
		
		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(jogador1);
		jogadores.add(jogador2);
		jogadores.add(jogador3);
		
		//Treinadores;
		Treinador treinador1 = new Treinador ("Treinador 1", date01,37738432, "treinador1mail@mail.com", 83488324, habilitacao1);
		Treinador treinador2 = new Treinador ("Treinador 2", date01,37738432, "treinador2mail@mail.com", 37483734, habilitacao2);
		
		List<Treinador> treinadores = new ArrayList<Treinador>();
		treinadores.add(treinador1);
		treinadores.add(treinador2);
		
		//Arbitros;
		Arbitro arbitro1 = new Arbitro("Arbitro 1", date01, 74637364, "arbitro1mail@mail.com", 463736434, habilitacao1);
		Arbitro arbitro2 = new Arbitro("Arbitro 2", date01, 46757454, "arbitro2mail@mail.com", 364762373, habilitacao1);
		
		//Equipas
		Equipa teste01 = new Equipa(6473, "Green", Escalao.Iniciado, jogadores, treinadores);
		Equipa teste02 = new Equipa(3445, "Green", Escalao.Iniciado, jogadores, treinadores);
		Equipa teste03 = new Equipa(3452, "Green", Escalao.Iniciado, jogadores, treinadores);
		
		//Clubes
		
		//Jogos
		
		//Competições
		
		System.out.println (teste01.MostrarInformacao());
		
		/*System.out.println (teste01.MostrarInformacao());
		teste01.EliminarJogador(000002);
		teste01.EliminarTreinador(000006);
		
		System.out.println (teste01.MostrarInformacao());
		
		teste01.EditarJogador(000001, jogador2);
		teste01.EditarTreinador(000005, treinador1);
		
		System.out.println (teste01.MostrarInformacao());*/
		
	} //main;

} //Class Execute;























