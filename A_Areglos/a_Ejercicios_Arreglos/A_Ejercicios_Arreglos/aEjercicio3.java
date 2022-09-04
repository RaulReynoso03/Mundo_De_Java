package A_Ejercicios_Arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class aEjercicio3 {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		
		
		float alturas[];
		int nelementos;
		float suma=0;
		float promedio;
		
		nelementos=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de elemntos:"));
		alturas=new float [nelementos];
		
		for(int i=0;i<alturas.length;i++) {
			System.out.println("Digite la altura "+i+" :");
			alturas[i]=teclado.nextFloat();
			suma=suma+alturas[i];
		}
		
		System.out.println("**LAS ALTURAS SON**");	
		for(int i=0;i<alturas.length;i++) {
			System.out.println(alturas[i]);
		}
		
		System.out.println("");
		promedio=suma/nelementos;
		System.out.println("El promedio de altura es de:"+promedio);
		
		int mayor=0;
		int menor=0;
		
		for(int i=0;i<alturas.length;i++) {
			if (alturas[i]>promedio) {
				mayor++;
			}else if(alturas[i]<promedio) {
				menor++;
			}
		}
			
		System.out.println("La cantidad de  mayores son:"+mayor);
		System.out.println("La cantidad de menores son:"+menor);
	}

}
