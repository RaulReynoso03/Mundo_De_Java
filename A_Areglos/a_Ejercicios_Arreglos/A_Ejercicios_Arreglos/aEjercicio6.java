package A_Ejercicios_Arreglos;

import java.util.Scanner;

public class aEjercicio6 {

	private static Scanner teclados;

	public static void main(String[] args) {
		
		teclados = new Scanner (System.in);
		
		int arreglo[]=new int [10];
		int negativos=0,positivos=0,pares=0,inpares=0;
		
		for (int i=0; i<arreglo.length; i++) {
			System.out.print("Ingresa el valor["+arreglo[i]+"]");
			arreglo[i]=teclados.nextInt();
			
			if(arreglo[i]<0) {
				negativos++;
			}if(arreglo[i]>0) {
				positivos++;
			}if(arreglo[i]%2==0) {
				pares++;
			}if(arreglo[i]%3==0) {
				inpares++;
			}
		}
			
			System.out.println("La cantidad de numeros pares es de: "+pares);
			System.out.println("La cantidad de numeros inpares es de: "+inpares);
			System.out.println("La cantidad de numeros positivos es de: "+positivos);
			System.out.println("La cantidad de numeros negativos es de: "+negativos);
			
			
	}

}
