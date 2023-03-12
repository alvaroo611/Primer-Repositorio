package es.IESJandula.Alvaro_Marmol_Romero.Transparencia27;
import java.util.Scanner;
public class AMRCondicionales08 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n,resto;
		System.out.println("Digite un numero: ");
		n=sn.nextInt();
		resto=n%10;
		System.out.println("La ultima cifra de el numero introducido es: "+resto);
		sn.close();

	}

}
