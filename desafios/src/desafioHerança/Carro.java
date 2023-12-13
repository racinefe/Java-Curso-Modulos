package desafioHerança;

public class Carro {
	
	int velocidadeAtual = 0;
	
	
	void acelerar() {
		if(velocidadeAtual >= 200) {
			System.out.println("Velocidade maxima atingida");
			
		}else  {
			
			velocidadeAtual += 5;
			
			

		}
	}
	void frear() {
		if (velocidadeAtual > 0 ) {
			velocidadeAtual -= 5;
			System.out.println("Freiando - "+velocidadeAtual);
			
		}else if(velocidadeAtual == 0) {
			System.out.println("Ocarro esta parado");
			
		}
	}
	public String toString() {
		return "Velocidade Atual em =>> " + velocidadeAtual; 
	}
}
