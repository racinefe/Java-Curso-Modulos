package desafioHerança;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	private int delta =5;
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	void acelerar() {
		if(velocidadeAtual + delta >VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
			System.out.println("Velocidade maxima atingida");
			
		}else  {
			
			velocidadeAtual += delta;
			
			

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


	public int getDelta() {
		return delta;
	}


	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
