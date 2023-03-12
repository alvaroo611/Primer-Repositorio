package es.IESJandula.Alvaro_Marmol_Romero.transparencia9;

import java.util.Scanner;

public class AMRPrimerosPasosJava09 {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		double euros, pesetas;
		System.out.println("Conversor de euros a pesetas");
		//Introduce el numero de euros
		System.out.println("Digite un numero de euros: ");
		euros = sn.nextDouble();
		//Hacemos la conversion y lo mostramos en pantalla
		pesetas = euros * 166.386;
		System.out.println("El numero de euros introducidos convertido a pesetas son: " + pesetas);
		sn.close();
	}
}