package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia! \n\n");

		System.out.println("Bom");
		System.out.println("Dia!");
	
		System.out.printf("Sorteio:  %d %d %d %d %n", 1, 2, 3, 4);
		System.out.printf("Nome: %s %n","Racine");
		
		
		//Scanner(System.in) pega a entrada do teclado 
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Digitte seu nome:");
		String nome = entradaTeclado.nextLine();
				
		System.out.println("Digitte seu E-mail:");
		String email = entradaTeclado.nextLine();
		
		System.out.println("Digitte sua idade:");
		int idade = entradaTeclado.nextInt();
		
		System.out.println("\n\n Nome = " + nome + "\n E-mail = " + email);
		System.out.println(" Idade = " + idade );
		
		entradaTeclado.close();
		
		
	}

}
