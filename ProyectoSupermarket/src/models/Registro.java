package models;

public class Registro {
	private int id_registro;
	private String email;
	private String password;
	@Override
	public String toString() {
		return "Registro [id_registro=" + id_registro + ", email=" + email + ", password=" + password + "]";
	}
	public Registro() {
		super();
	}
	public Registro(int id_registro, String email, String password) {
		super();
		this.id_registro = id_registro;
		this.email = email;
		this.password = password;
	}
	public int getId_registro() {
		return id_registro;
	}
	public void setId_registro(int id_registro) {
		this.id_registro = id_registro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
