package es.IESJandula.Alvaro_Marmol_Romero.transparencia37;

import java.util.Scanner;

public class AMRBucles03 {
	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		double suma,resta,multiplicacion,n1,n2,cont;
		int opciones;
		
		
		do{
			
			System.out.println("Digite un numero: ");
			n1=sn.nextDouble();
			System.out.println("Digite otro numero: ");
			n2=sn.nextDouble();
			do {
				cont=0;
				System.out.println("Que operacion quieres realizar:\n"
									+ "1 Suma\n"
									+ "2 Resta\n"
									+ "3 Multiplicacion\n"
									+ "4 Salir de la calculadora");
				opciones=sn.nextInt();
					
					
				if(opciones!=4)
				{
					switch(opciones)
					{
						case 1:
							suma=n1+n2;
							System.out.println(n1+" + "+n2+" = "+suma);
							break;
						case 2:
							if(n1>=n2) {
							resta=n1-n2;
							System.out.println(n1+" - "+n2+" = "+resta);
							}else if(n2>n1){
							resta=n2-n1;
							System.out.println(n2+" - "+n1+" = "+resta);
							}
							break;
						case 3:
							multiplicacion=n1*n2;
							System.out.println(n1+" + "+n2+" = "+multiplicacion);
						default:
							System.out.println("Opcion no valida");
							cont++;
					}
				
				}else {
						System.out.println("HASTA PRONTO!!");
						cont=2;
				}
		}while(cont==1);
	}while(cont!=2);
			
		
	sn.close();
		
	}
}
