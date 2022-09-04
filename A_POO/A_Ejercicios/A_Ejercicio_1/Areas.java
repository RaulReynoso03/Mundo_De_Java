package A_Ejercicio_1;

public class Areas {

	public float calcular_area_cuadrado (float lado){
		float area=lado*lado;
		return area;
	}
	public static float calcular_area_circulo(float radio) {
		float area=(float) (Math.PI*(Math.pow(radio, 2)));
		return area;
	}
	public static float calcular_area_triangulo(float altura,float base) {
		float area=(base*altura)/2;
		return area;
	}
	public static float calcular_area_rectangulo(float base,float altura) {
		float area=base*altura;
		return area;
	}

}
