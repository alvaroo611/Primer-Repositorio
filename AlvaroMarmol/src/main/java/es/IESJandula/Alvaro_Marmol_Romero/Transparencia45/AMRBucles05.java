package es.IESJandula.Alvaro_Marmol_Romero.Transparencia45;
import java.util.Scanner;
public class AMRBucles05 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n,factorial=1;
		System.out.println("Digite el valor de el numero");
		n=sn.nextInt();
		for(int i=n;i>=1;i--)
		{
			factorial=factorial*i;
			
		}
		System.out.println("El numero convertido a factorial es: "+factorial);
		sn.close();

	}

}
