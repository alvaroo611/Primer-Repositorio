package es.IESJandula.Alvaro_Marmol_Romero.transparencia37;
import java.util.Scanner;
public class AMRBucles01 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n;
		System.out.println("Digite un numero:");
		n=sn.nextInt();
		for(int i=1; i<=n;i++)
		{
			System.out.println("*");
		}
		sn.close();
	}

}
