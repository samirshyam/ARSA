package tienda.principal;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Arrancando Aplicacion...");
		PantallaInicio p = new PantallaInicio();
		p.setVisible(true);
		p.setTitle("ARSA");
		p.setSize(540, 400);
	}
}
