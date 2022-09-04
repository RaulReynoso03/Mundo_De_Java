//Crear una aplicacion que calcule el area de un trapecio
//S=h(b*B)/2;

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio10 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("**CALCULAR SUPERFICIE DE UN TRAPECIO**\n");
		
		
		System.out.println("Ingrese la medida de la base menor:");
		float base_menor=teclado.nextFloat();
		System.out.println("Ingrese la medidad de la base mayor:");
		float base_mayor=teclado.nextFloat();
		System.out.println("Ingrese la medida de la altura:");
		float altura=teclado.nextFloat();
		
		float superficie=(base_mayor*base_menor)+altura/2;
		
		System.out.println("La superficie del trapecio es de:"+superficie);
		
		
	}

}
