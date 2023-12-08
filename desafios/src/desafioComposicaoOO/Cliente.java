package desafioComposicaoOO;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

     String nome;
     List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    public double calcularTotalCompras() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.calcularTotal();
        }
        return total;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
    
}