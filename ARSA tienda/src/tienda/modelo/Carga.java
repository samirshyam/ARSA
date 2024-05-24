package tienda.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Carga implements Iterable<Producto>{
	
	private static int cont=0;
	private String codCargo="";
	private Empleado empleado;
	private ArrayList<Producto> listaProductos;
	
	public String getCodCargo() {
		return codCargo;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	
	
	public Carga(Empleado empleado, ArrayList<Producto> listaProductos) {
		codCargo+=++cont;
		this.empleado=empleado;
		this.listaProductos=listaProductos;
	}
	
	public void annadirProducto(Producto producto) {
		listaProductos.add(producto);
	}

	@Override
	public Iterator<Producto> iterator() {
		return this.listaProductos.iterator();
	}
}
