
public class Clasificado implements AClasificado{
	
	private String autor;
	private String info;
	private String mensaje;
	
	public Clasificado(String a, String i, String m) {
		this.autor = a;
		this.info = i;
		this.mensaje = m;
	}
	
	public String visualizar() {
		String texto="";
		texto += "Autor: "+autor;
		texto += "Informacion: "+info;
		texto += mensaje;
		return texto;
	}
	@Override
	public String listar() {
		return visualizar();
	}

}
