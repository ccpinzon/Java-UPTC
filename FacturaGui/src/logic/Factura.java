package logic;

import java.util.ArrayList;

public class Factura {
	
	private String fechaFactura, numFactura;
	private ArrayList<Detalle> detalles;
	
	
	public Factura() {    detalles = new ArrayList<>();	}


	public String getFechaFactura() {
		return fechaFactura;
	}


	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}


	public String getNumFactura() {
		return numFactura;
	}


	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}


	public ArrayList<Detalle> getDetalles() {
		return (ArrayList<Detalle>)detalles.clone();
	}


	public void setDetalles(ArrayList<Detalle> detalles) {
		this.detalles = detalles;
	}


	@Override
	public String toString() {
		return "Factura [fechaFactura=" + fechaFactura + ", numFactura="
				+ numFactura + ", detalles=" + detalles + "]";
	}	
	
	public void agregarDetalle (Detalle detalle){
		detalles.add(detalle);
	}
	
	public double calcularTotal(){
		
		double suma=0;
		for(Detalle detalle:detalles){
			suma+= detalle.calcularSubTotal();
		}return suma;	
		
	}
	
	
	
	

}
