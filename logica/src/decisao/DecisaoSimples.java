package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		float media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.println("Parab�ns voc� foi aprovado!");
		}
		
		if (media < 4) {
			System.out.println("Infelizmente voc� foi reprovado!");
		}

		// && => and
		// || => or
		if (media<6 && media>=4) {
			System.out.println("Voc� ainda tem uma chance no exame");
		}
		
		System.out.println("Sua m�dia na disciplina: " + disciplina + " foi: " + media);
		

	
	
	
	
	
	
	
	
	}
}
