package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações de Funcionários
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulasdos = 3_134_845_223L;
		
		//Tipos Numéricos Reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		
		boolean ferias = true; //ou false
		
		//Tipo caractere
		
		char status = 'A';
		
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulasdos / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->"+ salario);
		System.out.println("ferias ->"+ ferias);
		System.out.println("Status ->"+ status);

	}

}
