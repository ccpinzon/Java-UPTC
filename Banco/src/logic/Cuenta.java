package logic;

import java.util.Calendar;

public abstract class Cuenta {
	
	private String numeroCuenta;
	private double saldo;
	

	public Cuenta (){
		
	}

	public Cuenta(String numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public abstract void Retirar(double ValorRetiro);
	
	public abstract void Consignar(double ValorConsignar);
	
	public abstract void Transferir(double ValorTransferir, Cuenta cuenta);
	
	
	
	
	
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo
				+ "]";
	}
	
	public class Transaccion {
		
		private Calendar fechaTransaccion;
		private double saldoTransaccion;
		private EtipoTransaccion tipoTransaccion;
		
		public Transaccion(){
					
					}

		public Calendar getFechaTransaccion() {
			return fechaTransaccion;
		}

		public void setFechaTransaccion(Calendar fechaTransaccion) {
			this.fechaTransaccion = fechaTransaccion;
		}

		public double getSaldoTransaccion() {
			return saldoTransaccion;
		}

		public void setSaldoTransaccion(double saldoTransaccion) {
			this.saldoTransaccion = saldoTransaccion;
		}

		public EtipoTransaccion getTipoTransaccion() {
			return tipoTransaccion;
		}

		public void setTipoTransaccion(EtipoTransaccion tipoTransaccion) {
			this.tipoTransaccion = tipoTransaccion;
		}

		@Override
		public String toString() {
			return "Transaccion [fechaTransaccion=" + fechaTransaccion
					+ ", saldoTransaccion=" + saldoTransaccion
					+ ", tipoTransaccion=" + tipoTransaccion + "]";
		}
		
		 
	}	
	
}
