//Hallar la superficie de un cuadrado conociendo el valor de un lado

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_1 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		
		System.out.println("Ingresa el lado del cuadrado:");
		float lado=teclado.nextFloat();
		
		float superficie=lado*lado;
		
		System.out.println("La superficie del cuadrado es:"+superficie);
		
		
	}

}
