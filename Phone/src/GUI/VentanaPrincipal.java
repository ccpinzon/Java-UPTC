package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import logic.ControlLlamada;
import logic.Llamada;

public class VentanaPrincipal extends JFrame {

	private PanelDerecho derecho;
	private PanelFileChooser fileCho;
	private PanelIzquierdo izquierdo;
	private PanelMenus menu;
	private PanelInfoExtra info;
	private PanelHistograma histograma;
	private GestionEventos eventos;
	private ControlLlamada llamada;
	private String ruta;
	private JSeparator spUno, spDos;
	private ArrayList<Llamada> hola;
	private ArrayList<String> numeros,cantidades;
	private VerLista vista;
	public long [] m = null;
	public String moda3 = null; 
	private Histograma histo;
	

	public VentanaPrincipal() {

		setTitle("Phone");
		setSize(920, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(("recursos/imagenes/Icono.png")).getImage());
		setResizable(false);
		setLayout(new BorderLayout());
		
		inicializar();
		agregar();
	}

	private void inicializar() {

		eventos = new GestionEventos(this);
		histo = new Histograma(this);
		llamada = new ControlLlamada();
		derecho = new PanelDerecho(this);
		vista = new VerLista(this);
		izquierdo = new PanelIzquierdo(this);
		fileCho = new PanelFileChooser(this);
		menu = new PanelMenus(this);
		info = new PanelInfoExtra(this);
		histograma = new PanelHistograma(this);
		spUno = new JSeparator();
		spDos = new JSeparator();
		hola = new ArrayList<>();
		numeros = new ArrayList<>();
		cantidades = new ArrayList<>();
 		
		
	}

	private void agregar() {

		add(menu, BorderLayout.NORTH);
		izquierdo.add(fileCho);
		izquierdo.add(spUno);
		izquierdo.add(info);
		izquierdo.add(spDos);
		izquierdo.add(histograma);
		add(izquierdo);
		add(derecho, BorderLayout.EAST);

	}

	public GestionEventos getEventos() {
		return eventos;
	}

