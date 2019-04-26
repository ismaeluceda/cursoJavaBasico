package ejemplo2;

public abstract class Arma {

	private String tipo;
	
	public abstract void usar(); 
	
	public Arma() {
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
