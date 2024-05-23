package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class AltaProductoControlador implements AltaProductoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public void altaProducto(String nombreProducto, String seccionProducto, String fechaCaducidad, double precio,
			int stock) {
		api.altaProducto(nombreProducto, seccionProducto, fechaCaducidad, precio, stock);
	}

}
