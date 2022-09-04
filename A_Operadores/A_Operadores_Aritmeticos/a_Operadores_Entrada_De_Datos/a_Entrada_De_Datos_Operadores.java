package a_Operadores_Entrada_De_Datos;

import java.util.Scanner;

public class a_Entrada_De_Datos_Operadores {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int n1,n2;
		
		int suma,resta;
		float multiplicacion,divicion;
		
		
		System.out.println("Ingresa 2 numero:");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		
		suma=n1+n2;
		resta=n1-n2;
		multiplicacion=n1*n2;
		divicion=n1/n2;
		
		System.out.println("La suma es:"+suma);
		System.out.println("La resta es:"+resta);
		System.out.println("La multiplicacion es:"+multiplicacion);
		System.out.println("La divicion es:"+divicion);
	}

}
