package br.com.bankofoz.beans;
/*
 * Nas classes filhas CUIDADO:
 * - construtor cheio
 * - toString()
 */
public class Corrente extends Conta{

	private double limite;
	private double taxa;
	
	public String getResumo() {
		return "Limite: " + limite + "\nTaxa: " + taxa + 
				"\nSaldo: " + super.getSaldo() + "\nCliente: " + super.getCliente().getNome();
	}
	
	public double getSaldo() {
		return limite + super.getSaldo();
	}
	
	public boolean sacar(double valor) {
		double resultado = limite + super.getSaldo();
		if (resultado>=valor) {
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}
	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, double limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public Corrente() {
		super();
	}
	
	
	
}
