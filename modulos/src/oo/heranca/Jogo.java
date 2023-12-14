package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
	/*
	 * 
	 * exemplo de utilização do [ Enum ]
	 *
	 */
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10,11);
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.print("Vida Monstro: " + monstro.vida);
		System.out.println(" | Vida Heroi: " + heroi.vida);
		
		
		System.out.println("Heroi ataca -> " + heroi.atacar(monstro));
		System.out.print("Vida Monstro: " + monstro.vida);
		System.out.println(" | Vida Heroi: " + heroi.vida);
		
		System.out.println("Monstro ataca -> " + monstro.atacar(heroi));
		System.out.print("Vida Monstro: " + monstro.vida);
		System.out.println(" | Vida Heroi: " + heroi.vida);
		
		heroi.andar(Direcao.NORTE);
		System.out.println("Monstro ataca -> " + monstro.atacar(heroi));
		System.out.print("Vida Monstro: " + monstro.vida);
		System.out.println(" | Vida Heroi: " + heroi.vida);
	}
}
