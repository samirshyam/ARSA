package tienda.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Carga implements Iterable<Producto>{
	
	private static int cont=0;
	private String codCargo="";
	private Empleado empleado;
	
	public String getCodCargo() {
		return codCargo;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	private ArrayList<Producto> listaProductos;
	
	public Carga(Empleado empleado) {
		codCargo+=++cont;
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
