package rojo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Layout extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout frame = new Layout();
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
	public Layout() {
		getContentPane().setLayout(new GridLayout(2, 3, 0, 0));
		
		JButton btnNewButton_2 = new JButton("New button");
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		getContentPane().add(btnNewButton_1);
	}

}
