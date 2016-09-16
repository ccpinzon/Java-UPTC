package cosas;

public  class Reloj {
	
	private String marca;

	public Reloj() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Reloj [marca=" + marca + "]";
	}
	
	
	

}
