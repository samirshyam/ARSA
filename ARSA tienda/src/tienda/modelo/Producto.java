package tienda.modelo;

public class Producto {
	
	private String codProducto;
	private String nombreProducto;
	private String seccionProducto;
	private double precio;
	private int stock;
	
	public Producto(String nombreProducto, String seccionProducto, String fechaCaducidad, double precio, int stock) {
		this.nombreProducto = nombreProducto;
		this.seccionProducto = seccionProducto;
		this.precio = precio;
		this.stock = stock;
	}

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getSeccionProducto() {
		return seccionProducto;
	}

	public void setSeccionProducto(String seccionProducto) {
		this.seccionProducto = seccionProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", nombreProducto=" + nombreProducto + ", seccionProducto="
				+ seccionProducto + ", precio=" + precio + ", stock=" + stock
				+ "]";
	}
	
	
}
