package LambdaOrnekler;

import java.util.Arrays;
import java.util.List;

public class LambdaOrnek03 {

	public static void main(String[] args) {
		List<String> liste =Arrays.asList("Omer","Ali","Asým","Mehmet","aydýn","celil","Sefa","fatih","Ayþe","Anýl");
		 // a ilebaþlayanlar
liste.stream().filter(harf->harf.startsWith("A")).forEach(System.out::println);
System.out.println("<------------------------------------------------------->");
// Büyük harfe çevir A ile baþlayanlarý getir
liste.stream().map(h->h.toUpperCase()).filter(harf->harf.startsWith("A")).forEach(System.out::println);
	}

}
