package BBDD;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class intento1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String nombreFichero = "c:\\Datos/prueba.txt";
Connection cn;
BufferedReader br = null;

try {
	String url = "jdbc:mysql://localhost:3306/prueba?serverTimezone=UTC";
	String usu = "root";
	String pass = "Primera01";
	br = new BufferedReader(new FileReader(nombreFichero));
	String texto = br.readLine();
	cn = DriverManager.getConnection(url,usu,pass);
	String [] campos = texto.split(";");
	
	
	if(cn  !=null) {
		Statement st = cn.createStatement(); 
		String sql = "INSERT INTO Alumnos (id, Nombre, Apellidos, Direccion, Edad)"
				+ "VALUES ('"+campos[0]+"','"+campos[1]+"','"+campos[2]+"','"+campos[3]+"','"+campos[4]+"')";
		System.out.println(sql);
		st.execute(sql);
	
	System.out.println("Exito");
	cn.close();}
	
	System.out.println("Conexion Cerrada");
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
		

		
		


