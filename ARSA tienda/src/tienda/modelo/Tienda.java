package tienda.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Tienda {
	private String nombreTienda;
	private String direccion;
	private ArrayList<Empleado> listaEmpleados;
	private ArrayList<Producto> listaProductos;
	
	public Tienda(String nombreTienda, String direccion) {
		listaEmpleados = new ArrayList<>();
		listaProductos = new ArrayList<>();
		this.nombreTienda=nombreTienda;
		this.direccion=direccion;
	}
	
	public void annadirEmpleado(Empleado empleado) {
		codEmpleado(empleado);
		listaEmpleados.add(empleado);
	}

	public boolean borrarEmpleado(String dni) {
		Iterator<Empleado> it = listaEmpleados.iterator();
		if (it.hasNext()) {
			if (it.next().getDni().equals(dni)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public void annadirProducto(Producto producto) {
		codProducto(producto);
		listaProductos.add(producto);
	}

	public boolean borrarProducto(String nombreProducto) {
		Iterator<Producto> it = listaProductos.iterator();
		if (it.hasNext()) {
			if (it.next().getNombreProducto().equals(nombreProducto)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public void codEmpleado(Empleado empleado) {
		if (empleado instanceof Supervisor) {
			empleado.setCodEmpleado("SUP"+empleado.getDni().substring(0, 8));
		}
		else {
			empleado.setCodEmpleado(empleado.getTipoEmpleado().substring(0,3)+empleado.getDni().substring(0, 8));
		}
	}
	
	public void codProducto(Producto producto) {
		producto.setCodProducto(producto.getSeccionProducto().substring(0,4)+"_"+producto.getNombreProducto());
	}
	
	public Empleado buscarEmpleado(String dni) {
		for (Empleado i: listaEmpleados) {
			if (i.getDni().equals(dni)) {
				return i;
			}
		}
		return null;
	}
	
	public Producto buscarProducto(String nombreProducto) {
		for (Producto i: listaProductos) {
			if (i.getNombreProducto().equals(nombreProducto)) {
				return i;
			}
		}
		return null;
	}
	
	public void incrementarSueldoEmpleados(int porcentaje) {
		for (Empleado i: listaEmpleados) {
			if (i instanceof Supervisor) {
				porcentaje=porcentaje+2;
			}
			i.setSueldo(i.getSueldo()+(i.getSueldo()*(porcentaje/100)));
		}
	}
	
	public void incrementarSueldoEmpleados(int porcentaje, String dni) {
		for (Empleado i: listaEmpleados) {
			if (i.getDni().equals(dni)) {
			i.setSueldo(i.getSueldo()+(i.getSueldo()*(porcentaje/100)));
			}
		}
	}
	
	public boolean actualizarProducto(String codProducto, String nombreProducto, String seccionProducto, double precio, int stock) {
		for (Producto i: listaProductos) {
			if (i.getCodProducto()==codProducto) {
				i.setNombreProducto(nombreProducto);
				i.setSeccionProducto(seccionProducto);
				i.setPrecio(precio);
				i.setStock(stock);
				codProducto(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean actualizarPosicion(String dni, String tipoEmpleado) {
		for (Empleado i: listaEmpleados) {
			if(i.getDni().equals(dni)) {
				i.setTipoEmpleado(tipoEmpleado);
				codEmpleado(i);
				return true;
			}
		}
		return false;
	}
}
