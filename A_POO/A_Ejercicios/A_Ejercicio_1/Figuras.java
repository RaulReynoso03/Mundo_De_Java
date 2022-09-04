package A_Ejercicio_1;

import java.util.Scanner;

public class Figuras {

	private static Scanner sc;
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Perimetro perimetro=new Perimetro();
		new Areas();
		Heron heron=new Heron();
		int opcion;
		
		
		do {
			
			System.out.println("\t\nMenu");
			System.out.println("1.Areas");
			System.out.println("2.Perimetro");
			System.out.println("3.Ley de heron");
			System.out.println("4.Salir");
			System.out.println("Ingresa un opcion: ");
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Menu de areas");
				System.out.println("1.Cuadrado");
				System.out.println("2.Circulo");
				System.out.println("3.Triangulo");
				System.out.println("4.Rectangulo");
				System.out.println("Ingresa un opcion: ");
				int eleccion_area=sc.nextInt();
				
				switch (eleccion_area) {
				case 1:
					System.out.println("Ingresa un lado:");
					float lado=sc.nextFloat();
					float areacuadrado=calcular_area_cuadrado(lado);
					System.out.println("El area del cuadrado es :"+areacuadrado);
					break;
					
					case 2:
						System.out.println("Ingresa el radio: ");
						float radio=sc.nextFloat();
						
						float areaCirculo=Areas.calcular_area_circulo(radio);
						System.out.println("El area del circulo es :"+areaCirculo);
						break;
					case 3:
						System.out.println("Ingresa la base: ");
						float base=sc.nextFloat();
						System.out.println("Ingresa la altura: ");
						float altura=sc.nextFloat();
						
						float areatriangulo=Areas.calcular_area_triangulo(base, altura);
						System.out.println("El area del triangulo es :"+areatriangulo);
						break;
					case 4:
						System.out.println("Ingresa la base: ");
						float baserectangulo=sc.nextFloat();
						System.out.println("Ingresa la altura: ");
						float alturarectangulo=sc.nextFloat();
						
						float arearectangulo=Areas.calcular_area_rectangulo(baserectangulo,alturarectangulo);
						System.out.println("El area del rectangulo es :"+arearectangulo);
						break;
						default:
							System.out.println("\nLa opcion no existe");
							break;
				}		
				break;
				
				case 2:
					System.out.println("Menu de perimetros");
					System.out.println("1.Cuadrado");
					System.out.println("2.Circulo");
					System.out.println("3.Triangulo");
					System.out.println("4.Rectangulo");
					System.out.println("Ingresa un opcion: ");
					int elccion_perimetro=sc.nextInt();
					
					switch(elccion_perimetro) {
					
					case 1:
						System.out.println("Ingresa un lado:");
						float lado=sc.nextFloat();
						
						float perimetocuadrado=perimetro.calcular_perimetro_cuadrado(lado);
						System.out.println("El perimetro del cuadrado es:"+perimetocuadrado);
					break;
					case 2:
						System.out.println("Ingresa el diametro:");
						@SuppressWarnings("unused") float diamatro=sc.nextFloat();
						
						float perimetrocirculo=perimetro.calcular_perimetro_circulo(elccion_perimetro);
						System.out.println("El perimetro del circulo es:"+perimetrocirculo);
					break;
					case 3:
						System.out.println("Ingresa el primer lado:");
						float lado_uno=sc.nextFloat();
						System.out.println("Ingresa el segundo lado:");
						float lado_dos=sc.nextFloat();
						System.out.println("Ingresa el tercer lado:");
						float lado_tercer=sc.nextFloat();
						
						float perimetrotriangulo=perimetro.calcular_perimetro_triangulo(lado_uno, lado_dos, lado_tercer);
						System.out.println("El perimetro del triangulo es :"+perimetrotriangulo);
						
					break;
					case 4:
						
						System.out.println("Ingresa la altura:");
						float baserectangulo=sc.nextFloat();
						System.out.println("Ingresa la base:");
						float baserectangulo2=sc.nextFloat();
						
						float perimetrorectangulo=perimetro.calcular_perimetro_rectangulo(baserectangulo, baserectangulo2);
						System.out.println(" El perimetro del rectangulo es:"+perimetrorectangulo);
						
					break;
					default:
						System.out.println("La opcion no existe ");
					break;
					}

					break;
				case 3:
					float a,b,c;
					System.out.println("Ingresa el primer lado:");
					a=sc.nextFloat();
					System.out.println("Ingresa el segundo lado:");
					b=sc.nextFloat();
					System.out.println("Ingresa el tercer lado:");
					c=sc.nextFloat();
					
					float leyheron=heron.calcularleydeheron(a, b, c);
					System.out.println("La ley de heron es :"+leyheron);
					
					break;
					case 4:
						System.out.println("Gracias por participar :D");
				break;
				
				default:
					System.out.println("Opcion no disponible :(");
				break;
	
			}
	
		}while (opcion!=4);
		
		
		
	}

	private static float calcular_area_cuadrado(float lado2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
