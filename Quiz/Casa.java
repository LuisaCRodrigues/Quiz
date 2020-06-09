
public class Casa {
	public int indexCasa;
	public static int value;
	private Categorias tipo;
	private String nome;

	public Casa() {
		definirValue();
		this.indexCasa = value;
		
		gerarTipo();
		this.nome = tipo.name();
	}
	
	public Casa(String nome) {
		this.nome = nome;
		definirValue();
		this.indexCasa = value;
		
		gerarTipo();
		this.nome = tipo.name();
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public static void definirValue() {
		if(value < 5) {
			value++;
		}
		else {
			value = 1;
		}
		
	}
	
	public void gerarTipo() {
		for(Categorias op : Categorias.values()){
			if(op.getValor() == this.indexCasa) {			
				this.tipo = op;
			}
		}
	}

	public Categorias getTipo() {
		return tipo;
	}	

}
