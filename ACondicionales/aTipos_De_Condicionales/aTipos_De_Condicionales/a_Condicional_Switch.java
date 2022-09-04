package aTipos_De_Condicionales;

import java.util.Scanner;

public class a_Condicional_Switch {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("Ingresa una opcion:");
		int opcion=teclado.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Usted a elegido la opcion 1");
			break;
			
		case 2:
			System.out.println("Usted a elegido la opcion 2");
			break;
			
		case 3:
			System.out.println("Usted a elegido la opcion 3");
			break;
			
		default:
			System.out.println("Usted no a elegido ninguna opcion");
			break;
		}
		
	}

}
