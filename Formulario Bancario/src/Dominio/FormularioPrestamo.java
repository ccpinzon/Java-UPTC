package Dominio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class FormularioPrestamo extends JPanel {
	
	private JLabel Lbtitulo1, LbNombres, LbIdentificacion, LbTitulo2, LbMonto, LbNumCuentas, LbValCuenta;
	private JTextField TxNombres, TxIdentificacion, TxMonto, TxValorCuenta;
	private JRadioButton RbCc, RbCe;
	private ButtonGroup Gc;
	private JComboBox CbNumeroCuentas;
	private JButton BtCalcular;
	
	public FormularioPrestamo () {
		
		inicializarComponentes();
		agregarComponentes();
	}
	
	public void inicializarComponentes(){
		
		Lbtitulo1 = new JLabel("Sistemas Bancario");
		LbNombres = new JLabel("Nombres Y Apellidos");
		LbIdentificacion = new JLabel("N° Identificacion");
		LbTitulo2 = new JLabel("Datos Prestamos");
		LbMonto = new JLabel("Monto Solicitado");
		LbNumCuentas = new JLabel("Numero Cuentas");
		LbValCuenta = new JLabel("Valor Cuenta");
		
		TxNombres = new JTextField(10);
		TxIdentificacion = new JTextField(10);
		TxMonto = new JTextField(10);
		TxValorCuenta = new JTextField(10);
		
		RbCc = new JRadioButton("CC");
		RbCe = new JRadioButton("CE");
		
		Gc = new ButtonGroup();
		Gc.add(RbCc);
		Gc.add(RbCe);
		
		Integer [] NumeroCuentas = {12,24,36,48};
		CbNumeroCuentas = new JComboBox (NumeroCuentas);
		
		BtCalcular = new JButton("Calcular");
		BtCalcular.addActionListener(new AccionCalcular());	}
	
	
	 private void  agregarComponentes(){
		 
		 add(Lbtitulo1);
		 add(LbNombres);
		 add(TxNombres);
		 add(LbIdentificacion);
		 add(TxIdentificacion);
		 add(RbCc);
		 add(RbCe);
		 add(LbTitulo2);
		 add(LbMonto);
		 add(TxMonto);
		 add(LbNumCuentas);
		
		 add(CbNumeroCuentas);
		 add(BtCalcular);
		 add(LbValCuenta);
		 add(TxValorCuenta);
	 }
	
	
	
	
	
	private class AccionCalcular implements ActionListener{
		
		@Override
	
	public void actionPerformed(ActionEvent argo) {
			Long Montosolicitado;
			Integer numeroCuentas;
			float valorcuenta;
			Montosolicitado = Long.parseLong(TxMonto.getText());
			numeroCuentas = (Integer)CbNumeroCuentas.getSelectedItem();
			valorcuenta = Montosolicitado / numeroCuentas;
			TxValorCuenta.setText(Float.toString(valorcuenta));
			
			
		
		
	}}
	


}
