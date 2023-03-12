package es.IESJandula.Alvaro_Marmol_Romero.pract_oblig._1;

public class Depuracion2 {
	private	static String code1 =":@A=",code2=">;?<",code3="BC:@";
	public static void main(String[] args)
	{
		System.out.println();
	}
	public static void decrypter(String code)
	{
		for(int i=0;i<code.length();i++)
		{
			char charDecrypted=(char)(code.charAt(i)-10);
			System.out.println(charDecrypted);
		}
	}
}
