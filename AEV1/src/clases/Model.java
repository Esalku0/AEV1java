package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Model {

	private static String lecturaString = "ficherin";
	private static String EscrituraString = "prueba.txt";

	public static String mostrarDatos(String f1) {

		File fichero = new File(f1);

		String contenido = "";
		contenido += "\n" + fichero.getName();
		contenido += "\n" + fichero.getAbsolutePath();
		contenido += "\n" + fichero.lastModified();
		contenido += "\n" + fichero.length();

		return contenido;

	}

	/**
	 * Aquest metode ens serveix per a poder llegir el contengunt d'un fitxer que
	 * pasem per parametre
	 * 
	 * @param és la ruta que li passem per a poder accedir al fitxer
	 * @return retorna el contingut sencer del fitxer
	 */
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

	public static boolean cambiarNombre(String nombreActual, String nombreReemplazar) {
		File f1 = new File(nombreActual);
		File f2 = new File(nombreReemplazar);

		if (f1.renameTo(f2)) {
			System.out.println("okay");
			return true;

		} else {
			System.out.println("nop");
			return false;

		}
	}

	public static void crearFichero(String ruta) {
		File fichero = new File(ruta);

		try {
			if (!fichero.createNewFile()) {
				System.out.println("No se ha podido crear");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void eliminarFichero(String ruta) {
		File fichero = new File(ruta);

		if (!fichero.delete()) {
			System.out.println("No se ha podido crear");
		}

	}

	public static void copiarArchivo(String archivoOriginal) {
		File originalFile = new File(archivoOriginal);
		String nomCopia = originalFile.getName() + "_Copia";
		File copiaFile = new File(nomCopia);

		try {
			FileReader fr = new FileReader(originalFile);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(copiaFile);
			BufferedWriter bw = new BufferedWriter(fw);

			String linea = br.readLine();

			while (linea != null) {
				bw.write(linea);
				System.out.println(linea);
				bw.newLine();
				linea = br.readLine();
			}
			br.close();
			fr.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int buscarTexto(String palabra) {
		String pal = palabra;
		int contadorPalabras = 0;
		try {
			FileReader fr = new FileReader("ficherin");
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();

			String[] lineas;
			do {
				lineas = linea.split(" ");
				for (int i = 0; i < lineas.length; i++) {
					if (lineas[i].indexOf(palabra) != -1) {
						contadorPalabras++;
					}
				}
				linea = br.readLine();
			} while (linea != null);

			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return contadorPalabras;
	}

	public static void cambiarTexto(String palabraReemplazar, String Reemplazada) {
		String palabraParaCambiar = palabraReemplazar;
		String palabraReemplazada = Reemplazada;
		try {
			final BufferedReader reader = new BufferedReader(new FileReader("ficherin"));
			// Creamos cadenas vacias de contenido y linea
			String linea = "", content = "";
			// Separa todo con espacios y por lineas
			while ((linea = reader.readLine()) != null) {
				content += linea + "\r\n";
				System.out.println(content);
			}

			reader.close();
				//Le asignamos las palabras 
			String replacement = palabraReemplazada;
			String needle = palabraParaCambiar;
				//Le decimos a esto las palabras que vamos a reemplazar
			String newContent = content.replaceAll(needle, replacement);
				//Hacemos un filewriter para escribir y tal
			FileWriter writer = new FileWriter("ficherin");
				//escribimossssssss en el fichero de escritura con las palabras reemplazadas
			writer.write(newContent);

			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
