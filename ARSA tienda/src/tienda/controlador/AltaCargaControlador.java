package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class AltaCargaControlador implements AltaCargaInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();

	@Override
	public void crearCarga(String dni) {
		api.crearCarga(dni);
	}
	
	
}
