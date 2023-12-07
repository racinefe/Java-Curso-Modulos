package oo.composição;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	 
	final String nome;
	final List<Aluno> alunos = new ArrayList<Aluno>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	void AddAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.curso.add(this);
	}
	public String toString() {
		return nome;
	}
}
