package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Racine"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Thiago"));
		lista.add(new Usuario("Nathane"));
		
		for (Usuario u:lista) {
			System.out.println(u.nome);
		}
		
		System.out.println((lista.get(3))); //acessar o nome da lista pelo índice | utilizando a formatação do `toString` do objeto `Usuario`
	}

}
