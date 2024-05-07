package tienda.modelo;

public class Empleado {
	
	private String codEmpleado;
	private String nombreEmpleado;
	private String dni;
	private String tipoEmpleado;
	private double sueldo;
	private String turno;
	
	public Empleado(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno) {
		this.nombreEmpleado = nombreEmpleado;
		this.dni = dni;
		this.tipoEmpleado = tipoEmpleado;
		this.sueldo = sueldo;
		this.turno = turno;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", dni=" + dni
				+ ", tipoEmpleado=" + tipoEmpleado + ", sueldo=" + sueldo + ", turno=" + turno + "]";
	}
	
	
}
