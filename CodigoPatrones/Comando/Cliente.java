package launcher;

import vista.Aplicacion;
import vista.Menu;
import control.ComandoDeAdicion;
import control.ComandoDeConsulta;
import control.IComando;

public class Cliente {

	public static void main(String[] args) {
		Aplicacion interfaz = new Aplicacion();
		IComando miComando = new ComandoDeConsulta(interfaz);
		Menu ventanaGUI = new Menu(miComando);
		ventanaGUI.correrMenu();
		miComando = new ComandoDeAdicion(interfaz);
		ventanaGUI.correrMenu();
	}

}
