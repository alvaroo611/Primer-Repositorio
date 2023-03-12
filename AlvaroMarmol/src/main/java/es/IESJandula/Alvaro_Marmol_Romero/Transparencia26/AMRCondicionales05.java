package es.IESJandula.Alvaro_Marmol_Romero.Transparencia26;
import java.util.Scanner;
public class AMRCondicionales05 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int h,min,s,medianoche=24,restomin;
		System.out.println("Digite una hora:\n"
				+ "Digite la hora que es:");
		h=sn.nextInt();
		System.out.println("Digite los minutos de la hora introducida:");
		min=sn.nextInt();
		
		restomin=min*60;
		
		s=((medianoche-h)*3600)-restomin;
		
		System.out.println("Faltan "+s+" segundos para llegar a medianoche");
			
		sn.close();
		

	}

}
