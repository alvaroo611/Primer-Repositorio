package es.IESJandula.Alvaro_Marmol_Romero.transparencia37;

import java.util.Scanner;

public class AMRBucles04 {

	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		int suma=0;
		for(int i=50;i<=300;i++)
		{
			suma+=i;
		}
		System.out.println("La suma de todos los numeros entre 50 y 300 es : "+suma);
		sn.close();
	}

}
