package fundamentos;

public class ConvercaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //converção implícita
		System.out.println(a);
		
		float b = (float)1.1234567888888; //conveção explicita (CAST)
		System.out.println(b);
		
		System.out.println("************ConvercaoTipoPrimitivoNumerico*************");
		
		int c = 130 ;
		System.out.println(c);
		byte d = (byte)c; //conveção explicita (CAST)
		System.out.println(d);
		
		System.out.println("************ConvercaoTipoPrimitivoNumerico*************");
		
		double e = 1.9999999;
		System.out.println(e);
		int f = (int) e; //conveção explicita (CAST)
		System.out.println(f);
		
		

	}

}
