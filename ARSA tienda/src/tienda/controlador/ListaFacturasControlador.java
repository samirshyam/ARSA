package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class ListaFacturasControlador implements ListaFacturaInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public String[][] listarFacturas() {
		return api.listarFacturas();
	}

}
