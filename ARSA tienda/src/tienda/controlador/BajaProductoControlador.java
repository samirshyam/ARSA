package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class BajaProductoControlador implements BajaProductoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public void borrarProducto(String nombreProducto) {
		api.borrarProducto(nombreProducto);
	}

}
