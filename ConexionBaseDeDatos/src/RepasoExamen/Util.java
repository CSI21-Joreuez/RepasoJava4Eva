package RepasoExamen;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {

	public static Connection dameConexion(String URL, String USU, String PASSSWORD) {
		Connection connection = null;
		try {
		connection = DriverManager.getConnection(URL,USU,PASSSWORD);
		System.out.println("Connection Establecida");
		}catch (Exception e) {

		e.printStackTrace();
		e.getMessage();
		}
		return connection;
		}

	
		}

