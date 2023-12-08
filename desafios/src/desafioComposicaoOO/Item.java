package desafioComposicaoOO;

	public class Item {
		
		  int quantidade;
		  Produto produto;

		    public Item(Produto produto, int quantidade) {
		        this.produto = produto;
		        this.quantidade = quantidade;
		    }

		    public double calcularTotal() {
		        return quantidade * produto.getPreco();
		    }

			public int getQuantidade() {
				return quantidade;
			}

			public void setQuantidade(int quantidade) {
				this.quantidade = quantidade;
			}

			public Produto getProduto() {
				return produto;
			}

			public void setProduto(Produto produto) {
				this.produto = produto;
			}
	
	
}
