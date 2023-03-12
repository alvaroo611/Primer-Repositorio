package es.IESJandula.Alvaro_Marmol_Romero.Transparencia27;

import java.util.Scanner;

public class AMRCondicionales11 {
	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		int n,r,r2 ;
		System.out.println("Digite un numero de 5 cifras como maximo: ");
		n=sn.nextInt();
		
		if(n<10 && n>-10)
		{
			System.out.println("El numero "+n+" es capicua");
			
			
		}else if(n>=10 && n<100 || n<=-10 && n>-100) {
			r=n/10;
		
			n%=10;
			if(n==r) {
				System.out.println("El numero "+n+" es capicua");
			}else {
				System.out.println("El numero "+n+" no es capicua");
			}
			
		}else if(n>=100 && n<1000 || n<=-100 && n>-1000 ) {
			r=n/100;
			n%=10;
			if(n==r) {
				System.out.println("El numero "+n+" es capicua");
			}else {
				System.out.println("El numero "+n+" no es capicua");
			}
			
			
		}else if(n>=1000 && n<10000 || n<=-1000 && n>-10000 ) {
			r=n/100;
			r2=n%100;
			
			if(r2==r) {
				System.out.println("El numero "+n+" es capicua");
			}else {
				System.out.println("El numero "+n+" no es capicua");
			}
			
			
		}else if(n>=10000 && n<100000 || n<=-10000 && n>-100000 ) {
			r=n/1000;
			r2=n%100;
			
			if(r2==r) {
				System.out.println("El numero "+n+" es capicua");
			}else {
				System.out.println("El numero "+n+" no es capicua");
			}
				
		}else {
			System.out.println("ERROR: El numero es mayor de 5 digitos ");
		}
		sn.close();
	}
}
