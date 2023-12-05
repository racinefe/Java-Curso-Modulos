package estruturaDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//racin 21 de set. de 2023
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		do {
			System.out.println("Digite algo ou "+ "Digite sair para encerrar o programa.");
			valor = entrada.nextLine();
			
		}while(!valor.equalsIgnoreCase("sair"));
		
		System.out.println("BayBay!");

		entrada.close();

	}

}
