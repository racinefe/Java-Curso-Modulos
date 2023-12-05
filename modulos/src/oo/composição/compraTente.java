package oo.composição;



public class compraTente {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "Pedro";
		compra1.addItem("Banana", 12, 1.20);
		compra1.addItem("Pera", 5, 2.00);
		compra1.addItem("Morango", 10, 3.00);
		
		System.out.println("QUANTIDADE DE ITENS: " + compra1.itens.size());
		
		System.out.println("VALOR TOTAL DA COMPRA = R$" + compra1.valorTotal());
	

	}

}
