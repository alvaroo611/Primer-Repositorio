package es.IESJandula.Alvaro_Marmol_Romero.transparencia9;

import java.util.Scanner;

public class AMRPrimerosPasosJava07 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double fx, x2, x;
		// Pedimos los datos a el usario
		System.out.println("Digite el valor de x para hacer ");
		x = sn.nextDouble();
		// Elevamos el numero introducido al cuadrado
		x2 = Math.pow(x, 2);
		// Hacemos la ecuacion y lo mostramos por pantalla
		fx = x2 + x + 1;
		System.out.println("El resultado de F(X)=X^2+X+1 es= " + fx);
		sn.close();
	}

}