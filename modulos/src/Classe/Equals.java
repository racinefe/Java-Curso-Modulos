package Classe;



public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "racine";
		u1.email = "racine@email.ex";
		
		Usuario u2 = new Usuario();
		u2.nome = "racine";
		u2.email = "racine@email.ex";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		
	}
}
