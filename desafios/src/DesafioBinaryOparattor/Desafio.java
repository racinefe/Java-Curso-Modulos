package DesafioBinaryOparattor;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        // Operações funcionais para calcular e formatar o preço final
        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoM =
                preco -> preco >= 2500 ? preco * 1.085 : preco; // Corrigido o valor do imposto
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format(Locale.ENGLISH,"%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        // Exemplo de um produto
        Produto p = new Produto("iPad", 3235.89, 0.13);

        // Aplicando as operações em cadeia
        String preco = precoFinal
                .andThen(impostoM)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p); // Ajustado para aplicar diretamente o preço do produto

        // Imprimindo o resultado
        System.out.println("Preço final: " + preco);
    }
}
