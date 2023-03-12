package es.IESJandula.Alvaro_Marmol_Romero.Transparencia27;

import java.util.Scanner;

public class AMRCondicionales10 {
	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		int n ;
		System.out.println("Digite un numero de 5 cifras como maximo: ");
		n=sn.nextInt();
		
		if(n<10 && n>-10)
		{
			System.out.println("El numero "+n+" tiene 1 digito");
			
		}else if(n>=10 && n<100 || n<=-10 && n>-100) {
			
			System.out.println("El numero "+n+" tiene 2 digitos");
			
		}else if(n>=100 && n<1000 || n<=-100 && n>-1000 ) {
			
			System.out.println("El numero "+n+" tiene 3 digitos" );
			
		}else if(n>=1000 && n<10000 || n<=-1000 && n>-10000 ) {
		
			System.out.println("El numero "+n+" tiene 4 digitos ");
			
		}else if(n>=10000 && n<100000 || n<=-10000 && n>-100000 ) {
		
			System.out.println("El numero "+n+" tiene 5 digitos");	
		}else {
			System.out.println("ERROR: El numero es mayor de 5 digitos ");
		}
		sn.close();

	}	}