import java.util.Random;
import java.util.Scanner;

public class Jogador extends Perguntas {

	// Atributos
	Scanner entrada = new Scanner(System.in);
	Random random = new Random();

	public int numLados;
	public int numero;
	public String nome;
	public String cor;
	public int[] especialidades = new int[5];
	public int posicao;
	int quantCasasAndar;

	// Construtor
		public Jogador() {
			setNome(nome);
//			setNumero(numero);
			setCor(cor);
			setEspecialidades(especialidades);
		}

	// Getters e Setters
	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		System.out.println("Digite seu nome: ");
		this.nome = entrada.nextLine();
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		System.out.println("Escolha a cor do seu personagem: ");
		this.cor = entrada.nextLine();
	}
 
	public int getEspecialidades(int x) {
		return especialidades[x];
	}
	
	public void setEspecialidades(int[] especialidades2) {
		System.out.println("Distribua os valores das suas especialidades: ");
		System.out.println(
				"Escolha, na sequência, duas categorias para questões fáceis, duas para questões médias e uma para questões difíceis: "
				+ "(Ordem: VARIEDADES, CIENCIAETECNOLOGIA, ESPORTEELAZER, MUNDO, ENTRETENIMENTO");
		for (int cont = 0; cont < 5; cont++) {
			this.especialidades[cont] = entrada.nextInt();
		}

	}

	// Métodos
	public void escolherDado() {
		System.out.println("Escolha um dado:");
		numLados = entrada.nextInt();
		if (numLados == 2) {
			quantCasasAndar = Jogo.lado2.sortearValor();
		} else {
			quantCasasAndar = Jogo.lado4.sortearValor();
		}
	}

	public void andar() {
		if (Perguntas.respVerif == true) {
			this.setPosicao(this.getPosicao() + quantCasasAndar);
			System.out.println("ooi");
		} else {
			if (this.getPosicao() >= quantCasasAndar) {
				System.out.println("ola");
				this.setPosicao(this.getPosicao() - quantCasasAndar);
			}
			else {
				System.out.println("ohaio");
				this.setPosicao(0);
			}
		}
		
	}
	
}
