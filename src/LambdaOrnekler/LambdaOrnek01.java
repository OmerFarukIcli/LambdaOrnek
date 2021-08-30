package LambdaOrnekler;

import java.util.Arrays;
import java.util.List;

public class LambdaOrnek01 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,6,5,7,9,2,10,11);
		list.forEach(x->System.out.println(x));
		System.out.println("-----------------------");
		//elemanlarý iki artýr
		list.forEach(x->
		{
			int miktar=2;
			System.out.println(x+miktar+"  ");
		}
		);
		System.out.println("-----------------------");
		//Metot referansý Class Adi::Metot adi
		list.forEach(System.out::println);
		System.out.println("-----------------------");
		//Kendi metodum Class Adi::Metot adi
		list.forEach(LambdaOrnek01::yaz);
		

	}
	public static void yaz(int x)
	{
		System.out.println(x*10);
	}

}
