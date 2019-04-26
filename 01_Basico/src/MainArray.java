
public class MainArray {

	public static void main(String[] args) {
		
		int[] arrayNumeros = new int[5];
		//este tipo de arrays son arrays estaticos, una vez inicializado el array
		//a un tamano siempre sera ese tamano
		arrayNumeros[0] = 23;
		arrayNumeros[1] = 45;
		
		for (int i=0; i < arrayNumeros.length;i++) {
			System.out.println(arrayNumeros[i]);
		}
		
		for (int i : arrayNumeros) {
			System.out.println(i);
		}
	}

}