	public static void main(String[] args) {

		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);

	}

	public PanelDerecho getDerecho() {
		return derecho;
	}

	public void setDerecho(PanelDerecho derecho) {
		this.derecho = derecho;
	}

	public PanelFileChooser getFileCho() {
		return fileCho;
	}

	public void setFileCho(PanelFileChooser fileCho) {
		this.fileCho = fileCho;
	}

	public PanelIzquierdo getIzquierdo() {
		return izquierdo;
	}

	public void setIzquierdo(PanelIzquierdo izquierdo) {
		this.izquierdo = izquierdo;
	}

	public PanelMenus getMenu() {
		return menu;
	}

	public void setMenu(PanelMenus menu) {
		this.menu = menu;
	}

	public PanelInfoExtra getInfo() {
		return info;
	}

	public void setInfo(PanelInfoExtra info) {
		this.info = info;
	}

	public PanelHistograma getHistograma() {
		return histograma;
	}

	public void setHistograma(PanelHistograma histograma) {
		this.histograma = histograma;
	}

	public JSeparator getSpUno() {
		return spUno;
	}

	public void setSpUno(JSeparator spUno) {
		this.spUno = spUno;
	}

	public JSeparator getSpDos() {
		return spDos;
	}

	public void setSpDos(JSeparator spDos) {
		this.spDos = spDos;
	}

	public void setEventos(GestionEventos eventos) {
		this.eventos = eventos;
	}

	public ControlLlamada getLlamada() {
		return llamada;
	}

	public void setLlamada(ControlLlamada llamada) {
		this.llamada = llamada;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	

	
	public long[] getM() {
		return m;
	}

	public void setM(long[] m) {
		this.m = m;
	}
	

	

	public String getModa3() {
		return moda3;
	}

	public void setModa3(String moda3) {
		this.moda3 = moda3;
	}

	public void abrir() throws IOException {
	
		hola.clear();
		
		
		int sel = fileCho.getFlExaminar().showOpenDialog(this);
		if (sel == JFileChooser.APPROVE_OPTION) {

			File selectedFile = fileCho.getFlExaminar().getSelectedFile();
			fileCho.getTxEnlace().setText(String.valueOf(selectedFile.getAbsolutePath()));
			fileCho.getBtMostrar().setEnabled(true);
			fileCho.getCbMuestra().setEnabled(true);
			info.getBtboton().setEnabled(true);
			ruta = selectedFile.getAbsolutePath();
			setRuta(ruta);
			
			hola = llamada.readArchivo(ruta);
			numeroMayorDeLlamadas(hola);
			MayorDuracion(hola);
			MenorDuracion(hola);
			fecha(hola);
			
			//System.out.println(hola.size());
			long numero = 0;
			String numeroCel = null;
			
			for(int i=0;i<hola.size();i++){
				
				long p = numeroMenorLlamadas(Long.parseLong(hola.get(i).getNumero()));
				
			//	System.out.println("el numero "+Long.parseLong(hola.get(i).getNumero())+" se repite "+p);
				
				numeros.add(hola.get(i).getNumero());
				cantidades.add(String.valueOf(p));
				
				
				if(p==1){
					numero=p;
				//	System.out.println(numero);
					
					numeroCel=hola.get(4).getNumero();
					info.getTxNumeroDos().setText(numeroCel);
					info.getTxCantidadDos().setText(String.valueOf(numero));
					
				}
				
				
			}
			//System.out.println(numeros);
			//System.out.println(cantidades);
			
		
			
			histograma.getBtGenerar().setEnabled(true);
			
	 
			
			

		}

	}

	public void ayuda() {

		JOptionPane.showMessageDialog(null," BIENVENIDO TELEFONIA BAKA \n Daniel Alcides Carvajal Patiño \n 201210248 \n Ingenieria De Sistemas UPTC","Acerca Del Programa", 1);

	}

	public void salir() {
		dispose();
	}

	public void mostrar() throws IOException {

		String my = fileCho.getCbMuestra().getSelectedItem().toString();
				
		if (my.equals(" ")) {JOptionPane.showMessageDialog(null,"Porfavor Seleccion Un Tipo De Visualisacion");}
		
		else if (my.equals("Todo")) {todo();}
		
		else if (my.equals("Fecha")) {fecha();}
		
		else if (my.equals("Hora")) {hora();}
		
		else if (my.equals("Numero")) {numero();}
		
		else if (my.equals("Duracion")) {duracion();}
		
		else if (my.equals("Costo")) { costo();}

	}

	public void listo() {

		while (derecho.getModeloTabla().getRowCount() != 0) {
			derecho.getModeloTabla().removeRow(0);
		}

		fileCho.getCbMuestra().setEnabled(true);
		fileCho.getBtMostrar().setEnabled(true);
		derecho.getBoton().setEnabled(false);

	}

	public void todo() {
		
		
		for (int i = 0; i <= hola.size() - 1; i++) {

			String fecha = hola.get(i).getFecha();
			String hora = hola.get(i).getHora();
			String numero = hola.get(i).getNumero();
			String duracion = hola.get(i).getDuracion();
			double costo = hola.get(i).getCosto();
		
			Object[] m = { fecha, hora, numero, duracion, costo };
			
			
			derecho.getModeloTabla().insertRow(i, m);
			derecho.getBoton().setEnabled(true);
			fileCho.getBtMostrar().setEnabled(false);
			fileCho.getCbMuestra().setEnabled(false);
		}
		
	}

	public void fecha() {
		
		for (int i = 0; i <= hola.size() - 1; i++) {
			
			String fecha = hola.get(i).getFecha();
			Object[] m = { fecha};
			derecho.getModeloTabla().insertRow(i, m);
			derecho.getBoton().setEnabled(true);
			fileCho.getBtMostrar().setEnabled(false);
			fileCho.getCbMuestra().setEnabled(false);
		}
		
		
		
	}

	public void hora() {
		
		for (int i = 0; i <= hola.size() - 1; i++) {

			String fecha = " ";
			String hora = hola.get(i).getHora();
			

			Object[] m = { fecha, hora};

			derecho.getModeloTabla().insertRow(i, m);

			derecho.getBoton().setEnabled(true);
			fileCho.getBtMostrar().setEnabled(false);
			fileCho.getCbMuestra().setEnabled(false);
		}	
	}

	public void numero() {
		for (int i = 0; i <= hola.size() - 1; i++) {

			String fecha = " ";
			String hora = " ";
			String numero = hola.get(i).getNumero();
			
			Object[] m = { fecha, hora, numero};

			derecho.getModeloTabla().insertRow(i, m);

			derecho.getBoton().setEnabled(true);
			fileCho.getBtMostrar().setEnabled(false);
			fileCho.getCbMuestra().setEnabled(false);
			
		}
		
	}

	public void duracion() {
		

		for (int i = 0; i <= hola.size() - 1; i++) {

			String fecha = " ";
			String hora = " ";
			String numero = " ";
			String duracion = hola.get(i).getDuracion();
			
			Object[] m = { fecha, hora, numero, duracion};

			derecho.getModeloTabla().insertRow(i, m);

			derecho.getBoton().setEnabled(true);
			fileCho.getBtMostrar().setEnabled(false);
			fileCho.getCbMuestra().setEnabled(false);
		}}

	public void costo() {
		
		for (int i = 0; i <= hola.size() - 1; i++) {

			String fecha = " ";
			String hora = " ";
			String numero = " ";
			String duracion = " ";
			double costo = hola.get(i).getCosto();

			Object[] m = { fecha, hora, numero, duracion, costo };

			derecho.getModeloTabla().insertRow(i, m);

			derecho.getBoton().setEnabled(true);
			fileCho.getBtMostrar().setEnabled(false);
			fileCho.getCbMuestra().setEnabled(false);
		}
		
		
	}
	
	
	
	
	public void numeroMayorDeLlamadas(ArrayList<Llamada> n){
		
         
		int frecuenciaTemp, frecuenciaModa = 0; 
		long moda=1;
        
        for (int i=0; i < n.size()-1; i++){
        	
        	
            frecuenciaTemp = 1;
            
            for(int j = i+1 ; j< n.size(); j++){
            	
                if(n.get(i).getNumero().equals(n.get(j).getNumero()))
                
                    frecuenciaTemp ++;   
                
               
              
                
            }	
            if(frecuenciaTemp > frecuenciaModa){
            	 
                frecuenciaModa = frecuenciaTemp;
                moda = Long.parseLong(n.get(i).getNumero());
                
                
                info.getTxNumeroUno().setText(String.valueOf(moda));
                info.getTxCantidadUno().setText(String.valueOf(frecuenciaModa));
            }
                
        }}

	
	
	
	
	
	
	public void MayorDuracion(ArrayList<Llamada> n) throws IOException{
		String moda=null, duracionModa = null;
		int r1=0, r2=0;
		r1=Integer.parseInt(n.get(0).getDuracion().replace(':', '0'));
		for (int i=0; i < n.size()-1; i++){       			
            for(int j = i+1 ; j< n.size(); j++){
            	r2=Integer.parseInt(n.get(j).getDuracion().replace(':', '0'));
            	if (r1<r2){
            		r1=r2;
            		moda=n.get(j).getNumero();
            		duracionModa=n.get(j).getDuracion();
            	}
            }
		}
		
		 info.getTxNumeroTres().setText(String.valueOf(moda));
         info.getTxDuracionUno().setText(String.valueOf(duracionModa));
//		JOptionPane.showMessageDialog(null, "El numero de la llamada mas larga es: \n"+moda+"  con un tiempo de : "+duracionModa);
	}
	
	public void MenorDuracion(ArrayList<Llamada> n) throws IOException{
		String moda=null, duracionModa = null;
		int r1=0, r2=0;
		r1=Integer.parseInt(n.get(0).getDuracion().replace(':', '0'));
		for (int i=0; i < n.size(); i++){ 
            for(int j = i ; j< n.size(); j++){
            	r2=Integer.parseInt(n.get(j).getDuracion().replace(':', '0'));
            	if (r1>=r2){
            		r1=r2;
            		moda=n.get(i).getNumero();
            		duracionModa=n.get(i).getDuracion();
            	}
            }
		}
		
		info.getTxNumeroCuatro().setText(String.valueOf(moda));
        info.getTxDuracionDos().setText(String.valueOf(duracionModa));
		//JOptionPane.showMessageDialog(null, "El numero de la llamada mas corta es: \n"+moda+"  con un tiempo de : "+duracionModa);
	}
	
	public void fecha(ArrayList<Llamada> numero) {
		int frecuenciaTemp, frecuenciaModa = 0;
		String moda = null;

		for (int i = 0; i < numero.size() - 1; i++) {
			frecuenciaTemp = 1;
			for (int j = i + 1; j < numero.size(); j++) {
				if (numero.get(i).getFecha().equals(numero.get(j).getFecha()))
					frecuenciaTemp++;
			}
			if (frecuenciaTemp > frecuenciaModa) {
				frecuenciaModa = frecuenciaTemp;
				moda = numero.get(i).getFecha();
			}
		}
		info.getTxfecha().setText(String.valueOf(moda));
        info.getTxCantidad().setText(String.valueOf(frecuenciaModa));
        
       moda3= String.valueOf(moda);
        
     
        
        
	}
	
	public ArrayList<Llamada> buscarFecha(String fecha){
		
		ArrayList<Llamada> mi = new ArrayList<Llamada>();
		for(int i =0; i<=hola.size()-1;i++){
			if(hola.get(i).getFecha().equals(fecha)){
				
					
			mi.add(hola.get(i));
			
			
			}
				 
			}
		
		return mi;
			
			
		}
		
		
	

	public void verLista() {
		
		ArrayList<Llamada>  mi =buscarFecha(moda3);
		vista.setVisible(true);
		for(int i =0;i<=mi.size()-1;i++){
			String fecha1 = mi.get(i).getFecha();
		
			String hora = mi.get(i).getHora();
			String numero = mi.get(i).getNumero();
			String duracion = mi.get(i).getDuracion();
			double costo = mi.get(i).getCosto();
	
			Object [] j = {fecha1, hora,numero,duracion, costo};
			vista.getModeloTabla().insertRow(i, j);
			
			
		}
		
	}

	public void ver() {
		
		
		vista.dispose();
		
	}
	
	public int numeroMenorLlamadas(long m){
		
		int contador =0;
		
    	for(int i=0;i<hola.size()-1;i++){
    		
    		if(Long.parseLong(hola.get(i).getNumero())==m){
    	
    			contador++;
    			//System.out.println("numero"+Long.parseLong(hola.get(i).getNumero())+"se repite"+contador);
    			
    			
    		}
    		
    	}
		return(contador);
	}

	public void generar() {
				
		histo.setVisible(true);
		
		histo.llenar(numeros, cantidades);
		
	}

	public void acpetar() {
		histo.dispose();
		
	}
	
}


