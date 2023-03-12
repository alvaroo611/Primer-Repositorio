package es.IESJandula.Alvaro_Marmol_Romero.Transparencia45;

import java.util.Scanner;

public class AMRBucles08 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int x,y,i,cont=0,resto;
		System.out.println("Digite el valor de x: ");
		x=sn.nextInt();
		System.out.println("Digite el valor de y: ");
		y=sn.nextInt();
		for( i=y;i<=x;i+=y)
		{
			
			cont++;
			
		}
		resto=x-(i-y);
		System.out.println("El cociente de la division es: "+cont);
		System.out.println("El resto de la division es: "+resto);
		sn.close();
	}

}

	