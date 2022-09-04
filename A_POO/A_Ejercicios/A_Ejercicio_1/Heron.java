package A_Ejercicio_1;

public class Heron {

	
	public float calcularleydeheron(float a,float b,float c) {
	
	float area = (a+b+c)/2;
	float resultado=(float) Math.sqrt(area*(area-a)*(area-b)*(area-c));
	return resultado;
	
	}
}
