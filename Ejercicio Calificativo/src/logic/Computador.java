package logic;
import java.util.ArrayList;
import java.util.Collections;

public class Computador implements Comparable<Computador>{
	
	private String serial;
	private String marca;
	private float tamanoPantalla;
	private ArrayList<Hadware> hadwares;
	
	
	public Computador() {
		
		hadwares = new ArrayList<Hadware>();
		
	}	
		
	public Computador(String serial, String marca, float tamanoPantalla,
			ArrayList<Hadware> hadwares) {
		super();
		this.serial = serial;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
		this.hadwares = new ArrayList<Hadware>();
	}

	
	
public void ordenarCosto(){
		
		Collections.sort(hadwares, new ordenarcosto());
	}
	





public int compareTo(Computador computador){
	
	
	
	return computador.marca.compareTo(marca);
			
}


	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getTamanoPantalla() {
		return tamanoPantalla;
	}
	public void setTamanoPantalla(float tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}
	public ArrayList<Hadware> getHadwares() {
		return hadwares;
	}
	public void setHadwares(ArrayList<Hadware> hadwares) {
		this.hadwares = hadwares;
	}

	
	public void agregarHadware (Hadware had){
		hadwares.add(had);
		
	}
    public float calcularTotal(){
    	
    	float total=0;
    for (Hadware had : hadwares){
    	
    	
    	total = total+had.getPrecio();
    	  		
    	}
    
    
    return total;
    	
    }




	@Override
	public String toString() {
		return "Computador [serial=" + serial + ", marca=" + marca
				+ ", tamanoPantalla=" + tamanoPantalla + ", hadwares="
				+ hadwares +  ", calcularTotal()="
				+ calcularTotal() + "]";
	}
    
}
