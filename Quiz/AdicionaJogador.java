import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AdicionaJogador extends JFrame {
	
	ArrayList<String> jogadoresAtivos = new ArrayList();

	private JPanel contentPane;
	private JTextField nome;
	public static int i;
	public int variedades, cienciaetecnologia, esporteelazer, mundo, entretenimento;
	public String cor;
	public int facil = 0, medio = 0, dificil = 0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdicionaJogador frame = new AdicionaJogador();
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
	public AdicionaJogador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJogador = new JLabel("Jogador 1:");
		lblJogador.setBounds(30, 27, 46, 14);
		contentPane.add(lblJogador);
		
		nome = new JTextField();
		nome.setBounds(136, 24, 187, 20);
		contentPane.add(nome);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(30, 63, 46, 14);
		contentPane.add(lblCor);
		
		JComboBox boxCor = new JComboBox();
		boxCor.setBounds(136, 60, 81, 20);
		contentPane.add(boxCor);
		boxCor.addItem("Amarelo");
		boxCor.addItem("Vermelho");
		boxCor.addItem("Verde");
		boxCor.addItem("Azul");
		boxCor.addItem("Preto");
		boxCor.addItem("Branco");
		cor = boxCor.getSelectedItem().toString();
		
		JLabel lblEscolhaSuasHabilidades = new JLabel("Escolha suas Habilidades");
		lblEscolhaSuasHabilidades.setBounds(30, 98, 131, 14);
		contentPane.add(lblEscolhaSuasHabilidades);
		
		JLabel lblVariedades = new JLabel("Variedades");
		lblVariedades.setBounds(30, 123, 73, 14);
		contentPane.add(lblVariedades);
		
		JLabel lblCinciaETecnologia = new JLabel("Ci\u00EAncia e Tecnologia");
		lblCinciaETecnologia.setBounds(30, 148, 109, 14);
		contentPane.add(lblCinciaETecnologia);
		
		JLabel lblEsporteELazer = new JLabel("Esporte e Lazer");
		lblEsporteELazer.setBounds(30, 173, 81, 14);
		contentPane.add(lblEsporteELazer);
		
		JLabel lblMundo = new JLabel("Mundo");
		lblMundo.setBounds(30, 195, 46, 14);
		contentPane.add(lblMundo);
		
		JLabel lblEntretenimento = new JLabel("Entretenimento");
		lblEntretenimento.setBounds(30, 220, 81, 14);
		contentPane.add(lblEntretenimento);
		
		JComboBox boxVariedades = new JComboBox();
		boxVariedades.setBounds(206, 120, 40, 20);
		contentPane.add(boxVariedades);
		boxVariedades.addItem("0");
		boxVariedades.addItem("1");
		boxVariedades.addItem("2");
		variedades = boxVariedades.getSelectedIndex();
		
		
		JComboBox boxCienciaETecnologia = new JComboBox();
		boxCienciaETecnologia.setBounds(206, 148, 40, 20);
		contentPane.add(boxCienciaETecnologia);
		boxCienciaETecnologia.addItem("0");
		boxCienciaETecnologia.addItem("1");
		boxCienciaETecnologia.addItem("2");
		cienciaetecnologia = boxCienciaETecnologia.getSelectedIndex();
		
		JComboBox boxEsporteELazer = new JComboBox();
		boxEsporteELazer.setBounds(206, 170, 40, 20);
		contentPane.add(boxEsporteELazer);
		boxEsporteELazer.addItem("0");
		boxEsporteELazer.addItem("1");
		boxEsporteELazer.addItem("2");
		esporteelazer = boxEsporteELazer.getSelectedIndex();
		
		JComboBox boxMundo = new JComboBox();
		boxMundo.setBounds(206, 192, 40, 20);
		contentPane.add(boxMundo);
		boxMundo.addItem("0");
		boxMundo.addItem("1");
		boxMundo.addItem("2");
		mundo = boxMundo.getSelectedIndex();
		
		JComboBox boxEntretenimento = new JComboBox();
		boxEntretenimento.setBounds(206, 217, 40, 20);
		contentPane.add(boxEntretenimento);
		boxEntretenimento.addItem("0");
		boxEntretenimento.addItem("1");
		boxEntretenimento.addItem("2");
		entretenimento = boxEntretenimento.getSelectedIndex();	
		
		JButton btnPrximo = new JButton("Pr\u00F3ximo");
		btnPrximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(QntJogadores.totJogadores != 1) {
					AdicionaJogador frame = new AdicionaJogador();
					frame.setVisible(true);
					QntJogadores.totJogadores--;
					dispose();
				}else {
					TelaJogo frame = new TelaJogo();
					frame.setVisible(true);
				}			
			}
		});
		btnPrximo.setBounds(335, 227, 89, 23);
		contentPane.add(btnPrximo);	
	}	
}


