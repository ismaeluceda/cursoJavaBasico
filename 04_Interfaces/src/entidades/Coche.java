package entidades;

public class Coche implements Movible{
	private String matricula;
	private String marca;
	private int posicion;
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", Marca=" + marca + "]";
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public void moverseLento() {
		// TODO Auto-generated method stub
		System.out.println("Soy el coche" + matricula + " y me muevo 5 metro");
		posicion +=5;
		
	}
	@Override
	public void moverseRapido() {
		// TODO Auto-generated method stub
		System.out.println("Soy el coche" + matricula + " y me muevo 50 metro");
		posicion +=50;
	}
	@Override
	public int moverse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("Soy el coche" + matricula + " y me muevo " + metros + " metros");
		posicion +=10;
		return posicion;
	}

}
