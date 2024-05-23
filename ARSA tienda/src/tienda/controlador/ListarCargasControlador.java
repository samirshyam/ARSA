package tienda.controlador;

import tienda.modelo.APITiendaARSA;

public class ListarCargasControlador implements ListaCargaInterface{
	
	private APITiendaARSA api= APITiendaARSA.getInstance();

	@Override
	public String[][] listarCargas() {
		return api.listarCargas();
	}

}
