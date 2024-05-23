package tienda.controlador;

import tienda.modelo.Empleado;

public interface AltaEmpleadoInterface {
	public void altaEmpleado(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno);
	
	public void altaSupervisor(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno, String seccion);
	
	public void annadirEmpleadoBajoSupervisor(Empleado supervisor, String dni);
	
	public Empleado buscarEmpleado(String dni);
}
