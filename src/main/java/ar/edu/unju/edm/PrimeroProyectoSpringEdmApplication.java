package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeroProyectoSpringEdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeroProyectoSpringEdmApplication.class, args);
		
		System.out.println("Hola Mundo, soy Gustavo");
		
		double a;
		double b;
		
		a = 15;
		b = 10;
		
		System.out.println("La multiplicación de a * b = " + a*b);
				
		System.out.println("El resultado de la suma es: "+ sumar(a,b));
	}
	
	
	public static double sumar(double a, double b){
		return a+b;
	}

}
