package desafioComposicaoOO;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	  List<Item> itens = new ArrayList<>();

		
		  public Compra() {
		  
		 
		  }
		 
	 void addItem(Produto p, int qtde) {
		 this.itens.add(new Item(p, qtde));
	 }

	    public double calcularTotal() {
	        double total = 0;
	        for (Item item : itens) {
	            total += item.quantidade * item.produto.preco;
	        }
	        return total;
	    }

		public List<Item> getItens() {
			return itens;
		}

		public void setItens(List<Item> itens) {
			this.itens = itens;
		}

		
	
}


