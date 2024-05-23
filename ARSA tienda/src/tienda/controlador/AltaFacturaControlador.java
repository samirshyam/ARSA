package tienda.controlador;

import tienda.modelo.APITiendaARSA;
import tienda.modelo.Factura;

public class AltaFacturaControlador implements AltaFacturaInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();

	@Override
	public Factura crearFactura(String dni) {
		return api.crearFactura(dni);
		
	}

	@Override
	public void annadirProductoFactura(Factura factura, String nombreProducto) {
		api.annadirProductoFactura(factura, nombreProducto);
		
	}

	@Override
	public void precioFactura(Factura factura) {
		api.precioFactura(factura);
		
	}

}
