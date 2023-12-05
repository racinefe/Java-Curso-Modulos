package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Celular"; 
		p1.preco = 4356.89;
		
		Produto p2 = new Produto("Caneta", 12.56);
		
		
		Produto.desconto = 0.50;
		
		
		System.out.println(p1.nome +" "+ p1.pecoComDesconto());
		System.out.println(p2.nome +" "+ p2.pecoComDesconto());
		
		double precoFinal = p1.pecoComDesconto();
		double precoFinal2 = p2.pecoComDesconto(0.1);
		double mediaCarrinho = (precoFinal + precoFinal2)/2;
		
		
		
		System.out.printf("Media carrionho: R$%.2f \n",mediaCarrinho);

	}

}
