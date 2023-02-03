package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import Arrays.numerosAleatorios;



public class ExercicioStreamAPI {

	public static <T> void main(String[] args) {
		
		List<String> numeroAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "5");
		
		System.out.println("Imprima todos os elementos dessa lista de String: " );
		
		// 1 jeito
		/*	numeroAleatorios.stream().forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println(t);
					
				}
			}); */
		// 2 jeito
		numeroAleatorios.forEach(System.out::println);
		
		System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set");
		
		Set<String> collectSet = numeroAleatorios.stream().limit(5).collect(Collectors.toSet());
		
		System.out.println("Transforme essa lista de String em uma lista de numeros inteiros ");
		
		numeroAleatorios.stream()
		.map(Integer::parseInt)
		.collect(Collectors.toList())
		.forEach(System.out::println);;
		
		System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
		
		List<Integer> collectList = numeroAleatorios.stream()
		.map(Integer::parseInt)
		.filter(i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());
		
		System.out.println(collectList);
		
		System.out.println("Mostre a media dos numeros ");
		
		numeroAleatorios.stream()
		.mapToInt(s ->  Integer.parseInt(s))
		// pode ser assim .mapToInt(Integer::parseInt);
		.average()
		.ifPresent(System.out::println);
				
		System.out.println("Remova os valores impares");
		
		List<Integer> numerosAleatoriosInteger = (List<Integer>) numeroAleatorios.stream();
		
		numerosAleatoriosInteger.removeIf(t -> (t % 2 != 0));
		System.out.println(numerosAleatoriosInteger);
		
	}
 
}

