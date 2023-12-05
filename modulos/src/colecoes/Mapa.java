package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Bruna");
		usuarios.put(2, "Racine");
		usuarios.put(3, "Renan");
		usuarios.put(4, "Sanndy");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey()+ "-->");
			System.out.println(registro.getValue());
		}
		
		
		

	}

}
