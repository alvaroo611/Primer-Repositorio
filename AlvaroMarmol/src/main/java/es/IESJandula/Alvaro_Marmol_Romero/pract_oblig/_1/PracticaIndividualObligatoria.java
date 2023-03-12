package es.IESJandula.Alvaro_Marmol_Romero.pract_oblig._1;
import java.util.Scanner;
public class PracticaIndividualObligatoria {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double a,b,c;
		System.out.println("Digite el valor de a: ");
		a=sn.nextDouble();
		System.out.println("Digite el valor de b:");
		b=sn.nextDouble();
		System.out.println("Digite el valor de c: ");
		c=sn.nextDouble();
		if(a>0 && a<=150 && a%13==0 && a%11==0)
		{
			System.out.println("Tesoro 1 encontrado");
		}else if(a<=100 &&(b<=20 || b==c))
		{
			System.out.println("Tesoro 2 encontrado");
			
		}else if(c>0 && c<=1550 && c%7==0 && c%13==0 && c%17==0)
		{
			System.out.println("Tesoro 3 encontrado");
		}
		sn.close();
	}

}
