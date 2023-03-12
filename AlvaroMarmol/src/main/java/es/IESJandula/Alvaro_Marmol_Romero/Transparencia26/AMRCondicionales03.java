package es.IESJandula.Alvaro_Marmol_Romero.Transparencia26;

import java.util.Scanner;

public class AMRCondicionales03 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int dia;
		System.out.println("Digite un numero de el 1 al 7: ");
			dia=sn.nextInt();
			switch(dia)
			{
				case 1:
					System.out.println("Lunes");
					break;
				case 2:
					System.out.println("Martes");
					break;

				case 3:
					System.out.println("Miercoles");
					break;

				case 4:
					System.out.println("Jueves");
					break;

				case 5:
					System.out.println("Viernes");
					break;
				case 6:
					System.out.println("Sabado");
					break;
				case 7:
					System.out.println("Domingo");
					break;
					
				default:
					System.out.println("Has introducido una opcion incorrecta");
					
			}
			sn.close();
	}		
}
