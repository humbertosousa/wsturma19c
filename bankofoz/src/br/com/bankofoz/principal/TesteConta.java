package br.com.bankofoz.principal;

import javax.swing.JOptionPane;

import br.com.bankofoz.beans.Agencia;
import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;

public class TesteConta {

	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(1,"Xpto","123.456.789.99");
		Agencia agencia = new Agencia(1234,"GAMA","1234-4321");
		double saldo = 1000;
		int numero = 123456;
		Conta conta = new Conta();
		if (JOptionPane.showConfirmDialog(null, "Corrente?", "Title", JOptionPane.YES_NO_OPTION)==0) {
			conta = new Corrente(
					numero,	saldo, cliente,	agencia,
					5000, // limite
					50 // taxa da conta corrente
					);
		}else {
			conta = new Poupanca(
					numero,	saldo, cliente, agencia,
					0.05, // rendimento
					10 // dia do aniversário da poupanca
					);
		}
		
		System.out.println("Sacar: " + conta.sacar(2000));
		System.out.println(conta.toString());
		System.out.println(conta.getResumo());
		System.out.println(conta.getSaldo());
		
		
		
		
		
		
	}
	
}
