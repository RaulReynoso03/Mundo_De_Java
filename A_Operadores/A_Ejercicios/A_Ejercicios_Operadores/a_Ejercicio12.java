/*Crear una aplicacion que nos pida 2 cadenas por teclado y dichas dos cadenas
 * sumarlas y mostrarla 
 */

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio12 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		String cadena3=" ";
		
		System.out.println("\n**SUMA DE DOS CADENAS**");
		
		System.out.println("Ingresa una cadena de texto:");
		String cadena1=teclado.next();
		System.out.println("Ingresa una segunda cadena de texto:");
		String cadena2=teclado.next();
		
		cadena3=cadena1+" "+cadena2;
		
		System.out.println(cadena3);

	}

}
