package tienda.modelo;

public class APITiendaARSA {
	
	private Tienda tienda;
	private static APITiendaARSA instancia = new APITiendaARSA();
	

	private APITiendaARSA() {
		tienda=new Tienda();
	}
	
	public static APITiendaARSA getInstance() {
		return instancia;
	}
	
	public void altaEmpleado(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno) {
		Empleado empleado = new Empleado(nombreEmpleado,dni,tipoEmpleado,sueldo,turno);
		tienda.annadirEmpleado(empleado);
	}
	
	public void borrarEmpleado(String dni) {
		tienda.borrarEmpleado(dni);
	}
	
	public void altaProducto(String nombreProducto, String seccionProducto, String fechaCaducidad, double precio, int stock) {
		Producto producto = new Producto(nombreProducto,seccionProducto,fechaCaducidad,precio,stock);
		tienda.annadirProducto(producto);
	}
	
	public void borrarProducto(String nombreProducto) {
		tienda.borrarProducto(nombreProducto);
	}
	
	public void incrementarSueldoEmpleados(int porcentaje) {
		tienda.incrementarSueldoEmpleados(porcentaje);
	}
	
	public void incrementarSueldoEmpleados(int porcentaje, String dni) {
		tienda.incrementarSueldoEmpleados(porcentaje, dni);
	}
	
	public void actualizarProducto(String codProducto, String nombreProducto, String seccionProducto, double precio, int stock) {
		tienda.actualizarProducto(codProducto, nombreProducto, seccionProducto, precio, stock);
	}
	
	public void actualizarPosicion(String dni, String tipoEmpleado) { 
		tienda.actualizarPosicion(dni, tipoEmpleado);
	}
	
	public Empleado buscarEmpleado(String dni) {
		return tienda.buscarEmpleado(dni);
	}
	
	public Producto buscarProducto(String nombreProducto) {
		return tienda.buscarProducto(nombreProducto);
	}
	
	public void crearFactura(String dni) {
		tienda.crearFactura(dni);
	}
	
	public void crearCarga(String dni) {
		tienda.crearCarga(dni);
	}
	
	public void annadirProductoFactura(Factura factura,String nombreProducto) {
		tienda.annadirProductoFactura(factura, nombreProducto);
	}
	
	public void precioFacura(Factura factura) {
		tienda.precioFactura(factura);
	}
}
