package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class ListarEmpleadosControlador implements ListaEmpleadoInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();
	
	@Override
	public String[][] listarEmpleados() {
		return api.listarEmpleados();
	}

}
