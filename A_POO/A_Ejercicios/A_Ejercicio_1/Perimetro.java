package A_Ejercicio_1;

public class Perimetro {
		
	//CREAMOS LOS METOS PARA CALCULAR LOS PERIMETROS DE LAS FIGURAS GEOMETRICAS
	
	public float calcular_perimetro_cuadrado(float lado){
		float perimetro=4*lado;
		return perimetro;
	}
	public float calcular_perimetro_triangulo(float lado1,float lado2,float lado3){
		float perimetro=lado1+lado2+lado3;
		return perimetro;
	}
	public float calcular_perimetro_circulo(float diametro) {
		float perimetro=(float) (diametro*Math.PI);
		return perimetro;
	}
	public float calcular_perimetro_rectangulo(float base,float altura) {	
		float perimetro=2*(base)+2*(altura);
		return perimetro;
	}
	
}
