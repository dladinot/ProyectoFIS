package patronFachada;
import java.io.*;

public class HorasMonitoria implements IMonitoria{
	int opcionElegida;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	@Override
	public void administrarMonitoria() {
		
		System.out.println("Horas de Monitoria"
				+ "Que desea hacer?\n"
				+ "1)Consultar horas\n"
				+ "2)Registrar horas\n");
		
		try {
			opcionElegida=Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		switch(opcionElegida) {
		case 1:
			consultarHoras();
			break;
		case 2:
			registrarHoras();
			break;
		default:
			System.out.println("Ingrese una opcion valida");
		}
		
	}
	public void consultarHoras() {
		System.out.println("Usted esta siendo redireccionado"
				+ " al modulo de consulta de horas");
		
	}
	public void registrarHoras() {
		System.out.println("Usted esta siendo redireccionado"
				+ " al modulo de registro de horas");
	}

}

