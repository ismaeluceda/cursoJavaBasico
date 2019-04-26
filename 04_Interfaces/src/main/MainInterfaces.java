package main;

import java.util.ArrayList;

import entidades.Coche;
import entidades.Movible;
import entidades.Persona;

public class MainInterfaces {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setNombre("Silvestre");
		p1.setEdad(10);
		
		Coche c1 = new Coche();
		c1.setMarca("Renault");
		c1.setMatricula("2444 GZS");
		
		Persona p2 = new Persona();
		p2.setNombre("Piolin");
		p2.setEdad(15);
		
		Coche c2 = new Coche();
		c2.setMarca("Toyota");
		c2.setMatricula("1234 ABC");
		
		ArrayList<Movible> carrera = new ArrayList<>();
		carrera.add(p1);
		carrera.add(p2);
		carrera.add(c1);
		carrera.add(c2);
		
		for (Movible participante : carrera) {
			participante.moverseRapido();
		}
		
	}

}
