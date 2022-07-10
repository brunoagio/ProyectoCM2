package models;

import java.util.Date;

public abstract class Usuario {
	private String nombre;
	private String apellido;
	private Date fechaNac;
	private int dni;
	private String domicilio;
	private int tel;
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", dni=" + dni
				+ ", domicilio=" + domicilio + ", tel=" + tel + "]";
	}
	public Usuario() {
		super();
	}
	public Usuario(String _nombre, String _apellido, Date _fecha_nac, int _dni, String _domicilio, int _tel) {
		super();
		this.nombre = _nombre;
		this.apellido = _apellido;
		this.fechaNac = _fecha_nac;
		this.dni = _dni;
		this.domicilio = _domicilio;
		this.tel = _tel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
	
}
