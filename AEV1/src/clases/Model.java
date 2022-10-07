package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Model {

	private static String lecturaString = "ficherin";
	private static String EscrituraString = "prueba.txt";

	
	
	public static String mostrarDatos(String f1) {

		 File fichero = new File(f1);
		 
		 String contenido="";
		 contenido+= "\n" + fichero.getName();
		 contenido+= "\n" + fichero.getAbsolutePath();
		 contenido+= "\n" + fichero.lastModified();
		 contenido+= "\n" + fichero.length();
		 
		 return contenido;
		
		
	}
	
	

	public static String mostrarContenidoPrincipal(String ruta) {
		String texto = "";
		try (FileReader fileReader = new FileReader(ruta)) {
			int caracterLeido = fileReader.read();
			while (caracterLeido != -1) {
				char caracter = (char) caracterLeido;
				caracterLeido = fileReader.read();
				texto += caracter;
			}
		} catch (IOException ex) {
			System.err.println("Error al leer el archivo");
			ex.printStackTrace();
		}
		return texto;
	}
	
	public static boolean name(String nombreActual, String nombreReemplazar) {
		File f1 = new File(nombreActual);
		File f2 = new File(nombreReemplazar);
		
		
		if (f1.renameTo(f2)) {
			return true;
		}else {
			return false;
		}
	}
	
	

}

