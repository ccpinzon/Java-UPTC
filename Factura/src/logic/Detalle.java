package logic;

import java.util.ArrayList;

public class Detalle {
	
	private int cantidad;
	private ArrayList<Producto>productos;
	

	public Detalle() {
		
		productos = new ArrayList<>();
		
	}
	
	

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ArrayList<Producto> getProducto() {
		return (ArrayList<Producto>)productos.clone();
	}

	

	


	
	
	public void agregarProducto(Producto producto){
		
		productos.add(producto);
	}




 public int CalcularTotal (){
		 int cont =0;
		 for (int i=0;i<productos.size();i++){
			 
			cont=cont+(cantidad*productos.get(i).getPrecio());
					
			 
		 }
		return cont;
	 }
	
	

	@Override
	public String toString() {
		return "\nCantidad: " + cantidad + ", Producto: " + productos +"Total: "+CalcularTotal();
	}



	
	
	

}
