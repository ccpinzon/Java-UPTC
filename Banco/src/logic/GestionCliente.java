package logic;

import java.util.ArrayList;

public class GestionCliente {
	
	private ArrayList<Cliente>clientes;
	
public GestionCliente(){
	
	clientes = new ArrayList<>();
	
}

public ArrayList<Cliente> getClientes() {
	return (ArrayList<Cliente>) clientes.clone();
}	



    public Cliente BuscarCliente(String Documento){
	
	 for(Cliente cli:clientes){
			
			if(cli.getDocumento().equals(Documento))
				return cli;
			}
	return null;	
	
}
	
    
    
  
    
    
    
public void agregarCliente(Cliente cli){
	
	clientes.add(cli);
	
}

@Override
public String toString() {
	return "GestionCliente [clientes=" + clientes + "]";
}



	
	
	

}
