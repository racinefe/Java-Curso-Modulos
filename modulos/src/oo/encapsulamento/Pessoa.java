package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//Getter
	public int getIdade() {
		return idade;
	}
	//Setter
	public void setIdade(int alteraIdade) {
		if(alteraIdade>= 0 && alteraIdade <= 99) {
			this.idade = alteraIdade;
		}
		
	}
	@Override
	public String toString() {
		
		return "Ola eu sou o " + getNome() + " e tenho " + getIdade() + " Anos";
	}
}
