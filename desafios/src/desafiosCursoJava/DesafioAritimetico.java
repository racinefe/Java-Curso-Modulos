package desafiosCursoJava;

public class DesafioAritimetico {

	public static void main(String[] args) {
		
 		
		double a = 6*(3+2);
		double a1= Math.pow(a, 2);
		double exprecao1 = a1/(3*2);
		
		double b = (1-5)*(2-7);
		double b2 = Math.pow(b, 2)/2;
		double exprecao2 = b2/2;
		
		
		double c = exprecao1 - exprecao2;
		double c3 = Math.pow(c, 3);
		double x = Math.pow(10, 3);
		
		double resultadoFinal = c3/x;
		
		
		System.out.println(resultadoFinal);
		
		

	}

}
