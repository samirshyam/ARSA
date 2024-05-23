package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class ActualizarProductoControlador implements ActualizarProductoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public void actualizarProducto(String codProducto, String nombreProducto, String seccionProducto, double precio,
			int stock) {
		api.actualizarProducto(codProducto, nombreProducto, seccionProducto, precio, stock);
	}

}
