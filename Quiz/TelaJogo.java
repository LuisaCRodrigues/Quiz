import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaJogo extends JFrame {

	private JLabel jogador1 = new JLabel("");
	private JPanel contentPane;
	private Jogador jogadorJogando = null;
	public int x = 56;
	public int y = 27;
	public int acertos = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
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
	public TelaJogo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		jogador1.setIcon(new ImageIcon(TelaJogo.class.getResource("/Imagens/BolaAzul.png")));
		jogador1.setBounds(x, y, 22, 22);
		contentPane.add(jogador1);

		JButton btnAndaBola = new JButton("Anda bola");
		btnAndaBola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LadoDado lado = new LadoDado();
				int casas = LadoDado.quantCasasAndar;
				//acertos = quantCasasAndar;
				moveJogador(casas);
			}
		});
		btnAndaBola.setBounds(205, 198, 89, 23);
		contentPane.add(btnAndaBola);

		JLabel tabuleiro = new JLabel("");
		tabuleiro.setIcon(new ImageIcon(TelaJogo.class.getResource("/Imagens/Tabuleiro.jpeg")));
		tabuleiro.setBounds(0, 0, 502, 504);
		contentPane.add(tabuleiro);

		JButton btnEscolherDado = new JButton("Escolher Dado");
		btnEscolherDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LadoDado frame = new LadoDado();
				frame.setVisible(true);
			}
		});

		btnEscolherDado.setBounds(519, 111, 117, 42);
		contentPane.add(btnEscolherDado);

		JButton btnResponder = new JButton("Responder");
		btnResponder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				perguntaDada frame = new perguntaDada();
				frame.setVisible(true);
				LadoDado lado = new LadoDado();
				acertos = lado.quantCasasAndar;
				moveJogador(acertos);				
			}
		});
		btnResponder.setBounds(519, 188, 117, 42);
		contentPane.add(btnResponder);
	}

	public void moveJogador(int acertos) {
		if (acertos < 5) {
			x += 100;
			jogador1.setBounds(x, y, 22, 22);
		} else if (acertos >= 5 && acertos < 9) {
			y += 100;
			jogador1.setBounds(x, y, 22, 22);
		} else if (acertos >= 9 && acertos < 13) {
			x -= 100;
			jogador1.setBounds(x, y, 22, 22);
		} else if (acertos >= 13 && acertos < 16) {
			y -= 100;
			jogador1.setBounds(x, y, 22, 22);
		} else {
			y -= 100;
			jogador1.setBounds(x, y, 22, 22);
			JOptionPane.showMessageDialog(null, "PARABÉNS, VOCÊ GANHOU O JOGO!");
		}
	}
}
