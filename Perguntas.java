package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Perguntas {

	public static void main(String[] args) {
		
		Collection<String> perguntas = new ArrayList();
		List<Integer> respostas = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		Integer resposta = 0;
		int cont = 0;
		int i = 0;
		int respostaTotal = 0;
		
		perguntas.add("1 - Telefonou para a vitima?");	
		perguntas.add("2 - Esteve no local do crime?");	
		perguntas.add("3 - Mora perto da vitima?");	
		perguntas.add("4 - Devia para a vitima?");	
		perguntas.add("5 - Ja trabalhou com a vitima?");
		
		System.out.println(" -- PERGUNTAS --");
		System.out.println("1 - SIM");
		System.out.println("2 - NAO");
		
		System.out.println(" ---------------");
		
		while( cont < 5) {
		
			 
				
				System.out.println(((ArrayList) perguntas).get(i));
				respostas.add(resposta = sc.nextInt());
				
				
				while(resposta != 1 && resposta != 2) {
					
					System.out.println("Resposta errada, digite somente 1 ou 2: ");
					respostas.add(resposta = sc.nextInt());
					
				}
					i++;
					
					if(resposta == 1) {
						respostaTotal++;
					}
					
		cont++;
		
		
			
		
		}
		
			
		
		
		if(respostaTotal == 2) {
			System.out.println("SUSPEITA");
		}else if(respostaTotal == 3 || respostaTotal == 4) {
			System.out.println("CUMPLICE");
		}else if(respostaTotal == 5){
			System.out.println("ASSASINO");
		}else {
			System.out.println("INOCENTE");
		}
		
		
		 
		
		
		
	}
}
