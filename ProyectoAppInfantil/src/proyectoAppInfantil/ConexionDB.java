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

	public void crearUsuario(int cod, String NombreAlumno, String Apellido1Alumno, String Apellido2Alumno, String Avatar,
			String NombreProgenitor, String Apellido1Progenitor, String Apellido2Progenitor, String Contrasenya,
			String NombreUsuario) throws SQLException {
		
		statement.execute("insert into Usuarios values (\"" + null + "\",\"" + NombreUsuario + "\",\"" + NombreAlumno + "\",\"" + Apellido1Alumno + "\",\""
				+ Apellido2Alumno + "\",\"" + Avatar + "\")");

		statement.execute("insert into Progenitores values (\"" + null + "\",\"" + NombreProgenitor + "\",\"" + Apellido1Progenitor + "\",\""
				+ Apellido2Progenitor + "\",\"" + Contrasenya + "\",\"" + cod  + "\")");
	}

	public void eliminarUsuario(String CodigoUsuario) throws SQLException {
		statement.execute("delete from Usuario where CodigoUsuario = \"" + CodigoUsuario + "\"");
	}
	
	
	
	
	public void crearPuntuacion(String NombreUsuario, String Apellido1Usuario, String Apellido2Usuario, String Avatar,
			String NombreProgenitor, String Apellido1Progenitor, String Apellido2Progenitor, String Contrasenya,
			int CodigoUsuario) throws SQLException {
		
		statement.execute("insert into Usuario values (\"" + NombreUsuario + "\",\"" + Apellido1Usuario + "\",\""
				+ Apellido2Usuario + "\",\"" + Avatar + "\")");

		statement.execute("insert into Progenitor values (\"" + NombreProgenitor + "\",\"" + Apellido1Progenitor + "\",\""
				+ Apellido2Progenitor + "\",\"" + Contrasenya + "\",\"" + CodigoUsuario  + "\")");
	}

//	private void leerBDAlumno(Grupo g) throws Exception {
//		ResultSet rsAlumno = statement.executeQuery("select * from alumno where NombreGrupo = \"" + g.getNombreGrupo() +"\"");
//		while (rsAlumno.next()) {
//			Alumno al = new Alumno(rsAlumno.getString(1),rsAlumno.getString(2),rsAlumno.getString(3));
//			g.addAlumnoBD(al);
//		}
//		for (int i = 0; i < g.getListaAlumnos().size(); i++) {
//			leerBDExameneTrabajo(g.getListaAlumnos().get(i));
//		}
//	}
//	
//	
//	public void leerBDAlumnos(Grupo g) throws Exception {
//		ResultSet rsAlumno = statement.executeQuery("select * from alumno where NombreGrupo = \"" + g.getNombreGrupo() +"\"");
//		while (rsAlumno.next()) {
//			Alumno al = new Alumno(rsAlumno.getString(1),rsAlumno.getString(2),rsAlumno.getString(3));
//			g.addAlumnoBD(al);
//		}
//		for (int i = 0; i < g.getListaAlumnos().size(); i++) {
//			leerBDExameneTrabajo(g.getListaAlumnos().get(i));
//		}
//	}

}
