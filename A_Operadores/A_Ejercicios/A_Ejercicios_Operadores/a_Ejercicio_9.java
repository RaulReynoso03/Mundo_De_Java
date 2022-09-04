/*Crear una aplicacion que calcule la edad de una persona
 * tomando en cuanta la fecha en que nacio y la fecha actual;
 */

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_9 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("Ingresa la fecha de nacimiento:");
		int fecha_nacimiento=teclado.nextInt();
		System.out.println("Ingresa la fecha actual:");
		int fecha_actual=teclado.nextInt();
		
		
		int edad=fecha_actual-fecha_nacimiento;
		
		System.out.println("La edad es de:"+edad);
		

	}

}
