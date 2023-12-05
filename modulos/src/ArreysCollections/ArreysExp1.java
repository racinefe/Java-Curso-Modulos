package ArreysCollections;

import java.util.Arrays;


public class ArreysExp1 {

	public static void main(String[] args) {

		double[] notasAluno = new double[4];
		System.out.println(Arrays.toString(notasAluno));
		
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.7;
		notasAluno[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAluno));
		
		double totalAluno = 0;
		for (int i = 0; i<notasAluno.length; i++) {
			totalAluno+= notasAluno[i];
			
		}
		System.out.println("ALUNO1: " +totalAluno/notasAluno.length);
		
		double[]  notasAluo2 = {6.9, 8.9, 5.5, 10};//ARREY COM DADOS LITERAL
		
		double totalAluno2=0;
		for (int i = 0; i < notasAluo2.length; i++) {
			totalAluno2 += notasAluo2[i];
		}
		System.out.println("ALUNO2: " + totalAluno2 / notasAluo2.length);
	}

}
