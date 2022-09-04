//Hallar la suma de 3 numeros conociendo los numeros

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_2 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("Ingrese 3 numero:");
		int n1=teclado.nextInt();
		int n2=teclado.nextInt();
		int n3=teclado.nextInt();
		
		int suma=n1+n2+n3;
		
		System.out.println("El resultado de la suma es:"+suma);
		
		

	}

}
