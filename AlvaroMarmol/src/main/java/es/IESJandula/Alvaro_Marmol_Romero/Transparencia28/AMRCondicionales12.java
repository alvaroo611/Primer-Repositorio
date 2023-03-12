package es.IESJandula.Alvaro_Marmol_Romero.Transparencia28;
import java.util.Scanner;
public class AMRCondicionales12 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double nota1,nota2,media;
		String recuperacion;
		System.out.println("Digite la nota de el primer examen :");
		nota1=sn.nextDouble();
		System.out.println("Digite la nota de el segundo examen: ");
		nota2=sn.nextDouble();
		media=(nota1+nota2)/2;
		if(media>=5)
		{
			System.out.println("La nota media de l trimestre es un "+media);
		}else {
			System.out.println("Cual ha sido el resultado de la recuperacion: ");
			recuperacion=sn.next();
			if(recuperacion.equals("apto"))
			{
				System.out.println("La nota media de el trimestre es un 5");
			}else if(recuperacion.equals("noapto"))
			{
				System.out.println("La nota media de el trimestre es "+media);
			}else {
				System.out.println("Debe introducir Apto o No Apto");
			}
		}
		sn.close();
	}

}
