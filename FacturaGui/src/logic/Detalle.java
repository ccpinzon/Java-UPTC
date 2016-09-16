package logic;

public class Detalle {
	
	private int cantidad;
	private Producto producto;
	private Factura factura;

	public Detalle() {}
	
	public int getCantidad() {return cantidad;}
	public void setCantidad(int cantidad) {this.cantidad = cantidad;}

	public Producto getProducto() {return producto;}
	public void setProducto(Producto producto) {this.producto = producto;}

    public Factura getFactura() {return factura;}
	public void setFactura(Factura factura) {this.factura = factura;}

	@Override
	public String toString() {
		return "Detalle [cantidad=" + cantidad + ", producto=" + producto
				+ ", factura=" + factura + "]";}

	public double calcularSubTotal (){
		
		return cantidad*producto.getPrecio();}}