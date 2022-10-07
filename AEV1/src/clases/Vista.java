package clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JButton btnAbrirFicheros;
	private JTextArea txtDatos;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAbrirFicheros = new JButton("BUSCADOR DE FICHEROS");
		btnAbrirFicheros.setBounds(44, 31, 200, 42);
		contentPane.add(btnAbrirFicheros);
		
		txtDatos = new JTextArea();
		txtDatos.setBounds(44, 98, 200, 22);
		contentPane.add(txtDatos);
		setVisible(true);
	}
	
	public JButton getElegirFichero() {
		return btnAbrirFicheros;
	}
	public JTextArea getDatos() {
		return txtDatos;
	}
}
