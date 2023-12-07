package oo.composição;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> curso = new ArrayList<Curso>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void AddCurso(Curso curso) {
		this.curso.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {
		return nome;
	}
}
