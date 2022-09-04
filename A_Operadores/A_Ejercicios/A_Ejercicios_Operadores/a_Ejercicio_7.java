//Crear una aplicacion que halle el promedio de 5 notas;

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_7 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int nota1,nota2,nota3,nota4,nota5;
		
		System.out.println("Ingresa 5 notas:");
		nota1=teclado.nextInt();
		nota2=teclado.nextInt();
		nota3=teclado.nextInt();
		nota4=teclado.nextInt();
		nota5=teclado.nextInt();
		
		int promedio=(nota1+nota2+nota3+nota4+nota5)/5;
		
		System.out.println("El promedio por las 5 notas es de:"+promedio);
		

	}

}
