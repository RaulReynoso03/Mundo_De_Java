//Crear una aplicacion que nos pida 2 caracteres y dado esos dos caracteres
//sumarlos y mostrarlos

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio11 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		char caracter1,caracter2;
		String suma="";
		
		
		System.out.println("Ingrese un caracter:");
		caracter1=teclado.next().charAt(0);
		System.out.println("Ingrese un segundo caracter:");
		caracter2=teclado.next().charAt(0);
		
		suma+=caracter1+caracter2;
		
		System.out.println("\nLa suma de los dos caracteres es: "+suma);
		
		
	}

}
