/*Crear una aplicacion que dado 2 valores calcule la
 * Suma
 * Resta
 * Divicion
 * Multipliclacion
 * Y muestre el resultado
 */

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_4 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("Ingresa 2 numero:");
		int n1=teclado.nextInt();
		int n2=teclado.nextInt();
		
		float suma,resta,multi,divicion;
		
		suma=n1+n2;
		resta=n1-n2;
		multi=n1*n2;
		divicion=n1/n2;
		
		System.out.println("La suma es:"+suma);
		System.out.println("La resta es:"+resta);
		System.out.println("La multiplicacion es:"+multi);
		System.out.println("La divicion es:"+divicion);
	}

}
