package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
	// main() é o start point de uma aplicação Java
	// é a chave de ignição do carro
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
		 * Alfanumérico: é um texto, parte de um texto ou um número
		 * que não será utilizado em operações matemáticas.
		 * CEP (RH do Itau) => 00010-009 => 
		 * Em Javanês: String
		 * 
		 * Numérico: representa um dado que PODE ser utilizado em 
		 * expressões matemáticas e/ou é considerado um dado crítico para o 
		 * contexto.
		 * CEP (Aplicação dos correios) => ?0010009
		 * CPF (aplicação da receita federal)
		 * Funcional (entre os colaboradores do Itau)
		 * RM (entre os alunos de uma faculdade)
		 * Em Javanês:
		 * - int => para representação de números inteiros
		 * - double => para números reais (com casas decimais)
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	// Em um classe encontramos: métodos e atributos
	// Nossa classe é publica
	/*
	 * JVM é o interpretador do Java
	 * JRE é o ambiente de execução
	 * JDK é o ambiente para desenvolvimento Java
	 *
	 */
	
} // fechando o bloco da classe TiposDados
