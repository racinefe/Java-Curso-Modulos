package desafiosCursoJava;

public class desafioLogico {

	public static void main(String[] args) {
		// trabbalho terça (V ou F)
		// trabbalho quinta (V ou F)
		boolean t1 = false;
		boolean t2 = false;
		
		boolean complrouTV50 = t1 && t2;
		boolean complrouTV32 = t1 ^ t2;
		boolean tomouSorvete = false;
		
		System.out.println("comprou a TV de 50? "+complrouTV50);
		
		System.out.println("comprou a TV de 32? "+complrouTV32);
		
		if (complrouTV50 != false || complrouTV32 != false) {
			tomouSorvete = true;
			System.out.println("tomou sorvete? "+ tomouSorvete );
					
		}else {System.out.println("tomou sorvete? "+ tomouSorvete );}
		
		
		

	}

}
