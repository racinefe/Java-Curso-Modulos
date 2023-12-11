package desafioComposicaoOO;

public class ClienteTeste {

	public static void main(String[] args) {
		
		

        Compra compra1 = new Compra();
        compra1.addItem(new Produto("caneta", 4.50), 2);
        compra1.addItem(new Produto("caderno", 10), 3);
        
        Compra compra2 = new Compra();
        compra2.addItem(new Produto("Notebook", 4500), 1);
        compra2.addItem(new Produto("Impressora", 300), 1);
        
        Cliente cliente = new Cliente("João");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);

        double totalCompras = cliente.calcularTotalCompras();
        System.out.println("Total das Compras de " + cliente.getNome() + ": R$" + totalCompras);
    }

    
}
