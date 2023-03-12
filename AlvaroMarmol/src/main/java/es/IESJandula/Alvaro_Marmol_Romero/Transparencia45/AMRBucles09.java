package es.IESJandula.Alvaro_Marmol_Romero.Transparencia45;
import java.util.Scanner;
public class AMRBucles09 {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int altura;
		System.out.println("Que altura quieres que tenga el triangulo");
		altura=sn.nextInt();
		for(int i=1;i<=altura;i++)
		{
			for(int j=i;j<=altura;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
		sn.close();
		
	}

}
