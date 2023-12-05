package Classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		//acessando o Calculo da area com uma instancia 
		AreaCirc a1 = new  AreaCirc(10);
		//a1.pi = 10;
		System.out.println(a1.area());
		
		//acessando o calculo da area sem criação de instancia 
		System.out.println(AreaCirc.area(10));
	}	
}		
	


