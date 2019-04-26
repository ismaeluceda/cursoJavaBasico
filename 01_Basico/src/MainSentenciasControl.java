
public class MainSentenciasControl {

	public static void main(String[] args) {

		// condicionales
		int numero = 10;
		if (numero > 10) {
			System.out.println("el numero es mayor que 10");
		} else if (numero < 10) {
			System.out.println("el numero es menor que 10");
		} else {
			System.out.println("el numero es 10");
		}
		
		//bucles
		for (int i=0;i<=10;i++) {
			System.out.println("bluce for -> " + i);
		}
		
		int numero2 = 0;
		while (numero2 <=10) {
			System.out.println("bucle while -> " + numero2);
			numero2++;
		}
		
		String diaSemana = "LUNES";
		switch (diaSemana) {
		case "LUNES":
			System.out.println("El dia de la semana es lunes");
			break;
			//la ejecucion continua hasta que encuentra un break
		case "MARTES":
			System.out.println("El dia de la semana es lunes");
			break;
		default:
			break;
		}
		
		//and -> &&
		//or -> ||
		//not -> !
	}
}
