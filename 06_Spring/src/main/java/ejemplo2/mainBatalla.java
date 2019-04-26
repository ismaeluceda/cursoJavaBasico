package ejemplo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainBatalla {

	private static ApplicationContext context = 
			new ClassPathXmlApplicationContext("beansGuerra.xml");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guerrero guerrero = new Guerrero();
		guerrero.setNombre("Aquiles");
		Espada espada = new Espada();
		espada.setTipo("larga");
		//inyectar la dependencia
		guerrero.setArma(espada);
		guerrero.atacar();
		
		Guerrero guerrero2 = context.getBean("guerrero", Guerrero.class);
		guerrero2.atacar();
		

	}

}
