package tienda.controlador;

import java.util.ArrayList;

import tienda.modelo.APITiendaARSA;
import tienda.modelo.Producto;

public class AltaCargaControlador implements AltaCargaInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();

	@Override
	public void crearCarga(String dni,ArrayList<Producto> listaProductos) {
		api.crearCarga(dni,listaProductos);
	}
	
	
}
