package tienda.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Factura implements Iterable<Producto>{
	
	private static int cont=0;
	private String codFactura="";
	private double Precio;
	private Empleado empleado;
	private ArrayList<Producto> listaProductos;
	
	public Factura(Empleado empleado) {
		codFactura+=++cont;
		this.empleado=empleado;
		listaProductos= new ArrayList<>();
	}
	
	public void annadirProducto(Producto producto) {
		listaProductos.add(producto);
	}

	@Override
	public Iterator<Producto> iterator() {
		return this.listaProductos.iterator();
	}
	
	
}