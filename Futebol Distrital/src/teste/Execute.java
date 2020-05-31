package teste;

import java.util.*;

import com.as.futebol.Arbitro;
import com.as.futebol.Clube;
import com.as.futebol.Competicao;
import com.as.futebol.Equipa;
import com.as.futebol.Habilitacao;
import com.as.futebol.Jogador;
import com.as.futebol.Jogo;
import com.as.futebol.Treinador;
import com.as.futebol.Utilidade.*;

public class Execute {

	public static void main(String[] args) {
		//Date
		Date date01 = new Date(000630307010);
		
		//Habilitação
		Habilitacao habilitacao0 = new Habilitacao();
		Habilitacao habilitacao1 = new Habilitacao("Nome", "Descrição", TipoHabilitacao.Outro);
		Habilitacao habilitacao2 = new Habilitacao("Nome", "Descrição", TipoHabilitacao.Ensino);
		
		//Jogadores;
		Jogador jogador0 = new Jogador();
		Jogador jogador1 = new Jogador("Serge", 	date01, 925103101, "sergemail@email.com", 	463903301, PePreferido.Direita, Posicao.GuardaRedes, 27);
		Jogador jogador2 = new Jogador("Alex", 		date01, 925103102, "alexmail@email.com", 	463903302, PePreferido.Esquerda, Posicao.Defesa, 17);
		Jogador jogador3 = new Jogador("Tiago", 	date01, 925103103, "tiagomail@email.com", 	463903303, PePreferido.Direita, Posicao.Avançado, 12);
		Jogador jogador4 = new Jogador("Ricardo", 	date01, 925103104, "ricardo@email.com", 	463903304, PePreferido.Direita, Posicao.GuardaRedes, 27);
		Jogador jogador5 = new Jogador("Joao", 		date01, 925103105, "joao@email.com", 		463903305, PePreferido.Esquerda, Posicao.Defesa, 17);
		Jogador jogador6 = new Jogador("Miguel", 	date01, 925103106, "miguel@email.com", 		463903306, PePreferido.Direita, Posicao.Avançado, 12);
		Jogador jogador7 = new Jogador("Rose", 		date01, 925103107, "rose@email.com", 		463903307, PePreferido.Direita, Posicao.GuardaRedes, 27);
		Jogador jogador8 = new Jogador("Escarlate", date01, 925103108, "escarlate@email.com", 	463903308, PePreferido.Esquerda, Posicao.Defesa, 17);
		Jogador jogador9 = new Jogador("Blue", 		date01, 925103109, "blue@email.com", 		463903309, PePreferido.Direita, Posicao.Avançado, 12);
		
		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(jogador1);
		jogadores.add(jogador2);
		jogadores.add(jogador3);
		jogadores.add(jogador4);
		jogadores.add(jogador5);
		jogadores.add(jogador6);
		jogadores.add(jogador7);
		jogadores.add(jogador8);
		jogadores.add(jogador9);
		
		//Treinadores;
		Treinador treinador0 = new Treinador();
		Treinador treinador1 = new Treinador ("Bruno", 	date01,925102101, "bruno@mail.com", 	463902301, habilitacao1);
		Treinador treinador2 = new Treinador ("Marcio", date01,925102102, "marcio@mail.com", 	463902302, habilitacao2);
		Treinador treinador3 = new Treinador ("Hugo", 	date01,925102103, "hugo@mail.com", 		463902303, habilitacao1);
		Treinador treinador4 = new Treinador ("Joao", 	date01,925102104, "joao@mail.com", 		463902304, habilitacao2);
		Treinador treinador5 = new Treinador ("Jorge", 	date01,925102105, "jorge@mail.com", 	463902305, habilitacao1);
		Treinador treinador6 = new Treinador ("Duarte", date01,925102106, "duarte@mail.com", 	463902306, habilitacao2);
		Treinador treinador7 = new Treinador ("Pires", 	date01,925102107, "pires@mail.com", 	463902307, habilitacao1);
		Treinador treinador8 = new Treinador ("Jessica", date01,925102108, "jessica@mail.com", 	463902308, habilitacao2);
		Treinador treinador9 = new Treinador ("Jesus", 	date01,925102109, "jesus@mail.com", 	463902309, habilitacao1);
		
		List<Treinador> treinadores = new ArrayList<Treinador>();
		treinadores.add(treinador1);
		treinadores.add(treinador2);
		treinadores.add(treinador3);
		treinadores.add(treinador4);
		treinadores.add(treinador5);
		treinadores.add(treinador6);
		treinadores.add(treinador7);
		treinadores.add(treinador8);
		treinadores.add(treinador9);
		
		//Arbitros;
		Arbitro arbitro0 = new Arbitro();
		Arbitro arbitro1 = new Arbitro("Jose Silva", 	date01, 925101101, "josesilva@mail.com", 	463901301, habilitacao1);
		Arbitro arbitro2 = new Arbitro("Rose Espinhos", date01, 925101102, "roseespinhos@mail.com", 463901302, habilitacao1);
		Arbitro arbitro3 = new Arbitro("Pedro Gon", 	date01, 925101103, "pedrogon@mail.com", 	463901303, habilitacao1);
		Arbitro arbitro4 = new Arbitro("Alexander", 	date01, 925101104, "alexander@mail.com", 	463901304, habilitacao1);
		Arbitro arbitro5 = new Arbitro("Mario de Sá", 	date01, 925101105, "mario@mail.com", 		463901305, habilitacao1);
		Arbitro arbitro6 = new Arbitro("Kelvin Alan", 	date01, 925101106, "kelvinalan@mail.com", 	463901306, habilitacao1);
		Arbitro arbitro7 = new Arbitro("Alan", 			date01, 925101107, "alan@mail.com", 		463901307, habilitacao1);
		Arbitro arbitro8 = new Arbitro("Kevin",			date01, 925101108, "kevin@mail.com", 		463901308, habilitacao1);
		Arbitro arbitro9 = new Arbitro("John English", 	date01, 925101109, "john@mail.com", 		463901309, habilitacao1);
		
		List<Arbitro> arbitros = new ArrayList<Arbitro>();
		arbitros.add(arbitro1);
		arbitros.add(arbitro2);
		arbitros.add(arbitro3);
		arbitros.add(arbitro4);
		arbitros.add(arbitro5);
		arbitros.add(arbitro6);
		arbitros.add(arbitro7);
		arbitros.add(arbitro8);
		arbitros.add(arbitro9);
		
		//Equipas
		Equipa equipa0 = new Equipa();
		
		Equipa equipa1 = new Equipa(1101, "Brown", 	Escalao.Infantil);
		try {
			equipa1.addJogador(jogador1);
			equipa1.addJogador(jogador2);
			equipa1.addJogador(jogador3);
			equipa1.addTreinador(treinador1);
			//equipa1.addTreinador(treinador1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		Equipa equipa2 = new Equipa(1102, "Blue", 	Escalao.Infantil);
		equipa2.addJogador(jogador4);
		equipa2.addJogador(jogador5);
		equipa2.addJogador(jogador6);
		
		equipa2.addTreinador(treinador2);
		Equipa equipa3 = new Equipa(1103, "Yellow", Escalao.Infantil);
		equipa3.addJogador(jogador7);
		equipa3.addJogador(jogador8);
		equipa3.addJogador(jogador9);
		equipa3.addTreinador(treinador3);
		
		Equipa equipa4 = new Equipa(1104, "Red", 	Escalao.Iniciado);
		Equipa equipa5 = new Equipa(1105, "Cyan", 	Escalao.Iniciado);
		Equipa equipa6 = new Equipa(1106, "Magenta", Escalao.Iniciado);
		Equipa equipa7 = new Equipa(1107, "Purple", 	Escalao.Juvenil);
		Equipa equipa8 = new Equipa(1108, "Black", 	Escalao.Juvenil);
		Equipa equipa9 = new Equipa(1109, "Orange", 	Escalao.Juvenil);
		
		//Clubes
		Clube clube0 = new Clube();
		Clube clube1 = new Clube(1201, "Springfield", date01, Escalao.Infantil, CorEquipamento.Azul, 925104101, "springfield@mail.com", "Morada");
		
		try {
			clube1.addEquipa(equipa1);
			clube1.addEquipa(equipa2);
			clube1.addEquipa(equipa3);
			//clube1.addEquipa(equipa3);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println (equipa1.MostrarJogadores());
		
		//Jogos
		Jogo jogo0 = new Jogo();
		try {
			Jogo jogo1 = new Jogo(1301, equipa1, equipa2, date01, 1, arbitros);
			jogo1.AdicionarGolo(1101);
			jogo1.AdicionarGolo(1102);
			jogo1.AdicionarGolo(1101);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		//Competições
		Competicao competicao0 = new Competicao();
		Competicao competicao1 = new Competicao(1401, "Injustice League", date01, date01, Escalao.Infantil);
		
		try {
			competicao1.addEquipa(equipa1);
			competicao1.addEquipa(equipa2);
			competicao1.addEquipa(equipa3);
			//competicao1.addEquipa(equipa2);
			competicao1.EliminarEquipa(1103);
			//competicao1.addJogo(jogo1);
			//competicao1.addJogo(jogo1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println (competicao1.MostrarInformacao());
		
		/*System.out.println (teste01.MostrarInformacao());
		teste01.EliminarJogador(000002);
		teste01.EliminarTreinador(000006);
		
		System.out.println (teste01.MostrarInformacao());
		
		teste01.EditarJogador(000001, jogador2);
		teste01.EditarTreinador(000005, treinador1);
		
		System.out.println (teste01.MostrarInformacao());*/
		
	} //main;

} //Class Execute;























