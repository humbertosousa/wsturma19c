package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diárias"));
		float valorDiaria = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		float taxa=0;
		if (diarias>10) {
			taxa = valorDiaria * (float) 0.05;
		}else if (diarias<5) {
			taxa = valorDiaria * (float) 0.1;
		}else {
			taxa = valorDiaria * (float) 0.08;
		}
		float total = (valorDiaria+taxa)*diarias;
		System.out.printf("Total: %.2f", total);
		//System.out.printf("Diarias: %d \n Valor: %f \n Taxa: %f \n Total: %f", diarias, valorDiaria, taxa, total);
		/*
		 * Exercicio 2:
		 * Considere receber a quantidade de diárias de um hotel e o valor
		 * da diária. Sobre a diária haverá uma taxa que depende da quantidade
		 * de diárias.
		 * Se a quantidade de diárias for maior que 10 a taxa será de 5%
		 * Se a quantidade estiver entre 5 e 10 a taxa será de 8%
		 * Se a quantidade de diarias for menor que 5 a taxa será de 10%
		 * Exiba o valor final.*/
		
		
	}
	
}
