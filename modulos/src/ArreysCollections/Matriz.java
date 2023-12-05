package ArreysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		//racin 28 de nov. de 2023
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade se alunos: ");
		int qtAluno = entrada.nextInt();
		
		System.out.print("Quantidade de notas por Aluno? ");
		int qtNota = entrada.nextInt();
		
		double[][] notasTurma = new double [qtAluno][qtNota];
		double total = 0;
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ",n+1,a+1);
				
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
				
			}
		}
		double media = total / (qtAluno*qtNota);
		System.out.println("Media da turma: "+media);
		
		for(double[]notaAluno:notasTurma) {
			System.out.println(Arrays.toString(notaAluno));
		}
		
		 
		entrada.close();
	}

}
