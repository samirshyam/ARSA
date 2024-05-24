package tienda.controlador;

import java.util.ArrayList;

import tienda.modelo.Producto;

public interface AltaCargaInterface {
	
	public void crearCarga(String dni, ArrayList<Producto> listaProductos);
}
