package LambdaOrnekler;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaOrnek02 {

	public static void main(String[] args) {
		List<Integer> liste =Arrays.asList(3,11,5,11,12,25,44,11,-5,11);
		
		// Tek sayýlarý göster
		liste.stream().filter(x->x%2!=0).forEach(System.out::println);
		System.out.println("<----------------------------------->");
		// Cift sayýlarý göster
		liste.stream().filter(LambdaOrnek02::tekmi).forEach(System.out::println);
		System.out.println("<----------------------------------->");
		// Tek sayýlarýn karesi göster ve tekrarsýz
		liste.stream().filter(x->x%2!=0).distinct().map(LambdaOrnek02::kare).forEach(System.out::println);
		System.out.println("<----------------------------------->");
		// Toplamý
		System.out.println(liste.stream().filter(x->x%2!=0).distinct().map(LambdaOrnek02::kare).reduce(0,(x,y)->(x+y)));
		System.out.println("<----------------------------------->");
		// Buyuk bul
		System.out.println(liste.stream().reduce(0,Math::max));
		System.out.println("<----------------------------------->");
		// Kaç 11 var
		System.out.println(liste.stream().filter(x->x==11).count());
		System.out.println("<----------------------------------->");
		// 11 den büyükleri liste olarak kayxet
		System.out.println(liste.stream().filter(x->x>11).collect(Collectors.toList()));
		System.out.println("<----------------------------------->");
		// Tersten liste olrak kaydet
		System.out.println(liste.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList()));
		
	}
	private static boolean tekmi(int x)
	{
		return x%2==0;
	}
	private static int kare(int sayi)
	{
		return sayi*sayi;
	}

}
