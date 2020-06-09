import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		
		j1.nome = "jogador1";
		j2.nome = "jogador2";
		
		j1.cor = "Vermelho";
		j2.cor = "Amarelo";
		
		j1.especialidades[0] = 0;
		j1.especialidades[1] = 0;
		j1.especialidades[2] = 1;
		j1.especialidades[3] = 1;
		j1.especialidades[4] = 2;
		
		j2.especialidades[0] = 2;
		j2.especialidades[1] = 1;
		j2.especialidades[2] = 0;
		j2.especialidades[3] = 0;
		j2.especialidades[4] = 1;
		
		
//		try {
//			Jogo j1 = new Jogo(Tamanho.PEQUENO);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}

//	Jogador jogadorJogando = null;
	
//	Scanner entrada = new Scanner(System.in);
	
//	ArrayList<Jogador> jogadoresAtivos = new ArrayList();
	
//	System.out.println("Quantos jogs");
//	int numJogs = entrada.nextInt();
//	for (int i = 0; i < numJogs; i++) {
//		Jogador jogador = new Jogador();
//		jogadoresAtivos.add(i, jogador);
//	}

//	do {
//		for (int i = 0; i < jogadoresAtivos.size(); i++) {
//			jogadorJogando = jogadoresAtivos.get(i);
//			System.out.println(jogadorJogando.nome + " jogando");
//			System.out.println(Tabuleiro.retornarCasa(jogadorJogando.getPosicao()));
//			jogadorJogando.escolherDado();
//			System.out.println("Jogador vai andar " +jogadorJogando.quantCasasAndar);
//			int x = Tabuleiro.retornarValorCasa(jogadorJogando.getPosicao());
//			System.out.println("Nivel de especialidade do jogador na casa: "+jogadorJogando.getEspecialidades(x));
//			jogadorJogando.quiz(x,jogadorJogando.getEspecialidades(x));
//			jogadorJogando.andar();
//			System.out.println("Está na posição "+jogadorJogando.getPosicao());
//			System.out.println(Tabuleiro.retornarCasa(jogadorJogando.getPosicao()));
//			System.out.println("_______________________________________________");
//		}
//		
//	}while (jogadorJogando.getPosicao() < Tabuleiro.getQuantCasas());
//	
//		System.out.println(jogadorJogando.nome + "Venceu!");
//	}
//}
