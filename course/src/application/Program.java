package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		//ACRESCENTANDO UM METODO PARA CALCULAR A AREA.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle  x , y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Calcule a área do  triângulo X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Calcule a área do  triângulo y: ");
		
		y.a = sc.nextDouble();
		y.b= sc.nextDouble();
		y.c = sc.nextDouble();
		
		//ABAIXO LÓGICA REPETIDA PARA CADA TRIANGULO. IMPLEMENTANDO METODO.
		
		double areaX = x.area();//CHAMADA DO METODO / FUNÇAO DE X. 
		
		double areaY = y.area();//CHAMADA DO METEDO / FUNCAO DE Y.
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
		    System.out.println("Larger area : X");
		}
		
		else {
			System.out.println("Larger area : Y");
		}
		sc.close();
	}

}
