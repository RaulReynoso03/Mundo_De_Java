//Realizar la carga del lado del cuadrado ,mostrar por la pantalla el perimetro
package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_3 {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		
		System.out.println("Ingresa el lado del cuadrado:");
		int lado=teclado.nextInt();
		
		
		int perimetro=lado+lado+lado+lado;
		
		System.out.println("El perimetro del cuadrado es:"+perimetro);

	}

}
