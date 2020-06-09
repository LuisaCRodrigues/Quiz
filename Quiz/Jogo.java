import java.io.IOException;

public class Jogo extends Tabuleiro {
	
	public Jogo(Tamanho tamanho) throws IOException  {
		super(tamanho);
		Perguntas.criarPergunta();
	}
	
	public static Dado lado2 = new Dado(2);
	public static Dado lado4 = new Dado(4);


	public void novoTabuleiro() {
		new Tabuleiro(Tamanho.PEQUENO);
	}
	
	public void sairTabuleiro() {
		System.out.println("Saindo do jogo.");
	}


}
