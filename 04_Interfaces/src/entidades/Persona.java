package entidades;

public class Persona implements Movible{
	private String nombre;
	private int edad;
	private int posicion;
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	@Override
	public void moverseLento() {
		// TODO Auto-generated method stub
		System.out.println("Soy " + nombre + " y me muevo 1 metro");
		posicion +=1;
		
	}
	@Override
	public void moverseRapido() {
		// TODO Auto-generated method stub
		System.out.println("Soy " + nombre + " y me muevo 10 metro");
		posicion +=10;
	}
	@Override
	public int moverse(int metros) {
		// TODO Auto-generated method stub
		System.out.println("Soy " + nombre + " y me muevo " + metros + " metros");
		posicion +=10;
		return posicion;
	}

}
