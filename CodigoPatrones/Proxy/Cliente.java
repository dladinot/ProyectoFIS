package PatronProxy;
public class Cliente {
	public static void main(String[] arguments){
		BaseDatos bd= new ProxyBD();
		bd.conectar("F:\\FIS\\Proyecto FIS\\BaseDatos.sqlite");
		bd.guardar("INSERT INTO Clasificados\r\n" + 
				"VALUES (cla01, HorasMonitoria, Solicito estudiante..., 21/10/2017);");
		bd.conectar("SELECT * FROM Clasificados;");
	}
}


