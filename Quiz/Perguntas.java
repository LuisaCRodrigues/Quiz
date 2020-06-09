import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Perguntas{

	// Atributos
	private String pergunta;
	private String[] alternativas = new String[4];
	private String correta;
	private Categorias cat;
	private Dificuldade dificul;
	private static int x = 0;
	protected static String resp;
	private static Perguntas p[] = new Perguntas[75];
	public static boolean respVerif;

	// Getters e Setters
	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getAlternativas() {
		return alternativas[x];
	}
	
	public String[] getArray() {
		return alternativas;
	}

	public void setAlternativas(String alternativas) {
		if (x <= 3) {
			this.alternativas[x] = alternativas;
			x++;
		} else {
			x = 0;
			this.alternativas[x] = alternativas;
			x++;
		}

	}

	public String getCorreta() {
		return correta;
	}

	public void setCorreta(String correta) {
		this.correta = correta;
	}

	public Categorias getCat() {
		return cat;
	}

	public void setCat(String nome) {
		switch(nome){
			case "CIENCIAETECNOLOGIA":
				this.cat = Categorias.CIENCIAETECNOLOGIA;
				break;
			case "MUNDO":
				this.cat = Categorias.MUNDO;
				break;
			case "ENTRETENIMENTO":
				this.cat = Categorias.ENTRETENIMENTO;
				break;
			case "ESPORTEELAZER":
				this.cat = Categorias.ESPORTEELAZER;
				break;
			case "VARIEDADES":
				this.cat = Categorias.VARIEDADES;
				break;
		}
	}

	public Dificuldade getDificul() {
		return dificul;
	}

	public void setDificul(String dificul) {
		switch(dificul){
		case "FACIL":
			this.dificul = Dificuldade.FACIL;
			break;
		case "MEDIO":
			this.dificul = Dificuldade.MEDIO;
			break;
		case "DIFICIL":
			this.dificul = Dificuldade.DIFICIL;
			break;
		}
	}

	// Métodos
	private void mostrarPergunta() {
		System.out.println("Essa pergunta é de " + this.getCat() + ", de nível " + this.getDificul());
		System.out.println(this.getPergunta());
		for (x = 0; x < 4; x++) {
			System.out.println(x + "-" + this.getAlternativas());
		}
	}

	private void perguntar() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String resposta = entrada.nextLine();
		resp = resposta;
	}

	protected boolean verificarResposta() {
		if (resp.equals(correta)) {
			respVerif = true;
			System.out.println("Resposta certaa!");
		} else {
			respVerif = false;
			System.out.println("Sua resposta está errada");
			System.out.println("Resposta certa: " + correta);
		}
		return respVerif;
	}
	
	public void setMostrarPergunta(int num) {
		p[num].mostrarPergunta();
		System.out.print("Resposta: ");
		p[num].perguntar();
		p[num].verificarResposta();
	}

	public void quiz(int cat, int dificul) throws IOException {
		Random radom = new Random();
		int num;
		switch(cat){
		case 0:
			switch(dificul) {
			case 0:
				num = radom.nextInt(5);
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 1:
				num = radom.nextInt((9 - 5) + 1) + 5;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 2:
				num = radom.nextInt((14 - 10) + 1) + 10;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			}
			break;
		case 1:
			switch(dificul) {
			case 0:
				num = radom.nextInt((19 - 15) + 1) + 15;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 1:
				num = radom.nextInt((24 - 20) +1 ) + 20 ;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 2:
				num = radom.nextInt((29 - 25) + 1) + 25;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			}
			break;
		case 2:
			switch(dificul) {
			case 0:
				num = radom.nextInt((34 - 30) + 1) + 30;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 1:
				num = radom.nextInt((39 - 35) + 1) + 35;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 2:
				num = radom.nextInt((44 - 40) + 1) + 40;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			}
			break;
		case 3:
			switch(dificul) {
			case 0:
				num = radom.nextInt((49 - 45) + 1) + 45;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 1:
				num = radom.nextInt((54 - 50) + 1) + 50;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 2:
				num = radom.nextInt((59 - 55) + 1) + 55;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			}
			break;
		case 4:
			switch(dificul) {
			case 0:
				num = radom.nextInt((64 - 60) + 1) + 60;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 1:
				num = radom.nextInt((69 - 65) + 1) + 65;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			case 2:
				num = radom.nextInt((74 - 70) + 1) + 70;
				System.out.println("O número sorteado foi: "+num);
				setMostrarPergunta(num);
				break;
			}
			break;
	}
		
		
	}

	public static void criarPergunta() throws IOException {
		try {
			FileReader arq = new FileReader("perguntasCompletas.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			try {
					for (int i = 0; i < 75; i++) {
						p[i] = new Perguntas();
						p[i].setCat(lerArq.readLine());
						p[i].setDificul(lerArq.readLine());
						p[i].setPergunta(lerArq.readLine());
						p[i].setAlternativas(lerArq.readLine());
						p[i].setAlternativas(lerArq.readLine());
						p[i].setAlternativas(lerArq.readLine());
						p[i].setAlternativas(lerArq.readLine());
						p[i].setCorreta(lerArq.readLine());
					}
				arq.close();
			} catch (IOException ex) {
				System.out.println("Arquivo não encontrado");
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Sem conteudo");
		}
	}

}