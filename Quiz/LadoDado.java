import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LadoDado extends JFrame {

	private JPanel contentPane;
	protected static int quantCasasAndar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LadoDado frame = new LadoDado();
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
	public LadoDado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNmeroDeLados = new JLabel("N\u00FAmero de lados do dado");
		lblNmeroDeLados.setBounds(145, 66, 134, 14);
		contentPane.add(lblNmeroDeLados);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantCasasAndar = Jogo.lado2.sortearValor();
				JOptionPane.showMessageDialog(null, "Você vai andar "+quantCasasAndar+" casas");
				dispose();
			}
		});
		btnNewButton.setBounds(63, 119, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quantCasasAndar = Jogo.lado4.sortearValor();
				JOptionPane.showMessageDialog(null, "Você vai andar "+quantCasasAndar+" casas");
				dispose();
			}
		});
		
		btnNewButton_1.setBounds(235, 119, 89, 23);
		contentPane.add(btnNewButton_1);
		
	}

}
