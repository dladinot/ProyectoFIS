package PatronProxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class BDSQLite extends BaseDatos{
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
	public void consultar(String comandoSQL) {
		try {
			Statement stmt = conexion.createStatement();
			ResultSet rs = stmt.executeQuery(comandoSQL);
			ResultSetMetaData rsmd = rs.getMetaData();
            int numeroColumna = rsmd.getColumnCount();                     
            while (rs.next()) {         
            for(int i = 1 ; i <= numeroColumna; i++){
                  System.out.print(rs.getString(i) + " ");
            }
              System.out.println();           
            }
			stmt.close();
			desconectar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	@Override
	public void guardar(String comandoSQL) {
		 try {
	         Statement stmt = conexion.createStatement();
	         stmt.executeUpdate (comandoSQL);   
	         stmt.close();
	         desconectar();
	        } catch (Exception e) {
	        	JOptionPane.showMessageDialog(null, e.getMessage());
	        }
	}

	@Override
	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException e) {	
			System.out.println(e.getMessage());
		}
	}

}


