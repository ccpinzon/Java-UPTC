package logic;

import java.util.ArrayList;
import java.util.Calendar;

public class Factura {
	
	private int numeroFactura;
	private String fechaFactura;
	
	private ArrayList<Detalle>detalles;
	
	
	public Factura() {
		 detalles = new ArrayList<>();
		
	}


	public int getNumeroFactura() {
		return numeroFactura;
	}


	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}


	public String getFechaFactura() {
		return fechaFactura;
	}


	public void setFechaFactura(String fechaFactura) {
		this.fechaFactura = fechaFactura;
	}


	public ArrayList<Detalle> getDetalles() {
		return (ArrayList<Detalle>)detalles.clone();
	}


	public void agregarDetalle (Detalle detalle){
		detalles.add(detalle);
	}
	
	public String calcularEdad() {
		
		Calendar fechaActual = Calendar.getInstance();
		
		int Dia = fechaActual.get(Calendar.DAY_OF_MONTH);
		
		int Mes = fechaActual.get(Calendar.MONTH)+1;
				
		int Anio = fechaActual.get(Calendar.YEAR);
				
		fechaFactura= String.valueOf(Dia)+"/"+String.valueOf(Mes)+"/"+String.valueOf(Anio);
		
		return fechaFactura;
	}


	@Override
	public String toString() {
		return "Factura: \nNumero Factura: " + numeroFactura + "\nFecha Factura: "
				+ fechaFactura + "\nDetalles:" + detalles ;
	}


	

	

	
	
	

	



	
	
	
	
	

}
