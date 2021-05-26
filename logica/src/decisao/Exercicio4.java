package decisao;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3"));
		if (valor1!=valor2 && valor2!=valor3 && valor3!=valor1) {
			if (valor1<valor2 && valor1<valor3) {
				System.out.println(valor1);
				// 2 ou 3
				if (valor2<valor3) {
					System.out.println(valor2);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor2);					
				}
			}else if (valor2<valor1 && valor2<valor3) {
				System.out.println(valor2);
				// 1 ou 3
				if (valor1<valor3) {
					System.out.println(valor1);
					System.out.println(valor3);
				}else {
					System.out.println(valor3);
					System.out.println(valor1);					
				}
			}else {
				System.out.println(valor3);
				// 1 ou 2
				if (valor1<valor2) {
					System.out.println(valor1);
					System.out.println(valor2);
				}else {
					System.out.println(valor2);
					System.out.println(valor1);
				}
			}
		}else {
			System.out.println("Existem valores iguais");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
