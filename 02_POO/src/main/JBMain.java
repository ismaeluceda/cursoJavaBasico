package main;

import javabeans.Persona;

public class JBMain {

	public static void main(String[] args) {
		Persona p = new Persona("Luka", 48, 70.8);
		p.setEdad(-78);
		System.out.println(p.getEdad());
		System.out.println(p.toString());

	}

}
