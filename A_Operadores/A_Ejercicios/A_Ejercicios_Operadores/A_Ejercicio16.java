/*Crear una aplicacion que pida 3 numeros por teclado y dado esos 3
 * numeros calcular su promedio y finalmente mostrar ese promedio al
 * cubo
 */

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class A_Ejercicio16 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("\n**PROMEDIO AL CUBO DE 3 NUMEROS**");
		System.out.println("Ingresa 3 numeros:");
		int numero1=teclado.nextInt();
		int numero2=teclado.nextInt();
		int numero3=teclado.nextInt();
		
		float promedio=(numero1+numero2+numero3)/3;
		double promedio_cubo=Math.sqrt(promedio);
		
		System.out.println("El promedio es:"+promedio);
		System.out.println("El promedio al cubo es de:"+promedio_cubo);
		
	}

}
