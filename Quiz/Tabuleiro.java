import java.util.ArrayList;


public class Tabuleiro{
	private static int quantCasas;
	static Tamanho tamanho;
	static ArrayList<Casa> tabuleiroCasas = new ArrayList<Casa>();
	
	public Tabuleiro(Tamanho tamanho){
		Tabuleiro.tamanho = tamanho;
		definirTamanho(tamanho);
		gerarTabuleiro();
	}
	
	public Tamanho getTamanho() {
		return tamanho;
	}

	public static int getQuantCasas() {
		return quantCasas;
	}

	private void definirTamanho(Tamanho tamanho) {
			quantCasas = 20;
	}
	
	protected void gerarTabuleiro() {
		tabuleiroCasas.add(new Casa("Inicio"));
		for(int numCasas = 0; numCasas <= quantCasas; numCasas++) {
			if(numCasas == 0) {
				tabuleiroCasas.add(new Casa("Inicio"));
			}
			if(numCasas == quantCasas) {
				tabuleiroCasas.add(new Casa("Fim"));
			}
			else {
				tabuleiroCasas.add(new Casa());
			}
			
		}
		

	}

	public static ArrayList<Casa> getTabuleiroCasas() {
		return tabuleiroCasas;
	}

	public void setTabuleiroCasas(ArrayList<Casa> tabuleiroCasas) {
		this.tabuleiroCasas = tabuleiroCasas;
	}
	
	public static Categorias retornarCasa(int i) {
		return tabuleiroCasas.get(i).getTipo();
	}
	
	public static int retornarValorCasa(int i) {
		 int x = tabuleiroCasas.get(i).getTipo().getValor();
		 x = x -1;
		return x;
	}
}