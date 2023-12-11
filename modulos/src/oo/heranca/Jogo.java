package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
	/*
	 * 
	 * exemplo de utilização do [ Enum ]
	 *
	 */
		
		jogador j1 = new jogador();
		j1.x = 10;
		j1.y = 10;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		
		System.out.println("Posicao X: " + j1.x);
		System.out.println("Posicao Y: " + j1.y);
	}
}
