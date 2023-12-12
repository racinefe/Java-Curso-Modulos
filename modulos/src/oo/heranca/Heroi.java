package oo.heranca;

public class Heroi extends jogador {
	
	boolean atacar(jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
}
