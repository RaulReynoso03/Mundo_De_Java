//Crear una aplicacion que calcule un numero al exponente; 

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio13 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("\n**Exponente de un numero**");

		int numero,exponente;
		
		System.out.println("Digite la base:");
		numero=teclado.nextInt();
		System.out.println("Digite el exponente:");
		exponente=teclado.nextInt();
		
		double resultado=Math.pow(numero, exponente);
		
		System.out.println("El numero elevado al exponente es:"+resultado);
		
	}

}
