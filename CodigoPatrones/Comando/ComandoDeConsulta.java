package control;

import vista.Aplicacion;

public class ComandoDeConsulta implements IComando{

	private Aplicacion app;
	
	public ComandoDeConsulta(Aplicacion aplicacion){
		this.app = aplicacion;
	}
	
	@Override
	public void ejecutar() {
		app.consultar();
	}

}
