package proyectoAppInfantil;

import java.sql.SQLException;

public class Usuario {

	ConexionDB conexion;

	private String nombreUsuario;
	private String nombreAlumno;
	private String apellido1Alumno;
	private String apellido2Alumno;
	private int edadAlumno;
	private String avatarName;
	private String nombreProgenitor;
	private String apellido1Progenitor;
	private String apellido2Progenitor;
	private String password;

	public Usuario(String nombreUsuario, String nombreAlumno, String apellido1Alumno, String apellido2Alumno,
			int edadAlumno, String avatarName, String nombreProgenitor, String apellido1Progenitor,
			String apellido2Progenitor, String password) throws SQLException {
		this.nombreUsuario = nombreUsuario;
		this.nombreAlumno = nombreAlumno;
		this.apellido1Alumno = apellido1Alumno;
		this.apellido2Alumno = apellido2Alumno;
		this.edadAlumno = edadAlumno;
		this.avatarName = avatarName;
		this.nombreProgenitor = nombreProgenitor;
		this.apellido1Progenitor = apellido1Progenitor;
		this.apellido2Progenitor = apellido2Progenitor;
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellido1Alumno() {
		return apellido1Alumno;
	}

	public void setApellido1Alumno(String apellido1Alumno) {
		this.apellido1Alumno = apellido1Alumno;
	}

	public String getApellido2Alumno() {
		return apellido2Alumno;
	}

	public void setApellido2Alumno(String apellido2Alumno) {
		this.apellido2Alumno = apellido2Alumno;
	}

	public int getEdadAlumno() {
		return edadAlumno;
	}

	public void setEdadAlumno(int edadAlumno) {
		this.edadAlumno = edadAlumno;
	}

	public String getAvatarName() {
		return avatarName;
	}

	public void setAvatarName(String avatarName) {
		this.avatarName = avatarName;
	}

	public String getNombreProgenitor() {
		return nombreProgenitor;
	}

	public void setNombreProgenitor(String nombreProgenitor) {
		this.nombreProgenitor = nombreProgenitor;
	}

	public String getApellido1Progenitor() {
		return apellido1Progenitor;
	}

	public void setApellido1Progenitor(String apellido1Progenitor) {
		this.apellido1Progenitor = apellido1Progenitor;
	}

	public String getApellido2Progenitor() {
		return apellido2Progenitor;
	}

	public void setApellido2Progenitor(String apellido2Progenitor) {
		this.apellido2Progenitor = apellido2Progenitor;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [conexion=" + conexion + ", nombreUsuario=" + nombreUsuario + ", nombreAlumno=" + nombreAlumno
				+ ", apellido1Alumno=" + apellido1Alumno + ", apellido2Alumno=" + apellido2Alumno + ", edadAlumno="
				+ edadAlumno + ", avatarName=" + avatarName + ", nombreProgenitor=" + nombreProgenitor
				+ ", apellido1Progenitor=" + apellido1Progenitor + ", apellido2Progenitor=" + apellido2Progenitor
				+ ", password=" + password + "]";
	}


	
	
	
}
