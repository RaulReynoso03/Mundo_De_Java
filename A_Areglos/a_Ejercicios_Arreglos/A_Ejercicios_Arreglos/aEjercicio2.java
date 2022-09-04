package A_Ejercicios_Arreglos;

import java.util.Scanner;

public class aEjercicio2 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		float arreglo[]=new float[10];

		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println("Ingresa el valor en la posicion    ["+i+"] ");
			arreglo[i]=teclado.nextFloat();
		}
		
		System.out.println("Imprimiendo el arreglo");
		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
	}

}
