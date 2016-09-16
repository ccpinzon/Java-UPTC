
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CalculoNotas extends JPanel {
	
	private JRadioButton mujer, hombre;
	private ButtonGroup Ggenero;
	
	private  JSlider color1, color2, color3;
	private JLabel lbcolor1, lbcolor2, lbcolor3;
	private JPanel Colorpanel;
	
	private JCheckBox select1, select2;
	private JMenu menu,menu1, menu2;
	private JMenuBar menubar;
	private JMenuItem agregarCliente,salir;
	
	private JComboBox Genero;
	private JLabel lbmensaje, lbNotaUno, lbNotaDos, lbNotaTres, lbREsultado ;
	private JTextField txNotaUno, txNotaDos, txNotaTres, txResultado;
	private JButton btCalcular;
	String generos[]={"Masculino","Femenino","Homosexual"};
	
	public CalculoNotas (){
		
		Ggenero = new ButtonGroup();
		Ggenero.add(mujer);
		Ggenero.add(hombre);
		
		mujer = new JRadioButton("Mujer");
		hombre = new JRadioButton("hombre");
		
		color1 = new JSlider(JSlider.VERTICAL,0,255,0);
		color1.setMajorTickSpacing(50);
		color1.setMinorTickSpacing(10);
		color1.setPaintTicks(true);
		
		color1.setAlignmentY(Component.LEFT_ALIGNMENT);
		AccionSlider AccionColor= new AccionSlider();
		color1.addChangeListener(AccionColor);
		
		
		color2 = new JSlider(JSlider.VERTICAL,0,255,0);
		color2.setMajorTickSpacing(50);
		color2.setMinorTickSpacing(10);
		color2.setPaintTicks(true);
		color2.setAlignmentY(Component.LEFT_ALIGNMENT);
		AccionSlider AccionColor1= new AccionSlider();
		color2.addChangeListener(AccionColor1);
		
		color3 = new JSlider(JSlider.VERTICAL,0,255,0);
		color3.setMajorTickSpacing(50);
		color3.setMinorTickSpacing(10);
		color3.setPaintTicks(true);
		color3.setAlignmentY(Component.LEFT_ALIGNMENT);
		AccionSlider AccionColor2= new AccionSlider();
		color3.addChangeListener(AccionColor2);
		
		lbcolor1 = new JLabel("Rojo: 0");
		lbcolor1.setAlignmentY(Component.RIGHT_ALIGNMENT);
		
		
		lbcolor2 = new JLabel("Verde: 0");
		lbcolor2.setAlignmentY(Component.RIGHT_ALIGNMENT);
		
		
		lbcolor3 = new JLabel("Azul: 0");
		lbcolor3.setAlignmentY(Component.RIGHT_ALIGNMENT);
		
		
		Colorpanel = new JPanel();
		Colorpanel.setPreferredSize(new Dimension(50,50));
		Colorpanel.setBackground(new Color(0,0,0));
		
		
		
		

		menu = new JMenu();
		menu1 = new JMenu();
		menu2 = new JMenu();
		menubar = new JMenuBar();
		agregarCliente = new JMenuItem();
		salir = new JMenuItem();
		
		menu.setText("Archivo");
		menubar.add(menu);
		agregarCliente.setText("Agregar Cliente");
		menu.add(agregarCliente);
		salir.setText("Salir");
		menu.add(salir);
		
		menu1.setText("Editar");
		menubar.add(menu1);
		
		menu2.setText("Ayuda");
		menubar.add(menu2);
		
		Genero= new JComboBox (generos);
		Genero.addActionListener(new accionCombo());
		
		select1 = new JCheckBox("Deporte");
		select2 = new JCheckBox("Musica");
		select1.addItemListener(new accionCheck());
		select2.addItemListener(new accionCheck());
		
		
		setPreferredSize(new Dimension(150,350));
	
	lbmensaje = new JLabel ("Sisteme notas UPTC");
	lbNotaUno = new JLabel ("Digite nota uno");
	lbNotaDos = new JLabel ("Digite nota dos");
	lbNotaTres = new JLabel ("Digite nota tres");
	
	txNotaUno = new JTextField(10);
	txNotaDos = new JTextField(10);
	txNotaTres = new JTextField(10);
	
	btCalcular = new JButton ("Calcular");
	btCalcular.addActionListener(new accionBoton());
	
	lbREsultado = new JLabel("resultados");
	txResultado = new JTextField(10);
	
	
	add(menubar,BorderLayout.NORTH);
	add(lbmensaje);
	add(lbNotaUno);
	add(txNotaUno);
	add(lbNotaDos);
	add(txNotaDos);
	add(lbNotaTres);
	add(txNotaTres);
	add(btCalcular);
	add(lbREsultado);
	add(txResultado);
	add(Genero);
	add(select1);
	add(select2);
	add(color1);
	add(color2);
	add(color3);
	add(lbcolor1);
	add(lbcolor2);
	add(lbcolor3);
	add(Colorpanel);
	add(mujer);
	add(hombre);
	

	
	
	}
	private class accionBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			float notaUnotemp, notaDosTemp, notaTresTemp, resultadoTemp;
			String text = txNotaUno.getText();
			notaUnotemp=Float.parseFloat(text);
			
			String text1 = txNotaDos.getText();
			notaDosTemp=Float.parseFloat(text1);
			

			String text2 = txNotaTres.getText();
			notaTresTemp=Float.parseFloat(text2);
			
			resultadoTemp=(notaUnotemp+notaDosTemp+notaTresTemp)/3;
			
			txResultado.setText(Float.toString(resultadoTemp));
			
			
		}}
	
	private class accionCheck implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			 if(select1.isSelected ()){

               System.out.println("Seleciono deporte");
			 }
			 
			 if(select2.isSelected ()){

	               System.out.println("Seleciono Musica");
				 }
			
			
		}}	
	
	private class accionCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent argo) {
			
			String item = generos[Genero.getSelectedIndex()];			
			System.out.println(item);
		}
		
	}
	
	private class AccionSlider implements ChangeListener{
	

		@Override
		public void stateChanged(ChangeEvent arg0) {
			
			int rojo, verde, azul;
			
			rojo= color1.getValue();
			lbcolor1.setText("Rojo:"+rojo);
			
			verde = color2.getValue();
			lbcolor2.setText("Verde:"+verde);
			
			azul= color3.getValue();
			lbcolor3.setText("Azul:"+azul);
			
			Colorpanel.setBackground(new Color(rojo,verde,azul));
			
		}
	}
}
