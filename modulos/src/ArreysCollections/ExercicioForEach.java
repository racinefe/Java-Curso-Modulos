package ArreysCollections;

import java.util.Arrays;

public class ExercicioForEach {

	public static void main(String[] args) {
		
		double[] notasAluno = new double[4];
		System.out.println(Arrays.toString(notasAluno));
		
		notasAluno[0] = 7.9;
		notasAluno[1] = 8;
		notasAluno[2] = 6.7;
		notasAluno[3] = 9.7;
		
		for (double nota:notasAluno) {
			System.out.print(nota +" | ");
		}

	}

}
