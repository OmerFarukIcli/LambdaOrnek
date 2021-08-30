package lamdaInterface;
 
@FunctionalInterface
interface MesajVer
{
	void Merhaba(String str);
	default void yaz()
	{
		System.out.print("Normal");
	}
}

public class lambda {

	public static void main(String[] args) {
		 MesajVer msg=(mesaj)->System.out.println("Interface "+mesaj);
		 msg.Merhaba("Parametre");
		 msg.yaz();
		

	}

	

}
