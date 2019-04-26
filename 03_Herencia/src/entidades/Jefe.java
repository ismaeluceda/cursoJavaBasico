package entidades;

public class Jefe extends Empleado {
	private double incentivos;

	public Jefe() {
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public double calcularSueldo() {
		// nomina mas los incentivos
		return getNomina() + incentivos;
	}

	@Override
	public String toString() {
		return "Jefe [incentivos=" + incentivos + ", getNombre()=" + getNombre() + ", getDni()=" + getDni()
				+ ", getNomina()=" + getNomina() + "]";
	}

}
