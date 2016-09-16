package seres;

public class Irracional extends SerVivo {
	
	private String nombreCientifico;
	
	

	public Irracional() {
		
	}



	public String getNombreCientifico() {
		return nombreCientifico;
	}



	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}



	



	@Override
	public String toString() {
		return "Irracional [nombreCientifico=" + nombreCientifico
				+ ", toString()=" + super.toString() + "]";
	}



	@Override
	public String comunicarse() {
		// TODO Auto-generated method stub
		return "Los seres irracionales se omunican atraves de Sonidos";
	}

}
