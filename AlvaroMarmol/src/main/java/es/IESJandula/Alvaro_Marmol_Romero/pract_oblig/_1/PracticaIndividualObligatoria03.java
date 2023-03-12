package es.IESJandula.Alvaro_Marmol_Romero.pract_oblig._1;

public class PracticaIndividualObligatoria03 {

	public static void aperturaDeCompuerta()
	{
		System.out.println("Apertura de compuerta realizada");
	}
	public static void main(String[] args) {
		String usuario="Ninguno";
		String password="Ninguna";
		boolean accesoSistema=false;
		if(usuario.equals("usuarioSecreto")&& password.equals("contraseñaSecreta"))
		{
			accesoSistema=true;
			System.out.println("Acceso al sistema realizado");
		}else{
			System.out.println("Aviso al personal de vigilancia");
		}
		boolean accesoAlNumeroSecreto=false;
		if(accesoSistema)
		{
			int numeroSecreto=10;
			if(numeroSecreto==20)
			{
				accesoAlNumeroSecreto=true;
			}
		}

	}

}
