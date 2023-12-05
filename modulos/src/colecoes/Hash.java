package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuario = new HashSet<Usuario>();
		
		usuario.add(new Usuario("Racine"));
		usuario.add(new Usuario("Anna"));
		usuario.add(new Usuario("Felipe"));
		usuario.add(new Usuario("Patricia"));
		
		System.out.println(usuario.contains(new Usuario("Racine")));

	}

}
