package A_Ejercicios_Arreglos;

import java.util.Scanner;

public class aEjercicio8 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner (System.in);
		
		String arreglo[]=new String[20];
		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println("Ingresa  la cadena "+i+"  :");
			arreglo[i]=teclado.nextLine();
		}
		
		
		
		
		
	}

}
