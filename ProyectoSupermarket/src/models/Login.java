package models;

public class Login {
	private String email;
	private String pass;
	
	public Login() {
		
	}
	
	public Login(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Usuario ingresar() throws SQLExeption {
		Usuario user = null;
		Conexion cone = new Conexion();
		
		String consulta = "select * from usuario where email_usuario="+"'"+this.email+"'"+" and contrasenia_usuario ="+"'"+this.pass+"'";
		
		ResultSet rs = cone.devuelveConsulta(consulta);
		
		while(rs.next()) {
			System.out.println("ingreso exitoso");
			user
		}
	}
	
}
