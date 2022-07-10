package models;

public abstract class Producto {
	private int id_producto;
	private String nombre_producto;
	private int stock;
	private double precio;
	private String categoria;
	
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", stock=" + stock
				+ ", precio=" + precio + ", categoria=" + categoria + "]";
	}
	
	public Producto() {
		
	}
	
	public Producto(int _id_producto, String _nombre_producto, int _stock, double _precio, String _categoria) {
		this.id_producto = _id_producto;
		this.nombre_producto = _nombre_producto;
		this.stock = _stock;
		this.precio = _precio;
		this.categoria = _categoria;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
