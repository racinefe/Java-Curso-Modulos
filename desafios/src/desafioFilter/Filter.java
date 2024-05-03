package desafioFilter;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;



public class Filter {

	public static void main(String[] args) {
		
		Restaurante res1 = new Restaurante (90.0, 5,false);
		Restaurante res2 = new Restaurante (100.0, 5,true);
		Restaurante res3 = new Restaurante (30.0, 2,false);
		Restaurante res4 = new Restaurante (50.5, 3,true);
		Restaurante res5 = new Restaurante (110.5, 5,true);
		Restaurante res6 = new Restaurante (85.5, 5,true);
		
		List<Restaurante> restaurante = Arrays.asList(res1,res2,res3,res4,res5,res6);
		
		Predicate<Restaurante> preco = r-> r.preco <= 100;
		Predicate<Restaurante> aberto = r-> r.aberto;
		Predicate<Restaurante> avalicao = r-> r.nota >=5; 
		
		Function<Restaurante, String> filtro = r->"Restaurante está Aberto: "+r.aberto+" Valor: " + r.preco + " com nota: " + r.nota;
	
		
		restaurante.stream()
		.filter(preco)
		.filter(avalicao)
		.filter(aberto)
		.map(filtro)
		.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("");
		
		Predicate<Restaurante> preco2 = r-> r.preco <= 90;
		Predicate<Restaurante> aberto2 = r-> r.aberto;
		Predicate<Restaurante> avalicao2 = r-> r.nota >=3; 
		
		Function<Restaurante, String> filtro2 = r->"Restaurante está com -> "+" Valor médio R$" + r.preco + " e avaliação: " + r.nota;
		
		restaurante.stream()
		.filter(preco2)
		.filter(avalicao2)
		.filter(aberto2)
		.map(filtro2)
		.forEach(System.out::println);

	}

}
