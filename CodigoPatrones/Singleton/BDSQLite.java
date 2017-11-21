public class BDSQLite extends BaseDatos{
	private static BaseDatos bd;
	private Connection conexion;
	@Override
	public void conectar(String direccion) {
		String driver = "org.sqlite.JDBC";
        String connectString = "jdbc:sqlite:"+direccion;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(connectString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}


	@Override
	public static BaseDatos getBaseDatos() {
		if(bd == null) {
			bd = new BFSQLite();
		}
		return bd;
	}
}
