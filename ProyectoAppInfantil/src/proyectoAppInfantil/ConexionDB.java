package proyectoAppInfantil;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JTextField;
import com.mysql.cj.xdevapi.Result;



public class ConexionDB {
	private String url = "jdbc:mysql://localhost:3306/app_infantil";
	private String user = "root";
	private String password = "administrador";
	private Connection connect;
	private static Statement statement;
	public ConexionDB() throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(url, user, password);
			statement = connect.createStatement();
	};
	



	
	public void crearUsuario(String NombreUsuario, String Contrasenya, String numeroGrafo) throws SQLException {
		statement.execute("insert into Alumno values (\"" + NombreUsuario + "\",\"" + Contrasenya + "\",\"" + numeroGrafo +  "\")");
	}

	public void eliminarUsuario(String nia) throws SQLException {
		statement.execute("delete from alumno where NIA = \"" + nia + "\"");
	}

	
	


}
