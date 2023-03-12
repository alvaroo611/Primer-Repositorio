package es.IESJandula.Alvaro_Marmol_Romero.Transparencia27;
import java.util.Scanner;
public class AMRCondicionales09 {

	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		int n ,r;
		System.out.println("Digite un numero de 5 cifras como maximo: ");
		n=sn.nextInt();
		
		if(n<10 && n>-10)
		{
			System.out.println("La primera cifra de el numero es: "+n);
			
		}else if(n>=10 && n<100 || n<=-10 && n>-100) {
			r=n/10;
			System.out.println("La primera cifra de el numero es: "+r);
			
		}else if(n>=100 && n<1000 || n<=-100 && n>-1000 ) {
			r=n/100;
			System.out.println("La primera cifra de el numero es: "+r);
			
		}else if(n>=1000 && n<10000 || n<=-1000 && n>-10000 ) {
			r=n/=1000;
			System.out.println("La primera cifra de el numero es: "+r);
			
		}else if(n>=10000 && n<100000 || n<=-10000 && n>-100000 ) {
			r=n/=10000;
			System.out.println("La primera cifra de el numero es: "+r);	
		}else {
			System.out.println("El numero es mayor de 5 cifras ");
		}
		sn.close();

	}
}
