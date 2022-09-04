package A_Ejercicios_Arreglos;

import java.util.Scanner;

public class aEjercicio4 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner (System.in);
		
		int arreglo1[]=new int[10];
		int arreglo2[]=new int[10];
		int promedio_1;
		int promedio_2;
		int suma=0;
		int suma2=0;
		
		
		System.out.println("AREGGLO UNO");
		for(int i=0;i<arreglo1.length;i++) {
			System.out.println("Ingresa el valor ["+i+"]");
			arreglo1[i]=teclado.nextInt();
			suma=suma+arreglo1[i];
		}
		System.out.println("ARREGLO DOS");
		for(int i=0;i<arreglo2.length;i++) {
			System.out.println("Ingresa el valor["+i+"]");
			arreglo2[i]=teclado.nextInt();
			suma2=suma2+arreglo2[i];
		}
		promedio_1=suma/10;
		promedio_2=suma2/10;
		
		System.out.println("IMPRIMIENDO EL PROMEDIO DEL LOS ARREGLOS");
		System.out.println("El promedio del arreglo uno es: "+promedio_1);
		System.out.println("El promedio del arreglo dos es: "+promedio_2);
		
		System.out.println("");
		System.out.println("**ARREGLO CON MAYOR PROMEDIO**");
		
		if (promedio_1>promedio_2) {
			System.out.println("El arreglo 1 tiene un promedio mayor");
		}	else if(promedio_2>promedio_1){
			System.out.println("El arreglo 2 tiene un promedio mayor");
		}else {
			System.out.println("Los 2 arreglos tienen un promedio igual :D");
		}
			
		}
		
		
	}


