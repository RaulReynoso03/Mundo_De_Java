package A_Ejercicios_Arreglos;

import java.util.Scanner;

public class aEjercicio1 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int arreglo[]=new int [5]; //DAR UN TAMAÑO AL ARREGLO

		//LLENAR EL ARREGLO
		for(int i=0;i<arreglo.length;i++) {
			
			System.out.print("Digita un elemento en la posicion  ["+i+"] ");
			arreglo[i]=teclado.nextInt();
		}
		//IMPRIMIR EL ARREGLO
		
		System.out.println("El arreglo es:");
		for(int i=0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
		

	}

}
