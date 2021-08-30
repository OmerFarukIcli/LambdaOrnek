package LambdaOrnekler;

import java.util.Arrays;
import java.util.List;

public class LambdaOrnek03 {

	public static void main(String[] args) {
		List<String> liste =Arrays.asList("Omer","Ali","As�m","Mehmet","ayd�n","celil","Sefa","fatih","Ay�e","An�l");
		 // a ileba�layanlar
liste.stream().filter(harf->harf.startsWith("A")).forEach(System.out::println);
System.out.println("<------------------------------------------------------->");
// B�y�k harfe �evir A ile ba�layanlar� getir
liste.stream().map(h->h.toUpperCase()).filter(harf->harf.startsWith("A")).forEach(System.out::println);
	}

}
