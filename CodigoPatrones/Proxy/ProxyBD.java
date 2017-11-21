package PatronProxy;
public class ProxyBD extends BaseDatos{
	
	private BDSQLite accesoBD =null;
	
	@Override
	public void conectar(String direccion) {
		if(accesoBD!=null){
			accesoBD.conectar(direccion);
		}
		else{
			accesoBD= new BDSQLite();
			accesoBD.conectar(direccion);
		}
	}
	@Override
	public void consultar(String comandoSQL) {
		if(accesoBD!=null){
			accesoBD.consultar(comandoSQL);
		}
		else{
			accesoBD= new BDSQLite();
			accesoBD.consultar(comandoSQL);
		}
	}
	@Override
	public void guardar(String comandoSQL) {
		if(accesoBD!=null){
			accesoBD.guardar(comandoSQL);
		}
		else{
			accesoBD= new BDSQLite();
			accesoBD.guardar(comandoSQL);
		}
	}
	@Override
	public void desconectar() {
		if(accesoBD!=null){
			accesoBD.desconectar();
		}
		else{
			accesoBD= new BDSQLite();
			accesoBD.desconectar();
		}
	}

}


