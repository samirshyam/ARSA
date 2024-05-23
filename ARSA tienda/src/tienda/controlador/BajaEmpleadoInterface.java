package tienda.controlador;

import tienda.modelo.Empleado;

public interface BajaEmpleadoInterface {
	
	public void buscarEmpleado(String dni);
	
	public void borrarEmpleado(String dni);
	
	public void borrarEmpleadoBajoSupervisor(Empleado supervisor, String dni);
}
