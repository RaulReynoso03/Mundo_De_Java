//Crear una aplicacion que calcule el area de un triangulo conociendo su
//base y la altura
package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_5 {

	private static Scanner teclado;

	public static void main(String[] args) {
	
		teclado = new Scanner(System.in);
		
		System.out.print("Ingresa la base del triangulo:");
		float base=teclado.nextFloat();
		System.out.print("Ingresa la altura del triangulo:");
		float altura=teclado.nextFloat();
		
		float area=(base*altura)/2;
		
		System.out.println("El area del triangulo es:"+area);
		

	}

}
