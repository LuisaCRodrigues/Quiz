import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class teste extends JFrame {
	
	//private JPanel contentPane;
	JLabel bolaAzul = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste frame = new teste();
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
	public teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1400,350);
		setLocationRelativeTo(null);
		setVisible(true);
		getContentPane().setLayout(null);
		
	
		bolaAzul.setIcon(new ImageIcon("BolaAzul.jpeg"));
		bolaAzul.setBounds(57, 55, 22, 22);
		getContentPane().add(bolaAzul);
		setBounds(100, 100, 450, 300);
		
		new Movimento().start();
		
	}
	
	public class Movimento extends Thread{
		public void run() {
			while(true) {
				try{sleep(400);}catch(Exception erro){}
				
				int posX = bolaAzul.getX();
				int posY = bolaAzul.getY();
			
				if(posX >= 57 && posX < 257 && posY >= 55 && posY < 255) {
					bolaAzul.setBounds(posX + 20,posY,22,22);
				}
				else if(posX == 257 && posY < 255){
					bolaAzul.setBounds(posX, posY + 20, 22, 22);
				}
				
				else if(posX <= 257 && posX >= 57 && posY <= 255 && posX >= 55) {
					bolaAzul.setBounds(posX-20, posY, 22, 22);
				}
				
				else {
					bolaAzul.setBounds(posX, posY - 20, 22, 22);
				}
			}
		}
	}
}
