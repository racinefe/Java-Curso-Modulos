package operadores;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		int a = 30;
		int b = a;
		int c = 0;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > c);
		System.out.println(b >= c);
		System.out.println(b < c);
		System.out.println(b <= c);
		
		for (int i = 0; i<20 ;i++) {
			System.out.print("*");
		}
		
		
		double nota = 7.5;
		boolean bomComportamento = true;
		boolean passouaPorMedia = nota >= 7;
		boolean desconto = bomComportamento && passouaPorMedia;
		
		System.out.println("\nTem desconto? " + desconto);

	}

}
