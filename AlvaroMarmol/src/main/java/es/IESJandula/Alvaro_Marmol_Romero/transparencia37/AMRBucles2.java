package es.IESJandula.Alvaro_Marmol_Romero.transparencia37;
import java.util.Scanner;
public class AMRBucles2 {

	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		int n,opcion=0;
		n=(int) (Math.random()*10+1);
		System.out.println("Se ha generado un numero aleatorio adivinalo");
		while(opcion!=n)
		{
			
			System.out.println("DIGITE UN NUMERO");
			opcion=sn.nextInt();
			if(opcion!=n)
			{
				System.out.println("El numero introducido es incorrecto");
			}
		}
		System.out.println("El numero es correcto");
		sn.close();
	}
	

}
