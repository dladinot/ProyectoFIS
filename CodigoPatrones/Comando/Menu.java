package vista;

import control.IComando;

public class Menu {
	
	private IComando objComando;
	
	public Menu(IComando comando){
		this.objComando = comando;
	}
	
	public void correrMenu(){
		System.out.println("\t **** INTERFAZ DE LA APLICACION **** ");
		System.out.println("Pidiendo Datos del estudiante: ");
		objComando.ejecutar();
		System.out.println("Saliendo de la interfaz");
	}
}
