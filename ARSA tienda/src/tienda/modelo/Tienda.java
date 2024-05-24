package tienda.modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Tienda {
	private ArrayList<Empleado> listaEmpleados;
	private ArrayList<Producto> listaProductos;
	private ArrayList<Factura> listaFacturas;
	private ArrayList<Carga> listaCargas;
	
	public Tienda() {
		listaEmpleados = new ArrayList<>();
		listaProductos = new ArrayList<>();
		listaFacturas = new ArrayList<>();
		listaCargas = new ArrayList<>();
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
	
	private void codEmpleado(Empleado empleado) {
		if (empleado instanceof Supervisor) {
			empleado.setCodEmpleado("SUP"+empleado.getDni().substring(0, 8));
		}
		else {
			empleado.setCodEmpleado(empleado.getTipoEmpleado().substring(0,3)+empleado.getDni().substring(0, 8));
		}
	}
	
	private void codProducto(Producto producto) {
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
	
	public Factura crearFactura(String dni) {
		Factura factura= new Factura(buscarEmpleado(dni));
		listaFacturas.add(factura);
		return factura;
	}
	
	public void crearCarga(String dni, ArrayList<Producto> listaProductos) {
		Carga carga= new Carga(buscarEmpleado(dni),listaProductos);
		subirCarga(carga);
		listaCargas.add(carga);
	}
	
	public void precioFactura(Factura factura) {
		factura.precioFactura();
	}
	
	private boolean buscarFactura(String codFactura) {
		for (Factura i : listaFacturas) {
			if (i.getCodFactura().equals(codFactura)) {
				return true;
			}
		}
		return false;
	}
	
	private void subirCarga(Carga carga) {
		for (Producto i: listaProductos) {
			for (Producto x: carga) {
				if (i.getNombreProducto().equals(x.getNombreProducto())) {
					i.setStock(i.getStock()+x.getStock());
				}
				else {
					listaProductos.add(x);
				}
			}
		}
	}
	
	public void annadirProductoFactura(Factura factura,String nombreProducto) {
		factura.annadirProducto(buscarProducto(nombreProducto));
		buscarProducto(nombreProducto).setStock(buscarProducto(nombreProducto).getStock()-1);
	}
	
	public ArrayList<Empleado> listarEmpleados() {
		return listaEmpleados;
	}
	
	public ArrayList<Producto> listarProductos() {
		return listaProductos;
	}
	
	public ArrayList<Factura> listarFacturas() {
		return listaFacturas;
	}
	
	public ArrayList<Carga> listarCargas() {
		return listaCargas;
	}
}
