package desafioHerança;

public class UnoComEscada extends Carro implements Esportivo{
	
	
	UnoComEscada(){
		this(300);
	}
	UnoComEscada(int velocidadeMaxima){
		
		super(velocidadeMaxima);
		setDelta(10);
		
	}
	@Override
	public void ligarTurbo() {
		setDelta(20);
		
	}
	@Override
	public void desligarTurbo() {
		setDelta(10);
		
	}
		
		
		
}

