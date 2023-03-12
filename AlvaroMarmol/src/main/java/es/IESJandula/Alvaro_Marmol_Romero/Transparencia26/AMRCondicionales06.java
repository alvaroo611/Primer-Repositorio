package es.IESJandula.Alvaro_Marmol_Romero.Transparencia26;
import java.util.Scanner;
public class AMRCondicionales06 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int a,b,c,opciones;
		System.out.println("Digite el valor de a: ");
		a=sn.nextInt();
		System.out.println("Digite el valor de b: ");
		b=sn.nextInt();
		System.out.println("Digite el valor de c: ");
		c=sn.nextInt();
		System.out.println("En que orden quieres ordenar los numeros: \n"
				+ "1 Mayor a menor\n"
				+ "2 Menor a mayor");
		opciones=sn.nextInt();
				
		switch(opciones)
		{
			case 1:
				if(a>=b && b>=c)
				{
					System.out.println(a+"\n"+
									   b+"\n"+
									   c+"");
				}
				if(a>=b && c>=b)
				{
					System.out.println(a+"\n"+
									   c+"\n"+
									   b+"");
				}
				if(b>=c && c>=a)
				{
					System.out.println(b+"\n"+
									   c+"\n"+
									   a+"");
				}
				if(b>=a && a>=c)
				{
					System.out.println(b+"\n"+
									   a+"\n"+
									   c+"");
				}
				if(c>=b && b>=a)
				{
					System.out.println(c+"\n"+
									   b+"\n"+
									   a+"");
				}
				if(c>=a && a>=b)
				{
					System.out.println(c+"\n"+
									   a+"\n"+
									   b+"");
				}
				break;
			case 2:
				if(a<=b && b<=c)
				{
					System.out.println(a+"\n"+
									   b+"\n"+
									   c+"");
				}
				if(a<=b && c<=b)
				{
					System.out.println(a+"\n"+
									   c+"\n"+
									   b+"");
				}
				if(b<=c && c<=a)
				{
					System.out.println(b+"\n"+
									   c+"\n"+
									   a+"");
				}
				if(b<=a && a<=c)
				{
					System.out.println(b+"\n"+
									   a+"\n"+
									   c+"");
				}
				if(c<=b && b<=a)
				{
					System.out.println(c+"\n"+
									   b+"\n"+
									   a+"");
				}
				if(c<=a && a<=b)
				{
					System.out.println(c+"\n"+
									   a+"\n"+
									   b+"");
				}
				



		}
		sn.close();
	}

}
