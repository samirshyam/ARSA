package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class IncrementarSueldoControlador implements IncrementarSueldoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public void incrementarSueldoEmpleados(int porcentaje) {
		api.incrementarSueldoEmpleados(porcentaje);
	}

	@Override
	public void incrementarSueldoEmpleados(int porcentaje, String dni) {
		api.incrementarSueldoEmpleados(porcentaje, dni);
	}

}
