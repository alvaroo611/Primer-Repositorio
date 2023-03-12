package es.IESJandula.Alvaro_Marmol_Romero.transparencia10;

import java.util.Scanner;

public class AMRPrimerosPasosJava11 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double nota1, nota2, notadeseada;
		//El usuario introduce los datos
		System.out.println("Que nota tienes en el primer examen: ");
		nota1 = sn.nextDouble();
		System.out.println("¿Que nota quieres sacar en el trimestre?");
		notadeseada = sn.nextDouble();
		//Hacemos la regla de tres para sacar la nota que tendriamos que sacar en el segundo examen
		nota1 = nota1 * 40 / 100;

		nota2 = (notadeseada - nota1) / 0.6;

		System.out.println("Necesitas sacar un " + nota2 + " para que la nota del trimestre sea un " + notadeseada);
		sn.close();

	}

}
