package BBDD;

import java.util.ArrayList;
import java.util.Iterator;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection cn;
String query;
Statement st;
String removeQuery; 
String recuento;
boolean esTabla = false;
		System.out.println("Vamos A Ejecutar esta Query en la Base de Datos Prueba");
		ArrayList<Alumno> AA = new ArrayList<Alumno>();
			
		
		for (int i = 0; i < 10; i++) {
			Alumno alm = new Alumno (i,"Alumno"+i, "Disco"+i, "Corvete"+i, 20+i);
			AA.add(alm);
		}
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba?serverTimezone=UTC", "root", "Primera01");
			do {
				if(cn!=null)
				{
					st = cn.createStatement();
					System.out.println("Voy a Ejecutar la Consulta");
					recuento = "SELECT * FROM Alumnos";
					int n = st.executeUpdate(recuento);
					
					System.out.println("El Valor es "+n);
					if(n !=0)
					{
					esTabla = true;
					Iterator<Alumno> it = AA.iterator();
					while(it.hasNext())
					{
						Alumno a = it.next();
						query = "INSERT INTO Alumnos (id, nombre, apellidos, direccion, edad)" + "VALUES ('"+a.id+"','"+a.nombre+"','"+a.apellidos+"','"+a.direccion+"','"+a.edad+"')";
						st.execute(query);
						System.out.println(query);
					}
					System.out.println("La Conexion Ha Sido Un Exito");
					cn.close();
					}else if (n ==0)
					{
						System.out.println("Los Datos Ya Se Encuentran en la Tabla, Debemos Borrarlos Primero");
						Iterator<Alumno> it = AA.iterator();
						while(it.hasNext())
						{
							Alumno a = it.next();
							removeQuery = "DELETE * FROM Alumnos" ;
							st.execute(removeQuery);
						}
						System.out.println("La Conexion Ha Sido Un Exito");
						cn.close();	
					}		
				}

			} while (esTabla);
			
			
		} catch (SQLException e) {
			System.out.println("**Error en La Query***");
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getErrorCode());
			// TODO: handle exception
		}
		
		
	}

}
