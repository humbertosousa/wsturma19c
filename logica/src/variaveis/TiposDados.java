package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	// main() � o start point de uma aplica��o Java
	// � a chave de igni��o do carro
	public static void main(String[] args) {
		
		// Sintaxe: <Tipo de dado> <nome da variavel> = <dado>;
		
		String nome=JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura= Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " + idade);
		System.out.println("Altura.: " + altura);
		System.out.println("IMC....: " + imc);
		
		/*
		 * Alfanum�rico: � um texto, parte de um texto ou um n�mero
		 * que n�o ser� utilizado em opera��es matem�ticas.
		 * CEP (RH do Itau) => 00010-009 => 
		 * Em Javan�s: String
		 * 
		 * Num�rico: representa um dado que PODE ser utilizado em 
		 * express�es matem�ticas e/ou � considerado um dado cr�tico para o 
		 * contexto.
		 * CEP (Aplica��o dos correios) => ?0010009
		 * CPF (aplica��o da receita federal)
		 * Funcional (entre os colaboradores do Itau)
		 * RM (entre os alunos de uma faculdade)
		 * Em Javan�s:
		 * - int => para representa��o de n�meros inteiros
		 * - double => para n�meros reais (com casas decimais)
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	// Em um classe encontramos: m�todos e atributos
	// Nossa classe � publica
	/*
	 * JVM � o interpretador do Java
	 * JRE � o ambiente de execu��o
	 * JDK � o ambiente para desenvolvimento Java
	 *
	 */
	
} // fechando o bloco da classe TiposDados
