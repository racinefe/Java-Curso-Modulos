package Classe;

public class Produto {

	String nome;
	double preco; 
	static double desconto = 0.25;
	
	Produto(){
	}
	
	Produto(String nomeInnicial, double precoInicial){
		nome = nomeInnicial;
		preco = precoInicial;
	}
	
	double pecoComDesconto() {
		return preco * (1- desconto);
	}
	
	double pecoComDesconto(double descontoGerente) {
		
		return preco * (1- desconto + descontoGerente);
	}

}
