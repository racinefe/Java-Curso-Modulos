package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Anna", 7.5); 
		Aluno a2 = new Aluno("Paula", 6.5); 
		Aluno a3 = new Aluno("Lucas", 9.5); 
		Aluno a4 = new Aluno("Marcos", 7.5); 
		Aluno a5 = new Aluno("Bruna", 4.5); 
		Aluno a6 = new Aluno("Leonador", 6.5); 
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a-> a.nota >= 7;
		
		alunos.stream()
			.filter(aprovado)
			.map(a-> "Parabens " + a.nome + "!" + "Voce foi aprovado com nota:" + a.nota)
			.forEach(System.out::println);

	}

}
