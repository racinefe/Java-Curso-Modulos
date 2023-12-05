package desafiosCursoJava;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite o dia da semana");
			String semana = entrada.next();
			
			
			if(semana.equalsIgnoreCase("domingo") ){
				System.out.println(semana + " = 1");
			}else if(semana.equalsIgnoreCase("segunda")){
				System.out.println(semana + " = 2");
			}else if(semana.equalsIgnoreCase("terça")){
				System.out.println(semana + " = 3");
			}else if(semana.equalsIgnoreCase("quarta")){
				System.out.println(semana + " = 4");
			}else if(semana.equalsIgnoreCase("quinta")){
				System.out.println(semana + " = 5");
			}else if(semana.equalsIgnoreCase("sexta")){
				System.out.println(semana + " = 6");
			}else if(semana.equalsIgnoreCase("sabado")){
				System.out.println(semana + " = 7");
			}
		entrada.close();

	}

}
