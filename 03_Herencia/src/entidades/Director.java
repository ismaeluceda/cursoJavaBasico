package entidades;

import java.util.ArrayList;

public class Director extends Empleado {
	
	private ArrayList<Empleado> listaEmpleados;
	
	public Director() {
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	@Override
	public double calcularSueldo() {
		double sueldo = getNomina() + (listaEmpleados.size() * 50);
		return sueldo;
	}

}
