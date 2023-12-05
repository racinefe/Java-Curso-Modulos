package operadores;

public class operadoresTernarios {
	public static void main(String[] args) {
		double media = 5.0;
		String seFudeu = media >= 5.0 ? "Recuperação" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : seFudeu;
		
		System.out.println(resultado);
		
		double nota = media;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 9.0;
		boolean comDesconto = bomComportamento && passouPorMedia;
		String resultadoDesconto = comDesconto ? "sim" : "não";
		
		System.out.println("Tem Desconto? " + resultadoDesconto);
	}
}
