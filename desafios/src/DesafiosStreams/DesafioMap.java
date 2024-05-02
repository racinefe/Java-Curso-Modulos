package DesafiosStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;


public class DesafioMap {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		/*
		 * 1. Número para String binária....exemplo: 6 => "110"
		 * 2. Inverter a String...exemplo: "110" => "011"
		 * 3. Converter de volta para Integer...exemplo: "011" => 3
		 */
		Consumer<String> print = System.out::print;
		
		UnaryOperator<String> inverter =
				s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2);
		nums.stream()
        .map( Integer::toBinaryString)
        .map(inverter)
        .map(binarioParaInt)
        .forEach( System.out::println);
		System.out.println();
		
		
		
		
		
		
		
		
	}
}
