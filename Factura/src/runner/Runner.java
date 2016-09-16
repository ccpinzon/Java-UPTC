package runner;

import logic.*;

public class Runner {
	
	

	
	public static void main(String[] args) {
		
		
		Factura fact = new Factura();
		fact.setNumeroFactura(9878961);
		fact.calcularEdad();
		
		Detalle det = new Detalle();
		det.setCantidad(6);
		Producto prod = new Producto();
		prod.setCodigo(8795);
		prod.setDescripcion("Coca Cola");
		prod.setPrecio(1200);
		det.agregarProducto(prod);
		fact.agregarDetalle(det);
		
		det = new Detalle();
		det.setCantidad(8);
		prod = new Producto();
		prod.setCodigo(46556);
		prod.setDescripcion("Papel Higenico");
		prod.setPrecio(1800);
		det.agregarProducto(prod);
		fact.agregarDetalle(det);
		
		
		
		
		System.out.println(fact);
		

	}

}
