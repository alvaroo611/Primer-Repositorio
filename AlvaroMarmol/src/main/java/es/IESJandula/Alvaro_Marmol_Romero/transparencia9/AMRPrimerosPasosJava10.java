package es.IESJandula.Alvaro_Marmol_Romero.transparencia9;

import java.util.Scanner;

public class AMRPrimerosPasosJava10 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int horastrabajadas;
		//Introduce las horas trabajadas
		System.out.println("Introduce las horas trabajadas esta semana: ");
		horastrabajadas = sn.nextInt();
		//Hacemos la cuenta para saber el salario a la semana
		horastrabajadas *= 12;
		System.out.println("Su salario en esta semana es de " + horastrabajadas + "â‚¬");
		sn.close();
	}

}
