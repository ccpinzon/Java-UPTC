package logic;

import java.util.ArrayList;


public class GestionFactura {

	private ArrayList<Factura>facturas;
	private ArrayList<Producto>productos;
	
	
	public GestionFactura() {
		
		facturas = new ArrayList<>();
		productos = new ArrayList<>();
		
	}

	public ArrayList<Factura> getFacturas() {
		return (ArrayList<Factura>)facturas.clone();
	}


	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}


	public ArrayList<Producto> getProductos() {
		return (ArrayList<Producto>)productos.clone();
	}


	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}


	@Override
	public String toString() {
		return "GestionFactura [facturas=" + facturas + ", productos="
				+ productos + "]";
	}
	
	public void agregarProducto (Producto producto){
		
		productos.add(producto);
		
	}
	
	public void agregarFactura (Factura factura){
		facturas.add(factura);
	}
	
}
