package estruturaDeControle;

import java.util.Scanner;



public class IF_ELSE {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Informe  Media");
			double media = entrada.nextDouble();
			
			if(media >= 7.0){
				System.out.println("aluno aprovado");
			}else System.out.println("aluno reprovado");
			entrada.close();
		 
		/*String valor = JOptionPane.showInputDialog("Informe um Numero");
		int numero = Integer.parseInt(valor);
		if(numero % 2 == 0) {
			System.out.println("Numero e par: "+ numero);
		}else {System.out.println("Numero e inpar: "+ numero);
			}*/
	}

}
