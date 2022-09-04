//Crear una aplicacion que nos permita ver la raiz cuadrada de un numero

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio15 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("\n**Raiz cuadrada**");
		System.out.println("Ingresa un numero:");
		double numero=teclado.nextDouble();
		
		double raiz=Math.sqrt(numero);
		
		System.out.println("La raiz del numero es:"+raiz);
		
		double raiz_cubica=Math.cbrt(numero);
		System.out.println("La raiz cubica es:"+raiz_cubica);
	}

}
