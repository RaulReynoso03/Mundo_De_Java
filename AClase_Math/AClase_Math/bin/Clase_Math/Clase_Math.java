package AClase_Math.bin.Clase_Math;

import java.util.Scanner;

public class Clase_Math {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("**INGRESAR NUMEROS**");
		System.out.print("Ingresa un numero:");
		int numero1=teclado.nextInt();
		System.out.print("Ingresa un segundo numero:");
		int numero2=teclado.nextInt();
		System.out.println("\n");
		
		System.out.println("RESULTADOS:\n");
		
		//EXPONENTE DE UN NUMERO;
		double exponente=Math.pow(numero1, numero2);
		System.out.println("El numero "+numero1+" elevado al exponente "+numero2+" es:"+exponente);
		
		//NUMERO RAMDOM;
		System.out.println("\n");
		double ramdom=Math.random();
		System.out.println("El numero ramdom es:"+ramdom);
		
		//NUMERO PI;
		System.out.println("\n");
		double valor_pi=Math.PI;
		System.out.println("El numero pi es:"+valor_pi);
		
		//RAIZ DE UN NUMERO;
		System.out.println("\n");
		double raiz=Math.sqrt(numero2);
		System.out.println("La raiz de "+numero2+" es: "+raiz);
		
		//RAIZ CUBICA DE UN NUMERO;
		System.out.println("\n");
		double raiz_cubica=Math.cbrt(numero1);
		System.out.println("La raiz cubica de "+numero1+" es:"+raiz_cubica);
		
		//MAYOR DE 2 NUMEROS;
		System.out.println("\n");
		double mayor=Math.max(numero1, numero2);
		System.out.println("El numero mayor es el: "+mayor);
		
		//MENOR DE 2 NUMEROS;
		System.out.println("\n");
		double menor=Math.min(numero1, numero2);
		System.out.println("El numero menor es: "+menor);

		
	}

}
