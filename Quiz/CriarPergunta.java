/*import java.util.Random;
import java.util.Scanner;

public class CriarPergunta {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner entrada = new Scanner(System.in);
		Perguntas p[] = new Perguntas[75];
		// Variedades fácil
		p[0] = new Perguntas();
		p[0].setPergunta("Em que ano o real foi implantado como moeda brasileira?");
		p[0].setAlternativas("1992");
		p[0].setAlternativas("1993");
		p[0].setAlternativas("1994");
		p[0].setAlternativas("1995");
		p[0].setCorreta(2);
		p[0].setCat(Categorias.Variedades);
		p[0].setDificul(Dificuldade.Fácil);
		
		p[1] = new Perguntas();
		p[1].setPergunta("Qual é o signo de quem nasceu no dia 8 de março?");
		p[1].setAlternativas("Aquário");
		p[1].setAlternativas("Áries");
		p[1].setAlternativas("Peixes");
		p[1].setAlternativas("Sagitário");
		p[1].setCorreta(2);
		p[1].setCat(Categorias.Variedades);
		p[1].setDificul(Dificuldade.Fácil);
		
		p[2] = new Perguntas();
		p[2].setPergunta("Em 2008, a tradicional marca brasileira de chocolates e guloseimas Kopenhagen comemorou quantos anos?");
		p[2].setAlternativas("40 anos");
		p[2].setAlternativas("60 anos");
		p[2].setAlternativas("80 anos");
		p[2].setAlternativas("100 anos");
		p[2].setCorreta(2);
		p[2].setCat(Categorias.Variedades);
		p[2].setDificul(Dificuldade.Fácil);
		
		p[3] = new Perguntas();
		p[3].setPergunta("Qual destas não é uma cidade australiana?");
		p[3].setAlternativas("Melboune");
		p[3].setAlternativas("Manila");
		p[3].setAlternativas("Sidney");
		p[3].setAlternativas("Camberra");
		p[3].setCorreta(1);
		p[3].setCat(Categorias.Variedades);
		p[3].setDificul(Dificuldade.Fácil);

		p[4] = new Perguntas();
		p[4].setPergunta("Qual destas lutas marciais tem seu nome traduzido como, arte da suavidade?");
		p[4].setAlternativas("Jiu-Jítsu");
		p[4].setAlternativas("Tae kwon");
		p[4].setAlternativas("Tai chi chuan");
		p[4].setAlternativas("Karatê");
		p[4].setCorreta(0);
		p[4].setCat(Categorias.Variedades);
		p[4].setDificul(Dificuldade.Fácil);

		// Variedades médio
		p[5] = new Perguntas();
		p[5].setPergunta("O caviar, famosa iguaria de luxo feita de ovas de esturjão, é uma criação de que país?");
		p[5].setAlternativas("França");
		p[5].setAlternativas("Rússia");
		p[5].setAlternativas("Noruega");
		p[5].setAlternativas("Alemanha");
		p[5].setCorreta(1);
		p[5].setCat(Categorias.Variedades);
		p[5].setDificul(Dificuldade.Médio);

		p[6] = new Perguntas();
		p[6].setPergunta("Qual destes não foi presidente do Brasil?");
		p[6].setAlternativas("Gaspar Dutra");
		p[6].setAlternativas("Washington Luís");
		p[6].setAlternativas("Oswaldo cruz");
		p[6].setAlternativas("Campos Sales");
		p[6].setCorreta(2);
		p[6].setCat(Categorias.Variedades);
		p[6].setDificul(Dificuldade.Médio);

		p[7] = new Perguntas();
		p[7].setPergunta("Em qual destes países foi feita a primeira exibição de cinema?");
		p[7].setAlternativas("França");
		p[7].setAlternativas("Espanha");
		p[7].setAlternativas("Inglaterra");
		p[7].setAlternativas("Itália");
		p[7].setCorreta(0);
		p[7].setCat(Categorias.Variedades);
		p[7].setDificul(Dificuldade.Médio);

		p[8] = new Perguntas();
		p[8].setPergunta("Qual destes países não está na chamada Ásia de monções?");
		p[8].setAlternativas("Camboja");
		p[8].setAlternativas("Vietnã");
		p[8].setAlternativas("Japão");
		p[8].setAlternativas("Índia");
		p[8].setCorreta(2);
		p[8].setCat(Categorias.Variedades);
		p[8].setDificul(Dificuldade.Médio);

		p[9] = new Perguntas();
		p[9].setPergunta("Quem tem medo de lugares públicos, ou grandes espaços descobertos,tem o que?");
		p[9].setAlternativas("Xenofobia");
		p[9].setAlternativas("Agorafobia");
		p[9].setAlternativas("Acrofobia");
		p[9].setAlternativas("Homofobia");
		p[9].setCorreta(1);
		p[9].setCat(Categorias.Variedades);
		p[9].setDificul(Dificuldade.Médio);

		// Variedades difícil
		p[10] = new Perguntas();
		p[10].setPergunta("O cérebro de um homem adulto pesa cerca de quantos kilogramas?");
		p[10].setAlternativas("1,5 Kg");
		p[10].setAlternativas("1,75Kg");
		p[10].setAlternativas("2,5Kg");
		p[10].setAlternativas("3Kg");
		p[10].setCorreta(0);
		p[10].setCat(Categorias.Variedades);
		p[10].setDificul(Dificuldade.Difícil);

		p[11] = new Perguntas();
		p[11].setPergunta(
				"A opinião sobre a capacidade de um país ou empresa de saldar seus compromissos financeiros é chamado de?");
		p[11].setAlternativas("Rating");
		p[11].setAlternativas("Dumping");
		p[11].setAlternativas("Drawback");
		p[11].setAlternativas("Mopólio");
		p[11].setCorreta(0);
		p[11].setCat(Categorias.Variedades);
		p[11].setDificul(Dificuldade.Difícil);

		p[12] = new Perguntas();
		p[12].setPergunta("Em que ano surgiu o primeiro cartão de crédito?");
		p[12].setAlternativas("1937");
		p[12].setAlternativas("1945");
		p[12].setAlternativas("1948");
		p[12].setAlternativas("1950");
		p[12].setCorreta(2);
		p[12].setCat(Categorias.Variedades);
		p[12].setDificul(Dificuldade.Difícil);

		p[13] = new Perguntas();
		p[13].setPergunta("Com que pedra preciosa são confeccionados os anéis de bacharelado dos advogados?");
		p[13].setAlternativas("Diamante");
		p[13].setAlternativas("Topázio");
		p[13].setAlternativas("Esmeralda");
		p[13].setAlternativas("Rubi");
		p[13].setCorreta(3);
		p[13].setCat(Categorias.Variedades);
		p[13].setDificul(Dificuldade.Difícil);

		p[14] = new Perguntas();
		p[14].setPergunta(
				"Do total de pessoas da população da Ásia, que porcentagem vive na região que compreende Índia e China?");
		p[14].setAlternativas("até 15%");
		p[14].setAlternativas("até 35%");
		p[14].setAlternativas("até 50%");
		p[14].setAlternativas("mais de 50%");
		p[14].setCorreta(3);
		p[14].setCat(Categorias.Variedades);
		p[14].setDificul(Dificuldade.Difícil);

		// CiênciaeTecnologia fácil
		p[15] = new Perguntas();
		p[15].setPergunta(
				"No corpo humano, durante a digestão, os nutrientes dos alimentos são absorvidos nas paredes de qual órgão?");
		p[15].setAlternativas("Esôfago");
		p[15].setAlternativas("Intestino delgado");
		p[15].setAlternativas("Estômago");
		p[15].setAlternativas("Pâncreas");
		p[15].setCorreta(1);
		p[15].setCat(Categorias.CiênciaeTecnologia);
		p[15].setDificul(Dificuldade.Fácil);

		p[16] = new Perguntas();
		p[16].setPergunta("Qual o mascote do sistema operacional Linux, e qual seu nome?");
		p[16].setAlternativas("Coruja, chamada Lux");
		p[16].setAlternativas("Águia, chamada Bux");
		p[16].setAlternativas("Pinguim, chamado Tux");
		p[16].setAlternativas("Cachorro, chamado Nux");
		p[16].setCorreta(2);
		p[16].setCat(Categorias.CiênciaeTecnologia);
		p[16].setDificul(Dificuldade.Fácil);

		p[17] = new Perguntas();
		p[17].setPergunta("As siglas GIF e JPEG referem-se a padrões de compressão de que?");
		p[17].setAlternativas("Som");
		p[17].setAlternativas("Banco de dados");
		p[17].setAlternativas("Imagem");
		p[17].setAlternativas("Vídeo");
		p[17].setCorreta(2);
		p[17].setCat(Categorias.CiênciaeTecnologia);
		p[17].setDificul(Dificuldade.Fácil);

		p[18] = new Perguntas();
		p[18].setPergunta("Qual o nome da partícula subatômica positiva encontrada no núcleo dos átomos?");
		p[18].setAlternativas("Nêutron");
		p[18].setAlternativas("Próton");
		p[18].setAlternativas("Elétron");
		p[18].setAlternativas("Massa");
		p[18].setCorreta(1);
		p[18].setCat(Categorias.CiênciaeTecnologia);
		p[18].setDificul(Dificuldade.Fácil);

		p[19] = new Perguntas();
		p[19].setPergunta("Os dentes de alho são na verdade o que?");
		p[19].setAlternativas("Sementes");
		p[19].setAlternativas("Folhas");
		p[19].setAlternativas("Frutos");
		p[19].setAlternativas("Raízes");
		p[19].setCorreta(1);
		p[19].setCat(Categorias.CiênciaeTecnologia);
		p[19].setDificul(Dificuldade.Fácil);

		// CiênciaeTecnologia médio
		p[20] = new Perguntas();
		p[20].setPergunta("O que é um polígono regular de infinitos lados?");
		p[20].setAlternativas("Dodecágono");
		p[20].setAlternativas("Icoságono");
		p[20].setAlternativas("Quadrado");
		p[20].setAlternativas("Círuclo");
		p[20].setCorreta(3);
		p[20].setCat(Categorias.CiênciaeTecnologia);
		p[20].setDificul(Dificuldade.Médio);

		p[21] = new Perguntas();
		p[21].setPergunta("Em que parte do corpo humano ficam os ossos rádio e úmero");
		p[21].setAlternativas("Cabeça");
		p[21].setAlternativas("Braços");
		p[21].setAlternativas("Pernas");
		p[21].setAlternativas("Pés");
		p[21].setCorreta(1);
		p[21].setCat(Categorias.CiênciaeTecnologia);
		p[21].setDificul(Dificuldade.Médio);

		p[22] = new Perguntas();
		p[22].setPergunta("Quais destes elementos têm maior número atômico?");
		p[22].setAlternativas("Oxigênio");
		p[22].setAlternativas("Hidrogênio");
		p[22].setAlternativas("Carbono");
		p[22].setAlternativas("Prata");
		p[22].setCorreta(3);
		p[22].setCat(Categorias.CiênciaeTecnologia);
		p[22].setDificul(Dificuldade.Médio);

		p[23] = new Perguntas();
		p[23].setPergunta("Os pulgões são insetos que parasitam que organismo?");
		p[23].setAlternativas("Aves");
		p[23].setAlternativas("Cães");
		p[23].setAlternativas("Peixes");
		p[23].setAlternativas("Plantas");
		p[23].setCorreta(3);
		p[23].setCat(Categorias.CiênciaeTecnologia);
		p[23].setDificul(Dificuldade.Médio);

		p[24] = new Perguntas();
		p[24].setPergunta("Qual destes alimentos é um pseudofruto?");
		p[24].setAlternativas("Laranja");
		p[24].setAlternativas("Acerola");
		p[24].setAlternativas("Pêra");
		p[24].setAlternativas("Uva");
		p[24].setCorreta(2);
		p[24].setCat(Categorias.CiênciaeTecnologia);
		p[24].setDificul(Dificuldade.Médio);

		// CiênciaeTecnologia difícil
		p[25] = new Perguntas();
		p[25].setPergunta("Quem é considerado o pai da medicina?");
		p[25].setAlternativas("Sócrates");
		p[25].setAlternativas("Hipócrates");
		p[25].setAlternativas("Demócrito");
		p[25].setAlternativas("Aristóteles");
		p[25].setCorreta(1);
		p[25].setCat(Categorias.CiênciaeTecnologia);
		p[25].setDificul(Dificuldade.Difícil);

		p[26] = new Perguntas();
		p[26].setPergunta("O ácido desoxirribonucléico é também conhecido como o que?");
		p[26].setAlternativas("Ácido gástrico");
		p[26].setAlternativas("Bile");
		p[26].setAlternativas("Bicabornato");
		p[26].setAlternativas("DNA");
		p[26].setCorreta(2);
		p[26].setCat(Categorias.CiênciaeTecnologia);
		p[26].setDificul(Dificuldade.Difícil);

		p[27] = new Perguntas();
		p[27].setPergunta("Quantas vezes um kilobyte por segundo é maior que um kilobit por segundo?");
		p[27].setAlternativas("8 vezes");
		p[27].setAlternativas("16 vezes");
		p[27].setAlternativas("2 vezes");
		p[27].setAlternativas("10 vezes");
		p[27].setCorreta(0);
		p[27].setCat(Categorias.CiênciaeTecnologia);
		p[27].setDificul(Dificuldade.Difícil);

		p[28] = new Perguntas();
		p[28].setPergunta("Como é chamada a informação genética que um ser vivo herda de seus pais?");
		p[28].setAlternativas("Fenótipo");
		p[28].setAlternativas("RNA");
		p[28].setAlternativas("Genótipo");
		p[28].setAlternativas("Herança");
		p[28].setCorreta(2);
		p[28].setCat(Categorias.CiênciaeTecnologia);
		p[28].setDificul(Dificuldade.Difícil);

		p[29] = new Perguntas();
		p[29].setPergunta("A soma de dois ângulos replementares gera um ângulo de quantos graus?");
		p[29].setAlternativas("90°");
		p[29].setAlternativas("120°");
		p[29].setAlternativas("180°");
		p[29].setAlternativas("360°");
		p[29].setCorreta(3);
		p[29].setCat(Categorias.CiênciaeTecnologia);
		p[29].setDificul(Dificuldade.Difícil);

		// Entretenimento fácil
		p[30] = new Perguntas();
		p[30].setPergunta(
				"Em que poema épico são contadas as glórias e a coragem do povo lusitano, cruzando mares e desbravando terras?");
		p[30].setAlternativas("Ilíada");
		p[30].setAlternativas("Os Lusíadas");
		p[30].setAlternativas("Odisséia");
		p[30].setAlternativas("O Alto da barca do inferno");
		p[30].setCorreta(1);
		p[30].setCat(Categorias.Entretenimento);
		p[30].setDificul(Dificuldade.Fácil);

		p[31] = new Perguntas();
		p[31].setPergunta(
				"Qual o apelido de Al Capone, o mais famoso mafioso de todos os tempos, já retratado em diversos filmes?");
		p[31].setAlternativas("Al");
		p[31].setAlternativas("Poderoso Chefão");
		p[31].setAlternativas("Scarface");
		p[31].setAlternativas("El mafioso");
		p[31].setCorreta(2);
		p[31].setCat(Categorias.Entretenimento);
		p[31].setDificul(Dificuldade.Fácil);

		p[32] = new Perguntas();
		p[32].setPergunta("No filme À procura da da Felicidade, que ator interpretou Chris Gardner?");
		p[32].setAlternativas("Chris Evans");
		p[32].setAlternativas("Ryan Reynolds");
		p[32].setAlternativas("Owen Wilson");
		p[32].setAlternativas("Will Smith");
		p[32].setCorreta(3);
		p[32].setCat(Categorias.Entretenimento);
		p[32].setDificul(Dificuldade.Fácil);

		p[33] = new Perguntas();
		p[33].setPergunta("Helena e O alienista são obras de que escritor brasileiro?");
		p[33].setAlternativas("José de Alencar");
		p[33].setAlternativas("Machado de Assis");
		p[33].setAlternativas("Guimarães rosa");
		p[33].setAlternativas("Carlos Drummond de Andrade");
		p[33].setCorreta(1);
		p[33].setCat(Categorias.Entretenimento);
		p[33].setDificul(Dificuldade.Fácil);

		p[34] = new Perguntas();
		p[34].setPergunta("Quem dirigiu os filmes Guerra dos Mundos e A.I.-Inteligência Artificial?");
		p[34].setAlternativas("Alfred Hitchcock");
		p[34].setAlternativas("Woody Allen");
		p[34].setAlternativas("Quentin tarantino");
		p[34].setAlternativas("Steven Spielberg");
		p[34].setCorreta(3);
		p[34].setCat(Categorias.Entretenimento);
		p[34].setDificul(Dificuldade.Fácil);

		// Entretenimento médio
		p[35] = new Perguntas();
		p[35].setPergunta(
				"Que filme conta a história de um homem que abre uma fábrica e faz dela o refúgio de judeus na Alemanha nazista?");
		p[35].setAlternativas("O menino do pijama listrado");
		p[35].setAlternativas("O jogo de imitação");
		p[35].setAlternativas("Bastardos inglórios");
		p[35].setAlternativas("A lista de Schindler");
		p[35].setCorreta(3);
		p[35].setCat(Categorias.Entretenimento);
		p[35].setDificul(Dificuldade.Médio);

		p[36] = new Perguntas();
		p[36].setPergunta("Qual é o nome do jornal onde Peter Parker é fotógrafo free lancer?");
		p[36].setAlternativas("Planeta Diário");
		p[36].setAlternativas("Clarin Diário");
		p[36].setAlternativas("Diário News");
		p[36].setAlternativas("Planeta News");
		p[36].setCorreta(1);
		p[36].setCat(Categorias.Entretenimento);
		p[36].setDificul(Dificuldade.Médio);

		p[37] = new Perguntas();
		p[37].setPergunta("Nos quadrinhos de X-Men, quem é o grande inimigo de Wolverine?");
		p[37].setAlternativas("Dentes-de-Sabre");
		p[37].setAlternativas("Magneto");
		p[37].setAlternativas("Sr. Sinistro");
		p[37].setAlternativas("Apocalipse");
		p[37].setCorreta(0);
		p[37].setCat(Categorias.Entretenimento);
		p[37].setDificul(Dificuldade.Médio);

		p[38] = new Perguntas();
		p[38].setPergunta(
				"O significado deste estilo é irregular, retorcido e grotesco, nasceu sobre a égide da contra-reforma católica, qual estilo é esse?");
		p[38].setAlternativas("Realista");
		p[38].setAlternativas("Bucólico");
		p[38].setAlternativas("Gótico");
		p[38].setAlternativas("Barroco");
		p[38].setCorreta(3);
		p[38].setCat(Categorias.Entretenimento);
		p[38].setDificul(Dificuldade.Médio);

		p[39] = new Perguntas();
		p[39].setPergunta("Quem morre no final da décima temporada de Greys Anatomy?");
		p[39].setAlternativas("Miranda Bailey");
		p[39].setAlternativas("George O'Mailly");
		p[39].setAlternativas("Callie Torres");
		p[39].setAlternativas("Derek Shepard");
		p[39].setCorreta(3);
		p[39].setCat(Categorias.Entretenimento);
		p[39].setDificul(Dificuldade.Médio);

		// Entretenimento difícil
		p[40] = new Perguntas();
		p[40].setPergunta("Em que ano aconteceu a Semana de Arte Moderna no Teatro Municipal de São Paulo?");
		p[40].setAlternativas("1920");
		p[40].setAlternativas("1921");
		p[40].setAlternativas("1922");
		p[40].setAlternativas("1923");
		p[40].setCorreta(2);
		p[40].setCat(Categorias.Entretenimento);
		p[40].setDificul(Dificuldade.Difícil);

		p[41] = new Perguntas();
		p[41].setPergunta(
				"Que movimento artístico, lançado por Marcel Duchamp durante a Primeira Guerra Mundial, pregava o absurdo e a antiarte?");
		p[41].setAlternativas("Dadaísmo");
		p[41].setAlternativas("Expressionismo");
		p[41].setAlternativas("Modernismo");
		p[41].setAlternativas("Naturalismo");
		p[41].setCorreta(0);
		p[41].setCat(Categorias.Entretenimento);
		p[41].setDificul(Dificuldade.Difícil);

		p[42] = new Perguntas();
		p[42].setPergunta(
				"Com 7 filmes já lançados, recorde de bilheteria no seu lançamento, muitos prêmios conquistados e uma legião de fãs obstinados pelo mundo, esta saga ainda não terminou, qual é esse filme?");
		p[42].setAlternativas("Harry Potter");
		p[42].setAlternativas("Indiana Jones");
		p[42].setAlternativas("O Senhor dos Anéis");
		p[42].setAlternativas("Star Wars");
		p[42].setCorreta(3);
		p[42].setCat(Categorias.Entretenimento);
		p[42].setDificul(Dificuldade.Difícil);

		p[43] = new Perguntas();
		p[43].setPergunta(
				"Que famoso seriado mostrava a vida de amigos em Nova York, frequentadores da cafeteria Central Perk?");
		p[43].setAlternativas("The Big Bang Theory");
		p[43].setAlternativas("How i met your mother");
		p[43].setAlternativas("Friends");
		p[43].setAlternativas("Two and a half men");
		p[43].setCorreta(2);
		p[43].setCat(Categorias.Entretenimento);
		p[43].setDificul(Dificuldade.Difícil);

		p[44] = new Perguntas();
		p[44].setPergunta("Qual escritor norte-americano é autor do polêmico livro O Código da Vinci?");
		p[44].setAlternativas("Stephen King");
		p[44].setAlternativas("Edgar Allan Poe");
		p[44].setAlternativas("Dan Brown");
		p[44].setAlternativas("Charles Dickens");
		p[44].setCorreta(2);
		p[44].setCat(Categorias.Entretenimento);
		p[44].setDificul(Dificuldade.Difícil);

		// EsporteeLazer fácil
		p[45] = new Perguntas();
		p[45].setPergunta("Em que país foi realizada a primeira edição da Copa do Mundo de futebol?");
		p[45].setAlternativas("França");
		p[45].setAlternativas("Brasil");
		p[45].setAlternativas("Uruguai");
		p[45].setAlternativas("Alemanha");
		p[45].setCorreta(2);
		p[45].setCat(Categorias.EsporteeLazer);
		p[45].setDificul(Dificuldade.Fácil);

		p[46] = new Perguntas();
		p[46].setPergunta("Quantas linhas e quantas colunas tem geralmente uma grase de Sudoku?");
		p[46].setAlternativas("6 linhas e 6 colunas");
		p[46].setAlternativas("9 linhas e 6 colunas");
		p[46].setAlternativas("9 linhas e 9 colunas");
		p[46].setAlternativas("6 linhas e 9 colunas");
		p[46].setCorreta(2);
		p[46].setCat(Categorias.EsporteeLazer);
		p[46].setDificul(Dificuldade.Fácil);

		p[47] = new Perguntas();
		p[47].setPergunta("O Game boy, lançado em 1989, foi uma criação de qual empresa?");
		p[47].setAlternativas("Nintendo");
		p[47].setAlternativas("Sega");
		p[47].setAlternativas("Sony");
		p[47].setAlternativas("Namco");
		p[47].setCorreta(0);
		p[47].setCat(Categorias.EsporteeLazer);
		p[47].setDificul(Dificuldade.Fácil);

		p[48] = new Perguntas();
		p[48].setPergunta(
				"Os torneios de tênis de Roland garros, Open da Austrália, Wimbledon e US Open fazem parte de que?");
		p[48].setAlternativas("Grand tournament");
		p[48].setAlternativas("Grand Slam");
		p[48].setAlternativas("Grand Prix");
		p[48].setAlternativas("Tournament");
		p[48].setCorreta(1);
		p[48].setCat(Categorias.EsporteeLazer);
		p[48].setDificul(Dificuldade.Fácil);

		p[49] = new Perguntas();
		p[49].setPergunta("Com quantos dados se joga o pôquer de dados?");
		p[49].setAlternativas("3 dados");
		p[49].setAlternativas("4 dados");
		p[49].setAlternativas("5 dados");
		p[49].setAlternativas("6 dados");
		p[49].setCorreta(2);
		p[49].setCat(Categorias.EsporteeLazer);
		p[49].setDificul(Dificuldade.Fácil);

		// Esporteelazer médio
		p[50] = new Perguntas();
		p[50].setPergunta("Qual a cor da bola colocada bem no meio da mesa ao se iniciar uma partida de sinuca?");
		p[50].setAlternativas("Amarela");
		p[50].setAlternativas("Verde");
		p[50].setAlternativas("Branca");
		p[50].setAlternativas("Azul");
		p[50].setCorreta(3);
		p[50].setCat(Categorias.EsporteeLazer);
		p[50].setDificul(Dificuldade.Médio);

		p[51] = new Perguntas();
		p[51].setPergunta("Qual destes não é um naipe dos baralhos usados na Espanha e na Itália?");
		p[51].setAlternativas("Dragões");
		p[51].setAlternativas("Taças");
		p[51].setAlternativas("Bastões");
		p[51].setAlternativas("Moedas");
		p[51].setCorreta(0);
		p[51].setCat(Categorias.EsporteeLazer);
		p[51].setDificul(Dificuldade.Médio);

		p[52] = new Perguntas();
		p[52].setPergunta("Um time de pólo aquático dispóe de quantos segundos para comcluir um ataque?");
		p[52].setAlternativas("30 segundos");
		p[52].setAlternativas("45 segundos");
		p[52].setAlternativas("60 segundos");
		p[52].setAlternativas("65 segundos");
		p[52].setCorreta(0);
		p[52].setCat(Categorias.EsporteeLazer);
		p[52].setDificul(Dificuldade.Médio);

		p[53] = new Perguntas();
		p[53].setPergunta(
				"Quem foi o técnico da Seleção Brasileira de Futebol nas Copas do Mundo de 1982 e 1986, falecido em 2006?");
		p[53].setAlternativas("João Saldanha");
		p[53].setAlternativas("Telê Santana");
		p[53].setAlternativas("Zagallo");
		p[53].setAlternativas("Carlos Alberto Parreira");
		p[53].setCorreta(1);
		p[53].setCat(Categorias.EsporteeLazer);
		p[53].setDificul(Dificuldade.Médio);

		p[54] = new Perguntas();
		p[54].setPergunta("No escudo da CBF as letras estão sobre o que?");
		p[54].setAlternativas("Círculo");
		p[54].setAlternativas("Elipse");
		p[54].setAlternativas("Quadrado");
		p[54].setAlternativas("Cruz");
		p[54].setCorreta(3);
		p[54].setCat(Categorias.EsporteeLazer);
		p[54].setDificul(Dificuldade.Médio);

		// EsporteeLazer difícil
		p[55] = new Perguntas();
		p[55].setPergunta("O estilo medley da natação, é um estilo composto de quais outros?");
		p[55].setAlternativas("Borboleta, peito e livre");
		p[55].setAlternativas("Peito, crawl e livre");
		p[55].setAlternativas("Peito, borboleta, crawl e costas");
		p[55].setAlternativas("Borboleta, peito, livre e crawl");
		p[55].setCorreta(2);
		p[55].setCat(Categorias.EsporteeLazer);
		p[55].setDificul(Dificuldade.Difícil);

		p[56] = new Perguntas();
		p[56].setPergunta(
				"No beisebol, um batedor é eliminado depois de quantos arremessos sem conseguir bater a bola?");
		p[56].setAlternativas("3 arremessos");
		p[56].setAlternativas("4 arremessos");
		p[56].setAlternativas("5 arremessos");
		p[56].setAlternativas("6 arremessos");
		p[56].setCorreta(0);
		p[56].setCat(Categorias.EsporteeLazer);
		p[56].setDificul(Dificuldade.Difícil);

		p[57] = new Perguntas();
		p[57].setPergunta("Se você usa uma espada pra lutar, você é provavelmente lutador de que?");
		p[57].setAlternativas("Sumô");
		p[57].setAlternativas("Kendo");
		p[57].setAlternativas("Karatê");
		p[57].setAlternativas("Vale tudo");
		p[57].setCorreta(1);
		p[57].setCat(Categorias.EsporteeLazer);
		p[57].setDificul(Dificuldade.Difícil);

		p[58] = new Perguntas();
		p[58].setPergunta("Em paintball, dorito, é um tipo de que?");
		p[58].setAlternativas("Munição");
		p[58].setAlternativas("Juiz");
		p[58].setAlternativas("Pessoa");
		p[58].setAlternativas("Obstáculo");
		p[58].setCorreta(3);
		p[58].setCat(Categorias.EsporteeLazer);
		p[58].setDificul(Dificuldade.Difícil);

		p[59] = new Perguntas();
		p[59].setPergunta("Em que anos o Brasil ganhou a Copa do Mundo de Futebol?");
		p[59].setAlternativas("1958, 1964, 1970, 1998, 2002");
		p[59].setAlternativas("1954, 1962, 1974, 1994, 2002");
		p[59].setAlternativas("1958, 1962, 1970, 1994, 2002");
		p[59].setAlternativas("1954, 1964, 1974, 1998, 2002");
		p[59].setCorreta(2);
		p[59].setCat(Categorias.EsporteeLazer);
		p[59].setDificul(Dificuldade.Difícil);

		// Mundo fácil
		p[60] = new Perguntas();
		p[60].setPergunta(
				"Qual a expressão para ondas gigantes provocadas pelo deslocamento de placas tectônicas no fundo do mar?");
		p[60].setAlternativas("Terremoto");
		p[60].setAlternativas("Condilheiras");
		p[60].setAlternativas("Avalanche");
		p[60].setAlternativas("Tsunami");
		p[60].setCorreta(3);
		p[60].setCat(Categorias.Mundo);
		p[60].setDificul(Dificuldade.Fácil);

		p[61] = new Perguntas();
		p[61].setPergunta("Qual o significado do termo Mesopotâmia");
		p[61].setAlternativas("Terra sem dono");
		p[61].setAlternativas("Terra molhada");
		p[61].setAlternativas("Terra entre rios");
		p[61].setAlternativas("Terra mesmo");
		p[61].setCorreta(2);
		p[61].setCat(Categorias.Mundo);
		p[61].setDificul(Dificuldade.Fácil);

		p[62] = new Perguntas();
		p[62].setPergunta(
				"Qual o centro internacional de finanças e comércio que foi colônia britânica e está situado na costa sudeste da China?");
		p[62].setAlternativas("Xangai");
		p[62].setAlternativas("Taiwan");
		p[62].setAlternativas("Hong Kong");
		p[62].setAlternativas("Shanxi");
		p[62].setCorreta(2);
		p[62].setCat(Categorias.Mundo);
		p[62].setDificul(Dificuldade.Fácil);

		p[63] = new Perguntas();
		p[63].setPergunta("Antônio Palocci teve grande destaque em que ministério do governo Lula?");
		p[63].setAlternativas("Ministério da Saúde");
		p[63].setAlternativas("Ministério do Trabalho");
		p[63].setAlternativas("Ministério da Fazenda");
		p[63].setAlternativas("Ministério da Cultura");
		p[63].setCorreta(1);
		p[63].setCat(Categorias.Mundo);
		p[63].setDificul(Dificuldade.Fácil);

		p[64] = new Perguntas();
		p[64].setPergunta("Quem é considerado o pai da aviação no Brasil?");
		p[64].setAlternativas("Rui Barbosa");
		p[64].setAlternativas("Santos Dumont");
		p[64].setAlternativas("Castro Alves");
		p[64].setAlternativas("Oswaldo Cruz");
		p[64].setCorreta(1);
		p[64].setCat(Categorias.Mundo);
		p[64].setDificul(Dificuldade.Fácil);

		// Mundo médio
		p[65] = new Perguntas();
		p[65].setPergunta("A Tríplice Entente derrotu a Tríplice Aliança em que Guerra?");
		p[65].setAlternativas("Segunda Guerra Mundial");
		p[65].setAlternativas("Primeira Guerra Mundial");
		p[65].setAlternativas("Guerra dos 100 anos");
		p[65].setAlternativas("Guerra do Vietnã");
		p[65].setCorreta(1);
		p[65].setCat(Categorias.Mundo);
		p[65].setDificul(Dificuldade.Médio);

		p[66] = new Perguntas();
		p[66].setPergunta(
				"Que nome tem a distância em graus de qualquer ponto da superfície terrestre até o Meridiano de Greenwich?");
		p[66].setAlternativas("Longitude");
		p[66].setAlternativas("Latitude");
		p[66].setAlternativas("Fuso horário");
		p[66].setAlternativas("Trópico");
		p[66].setCorreta(0);
		p[66].setCat(Categorias.Mundo);
		p[66].setDificul(Dificuldade.Médio);

		p[67] = new Perguntas();
		p[67].setPergunta(
				"Qual o vulcão mais famoso do Japão, retratado em inúmeros trabalhos artísticos do seu povo?");
		p[67].setAlternativas("Monte Fuji");
		p[67].setAlternativas("Monte Santa Helena");
		p[67].setAlternativas("SakuraJima ");
		p[67].setAlternativas("Kilauea");
		p[67].setCorreta(0);
		p[67].setCat(Categorias.Mundo);
		p[67].setDificul(Dificuldade.Médio);

		p[68] = new Perguntas();
		p[68].setPergunta("Com qual destes países Alemanha não faz fronteira");
		p[68].setAlternativas("Polônia");
		p[68].setAlternativas("França");
		p[68].setAlternativas("Itália");
		p[68].setAlternativas("Áustria");
		p[68].setCorreta(2);
		p[68].setCat(Categorias.Mundo);
		p[68].setDificul(Dificuldade.Médio);

		p[69] = new Perguntas();
		p[69].setPergunta(
				"Em 1947, o território da Índia foi dividido em duas partes pelos ingleses, dando origem a dois países, quais são eles?");
		p[69].setAlternativas("Paquistão");
		p[69].setAlternativas("Afeganistão");
		p[69].setAlternativas("Uzbequistão");
		p[69].setAlternativas("Sri Lanka");
		p[69].setCorreta(0);
		p[69].setCat(Categorias.Mundo);
		p[69].setDificul(Dificuldade.Médio);

		// Mundo difícil
		p[70] = new Perguntas();
		p[70].setPergunta("Como ficou conhecida a abertura política proposta por Gorbachev?");
		p[70].setAlternativas("Perestroika");
		p[70].setAlternativas("Recomeço");
		p[70].setAlternativas("Abertura capitalista");
		p[70].setAlternativas("Glasnost");
		p[70].setCorreta(3);
		p[70].setCat(Categorias.Mundo);
		p[70].setDificul(Dificuldade.Difícil);

		p[71] = new Perguntas();
		p[71].setPergunta("Que deserto se encontra no Chile e é considerado um dos mais secos do mundo");
		p[71].setAlternativas("Deserto do Saara");
		p[71].setAlternativas("Deserto do Atacama");
		p[71].setAlternativas("Deserto de Kalahari");
		p[71].setAlternativas("Deserto de Nazca");
		p[71].setCorreta(1);
		p[71].setCat(Categorias.Mundo);
		p[71].setDificul(Dificuldade.Difícil);

		p[72] = new Perguntas();
		p[72].setPergunta("O chamado método Paulo Freire, é uma proposta pra que tipo de ensino?");
		p[72].setAlternativas("Ensino fundamental");
		p[72].setAlternativas("Ensino Médio");
		p[72].setAlternativas("Faculdade");
		p[72].setAlternativas("Alfabetização de adultos");
		p[72].setCorreta(3);
		p[72].setCat(Categorias.Mundo);
		p[72].setDificul(Dificuldade.Difícil);

		p[73] = new Perguntas();
		p[73].setPergunta("Quem fundou o protestantismo , sendo por isso excomungado pela Igreja Católica?");
		p[73].setAlternativas("Calvino");
		p[73].setAlternativas("Henrique VIII");
		p[73].setAlternativas("Martinho Lutero");
		p[73].setAlternativas("Galileu Galilei");
		p[73].setCorreta(2);
		p[73].setCat(Categorias.Mundo);
		p[73].setDificul(Dificuldade.Difícil);

		p[74] = new Perguntas();
		p[74].setPergunta("Em que ano o partido de Hitler chegou ao poder?");
		p[74].setAlternativas("1921");
		p[74].setAlternativas("1931");
		p[74].setAlternativas("1933");
		p[74].setAlternativas("1935");
		p[74].setCorreta(2);
		p[74].setCat(Categorias.Mundo);
		p[74].setDificul(Dificuldade.Difícil);
		
	}
}
*/