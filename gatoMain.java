package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import HerançaPolimorfismo.main;

public class ordenacaoList {
	
	
	public static void main(String[] args) {
		
		List <gato> meusGatos = new ArrayList<>() {{
			add(new gato("Jon", 18, "preto"));
			add(new gato("Simba", 6, "tigrado"));
			add(new gato("Jon", 12, "amarela"));	
		}};
		
	// Ordem Inserção
		
		for(gato gatos : meusGatos) {
			System.out.println(gatos);
		}
		
	// Ordem Aleatoria
		
		System.out.println("-- Ordem Aleatoria --");
		Collections.shuffle(meusGatos);
		
		for(gato gatos : meusGatos) {
			System.out.println(gatos);
		}
		
	// Ordem Natural, tem que implemntar a interface cinoarable na classe gato
		System.out.println("-- Ordem Natural --");
		Collections.sort(meusGatos);
		
		for(gato gatos : meusGatos) {
			System.out.println(gatos);
		}
	}
	
	
}

