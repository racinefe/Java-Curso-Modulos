package ArreysCollections;

import java.util.Arrays;
import java.util.Scanner;

public class desaffioArreys {

	public static void main(String[] args) {
		
		Scanner arrey = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas");
		int notas = arrey.nextInt();
		
		double[] notasAluno = new double[notas];
		
		for (int i =0; i < notas; i++) {
		
			System.out.print("informe a nota: "+ (i +1)+": ");
			notasAluno[i]= arrey.nextDouble() ;
		
		}
		System.out.println("Notas Do Aluno: "+Arrays.toString(notasAluno));
		
		double soma =0;
		for (double nota:notasAluno) {
			soma+= nota;
		}
		double media = soma/notasAluno.length;
		System.out.println("Media do Aluno: " + media);

		
		
		if (arrey != null) {
			arrey.close();
		}
		
		
	}

}
