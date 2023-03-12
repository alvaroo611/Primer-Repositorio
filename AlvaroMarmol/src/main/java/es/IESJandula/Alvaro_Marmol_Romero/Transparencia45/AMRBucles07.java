package es.IESJandula.Alvaro_Marmol_Romero.Transparencia45;
import java.util.Scanner;
public class AMRBucles07 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int x,y;
		System.out.println("Digite el valor de x: ");
		x=sn.nextInt();
		final int N=x;
		System.out.println("Digite el valor de y: ");
		y=sn.nextInt();
		for(int i=1;i<y;i++)
		{
			x+=N;
		}
		System.out.println("El resultado de la multiplicacion es: "+x);
		sn.close();
	}

}
