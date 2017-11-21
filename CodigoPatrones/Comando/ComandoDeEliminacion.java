package control;

import vista.Aplicacion;

public class ComandoDeEliminacion implements IComando{

	private Aplicacion app;
	
	public ComandoDeEliminacion(Aplicacion aplicacion){
		this.app = aplicacion;
	}
	
	@Override
	public void ejecutar() {
		app.eliminar();
	}

}
