package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio14 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("\n**Area de un circulo**");
		System.out.println("Ingresa el radio del circulo:");
		int radio=teclado.nextInt();
		
		double Area=(Math.PI*radio)*2;
		
		System.out.println("El area del circulo es:"+Area);
		
		
		
	}

}
