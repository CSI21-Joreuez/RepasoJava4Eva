package Ejercicio;

import java.io.BufferedReader; // ----> Debemos Importarlo
import java.io.FileNotFoundException;
import java.io.FileReader;// ----> Debemos Importarlo

public class FicheroEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreFichero = "c:\\Datos/prueba.txt";
		
		//Declaramos una Variable BufferedReader
		BufferedReader br = null;
		try {
			//Crear un objeto Buffered al que se le pase un objeto FileReader con el nombre del fichero
			br = new BufferedReader(new FileReader(nombreFichero));
			//Leer la primera linea, guardando en un string el resultado
			String texto = br.readLine();
			//Repetir mientras que no se llegue al final del Fichero
			while (texto != null) {
				//Hacer ñp que sea con la line leida
				System.out.println(texto);
				//divido la linea buscando el ; o el caracter requerido
				String [] campos = texto.split(";");
				System.out.println("--"+campos[0]);
				System.out.println("--"+campos[1]);
				System.out.println("--"+campos[2]);
				System.out.println("--"+campos[3]);
				//Leer la siguiente Linea
				texto = br.readLine();
			}
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Error: Fichero No Encontrado");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: Lectura del Fichero");
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if(br != null)
					br.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error Al Cerrar El Fichero");
				System.out.println(e.getMessage());
			}
		}
	}

}
