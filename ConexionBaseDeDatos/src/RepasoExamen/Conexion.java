package RepasoExamen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class Conexion {

	private static final String URL="jdbc:mysql://localhost:3306/prueba?serverTimezone=UTC";
	private static final String USU="root";
	private static final String PASSSWORD="Primera01";
	static Connection connection = null;
	
	public static void main(String[] args) {
		
	String nombreFichero = "C:\\Users\\Profesor\\Downloads/AlumnosEjemplo.txt";
	Connection cn;
	BufferedReader br = null;
	cn = Util.dameConexion(URL, USU,PASSSWORD);
	Statement st;
	ArrayList<Alumnos> ar = new ArrayList<Alumnos>();
	String sql;
	String sqlInsert=null;
	String[] vCampos ;
	String texto;
	
	String nombre = null;
	String apellidos = null;
	String direccion = null;
	int id =0 ;
	int edad = 0;
	
	
	try {
		br = new BufferedReader(new FileReader(nombreFichero));
		texto = br.readLine();
		vCampos = texto.split(",");
		if(cn!=null)
		{
			st = cn.createStatement();
			/*while(texto!=null)
			{
				
			 sqlInsert = "INSERT INTO Alumnos (id, nombre, apellidos, direccion, edad)"
					+ "VALUES ("+vCampos[0]+",'"+vCampos[1]+"','"+vCampos[2]+"','"+vCampos[3]+"',"+vCampos[4]+")";
			
					st.executeUpdate(sqlInsert);
					texto = br.readLine();
					if(texto!=null)
						vCampos = texto.split(",");

					
			}	*/
			
					sql = "SELECT id,nombre,apellidos,direccion,edad from Alumnos";
					st.executeQuery(sql);
					ResultSet rs = st.getResultSet();
					while(rs.next())
					{
						id = rs.getInt("id");
						nombre = rs.getString("nombre");
						apellidos = rs.getString("apellidos");
						direccion = rs.getString("direccion");
						edad = rs.getInt("edad");
						Alumnos a = new Alumnos(id, nombre, apellidos, direccion, edad);
						ar.add(a);
					}
					Iterator<Alumnos> i = ar.iterator();
					while (i.hasNext()) {
						sqlInsert= "INSERT INTO Alumnos (id, nombre, apellidos, direccion, edad)"
								+ "VALUES ("+i.next().getId()+ar.size()+",'"+i.next().getNombre()+"','"+i.next().getApellidos()+"','"+i.next().getDireccion()+"',"+i.next().getEdad()+")";
						st.executeUpdate(sqlInsert);
					}
					
		}
		
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		e1.getMessage();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		e.getMessage();
	}
				
	
	
				
		}

	
	}


