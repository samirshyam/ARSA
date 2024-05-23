package tienda.controlador;

import tienda.modelo.APITiendaARSA;
import tienda.modelo.Empleado;

public class AltaEmpleadoControlador implements AltaEmpleadoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();

	@Override
	public void altaEmpleado(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno) {
		api.altaEmpleado(nombreEmpleado, dni, tipoEmpleado, sueldo, turno);
		
	}

	@Override
	public void annadirEmpleadoBajoSupervisor(Empleado supervisor, String dni) {
		api.annadirEmpleadoBajoSupervisor(supervisor, dni);
		
	}



	@Override
	public void altaSupervisor(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno,
			String seccion) {
		api.altaSupervisor(nombreEmpleado, dni, tipoEmpleado, sueldo, turno, seccion);
	}
	
	
}
