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

	public ConexionDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect = DriverManager.getConnection(url, user, password);
		statement = connect.createStatement();
	};

	public void crearUsuario(String NombreUsuario, String NombreAlumno, String Apellido1Alumno, String Apellido2Alumno,
			int EdadAlumno, String Avatar, String NombreProgenitor, String Apellido1Progenitor,
			String Apellido2Progenitor, String Contrasenya)
			throws SQLException, SQLIntegrityConstraintViolationException, NullAvatarException {

		statement.execute("insert into Usuarios values (\"" + NombreUsuario + "\",\"" + NombreAlumno + "\",\""
				+ Apellido1Alumno + "\",\"" + Apellido2Alumno + "\",\"" + EdadAlumno + "\",\"" + Avatar + "\",\""
				+ NombreProgenitor + "\",\"" + Apellido1Progenitor + "\",\"" + Apellido2Progenitor + "\",\""
				+ Contrasenya + "\")");

//		statement.execute("insert into Progenitores values (\"" + NombreProgenitor + "\",\"" + Apellido1Progenitor + "\",\""
//				+ Apellido2Progenitor + "\",\"" + Contrasenya + "\",\"" + NombreUsuario  + "\")");
	}

	public void eliminarUsuario(String CodigoUsuario) throws SQLException {
		statement.execute("delete from Usuario where CodigoUsuario = \"" + CodigoUsuario + "\"");
	}

	public ArrayList<String> leerUsuarios() throws Exception {
		ResultSet rsUsuarios = statement.executeQuery("select NombreUsuario from Usuarios");
		ArrayList<String> users = new ArrayList<String>();
		while (rsUsuarios.next()) {
			users.add(rsUsuarios.getString(1));
		}
		return users;
	}

	public String comprobarUsuario(String avatar) throws Exception {
		ResultSet rsUser = statement
				.executeQuery("select nombreUsuario from Usuarios where Avatar = \"" + avatar + "\"");
		String user = rsUser.getString(1);

		return user;
	}

	public boolean validarUsuario(String nombreUsuario, String avatar) throws Exception {
		ResultSet rsUser = statement
				.executeQuery("select NombreUsuario, Avatar from Usuarios where NombreUsuario = \"" + nombreUsuario + "\"");
		//String user = rsUser.getString(1);
		if (rsUser.next()) {
			return true;

		} else {
			return false;
		}
	}
	
	
	

	public void crearPuntuacion(String NombreUsuario, String Apellido1Usuario, String Apellido2Usuario, String Avatar,
			String NombreProgenitor, String Apellido1Progenitor, String Apellido2Progenitor, String Contrasenya,
			int CodigoUsuario) throws SQLException {

		statement.execute("insert into Usuario values (\"" + NombreUsuario + "\",\"" + Apellido1Usuario + "\",\""
				+ Apellido2Usuario + "\",\"" + Avatar + "\")");

		statement.execute("insert into Progenitor values (\"" + NombreProgenitor + "\",\"" + Apellido1Progenitor
				+ "\",\"" + Apellido2Progenitor + "\",\"" + Contrasenya + "\",\"" + CodigoUsuario + "\")");
	}

}
