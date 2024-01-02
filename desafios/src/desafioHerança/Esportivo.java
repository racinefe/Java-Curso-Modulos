package desafioHerança;

public interface Esportivo {
	
	 void ligarTurbo();
	 void desligarTurbo();
	 
	 default int nivelTurbo() {
		 return 1;
	 }

}
