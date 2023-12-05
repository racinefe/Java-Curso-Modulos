package operadores;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1;
		a--; //a = a - 1;
		
		++b; //b = b + 1;
		--b; //b = b - 1;
		
		System.out.println("valor de a = "+a);
		System.out.println("valor de b = "+b);
		
		for(int i = 0; i <30;i++) {
			System.out.print("*");
		}
		
		System.out.println("\n mini Desafio");
		System.out.println(++a == b--);// verdadeiro ou falso ?
		System.out.println(a == b);// verdadeiro ou falso ?
		System.out.println("valor de a = "+a);
		System.out.println("valor de b = "+b);
	}

}
