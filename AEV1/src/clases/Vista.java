package clases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JButton btnAbrirFicheros;
	private JTextArea txtDatos;
	private JScrollPane scrollPane;
	private JTextArea txtContenidoFichero;
	private JTextField nombreReemplazar;
	private JTextField txtReemplazado;
	private JButton btnReemplazar;

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
		btnAbrirFicheros.setBounds(26, 30, 200, 42);
		contentPane.add(btnAbrirFicheros);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 99, 200, 106);
		contentPane.add(scrollPane);
		
		txtContenidoFichero = new JTextArea();
		txtContenidoFichero.setBounds(26, 242, 401, 171);
		contentPane.add(txtContenidoFichero);
		
		txtDatos = new JTextArea();
		txtDatos.setBounds(26, 99, 198, 104);
		contentPane.add(txtDatos);
		
		nombreReemplazar = new JTextField();
		nombreReemplazar.setBounds(424, 25, 136, 20);
		contentPane.add(nombreReemplazar);
		nombreReemplazar.setColumns(10);
		
		txtReemplazado = new JTextField();
		txtReemplazado.setColumns(10);
		txtReemplazado.setBounds(424, 66, 136, 20);
		contentPane.add(txtReemplazado);
		
		JLabel lblNewLabel = new JLabel("NOMBRE DEL FICHERO");
		lblNewLabel.setBounds(424, 11, 136, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreParaReemplazar = new JLabel("NOMBRE PARA REEMPLAZAR");
		lblNombreParaReemplazar.setBounds(424, 53, 157, 14);
		contentPane.add(lblNombreParaReemplazar);
		
		JButton btnReemplazar = new JButton("REEMPLAZAR");
		btnReemplazar.setBounds(591, 24, 126, 54);
		contentPane.add(btnReemplazar);
		setVisible(true);
	}
	
	public JButton getElegirFichero() {
		return btnAbrirFicheros;
	}
	public JTextArea getDatos() {
		return txtDatos;
	}
	public JTextArea getContenidoFichero() {
		return txtContenidoFichero;
	}
	
	public JTextField getNombreActual() {
		return nombreReemplazar;
	}
	
	public JTextField getNombreReemplazar() {
		return txtReemplazado;
	}
	public JButton getBtnReemplazar() {
		return btnReemplazar;
	}
}
