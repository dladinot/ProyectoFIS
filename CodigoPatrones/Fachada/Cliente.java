package patronFachada;
import java.io.*;
public class Cliente {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int opcionElegida;
		Logueo login =new Logueo();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bienvenido al sistema de gestion de monitorias\n"
				+ "Que desea hacer?\n"
				+ "1)Administrar horas\n"
				+ "2)Ir a clasificados\n"
				+ "3)Ver perfil\n"
				+ "4)Consultar horario\n"
				+ "5)Cerrar sesion");
		opcionElegida=Integer.parseInt(in.readLine());
		switch(opcionElegida) {
		case 1:
			System.out.println("Redirigiendo al subsistema HorasMonitoria");
			HorasMonitoria horas =new HorasMonitoria();
			horas.administrarMonitoria();
			break;
		case 2:
			System.out.println("Redirigiendo al subsistema Clasificados");
			Clasificados clasificado =new Clasificados();
			clasificado.administrarMonitoria();
			break;
		case 3:
			System.out.println("Redirigiendo al subsistema usuario");
			Usuario user =new Usuario();
			user.administrarMonitoria();
			break;
		case 4:
			System.out.println("Redirigiendo al subsistema horarios");
			Horarios horario =new Horarios();
			horario.administrarMonitoria();
		case 5:
			System.out.println("Saliendo del sistema...");
			login.iniciarSesion();
		}
		
	}

}
