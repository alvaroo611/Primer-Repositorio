package es.IESJandula.Alvaro_Marmol_Romero.Transparencia27;
import java.util.Scanner;
public class AMRCondicionales07 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n;
		System.out.println("Digite un numero: ");
		n=sn.nextInt();
		if(n%2==0)
		{
			System.out.println("El numero es par");
		}else{
			System.out.println("El numero es impar");
		}
		if(n%5==0)
		{
			System.out.println("El numero es divisible entre 5");
			
		}else {
			System.out.println("El numero no es divisible entre 5");
		}
		
		sn.close();
	}

}
