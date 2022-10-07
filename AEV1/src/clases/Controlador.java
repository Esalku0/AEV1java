package clases;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFileChooser;


public class Controlador {

	protected static final Component JFrame = null;
	private Vista vista;
	private Model model;

	public Controlador(Vista vista, Model mode) {
		this.vista = vista;
		this.model = mode;
		initEventHandler();
	}

	private void initEventHandler() {

		
		ActionListener anyadirActionListener = new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				

				
		        try {
			        JFileChooser j = new JFileChooser();
			        j.showOpenDialog(j);
			       
			        String nombre = j.getSelectedFile().getName(); 
					FileReader fReader = new FileReader(ruta);
					
					vista.getDatos().append(Modelo.mostrarDatos("ficherin"));
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		vista.getElegirFichero().addActionListener(anyadirActionListener);
		
		
		
	}

}
