package Paquete;

public class Ejecucion {

	@SuppressWarnings("unused")
	private static Lavadora lavadoramex;
	@SuppressWarnings("unused")
	private static Lavadora lavadora;

	public static void main(String[] args) {
		
		//CREAMOS EL OBJETO Y LA INSTANCIA
		
		lavadora = new Lavadora();
		
		String Color="Rojo";
		String Modelo="LG";
		int numerosSerie=1867676;
		float precio=(float) 1231.23;
		
		System.out.println("La primera lavaroa tiene las siguientes caracteristicas");
		System.out.println("Color:"+Color);
		System.out.println("Modelo:"+Modelo);
		System.out.println("Numero de serie:"+numerosSerie);
		System.out.println("Precio:"+precio);
		
		  lavadoramex = new  Lavadora();
			String ColorMex="Rojo";
			String ModeloMex="Sansung";
			int numerosSerieMex=1862324376;
			float precioMex=(float) 1212131.23;
		
			System.out.println("\n");
			System.out.println("La segunda lavaroa tiene las siguientes caracteristicas");
			System.out.println("Color:"+ColorMex);
			System.out.println("Modelo:"+ModeloMex);
			System.out.println("Numero de serie:"+numerosSerieMex);
			System.out.println("Precio:"+precioMex);
		
		
	}
	
}
