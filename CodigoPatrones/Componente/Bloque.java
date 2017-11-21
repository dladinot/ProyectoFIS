import java.util.ArrayList;

public class Bloque implements AClasificado{

	private ArrayList<AClasificado> clasificados = new ArrayList<AClasificado>();
	
	@Override
	public String listar() {
		String texto="";
		for(int i=0; i<clasificados.size();i++) {
			texto = clasificados.get(i).listar();
		}
		return texto;
	}
	public void agregar(AClasificado clasificado) {
		clasificados.add(clasificado);
	}
	public void remover(AClasificado clasificado) {
		clasificados.remove(clasificado);
	}
}
