package es.IESJandula.Alvaro_Marmol_Romero.transparencia14;

import java.util.Scanner;

public class AMRVariablesJava02 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double euros, pesetas;
		System.out.println("Conversor de euros a pesetas");
		System.out.println("Digite un numero de euros: ");
		euros = sn.nextDouble();
		pesetas = euros * 166.386;
		System.out.println("El numero de euros introducidos convertido a pesetas son: " + pesetas);
		sn.close();
	}

}
