package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
	/*
	 * 
	 * exemplo de utilização do [ Enum ]
	 *
	 */
		
		Monstro j1 = new Monstro();
		j1.x = 10;
		j1.y = 10;
		
		Heroi j2 = new Heroi();
		j2.x = 10;
		j2.y = 11;
		
		System.out.print("Vida Monstro: " + j1.vida);
		System.out.println(" | Vida Jogador: " + j2.vida);
		
		
		System.out.println("Jogador ataca -> " + j2.atacar(j1));
		System.out.print("Vida Monstro: " + j1.vida);
		System.out.println(" | Vida Jogador: " + j2.vida);
		
		System.out.println("Monstro ataca -> " + j1.atacar(j2));
		System.out.print("Vida Monstro: " + j1.vida);
		System.out.println(" | Vida Jogador: " + j2.vida);
		
		j2.x = 10;
		j2.y = 12;
		
		System.out.println("Monstro ataca -> " + j1.atacar(j2));
		System.out.print("Vida Monstro: " + j1.vida);
		System.out.println(" | Vida Jogador: " + j2.vida);
	}
}
