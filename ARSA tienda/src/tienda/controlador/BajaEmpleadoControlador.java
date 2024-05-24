package tienda.controlador;

import tienda.modelo.APITiendaARSA;
import tienda.modelo.Empleado;

public class BajaEmpleadoControlador implements BajaEmpleadoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public void borrarEmpleado(String dni) {
		api.borrarEmpleado(dni);
	}

	@Override
	public void borrarEmpleadoBajoSupervisor(Empleado supervisor, String dni) {
		api.borrarEmpleadoBajoSupervisor(supervisor, dni);
	}

	@Override
	public Empleado buscarEmpleado(String dni) {
		return api.buscarEmpleado(dni);
	}

}
