//Se debe desarrollar un programa que pida el ingreso del precio de un articulo y la cantidad
//que lleva el cliente.Mostrar cuanto debe de pagar el cliente;

package A_Ejercicios_Operadores;

import java.util.Scanner;

public class a_Ejercicio_8 {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		int precio_producto,cantidad_productos;
		
		System.out.println("Ingresa cuanto cuentas el producto:");
		precio_producto=teclado.nextInt();
		System.out.println("Ingresa cuantos productos va a llevar:");
		cantidad_productos=teclado.nextInt();
		
		int precio_a_pagar=precio_producto*cantidad_productos;
		
		System.out.println("El precio a pagar es de:"+precio_a_pagar);
		
		
	}

}
