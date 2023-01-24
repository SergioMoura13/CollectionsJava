package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class temperaturaMedia {

	public static void main(String[] args) {

		int cont = 1;
		double media;
		double soma = 0;
		double qtd = 0;
		double somaMedia;
		double next;
		
		List<Double> mediaTemperatura = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		while(cont <= 6) {
			System.out.println("Digite a temperatura do " +cont+ " mes: ");
			mediaTemperatura.add( media = sc.nextDouble());
			cont++;
		}
		
		System.out.println("\t-- Temperaturas --" );
		System.out.println(mediaTemperatura);
		
		java.util.Iterator<Double> med = mediaTemperatura.iterator();
		while(med.hasNext()) {
			soma += med.next();
			qtd++;
		}
		
		somaMedia = soma/qtd;
		
		System.out.println("A media das temperaturas e: " + somaMedia);
		
		java.util.Iterator<Double> acimaMedia = mediaTemperatura.iterator();
		
		while(acimaMedia.hasNext()) {
			next = acimaMedia.next();
			if(next < somaMedia) acimaMedia.remove();
		}
		
		System.out.println("Temperaturas acima da media: " + mediaTemperatura);
			
	}

}
