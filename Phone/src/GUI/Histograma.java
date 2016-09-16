package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Histograma extends JDialog{
	
	 private JFreeChart chart;
	 private ChartPanel panel;
	 private DefaultCategoryDataset dataset;
	 private JButton btacepar;
	 private VentanaPrincipal ventanaPrincipal;
	 
	 public Histograma(VentanaPrincipal ventanaPrincipal) {
	
		 setSize(600,600);
		 setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		// setResizable(false);
		// setTitle("Histograma");
		 setIconImage(new ImageIcon(("recursos/imagenes/Icono.png")).getImage());
		 setLayout(new BorderLayout());
		 
		 
		 dataset = new DefaultCategoryDataset();
		 chart = ChartFactory.createBarChart3D("Histograma", "Numeros", "Cantidad Llamadas", dataset, PlotOrientation.HORIZONTAL, true,   true, false);
	
	
		 
		 panel = new ChartPanel(chart);
		 
		 btacepar = new JButton("aceptar");
		 btacepar.setActionCommand(GestionEventos.ACEPTAR);
		 btacepar.addActionListener(ventanaPrincipal.getEventos());
		 
		 
		 add(panel,BorderLayout.CENTER);
		 add(btacepar,BorderLayout.SOUTH);
		 
	}
	 public void llenar(ArrayList<String> numeros, ArrayList<String> cantidad){
		 
 for(int i=0;i<numeros.size();i++){
			 
			 dataset.setValue(Integer.parseInt(cantidad.get(i)), "numeros",numeros.get(i));
			 
		    
		 }
	 }

}
