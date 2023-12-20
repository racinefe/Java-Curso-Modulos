package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("fulaninho",30);
		
		p1.setIdade(300);
		
		System.out.println(p1.getIdade());
		
		System.out.println(p1);
		

	}

}
