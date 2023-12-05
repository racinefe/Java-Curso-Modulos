package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("A Batalha do Apocalipse");
		livros.push("Filhos do Eden - herdeiros de atlantida");
		livros.push("Filhos do Eden - anjos da morte");
		
		for (String livro:livros) {
			System.out.println(livro);
		}
		System.out.println(" ");
		
		System.out.println(livros.peek());// Pilha-[LIFO - Last In First Out (O último a entrar é o primeiro sair)] 
		System.out.println(livros.element());
		
		System.out.println("Removeu da Lista ->"+livros.poll());//remove seguindo o LIFO
		
		System.out.println(" ");
		
		for (String livro:livros) {
			System.out.println(livro);
		}

	}

}
