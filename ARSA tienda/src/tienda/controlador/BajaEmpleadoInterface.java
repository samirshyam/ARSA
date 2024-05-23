package tienda.controlador;

import tienda.modelo.Empleado;

public interface BajaEmpleadoInterface {
	
	public void borrarEmpleado(String dni);
	
	public boolean borrarEmpleadoBajoSupervisor(Empleado supervisor, String dni);
}
