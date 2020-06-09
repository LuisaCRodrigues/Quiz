import java.util.Random;

public class Dado extends Tabuleiro {

	// Atributos
	protected int tipo;

	// Construtor

	public Dado(int tipo) {
		super(tamanho);
		this.tipo = tipo;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	// Métodos
	public int sortearValor() {
		int valor = 0;
		Random radom = new Random();
		
			if ((tipo == 2) || (tipo == 4)) {
				valor = 1 + radom.nextInt(tipo);
			} 
			else {
				valor = radom.nextInt(tipo);
			}
	
		return valor;
	}
}
