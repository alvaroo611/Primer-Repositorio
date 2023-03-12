package es.IESJandula.Alvaro_Marmol_Romero.Transparencia45;

import java.util.Scanner;

public class AMRBucles06 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n,exp;
		
		System.out.println("Digite un numero");
		n=sn.nextInt();
		final int n2=n;
		System.out.println("Digite a que exponente lo quieres elevar: ");
		exp=sn.nextInt();
		for(int i=2;i<=exp;i++)
		{

			n*=n2;
		}
		System.out.println("El resultado es: "+n);
		sn.close();
	}
}
