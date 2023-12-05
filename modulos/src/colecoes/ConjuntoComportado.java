package colecoes;


import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> listaAlunos = new TreeSet<>();
		
		listaAlunos.add("Anna");
		listaAlunos.add("Anna");
		listaAlunos.add("Carlos");
		listaAlunos.add("Patricia");
		listaAlunos.add("Lucas");
		listaAlunos.add("Bruna");
		listaAlunos.add("Pedro");
		
		for(String aprovados:listaAlunos) {
			System.out .println(aprovados);
		}
	}

}
