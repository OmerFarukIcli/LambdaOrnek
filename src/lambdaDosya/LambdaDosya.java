package lambdaDosya;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class LambdaDosya {

	public static void main(String[] args) throws IOException {
		String path = "src/lambdaDosya/odv.txt";
        Stream<String> satirlar = Files.lines(Path.of(path));
        satirlar.forEach(System.out::println);
        System.out.println("============================================================");

        // Bir dosyadan okunan satırları büyük harf olarak konsola yazdıralım.
        Files.lines(Paths.get(path)).map(String::toUpperCase).forEach(System.out::println);
	}

}
