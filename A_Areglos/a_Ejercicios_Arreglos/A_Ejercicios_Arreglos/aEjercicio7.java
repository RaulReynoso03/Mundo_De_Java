package A_Ejercicios_Arreglos;

import java.util.Scanner;

public class aEjercicio7 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int arreglo[];
		int  nelementos = 0;
		
		System.out.println("Ingresa la cantidad de elementos para el arreglo: ");
		arreglo=new int[nelementos];
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.println("Ingresa un elemnto en la pocision :");
			arreglo[i]=teclado.nextInt();
		}
		int mayor_elemento=arreglo[0];
		int menor_elemento=arreglo[0];
		int pocicion_mayor=0;
		int porcicion_menor=0;
		
		for(int i=0;i<arreglo.length;i++) {
			if(mayor_elemento<arreglo[i]) {
				mayor_elemento=arreglo[i];
				pocicion_mayor=i;
				
		}if (menor_elemento>arreglo[i]) {
				menor_elemento=arreglo[i];
				porcicion_menor=i;
			}
			}
		System.out.println("El elemnto mayor es:"+mayor_elemento+" en la pocicion:"+pocicion_mayor);
		System.out.println("El elemento menor es:"+menor_elemento+" en la pocicion:"+porcicion_menor);
	}
}
	