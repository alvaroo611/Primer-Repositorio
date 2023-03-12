package es.IESJandula.Alvaro_Marmol_Romero.Transparencia26;

import java.util.Scanner;

public class AMRCondicionales01 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int dia;
		System.out.println("Digite un dia de la semana: \n" 
						+ " 1 Lunes    \n" 
						+ " 2 Martes   \n" 
						+ " 3 Miercoles\n"
						+ " 4 Jueves   \n" 
						+ " 5 Viernes    ");
			dia=sn.nextInt();
			switch(dia)
			{
				case 1:
					System.out.println("A primera hora hay clase de base de datos");
					break;
				case 2:
					System.out.println("A primera hora hay clase de programacion");
					break;

				case 3:
					System.out.println("A primera hora hay clase de sistemas informaticos");
					break;

				case 4:
					System.out.println("A primera hora hay clase de formacion y orentacion laboral");
					break;

				case 5:
					System.out.println("A primera hora hay clase de programacion");
					break;
				default:
					System.out.println("Has introducido una opcion incorrecta");
					
			}
			sn.close();
	}

}
