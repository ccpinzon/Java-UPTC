package Dominio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutFocusTraversalPolicy;

public class EvaluacionLabel extends JPanel {
	
	private JLabel lbTitulo, lbFecha, lbCodgio, lbNombre, lbSemestre, lbGenero, lbPregunta, lbP1, lbP2, lbP3, lbP4, lbP5, lbLinea, lbRes1, lbRes2, lbRes3, lbRes4, lbRes5, lbNota;
	private JTextField txNombre, txCodigo;
	private JButton btEnviar;
	private JComboBox semestre;
	String semestres []={"1","2","3","4","5","6","7","8","9","10"};
	private JRadioButton femenino, masculino, P1_1, P1_2, P1_3, P1_4, P2_1, P2_2, P2_3, P2_4, P3_1, P3_2, P3_3, P3_4, P4_1, P4_2, P4_3, P4_4, P5_1, P5_2, P5_3, P5_4;
	private ButtonGroup Gg, GP1, GP2,GP3, GP4, GP5;
	int nota=0;
	
	public EvaluacionLabel(){
		
		setPreferredSize(new Dimension(150,500));
		
		lbTitulo = new JLabel("UPTC Evaluacion Programacion");
		lbFecha = new JLabel("Fecha");
		lbCodgio = new JLabel("Codigo");
		lbNombre = new JLabel("Nombre");
		lbSemestre = new JLabel("Semestre");
		lbGenero = new JLabel("Genero");
		lbLinea = new JLabel("________________________");
		lbPregunta = new JLabel("PREGUNTAS");
		lbP1 = new JLabel("¿Cual de los siguientes es un lenguaje de programacion?");
		lbP2 = new JLabel("¿Que es el IF en Java?");
		lbP3 = new JLabel("¿Como realizamos un ciclo infinito en java?");
		lbP4 = new JLabel("¿Para que sirve el FOR en java?");
		lbP5 = new JLabel("¿Que es Andriod?");
		lbNota = new JLabel();
		lbRes1 = new JLabel();
		lbRes2 = new JLabel();
		lbRes3 = new JLabel();
		lbRes4 = new JLabel();
		lbRes5 = new JLabel();
		
		txCodigo = new JTextField(10);
		txNombre = new JTextField(10);
		
		btEnviar = new JButton("Enviar");
		btEnviar.addActionListener(new AccionBoton());
		
		semestre = new JComboBox(semestres);
		
		
		Gg = new ButtonGroup();
		masculino = new JRadioButton("Masculino");
		femenino = new JRadioButton("Femenino");
		Gg.add(femenino);
		Gg.add(masculino);
		
		
		GP1 = new ButtonGroup();
		P1_1 = new JRadioButton("Java");
		P1_2 = new JRadioButton("MP3");
		P1_3 = new JRadioButton("Auto");
		P1_4 = new JRadioButton("Perro");
		GP1.add(P1_1);
		GP1.add(P1_2);
		GP1.add(P1_3);
		GP1.add(P1_4);
		
		GP2 = new ButtonGroup();
		P2_1 = new JRadioButton("Peliculas");
		P2_2 = new JRadioButton("Dibujos");
		P2_3 = new JRadioButton("Un Condicional");
		P2_4= new JRadioButton("Un Caballo");
		GP2.add(P2_1);
		GP2.add(P2_2);
		GP2.add(P2_3);
		GP2.add(P2_4);
		
		GP3 = new ButtonGroup();
		P3_1 = new JRadioButton("Con Una Llave");
		P3_2 = new JRadioButton("Con Un While");
		P3_3 = new JRadioButton("Un Else");
		P3_4 = new JRadioButton("Un Candado");
		GP3.add(P3_1);
		GP3.add(P3_2);
		GP3.add(P3_3);
		GP3.add(P3_4);
		
		GP4 = new ButtonGroup();
		P4_1 = new JRadioButton("Ver TV");
		P4_2 = new JRadioButton("Llover");
		P4_3 = new JRadioButton("Cantar");
		P4_4 = new JRadioButton("Realizar Ciclos");
		GP4.add(P4_1);
		GP4.add(P4_2);
		GP4.add(P4_3);
		GP4.add(P4_4);
		
		GP5 = new ButtonGroup();
		P5_1 = new JRadioButton("Un Sistema Operativo Movil");
		P5_2 = new JRadioButton("un Gato");
		P5_3 = new JRadioButton("Un Robot");
		P5_4 = new JRadioButton("Un Numero");
		GP5.add(P5_1);
		GP5.add(P5_2);
		GP5.add(P5_3);
		GP5.add(P5_4);
		
		
		add(lbTitulo);
		add(lbFecha);
		add(lbCodgio);
		add(txCodigo);
		add(lbNombre);
		add(txNombre);
		add(lbSemestre);
		add(semestre);
		add(lbGenero);
		add(masculino);
		add(femenino);
		add(lbLinea);
		add(lbPregunta);
		add(lbP1);
		add(P1_1);
		add(P1_2);
		add(P1_3);
		add(P1_4);
		add(lbRes1);
		add(lbP2);
		add(P2_1);
		add(P2_2);
		add(P2_3);
		add(P2_4);
	    add(lbRes2);
		add(lbP3);
		add(P3_1);
		add(P3_2);
		add(P3_3);
		add(P3_4);
		add(lbRes3);
		add(lbP4);
		add(P4_1);
		add(P4_2);
		add(P4_3);
		add(P4_4);
		add(lbRes4);
		add(lbP5);
		add(P5_1);
		add(P5_2);
		add(P5_3);
		add(P5_4);
		add(lbRes5);
		add(btEnviar);
		add(lbNota);
		
		
		
		
	}
	private class AccionBoton implements ActionListener{
		
	@Override
	public void actionPerformed(ActionEvent e) {
				
		if(P1_1.isSelected()){
			lbRes1.setText("correcto");
			nota++;}
		else{ lbRes1.setText("incorrecto");}
		
		if(P2_3.isSelected()){
			lbRes2.setText("correcto");
			nota++;}
		else{ lbRes2.setText("incorrecto");}
		
		if(P3_2.isSelected()){
			lbRes3.setText("correcto");
			nota++;}
		else{ lbRes3.setText("incorrecto");}
		
		if(P4_4.isSelected()){
			lbRes4.setText("correcto");
			nota++;}
		else{ lbRes4.setText("incorrecto");}
		
		if(P5_1.isSelected()){
			lbRes5.setText("correcto");
			nota++;}
		else{ lbRes5.setText("incorrecto");}
		
		
			
		
		
		
		lbNota.setText("Su Nota Es:"+String.valueOf(nota));
		
	}}
	


	
    
	
}
