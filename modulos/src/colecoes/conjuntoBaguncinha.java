package colecoes;

import java.util.HashSet;

public class conjuntoBaguncinha {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add("x");
		
		System.out.println("Tamanho do conjunto: "+conjunto.size());
		
		System.out.println(conjunto.remove("x"));
		System.out.println(conjunto.remove(1));
		
		System.out.println("Tamanho do conjunto: "+conjunto.size());
		
	}

}
