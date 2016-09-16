package logic;

public class CuentaCorriente extends Cuenta{

	public double SALDO_MINIMO=20000;
	
	public CuentaCorriente() {

	}

	public CuentaCorriente(double sALDO_MINIMO) {
		super();
		SALDO_MINIMO = sALDO_MINIMO;

	}
	
	
	
	
	
	public double getSALDO_MINIMO() {
		return SALDO_MINIMO;
	}

	public void setSALDO_MINIMO(double sALDO_MINIMO) {
		SALDO_MINIMO = sALDO_MINIMO;
	}

	@Override
	public void Retirar(double ValorRetiro) {
		// TODO Auto-generated method stub
		Boolean n;
		if (ValorRetiro <= (getSaldo() - SALDO_MINIMO)) {
			setSaldo(getSaldo() - ValorRetiro);
			n = true;
		} else
			n = false;
		
	}

	@Override
	public void Consignar(double ValorConsignar) {

		setSaldo(getSaldo() + ValorConsignar);
		
	}

	@Override
	public void Transferir(double ValorTransferencia, Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.Retirar(ValorTransferencia);
		cuenta.Consignar(ValorTransferencia);
		
	}

	
	
	

}
