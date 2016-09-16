package logic;



public class CuentaAhorro extends Cuenta {

	public double SALDO_MINIMO = 10000;

	public CuentaAhorro() {

	}

	public CuentaAhorro(double sALDO_MINIMO) {
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
		Boolean n;
		if (ValorRetiro <= (getSaldo() - SALDO_MINIMO)) {
			setSaldo(getSaldo() - ValorRetiro);
			n = true;
		} else
			n = false;
	}

	@Override
	public void Consignar(double ValorConsiganar) {
				
		   setSaldo(getSaldo() + ValorConsiganar);
					
	}

	@Override
	public void Transferir(double ValorTransferir,Cuenta cuenta) {
		
		this.Retirar(ValorTransferir);
		cuenta.Consignar(ValorTransferir);
		
		
	}

	
	
	

}
