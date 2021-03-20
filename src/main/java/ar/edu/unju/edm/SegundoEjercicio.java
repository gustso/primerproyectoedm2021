package ar.edu.unju.edm;

public class SegundoEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int altura = 20;
		int base;
		
		//altura = 10;
		base = 30;
		
		//pasar al rectangulo
		//llamar al constructor
		Rectangulo unRectangulo = new Rectangulo();
		int resultado = unRectangulo.calcularSuperficie(altura,base);
		
		System.out.println("La superficie del Rectangulo es: " + resultado);
		
		//perimetro
		unRectangulo.setAltura(altura);
		unRectangulo.setBase(base);
		
		unRectangulo.calcularDePerimetro();
		
		System.out.println("El perímetro es: "+unRectangulo.getPerimetro());

	}

}
