package br.com.bankofoz.beans;
/*
 * Polimorfismo:
 * � o pilar que admite um elemento ter o mesmo nome e executar v�rias a��es distintas.
 * => Objeto
 * Quando fazendo uso da heran�a, criamos o objeto pelo pai e instanciamos pelo filho.
 * Exemplo:
 * Conta conta = new Corrente();
 * => M�todo
 * Dois tipos:
 * Overload (sobrecarga)=> quando os m�todos est�o na mesma classe (desacelerar() da classe Veiculo)
 * Override (sobrescrita) => quando os m�todos est�o em classes distintas (pai e filha) 
 * Exemplo: getResumo() => est� na classe Conta, Corrente e na classe Poupanca
 */
public class Conta {

	private int numero;
	private double saldo;
	private Cliente cliente;
	private Agencia agencia;
	
	public String getResumo() {
		return "Saldo: " + saldo + "\n" + "Cliente: " + cliente.getNome();
	}
	
	public boolean depositar(double valor) {
		if (valor>0) {
			saldo+=valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean sacar(double valor) {
		if (valor<=saldo) {
			saldo-=valor;
			return true;
		}else {
			return false;
		}
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Conta(int numero, double saldo, Cliente cliente, Agencia agencia) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
	}
	public Conta() {
		super();
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + ", agencia=" + agencia + "]";
	}
	
	
	
}
