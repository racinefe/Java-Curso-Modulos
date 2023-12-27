package oo.polomorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);
		
		
		Arroz comida1 = new Arroz(0.2);
		Feijao comida2 = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(comida1);
		convidado.comer(comida2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.3);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());

	}

}
