package A_Ejercicios_Arreglos;

import java.util.Scanner;

public class aEjercicio9 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		String personas[]=new String[5];
		int edades[]=new int [5];
		
		for(int i=0;i<personas.length;i++) {
			System.out.print("Ingresa el nombre de una persona:");
			personas[i]=teclado.next();

			System.out.print("Ingresa la edad de la persona:");
			edades[i]=teclado.nextInt();
			System.out.print("");
		}
		
		//IMPRIMIMOS LAS PERSONAS MAYORES A 18;
		
		System.out.println("\nLas personas mayores de edad son:");
		
		for(int f=0;f<personas.length;f++) {
			if( edades[f] >=18) {
				System.out.println(personas[f]);
			}
		}
		
	}

}
