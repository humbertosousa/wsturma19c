package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	/*
	 * Tipos Primitivos (TODOS aqueles que começam com letra minuscula)
	 * boolean => Lógico (True/False)
	 * char => um caracter entre apostrofos
	 * 
	 * byte => -128/+127
	 * short => -32 mil / + 32 mil
	 * int => -2 trilhoes / + 2 trilhoes
	 * long => (-) 9 quintilhoes / (+) 9 quintilhoes
	 * 
	 * float => até 5 casas decimais.
	 * double => acima disso. 
	 */
	public static void main(String[] args) {
		
		
		String produto = JOptionPane.showInputDialog("Produto");
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		float total = valor*qtde;
		float imposto = total* (float) 0.17; // cast => casting (ajuste de tamanho)
		System.out.println("Total...: " + total);
		System.out.println("Imposto.: " + (total*0.17));
		
		
		/*
		 * Capturem:
		 * - nome do produto
		 * - qtde do produto
		 * - valor unitario
		 * exibir no final:
		 * - nome do produto
		 * - valor total
		 * - valor do imposto (17% sobre o valor total)
		 */
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
