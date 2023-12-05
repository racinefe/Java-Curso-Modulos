package Classe;

public class valorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + "= a | b =" + b);
		
		Data D1 = new Data(1,6,2022);
		Data D2 = D1;// atribuição por referencia - (Objeto)
		
		D1.dia = 05;
		D2.mes = 12;
		
		System.out.printf("%d/%d/%d\n",D1.dia,D1.mes,D1.ano);
		System.out.printf("%d/%d/%d",D2.dia,D2.mes,D2.ano);

	}

}
