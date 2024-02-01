package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Bia", "Lia", "Ana", "laura");
		
		
		  System.out.println(" Usanndo o for tradicional");
		  for (int i = 0; i < aprovados.size(); i++) {
		  System.out.println(aprovados.get(i)); }
		 
		
		
		  System.out.println("\n  Usanndo o foreach"); 
		  for (String nomes : aprovados) {
		  System.out.println(nomes); }
		 
		  
		  System.out.println("\n  Usanndo o Iterator");
		  Iterator<String> nomes = aprovados.iterator();
		  while (nomes.hasNext()) {
			System.out.println(nomes.next());
		 }
		  
		 System.out.println("\n  Usanndo o Stream");
		 Stream<String> nomesLista = aprovados.stream();
		 nomesLista.forEach(System.out::println);

	}

}
