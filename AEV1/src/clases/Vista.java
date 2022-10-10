package clases;

import java.awt.EventQueue;
import java.security.PublicKey;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JButton btnAbrirFicheros;
	private JTextArea txtDatos;
	private JScrollPane scrollPane;
	private JTextArea txtContenidoFichero;
	private JTextField nombreReemplazar;
	private JTextField txtReemplazado;
	private JButton btnReemplazar;
	private JTextField txtRutaFichero;
	private JButton btnCrearFichero;
	private JButton btnBorrarFichero;
	private JButton btnCopiarFichero;
	private JTextField txtRutaFicheroOriginal;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1160, 616);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnAbrirFicheros = new JButton("BUSCADOR DE FICHEROS");
		btnAbrirFicheros.setBackground(new Color(0, 64, 128));
		btnAbrirFicheros.setBounds(43, 40, 221, 66);
		contentPane.add(btnAbrirFicheros);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 124, 364, 155);
		contentPane.add(scrollPane);

		txtContenidoFichero = new JTextArea();
		txtContenidoFichero.setBounds(24, 395, 509, 171);
		contentPane.add(txtContenidoFichero);

		nombreReemplazar = new JTextField();
		nombreReemplazar.setBounds(788, 177, 175, 20);
		contentPane.add(nombreReemplazar);
		nombreReemplazar.setColumns(10);

		txtReemplazado = new JTextField();
		txtReemplazado.setColumns(10);
		txtReemplazado.setBounds(788, 221, 175, 20);
		contentPane.add(txtReemplazado);

		JLabel lblNewLabel = new JLabel("NOMBRE DEL FICHERO");
		lblNewLabel.setBounds(788, 163, 175, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNombreParaReemplazar = new JLabel("NOMBRE PARA REEMPLAZAR");
		lblNombreParaReemplazar.setBounds(788, 204, 182, 14);
		contentPane.add(lblNombreParaReemplazar);

		btnReemplazar = new JButton("REEMPLAZAR");
		btnReemplazar.setBounds(973, 173, 133, 29);
		contentPane.add(btnReemplazar);

		txtRutaFichero = new JTextField();
		txtRutaFichero.setBounds(788, 63, 178, 20);
		contentPane.add(txtRutaFichero);
		txtRutaFichero.setColumns(10);

		btnCrearFichero = new JButton("CREAR FICHERO");
		btnCrearFichero.setBounds(980, 38, 140, 20);
		contentPane.add(btnCrearFichero);

		JLabel lblNombreNuevoFichero = new JLabel("Nombre del fichero");
		lblNombreNuevoFichero.setBounds(791, 41, 150, 14);
		contentPane.add(lblNombreNuevoFichero);

		btnBorrarFichero = new JButton("BORRAR FICHERO");
		btnBorrarFichero.setBounds(980, 81, 140, 20);
		contentPane.add(btnBorrarFichero);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(771, 16, 373, 106);
		contentPane.add(panel_1);

		btnCopiarFichero = new JButton("COPIAR FICHERO");
		btnCopiarFichero.setBounds(973, 338, 133, 29);
		contentPane.add(btnCopiarFichero);

		JPanel panel = new JPanel();
		panel.setBounds(771, 154, 373, 106);
		contentPane.add(panel);

		txtDatos = new JTextArea();
		txtDatos.setBounds(24, 126, 364, 153);
		contentPane.add(txtDatos);

		txtRutaFicheroOriginal = new JTextField();
		txtRutaFicheroOriginal.setBounds(794, 342, 168, 20);
		contentPane.add(txtRutaFicheroOriginal);
		txtRutaFicheroOriginal.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(771, 303, 373, 106);
		contentPane.add(panel_1_1);
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

	public JButton getBtnCrearFichero() {
		return btnCrearFichero;
	}

	public JTextField getRutaFichero() {
		return txtRutaFichero;
	}

	public JButton getBtnBorrarFichero() {
		return btnBorrarFichero;
	}

	public JButton getBtnCopiarFichero() {
		return btnCopiarFichero;
	}

	public JTextField getRutaCopiaOriginal() {
		return txtRutaFicheroOriginal;

	}

}
