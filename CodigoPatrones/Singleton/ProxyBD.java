public class ProxyBD extends BaseDatos{
	
	private static ProxyBD proxy;
	private BDSQLite accesoBD =null;
	
	@Override
	public static BaseDatos getBaseDatos() {
		if(proxy == null) {
			proxy = new ProxyBD();
		}
		return proxy;
	}
}
