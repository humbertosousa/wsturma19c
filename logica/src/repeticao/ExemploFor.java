package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * Sintaxe do for:
		 * 1� variavel que vai contar
		 * 2� condi��o 
		 * 3� como ele vai contar?
		 */
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int contador=0;contador<11;contador+=1) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		}
		
		/*
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		int contador=0;
		while(contador<=100) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
			contador++;
		}*/
		
		
		
	}
	
	
}
