package patronFachada;
import java.io.*;

public class Clasificados implements IMonitoria{
	int opcionElegida;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	@Override
	public void administrarMonitoria() {
		
		System.out.println("Clasificados"
				+ "Que desea hacer?\n"
				+ "1)Consultar clasificado\n"
				+ "2)Publicar nuevo clasificado\n");
		
		try {
			opcionElegida=Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		switch(opcionElegida) {
		case 1:
			consultarClasificado();
			break;
		case 2:
			publicarClasificado();
			break;
		default:
			System.out.println("Ingrese una opcion valida");
		}
		
	}
	public void consultarClasificado() {
		System.out.println("Usted esta siendo redireccionado"
				+ " al modulo de consulta de clasificados");
		
	}
	public void publicarClasificado() {
		System.out.println("Usted esta siendo redireccionado"
				+ " al modulo de publicacion de clasificados");
	}

}
