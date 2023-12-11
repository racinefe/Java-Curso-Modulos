package oo.composição;



public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Helio");
		Aluno aluno2 = new Aluno("Patricia");
		Aluno aluno3 = new Aluno("Nathane");
		Aluno aluno4 = new Aluno("Ronny");
		Aluno aluno5 = new Aluno("Thiago");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Angular");
		Curso curso3 = new Curso("JavaScript");
		
		curso1.AddAluno(aluno1);
		curso1.AddAluno(aluno2);
		
		curso2.AddAluno(aluno3);
		curso2.AddAluno(aluno5);

		aluno1.AddCurso(curso3);
		aluno2.AddCurso(curso3);
		aluno3.AddCurso(curso3);
		aluno4.AddCurso(curso3);
		aluno5.AddCurso(curso3);
		
		
		for (Aluno aluno: curso3.alunos) {
			System.out.println("Esta matriculado no curso  " + curso3.nome);
			System.out.println("Aluno: " + aluno.nome);
			System.out.println();
			
		}
		System.out.println("Alunos do Curso de "+curso1.nome+": " +curso1.alunos);
		System.out.println("Alunos do Curso de "+curso2.nome+": " +curso2.alunos);
		System.out.println("Alunos do Curso de "+curso3.nome+": " +curso3.alunos);

	}

}
