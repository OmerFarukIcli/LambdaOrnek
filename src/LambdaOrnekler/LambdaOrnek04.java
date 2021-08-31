package LambdaOrnekler;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaOrnek04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste =Arrays.asList("Omer","Ali","Asým","Mehmet","aydýn","celil","Sefa","fatih","Ayþe","Anýl");
		// Listedeki tüm karakterler 7 den küçükmü
		System.out.println(liste.stream().allMatch(t->t.length()<7));
		// Belirtilen harf ile baþlayan yokmu
		System.out.println(liste.stream().noneMatch(t->t.startsWith("Y")));
		// Herhangi harf ile biten varmý
		System.out.println(liste.stream().anyMatch(t->t.endsWith("r")));
		// Uzunluklara göre sýrala
		liste.stream().sorted(Comparator.comparing(t->t.length())).map(t->t+":"+t.length()).forEach(System.out::println);
		liste.stream().sorted(Comparator.comparing(String::length)).map(t->t+":"+t.length()).forEach(System.out::println);
		
	}

}
