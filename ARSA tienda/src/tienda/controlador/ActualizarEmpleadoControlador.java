package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class ActualizarEmpleadoControlador implements ActualizarEmpleadoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public void actualizarPosicion(String dni, String tipoEmpleado) {
		api.actualizarPosicion(dni, tipoEmpleado);
	}

}
