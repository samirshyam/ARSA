package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class ListaProductosControlador implements ListaProductoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public String[][] listarProductos() {
		return api.listarProductos();
	}

}
