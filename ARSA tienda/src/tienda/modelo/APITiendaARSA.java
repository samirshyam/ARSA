package tienda.modelo;

import java.util.ArrayList;

public class APITiendaARSA {
	
	private Tienda tienda;
	private static APITiendaARSA instancia = new APITiendaARSA();
	

	private APITiendaARSA() {
		tienda=new Tienda();
	}
	
	public static APITiendaARSA getInstance() {
		return instancia;
	}
	
	/* 
	 * METODOS DE API DESDE AQUI 
	 *
	 */
	
	/* */public void altaEmpleado(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno) {
		Empleado empleado = new Empleado(nombreEmpleado,dni,tipoEmpleado,sueldo,turno);
		tienda.annadirEmpleado(empleado);
	}
	
	/* */public void altaSupervisor(String nombreEmpleado, String dni, String tipoEmpleado, double sueldo, String turno, String seccion) {
		Empleado empleado = new Supervisor(nombreEmpleado,dni,tipoEmpleado,sueldo,turno,seccion);
		tienda.annadirEmpleado(empleado);
	}
	
	/* */public void borrarEmpleado(String dni) {
		tienda.borrarEmpleado(dni);
	}
	
	/* */public void altaProducto(String nombreProducto, String seccionProducto, String fechaCaducidad, double precio, int stock) {
		Producto producto = new Producto(nombreProducto,seccionProducto,fechaCaducidad,precio,stock);
		tienda.annadirProducto(producto);
	}
	
	/* */public void borrarProducto(String nombreProducto) {
		tienda.borrarProducto(nombreProducto);
	}
	
	/* */public void incrementarSueldoEmpleados(int porcentaje) {
		tienda.incrementarSueldoEmpleados(porcentaje);
	}
	
	/* */public void incrementarSueldoEmpleados(int porcentaje, String dni) {
		tienda.incrementarSueldoEmpleados(porcentaje, dni);
	}
	
	/* */public void actualizarProducto(String codProducto, String nombreProducto, String seccionProducto, double precio, int stock) {
		tienda.actualizarProducto(codProducto, nombreProducto, seccionProducto, precio, stock);
	}
	
	/* */public void actualizarPosicion(String dni, String tipoEmpleado) { 
		tienda.actualizarPosicion(dni, tipoEmpleado);
	}
	
	public Empleado buscarEmpleado(String dni) {
		return tienda.buscarEmpleado(dni);
	}
	
	public Producto buscarProducto(String nombreProducto) {
		return tienda.buscarProducto(nombreProducto);
	}
	
	/* */public void crearFactura(String dni) {
		tienda.crearFactura(dni);
	}
	
	/*  */public void crearCarga(String dni) {
		tienda.crearCarga(dni);
	}
	
	/* */public void annadirProductoFactura(Factura factura,String nombreProducto) {
		tienda.annadirProductoFactura(factura, nombreProducto);
	}
	
	/* */public void precioFactura(Factura factura) {
		tienda.precioFactura(factura);
	}
	
	/* */public void annadirEmpleadoBajoSupervisor(Empleado supervisor, String dni) {
		((Supervisor) supervisor).annadirEmpleado(buscarEmpleado(dni));
	}
	
	/* */public boolean borrarEmpleadoBajoSupervisor(Empleado supervisor, String dni) {
		for (Empleado i: (Supervisor) supervisor) {
			if (i.getDni().equals(dni)) {
				((Supervisor) supervisor).borrarEmpleado(dni);
				return true;
			}
		}
		return false;
	}
	
	public String[][] listarEmpleados() {
		ArrayList<Empleado> listaEmpleados=tienda.listarEmpleados();
		String[][] listaEmpleadosArray=new String[listaEmpleados.size()][8];
		for (int i=0; i<listaEmpleados.size();i++) {
			listaEmpleadosArray[i][0]=listaEmpleados.get(i).getCodEmpleado(); 
			listaEmpleadosArray[i][1]=listaEmpleados.get(i).getNombreEmpleado();
			listaEmpleadosArray[i][2]=listaEmpleados.get(i).getDni();
			listaEmpleadosArray[i][3]=listaEmpleados.get(i).getTipoEmpleado();
			listaEmpleadosArray[i][4]=listaEmpleados.get(i).getTurno();
			listaEmpleadosArray[i][5]=Double.toString(listaEmpleados.get(i).getSueldo());
			if (listaEmpleados.get(i) instanceof Supervisor) {
				listaEmpleadosArray[i][6]=((Supervisor) listaEmpleados.get(i)).getSeccion();
				for (Empleado x: ((Supervisor) listaEmpleados.get(i))) {
					listaEmpleadosArray[i][7]+=x.getCodEmpleado()+"\n";
				}
			}
		}
		return listaEmpleadosArray;
	}
	
	public String[][] listarProductos() {
		ArrayList<Producto> listaProductos=tienda.listarProductos();
		String[][] listaProductosArray=new String[listaProductos.size()][5];
		for (int i=0; i<listaProductos.size();i++) {
			listaProductosArray[i][0]=listaProductos.get(i).getCodProducto(); 
			listaProductosArray[i][1]=listaProductos.get(i).getNombreProducto();
			listaProductosArray[i][2]=listaProductos.get(i).getSeccionProducto();
			listaProductosArray[i][3]=Double.toString(listaProductos.get(i).getPrecio());
			listaProductosArray[i][4]=Integer.toString(listaProductos.get(i).getStock());
		}
		return listaProductosArray;
	}
	
	public String[][] listarCargas() {
		ArrayList<Carga> listaCargas=tienda.listarCargas();
		String[][] listaCargasArray=new String[listaCargas.size()][2];
		for (int i=0; i<listaCargas.size();i++) {
			listaCargasArray[i][0]=listaCargas.get(i).getCodCargo(); 
			listaCargasArray[i][1]=listaCargas.get(i).getEmpleado().getCodEmpleado();
			ArrayList<Producto> listaProductos=listaCargas.get(i).getListaProductos();
			for (Producto x: listaProductos) {
				listaCargasArray[i][2]+=x.getCodProducto()+"\n";
			}
		}
		return listaCargasArray;
	}
	
	public String[][] listarFacturas() {
		ArrayList<Factura> listaFacturas=tienda.listarFacturas();
		String[][] listaFacturasArray=new String[listaFacturas.size()][4];
		for (int i=0; i<listaFacturas.size();i++) {
			listaFacturasArray[i][0]=listaFacturas.get(i).getCodFactura(); 
			listaFacturasArray[i][1]=listaFacturas.get(i).getEmpleado().getCodEmpleado();
			listaFacturasArray[i][2]=Double.toString(listaFacturas.get(i).getPrecio());
			ArrayList<Producto> listaProductos=listaFacturas.get(i).getListaProductos();
			for (Producto x: listaProductos) {
				listaFacturasArray[i][3]+=x.getCodProducto()+"\n";
			}
		}
		return listaFacturasArray;
	}
}
