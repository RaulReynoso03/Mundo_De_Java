package A_Ejercicios_Arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class aEjercicio5 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int arreglo[];
		int nelementos;
		boolean creciente=true;
		boolean decresiente=false;
		boolean esnegativo=false;
		
		nelementos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de elementos para el arreglo:"));
		
		//COMPROVANDO SI EL TAMAÑO DEL ARREGLO ES NEGATIVO
		if(nelementos<0) {
			System.out.println("\nNo existe un arreglo con tamaño negativo");
			System.exit(0);
		}
		
		arreglo=new int[nelementos];
		
		//LLENAR EL ARREGLO
		
		do {
			for(int i=0;i<arreglo.length;i++) {
				System.out.println("Ingresa un elemnto en la pocision ["+i+"]");
				arreglo[i]=teclado.nextInt();
			}
			
			//RECORREMOS EL ARREGLO PARA VER SI HAY UN NEGATIVO
			
			for(int i=0;i<arreglo.length;i++) {
				if (arreglo[i]<0) {
					esnegativo=true;
					break;
				}else {
					esnegativo=false;
				}
				
				if (esnegativo==true) {
				System.out.println("\nPor favor vuelve a dijitar ya que el arreglo tiene negativos");
				}
			}
		} while (esnegativo==true);
		
		//COMPROVAR SI EL ARREGLO ESTA EN FORMA CRECIENTE O DECRESIENTE
		
		for(int i=0;i<nelementos-1;i++) {
			if (arreglo[i]<arreglo[i+1]) {
				creciente=true;
			}else if (arreglo[i]>arreglo[i+1]) {
				decresiente=true;
			}
		}
		if (creciente==true  && decresiente==false) {
			System.out.println("\nEl arreglo es de forma creciente");
		}else if (creciente==false && decresiente==true) {
			System.out.println("\nEL arreglo es de forma decreciente");
		}else if(creciente==true && decresiente==true) {
			System.out.println(" \nEl arreglo esta desordenado");
		}else {
			System.out.println("\nLos elemntos del arreglo son iguales");
		}
		
		
	}

}
