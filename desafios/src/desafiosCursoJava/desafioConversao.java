package desafiosCursoJava;

import java.util.Scanner;

public class desafioConversao {

	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		
		String valor1, valor2, valor3;
		
		
		
		 System.out.println("Digite os Valores:");
		 
			System.out.println("Digite o primeiro Valor: " );		
			 valor1  = entradaTeclado.nextLine();
			System.out.println("Digite o segundo Valor: " );
			 valor2  = entradaTeclado.nextLine();
			System.out.println("Digite o Terceiro Valor: " );
			 valor3  = entradaTeclado.nextLine();
			 
			 
			System.out.println("Valores: "+ valor1 +" | "+ valor2 +" | "+ valor3);
		
			double v1 = Double.parseDouble(valor1.replace(',', '.'));
			double v2 = Double.parseDouble(valor2.replace(',', '.'));
			double v3 = Double.parseDouble(valor3.replace(',', '.'));
			
			double somaValores = v1 + v2 + v3;
			System.out.println("Soma : " + somaValores);
			System.out.println("Média : " + somaValores /3);
		
		
		entradaTeclado.close();
		
		
	}

}
