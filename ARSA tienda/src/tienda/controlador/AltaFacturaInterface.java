package tienda.controlador;

import tienda.modelo.Factura;

public interface AltaFacturaInterface {
	
	public Factura crearFactura(String dni);
	
	public void annadirProductoFactura(Factura factura,String nombreProducto);
	
	public void precioFactura(Factura factura);
}
