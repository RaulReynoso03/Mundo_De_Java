package a_Variables;

import java.util.Scanner;

public class b_Entrada_De_Variables {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int entero;
		float flotante;
		double decimal;
		String texto;
		char caracter;
		
		System.out.println("Ingresa un numero entero:");
		entero=teclado.nextInt();
		System.out.println("Ingresa un numero flotante:");
		flotante=teclado.nextFloat();
		System.out.println("Ingrese un decimal:");
		decimal=teclado.nextDouble();
		System.out.println("Ingresa una cadena de texto:");
		texto=teclado.next();
		System.out.println("Ingresa un caracter:");
		caracter=teclado.next().charAt(0);
		
		System.out.println(entero);
		System.out.println(flotante);
		System.out.println(decimal);
		System.out.println(texto);
		System.out.println(caracter);

	}

}
