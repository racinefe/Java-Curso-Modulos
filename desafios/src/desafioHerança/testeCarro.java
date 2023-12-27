package desafioHerança;



public class testeCarro {
	public static void main(String[] args) {
		
		UnoComEscada uno = new UnoComEscada();
		uno.acelerar();
		uno.ligarTurbo();
		uno.acelerar();
		uno.acelerar();
		uno.desligarTurbo();
		uno.acelerar();
		
		System.out.println("Uno Com Escada - " + uno);
		
	
		Ferrari ferrari = new Ferrari();
			
		
		System.out.println("Ferrari - " + ferrari);
	
		
	
		
		
	
	}
	
}
