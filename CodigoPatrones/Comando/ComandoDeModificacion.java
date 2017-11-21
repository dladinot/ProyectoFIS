package control;

import vista.Aplicacion;

public class ComandoDeModificacion implements IComando{

	private Aplicacion app;
	
	public ComandoDeModificacion(Aplicacion aplicacion) {
		this.app = aplicacion;
	}
	
	@Override
	public void ejecutar() {
		app.modificar();
	}

}
