package es.IESJandula.Alvaro_Marmol_Romero.transparencia9;

import java.util.Scanner;

public class AMRPrimerosPasosJava08 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double x, z, suma, resta, division, multiplicacion, resto, potencia, rxy, rx, ry;
		System.out.println("Digite el valor de X: ");
		x = sn.nextDouble();
		System.out.println("Digite el valor de Z");
		z = sn.nextDouble();
		suma = x + z;
		resta = x - z;
		division = x / z;
		multiplicacion = x * z;
		resto = x % z;
		potencia = Math.pow(x, z);
		rx = Math.sqrt(x);
		ry = Math.sqrt(z);
		rxy = rx + ry;
		System.out.println("El resultado de la suma de X y Z es = " + suma);
		System.out.println("El resultado de la resta de X y Z es = " + resta);
		System.out.println("El resultado de la multiplicacion de X y Z es = " + multiplicacion);
		System.out.println("El resultado de la division de X y Z es = " + division);
		System.out.println("El resultado de el resto de X y Z es = " + resto);
		System.out.println("El resultado de la potencia de X elevado a Z es = " + potencia);
		System.out.println("El resultado de la suma de la raiz cuadrada de X y la raiz cuadrada de Z es = " + rxy);
		sn.close();

		}

}
