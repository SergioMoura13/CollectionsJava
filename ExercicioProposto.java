package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ExercicioProposto {

	private static final boolean Integer = false;

	public static void main(String[] args) {
		
		Map<String, Integer> Populacao = new HashMap(){{
			
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
			
		}};
		
		for (Map.Entry<String, Integer> entry : Populacao.entrySet()) {
			String key = entry.getKey();
			Integer Value = entry.getValue();
			
			System.out.println("Estado: " + key +  " | Populacao: " + Value );
		}
		
		System.out.println("");
		System.out.println("Modificando a populacao de RN...");
		System.out.println("");
		
			Populacao.put("RN", 3534165);
			
			for (Map.Entry<String, Integer> entry : Populacao.entrySet()) {
				String key = entry.getKey();
				Integer Value = entry.getValue();
				
				System.out.println("Estado: " + key +  " | Populacao: " + Value );
			}	
			
			System.out.println("");
			System.out.println("Verificando se PB esta na tabela...");
			System.out.println("");
			
			System.out.println(Populacao.containsKey("PB"));
			
			System.out.println("");
			System.out.println("Adicionando...");
			System.out.println("");
			
			Populacao.put("PB", 4039277);
			
			for (Map.Entry<String, Integer> entry : Populacao.entrySet()) {
				String key = entry.getKey();
				Integer Value = entry.getValue();
				
				System.out.println("Estado: " + key +  " | Populacao: " + Value );
			}	
			
			System.out.println("");
			System.out.println("Exibindo a populacao do estado PE:");
			System.out.println(Populacao.get("PE"));
			
			System.out.println("");
			System.out.println("Exibindo a tabela como foi informado...");
			System.out.println("");
			
			Map<String, Integer> Populacao1 = new LinkedHashMap() {{
				
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);
				put("PB", 4039277);
				
			}};
			
			for (Map.Entry<String, Integer> entry : Populacao1.entrySet()) {
				String key = entry.getKey();
				Integer Value = entry.getValue();
				
				System.out.println("Estado: " + key +  " | Populacao: " + Value );
			}
			
			System.out.println("");
			System.out.println("Exibindo a tabela em ordem alfabetica...");
			System.out.println("");
			
			Map<String, Integer> Populacao2 = new TreeMap(Populacao1);
			
			for (Map.Entry<String, Integer> entry : Populacao2.entrySet()) {
				String key = entry.getKey();
				Integer Value = entry.getValue();
				
				System.out.println("Estado: " + key +  " | Populacao: " + Value );
			}
			
			System.out.println("");
			System.out.println("Exibindo o estado com a menor populacao...");
			System.out.println("");
			
			Integer MenorValor = Collections.min(Populacao.values());
			
			Set<Map.Entry<String, Integer>> estadoMenor = Populacao.entrySet(); 
			String estadoMenorPopulacao = "";
			
			for(Map.Entry<String, Integer> entry : estadoMenor) {
				
				if(entry.getValue().equals(MenorValor)) {
					estadoMenorPopulacao = entry.getKey();
				}
				
			}
			System.out.println("Estado: " + estadoMenorPopulacao + " | Populacao: " + MenorValor);
			
			System.out.println("");
			System.out.println("Exibindo o estado com a maior populacao...");
			System.out.println("");
			
			Integer MaiorValor = Collections.max(Populacao.values());
			
			Set<Map.Entry<String, Integer>> estadoMaior = Populacao.entrySet();
			String estadoMaiorPopulacao = "";
			
			for(Map.Entry<String, Integer> entry : estadoMaior) {
				if(entry.getValue().equals(MaiorValor)) {
					estadoMaiorPopulacao = entry.getKey();
				}
			}
			
			System.out.println("Estado: " + estadoMaiorPopulacao + " | Populacao: " + MaiorValor);
			
			System.out.println("");
			System.out.println("Exibindo a soma das populacoes...");
			System.out.println("");
			
			
			java.util.Iterator<java.lang.Integer> SomaPopulacao = Populacao.values().iterator();
			
			Integer Soma = 0;
			
			while(SomaPopulacao.hasNext()) {
				Soma += SomaPopulacao.next();
			}
			
			System.out.println("Soma: " + Soma);
			
			System.out.println("");
			System.out.println("Exibindo a media das populacoes...");
			System.out.println("");
			
			System.out.println("Media: " + Soma / Populacao.size());
			
			System.out.println("");
			System.out.println("Removendo os estados com a populacao menor que 4.000.000...");
			System.out.println("");
			
			java.util.Iterator<java.lang.Integer> RemoverValor = Populacao.values().iterator();
			
			while(RemoverValor.hasNext()) {
				if(RemoverValor.next() <= 4000000) {
					RemoverValor.remove();
				}
			}
			
			for (Map.Entry<String, Integer> entry : Populacao.entrySet()) {
				String key = entry.getKey();
				Integer Value = entry.getValue();
				
				System.out.println("Estado: " + key +  " | Populacao: " + Value );
			}
			
			
			System.out.println("");
			System.out.println("Removendo a tabela de estados...");
			System.out.println("");
			
			Populacao.clear();
			System.out.println("Removeu? " + Populacao.isEmpty());
			
					
			
	}

}
