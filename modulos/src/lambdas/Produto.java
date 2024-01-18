package lambdas;

public class Produto {
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toSstring() {
		double precoFinal = preco * ( 1 - desconto);
		return nome + "Preço R$" + precoFinal;
	}
}
