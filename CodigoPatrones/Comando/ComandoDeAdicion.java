package control;

import vista.Aplicacion;

public class ComandoDeAdicion implements IComando{

	private Aplicacion app;
	
	public ComandoDeAdicion(Aplicacion aplicacion){
		this.app = aplicacion;
	}
	
	@Override
	public void ejecutar() {
		app.adicionar();
	}

}
