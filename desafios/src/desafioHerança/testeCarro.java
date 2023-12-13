package desafioHerança;



public class testeCarro {
	public static void main(String[] args) {
		
		UnoComEscada uno = new UnoComEscada();
		uno.acelerar();
		uno.acelerar();
		System.out.println("Uno Com Escada - " + uno);
		uno.frear();
		uno.frear();
		uno.frear();
		uno.frear();
		uno.frear();
		System.out.println("Uno Com Escada - " + uno);
		
		
		
		
		Ferrari ferrari = new Ferrari();
		ferrari.acelerar();		
		ferrari.acelerar();		
		System.out.println("Ferrari - " + ferrari);
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
	
		System.out.println("Ferrari - " + ferrari);
	
		
		
	
	}
	
}
