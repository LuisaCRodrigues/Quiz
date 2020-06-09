import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class perguntaDada extends JFrame {

	protected static String resp;
	private String[] correta = new String[75];
	JButton btnLetraA = new JButton("");
	JButton btnLetraB = new JButton("");
	JButton btnLetraC = new JButton("");
	JButton btnLetraD = new JButton("");
	private static Perguntas p[] = new Perguntas[75];
	public static int num;
	private JPanel contentPane;
	private static int x = 0;
	private String pergunta;
	private Dificuldade dificul;
	private Categorias cat;
	private String[] alternativas;
	boolean corr = false;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					perguntaDada frame = new perguntaDada();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public perguntaDada() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea perguntaText = new JTextArea ("");
		perguntaText.setEditable(false);  
		perguntaText.setLineWrap(true);  
		perguntaText.setWrapStyleWord(true);  
		perguntaText.setBounds(31, 40, 373, 42);
		contentPane.add(perguntaText);
		perguntaText.setText(setPergunta());
		
		
		btnLetraA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resp = btnLetraA.getText();
				verificarResposta(num);
			}
		});
		btnLetraA.setBounds(20, 119, 89, 23);
		contentPane.add(btnLetraA);
		
		
		btnLetraB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resp = btnLetraB.getText();
				verificarResposta(num);
			}
		});
		
		btnLetraB.setBounds(117, 119, 89, 23);
		contentPane.add(btnLetraB);
		
		
		btnLetraC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resp = btnLetraC.getText();
				verificarResposta(num);
			}
		});
		btnLetraC.setBounds(216, 119, 89, 23);
		contentPane.add(btnLetraC);
		
		
		btnLetraD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resp = btnLetraD.getText();
				verificarResposta(num);
			}
		});
		btnLetraD.setBounds(315, 119, 89, 23);
		contentPane.add(btnLetraD);
		
	}
	
	
	public void criarPerguntas() {
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
					    correta[i] = lerArq.readLine();
					}
				arq.close();
			} catch (IOException ex) {
				System.out.println("Arquivo não encontrado");
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Sem conteudo");
	}		
}
	
	public String setPergunta() {
		criarPerguntas();
		Random radom = new Random();
		 num = radom.nextInt(75);
		String conteudo = p[num].getPergunta();
		setAlternativas(num);
		
		return conteudo;
	}
	
	public void setAlternativas(int num) {
		String[] alternativa = p[num].getArray();
		btnLetraA.setText(alternativa[0]);
		btnLetraB.setText(alternativa[1]);
		btnLetraC.setText(alternativa[2]);
		btnLetraD.setText(alternativa[3]);		
	}
	
	public void verificarResposta(int num) {
		
			if(resp.equals(correta[num])){
				corr = true;
				JOptionPane.showMessageDialog(null, "Resposta certa!");
				dispose();
			}
	    if(corr == false) {
			JOptionPane.showMessageDialog(null, "Resposta errada! Resposta correta: "+correta[num]);
			dispose();
		}
	}
	
}
