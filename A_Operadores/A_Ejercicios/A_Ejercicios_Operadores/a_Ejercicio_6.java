//Crear una aplicaicon que calcule el sueldo de un empleado; 
//Sueldo=horasTrabajadas*DiasDeTrabajo;

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_6 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		System.out.println("Ingresa las horas que trabajo:");
		int horas_trabajo=teclado.nextInt();
		System.out.println("Ingrese los dias de trabajo:");
		int dias_trabajo=teclado.nextInt();
		
		int sueldo=horas_trabajo*dias_trabajo;
		
		System.out.println("El sueldo del empleado es de: "+sueldo+"$");
		
		
		
	}

}
