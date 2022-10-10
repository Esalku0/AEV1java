package clases;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

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
					FileReader fReader = new FileReader(nombre);
					File fichero = new File(nombre);
					String ruta = fichero.getPath();

					vista.getDatos().append(Model.mostrarDatos(nombre));
					vista.getContenidoFichero().append(Model.mostrarContenidoPrincipal(ruta));

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		vista.getElegirFichero().addActionListener(anyadirActionListener);

		
		
		//Este ActionListener nos va a permitir cambiarle el nombre a un fichero
		//Tenemos que usar los dos JTEXTFIELD para el nombre antiguo y el nombre nuevo
		ActionListener botonReemplazar = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String nomActualString = vista.getNombreActual().getText();

				String nomReemplazarString = vista.getNombreReemplazar().getText();

				model.cambiarNombre(nomActualString, nomReemplazarString);

			}
		};

		vista.getBtnReemplazar().addActionListener(botonReemplazar);

		
		//ACTION LISTENER DEL BOTON PARA CREAR UN FICHERO
		//Este boton nos permite crear un fichero pasandole la ruta por parametro
		ActionListener botonCrearFicheroActionListener = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String ruta = vista.getRutaFichero().getText();

				model.crearFichero(ruta);

			}
		};

		vista.getBtnCrearFichero().addActionListener(botonCrearFicheroActionListener);

		//ACTION LISTENER DEL BOTON PARA ELIMINAR UN FICHERO
		//Este metodo nos permite eliminar un fichero pasandole un nombre o ruta por parametro
		ActionListener botonEliminarFichero = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				
				String ruta = vista.getRutaFichero().getText();
				model.eliminarFichero(ruta);
				
			}
		};
		vista.getBtnBorrarFichero().addActionListener(botonEliminarFichero);
		
		ActionListener botonCopia = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				String rutaOriginalString = vista.getRutaCopiaOriginal().getText();
				
				model.copiarArchivo(rutaOriginalString);
			}
		};
		vista.getBtnCopiarFichero().addActionListener(botonCopia);
	
		
		
		
		
		
		
		
	}
	


}
