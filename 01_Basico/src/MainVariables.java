
public class MainVariables {

	public static void main(String[] args) {
		// 2 tipo de variables: primitivos y referencias

		//variables primitivas, el valor se guarda dentro de la variable
		int entero1 = 10;
		double reales = 23.24;
		long enterosGrandes = 10_000_000_000_000L;
		boolean verdadero = true;
		
		System.out.println(enterosGrandes);
	
		//variables de referencia, apuntan a objetos, lo que guarda es un puntero 
		String cadena = "Esto es una cadena de texto";
		cadena = cadena + " cadena aniadida";
		System.out.println(cadena);
	}

}
