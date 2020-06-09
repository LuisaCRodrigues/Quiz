import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class QntJogadores extends JFrame {
	
	public static int totJogadores;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QntJogadores frame = new QntJogadores();
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
	public QntJogadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea lblQuantosJogadores = new JTextArea("Quantos jogadores?");
		lblQuantosJogadores.setBackground(UIManager.getColor("Button.background"));
		lblQuantosJogadores.setEditable(false);  
		lblQuantosJogadores.setLineWrap(true);  
		lblQuantosJogadores.setWrapStyleWord(true);  
		lblQuantosJogadores.setBounds(151, 94, 161, 40);
		contentPane.add(lblQuantosJogadores);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totJogadores = 2;
				AdicionaJogador frame = new AdicionaJogador();
				frame.setVisible(true);
			}
		});
		button.setBounds(51, 145, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totJogadores = 3;
				AdicionaJogador frame = new AdicionaJogador();
				frame.setVisible(true);
			}
		});
		button_1.setBounds(173, 145, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totJogadores = 4;
				AdicionaJogador frame = new AdicionaJogador();
				frame.setVisible(true);
			}
		});
		button_2.setBounds(305, 145, 89, 23);
		contentPane.add(button_2);
	}

}
