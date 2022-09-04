//Elabora un programa que solicite al usuario 5 numeros y indique cual es el número mayor.

package Repaso;

import java.util.Scanner;

public class a_Ejercicio_7 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int mayor=-999;
		for (int i = 0; i < 5; i++) {
		System.out.println("Ingresa el numero " + i+" :");
		int numeros = teclado.nextInt();
		
		if (numeros>mayor) {
			mayor=numeros;
		}
		}
		
		System.out.println("El numero mayor es el:"+mayor);
		

	}

}
