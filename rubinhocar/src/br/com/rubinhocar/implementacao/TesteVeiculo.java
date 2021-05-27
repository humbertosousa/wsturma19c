package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		// 1º Instanciar o objeto
		Veiculo objeto = new Veiculo(); // instancia um objeto 
		
		// 2º Preencher os atributos do objeto
		objeto.preencherModelo("camaro");
		objeto.preencherValor(200000);
		
		// 3º Exibir os resultados
		System.out.println(objeto.retornarTudo());
		System.out.println(objeto.ligar());
		objeto.acelerar(20);
		objeto.acelerar(10);
		objeto.desacelerar(15);
		System.out.println("Depois de ligar: \n" + objeto.retornarTudo());
		objeto.desligar();
		System.out.println("Depois de desligar: \n" + objeto.retornarTudo());
		
		
		
		
		
		
	}
	
	
	
}
