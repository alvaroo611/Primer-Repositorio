package es.IESJandula.Alvaro_Marmol_Romero.Transparencia26;
import java.util.Scanner;
public class AMRCondicionales04 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double a,x,b,r;
		System.out.println("Digite el valor de a: ");
		a=sn.nextDouble();
		System.out.println("Digite el valor de b: ");
		b=sn.nextDouble();
		System.out.println("Digite el valor de x: ");	
		x=sn.nextDouble();
		r=a*x+b;
		System.out.println("El resultado de la ecuacion es: "+r);
		sn.close();
	}
}
