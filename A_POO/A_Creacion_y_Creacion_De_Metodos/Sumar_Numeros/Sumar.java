package Sumar_Numeros;

import java.util.Scanner;

public class Sumar {

		int numero1;
		int numero2;
		int sumar;
		int resta;
		int multiplicar;
		private Scanner teclado;
		private Scanner teclado2;
		
		public void pedir_numeros() {
			teclado2 = new Scanner(System.in);
			System.out.println("");
			System.out.println("Ingresa el primer numero:");
			numero1=teclado2.nextInt();
			System.out.println("Ingresa el segundo numero:");
			numero2=teclado2.nextInt();
		}
		
		public void menu() {
			teclado = new Scanner(System.in);
			int opcion=0;
				System.out.println("1.Sumar numros");
				System.out.println("2.Restar numeros");
				System.out.println("3.Multiplicar numeros;");
				System.out.println("Ingresa un opcion:");
				opcion=teclado.nextInt();
				
				switch (opcion) {
				case 1 :
					pedir_numeros();
					sumar_numeros();
					break;
				case 2:
					pedir_numeros();
					restar_numeros();
					break;
				case 3:
					pedir_numeros();
					multiplicar_numeros();
					break;
					default:
						System.out.println("Opcion no disponible");
						break;
				}

		}
		
		public void sumar_numeros() {
			sumar=numero1+numero2;
			System.out.println("La suma de los numeros es:"+sumar);
		}
		public void restar_numeros() {
			resta=numero1-numero2;
			System.out.println("La resta de los numeros es:"+resta);
		}
		public void multiplicar_numeros() {
			multiplicar=numero1+numero2;
			System.out.println("La multiplicacion de los numeros es:"+multiplicar);
		}
		
}

