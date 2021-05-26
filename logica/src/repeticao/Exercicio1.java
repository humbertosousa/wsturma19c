package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		 /* Exercicio 1
		 * Peça para o usuário digitar o valor da tabuada que ele deseja visualizar.
		 * Monte o laço para que apresente o resultado da tabuada, da seguinte forma:
		 * 
		 * numero x 0 = resultado
		 * numero x 1 = resultado
		 * (...)  x 100 = resultado
		 */ 
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		int contador=0;
		while(contador<=100) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
			contador++;
		}
		
		/*
		do {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
			contador++;
		}while(contador<=100);
		*/
		
		
		
		
		
		
	}
	
	
}
