package aTipos_De_Condicionales;

import java.util.Scanner;

public class a_Condicional_IF_Else {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un camino:");
		char camino=teclado.next().charAt(0);
		
		if(camino=='a') {
			System.out.println("Unted esta en el camino a");
		}else if(camino=='b') {
			System.out.println("Usted esta en el camino b");
		}else if(camino=='c') {
			System.out.println("Usted esta en el camino c");
		}else {
			System.out.println("Usted no esta en ingun camino");
		}
		
	}

}
