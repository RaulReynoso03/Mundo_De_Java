//Crear una aplicaion que halle el mayor de 2 numeros con la clase math

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio17 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("\n**MAYOR DE 2 NUMEROS**");
		
		System.out.println("Ingresa 2 numeros:");
		double numero1=teclado.nextDouble();
		double numero2=teclado.nextDouble();
		
		
		double mayor=Math.max(numero1, numero2);
		System.out.println("El numero mayor es el: "+mayor);
		double menor=Math.min(numero1, numero2);
		System.out.println("El numero menor es el :"+menor);
		
		
	}

}
