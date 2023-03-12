package es.IESJandula.Alvaro_Marmol_Romero.transparencia9;

import java.util.Scanner;

public class AMRPrimerosPasosJava06 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int a, b, c, r;
		//Pedimos los datos a el usuario
		System.out.println("Digite el valor de a:");
		a = sn.nextInt();
		System.out.println("Digite el valor de b:");
		b = sn.nextInt();
		System.out.println("Digite el valor de c:");
		c = sn.nextInt();
		//Hacemos la multiplicacion de los numeros y mostramos el resultado
		r = a * b * c;
		System.out.println("El resultado es " + r);

		sn.close();

	}

}
