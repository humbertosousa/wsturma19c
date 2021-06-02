package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Endereco;

public class TesteCliente2 {

	public static void main(String[] args) {
		//<tipo de dado> <nome da variavel> = <valor>
		Cliente objeto = new Cliente();
		
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua X");
		endereco.setNumero("50");
		endereco.setComplemento("");
		endereco.setBairro("Centro");
		endereco.setCidade("São Paulo");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
		
		objeto.setAll(endereco, 1, "Xpto", "xpto@xpto.com.br", "1234-4321");
		
		System.out.println(objeto.toString());
		System.out.println("Bairro: " + objeto.getEndereco().getBairro());
		
		System.out.println("Usuário: " + objeto.getUsuario());
		
		
	}
	
	
	
}
