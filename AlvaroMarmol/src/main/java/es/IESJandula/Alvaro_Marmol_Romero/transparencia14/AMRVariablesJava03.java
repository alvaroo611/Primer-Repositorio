package es.IESJandula.Alvaro_Marmol_Romero.transparencia14;

import java.util.Scanner;

public class AMRVariablesJava03 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double factura, facturaiva;
		final double IVA = 0.21;
		System.out.println("Digite el precio de la factura: ");
		factura = sn.nextDouble();
		facturaiva = (factura * IVA) + factura;
		System.out.println("La factura con iva es :" + facturaiva);
		sn.close();

	}
}
