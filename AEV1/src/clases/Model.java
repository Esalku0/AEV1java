package clases;

import java.io.File;
import java.io.FileReader;

public class Model {

	private static String lecturaString = "ficherin";
	private static String EscrituraString = "prueba.txt";

	
	
	public static String mostrarDatos(String f1) {

		 File fichero = new File(f1);
		 
		 String contenido="";
		 contenido+= "\n" + fichero.getName();
		 contenido+= "\n" + fichero.getAbsolutePath();
		 contenido+= "\n" + fichero.lastModified();
		 contenido+= "\n" + fichero.getName();
		
		
	}

}

