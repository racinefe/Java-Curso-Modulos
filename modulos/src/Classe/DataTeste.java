package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		
		
		Data D1 = new Data();
		Data D2 = new Data(05,9,1991);
		System.out.printf("%d/%d/%d\n",D1.dia,D1.mes,D1.ano);
		
		
		
		
		
		System.out.printf(D2.obterDataFormatada());
		
		D1.imprimirDataFormatada();
		D2.imprimirDataFormatada();

	}

}
