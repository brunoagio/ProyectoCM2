package testMain;

import java.util.Scanner;

import models.Login;

public class Principal {

	public static void main(String[] args) {
		//flujo del programa
		//menu admin o usuario  (para el usuario normal mostrar un menu con 2 opciones logearse o registrarse)
		
		//1- login -conexxion a base datos
		//2- registro
		//3- una vez logeado, instanciamos un usuario.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese email: ");
		String email = sc.next();
		System.out.println("ingrese contraseña: ");
		String contrs =sc.next()
;
		
		Login login = new Login(email, contrs) {
			login.ingresar();
		}
	}

}
