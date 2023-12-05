package desafiosCursoJava;

import java.util.Scanner;

public class desafioCalculadora {

	public static void main(String[] args) {
		double num1,num2,resp;
		
		
		
		Scanner entrtada = new Scanner(System.in);
		System.out.print("Digite o primeiro numero:");
		num1 = entrtada.nextDouble();
		System.out.print("Digite o segundo numero:");
		num2 = entrtada.nextDouble();
		
		
		System.out.print("escolha a operação:");
		String op = entrtada.next();
		
		resp = "+".equals(op)? num1  + num2 :0;
		resp = "-".equals(op)? num1  - num2 :resp;
		resp = "*".equals(op)? num1  * num2 :resp;
		resp = "/".equals(op)? num1  / num2 :resp;
		resp = "%".equals(op)? num1  % num2 :resp;
		System.out.printf("%.2f %s %.2f = %.2f",num1, op, num2, resp);
		
		
		entrtada.close();
		
		

	}

}
