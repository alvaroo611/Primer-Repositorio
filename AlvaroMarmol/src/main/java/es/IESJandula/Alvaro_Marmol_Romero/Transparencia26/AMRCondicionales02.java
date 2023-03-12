package es.IESJandula.Alvaro_Marmol_Romero.Transparencia26;
import java.util.Scanner;
public class AMRCondicionales02 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);	
		int hora;
		System.out.println("Digite una hora por teclado: ");
		hora=sn.nextInt();
		if(hora>=6 && hora<=12)
		{
			System.out.println("Buenos dias");
		}else if(hora>=13 && hora<=20)
		{
			System.out.println("Buenas tardes");
			
		}else if(hora>=21 && hora<=23 || hora>=0 && hora<=5)
		{
			System.out.println("Buenas noches");
		}else {
			System.out.println("ERROR");
		}
		sn.close();
	}

}
