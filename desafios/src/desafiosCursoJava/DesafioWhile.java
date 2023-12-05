package desafiosCursoJava;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
	
	 //racin 21 de set. de 2023
	Scanner entrada = new Scanner(System.in);

	int contador = 0;
	int nota = 0;
	int total = 0;
	
	
	while(nota != -1){
		System.out.println("Digite uma nota ou -1 para sair");
		nota = entrada.nextInt();
		if( nota <=10 && nota >0) {
			contador++;
			int soma = nota;
			total += soma;
		}
		
	}
	double media = total/contador;	
	if(media >=7) {
		System.out.println("Aluno aprovado");
	}else {
		if(media >=5) {
			System.out.println("Aluno em recuperacão");
		}else {System.out.println("aluno reprovado");}
	}
	System.out.println("A soma das notas : "+total);
	System.out.printf("A media das notas : %.2f ",media);
		

	entrada.close();

	}

}
