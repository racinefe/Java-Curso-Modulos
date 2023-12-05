package Classe;

public class AreaCirc {

	double raio;
	//atributo istático
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	//metodo istático
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
