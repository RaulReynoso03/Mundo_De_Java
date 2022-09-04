package b_Creacion_de_un_areglo;

public class b_Creacion_de_un_areglo_String {

	public static void main(String[] args) {
		
		String arreglo[]=new String [4];
		
		arreglo[0]="Hola";
		arreglo[1]="Raul";
		arreglo[2]="Que tal";
		arreglo[3]="Contesta pues :8 ";
		
		for(int i=0;i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
	}

}
