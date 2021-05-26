package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	
	public static void main(String[] args) {
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		
		while (ano<1920 || ano>2003) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		}
		
		while (mes<1 || mes>12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
		}
		
		if (mes==2) { // o mes com 29 dias
			while(dia<1 || dia>29) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			}
		}else if(mes==4 || mes==6 || mes==9 || mes==11) { // para os meses com 30 dias
			while(dia<1 || dia>30) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			}
		}else { // para os meses com 31 dias
			while(dia<1 || dia>31) {
				dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			}
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		
		/*
		 * Capturem separadamente: dia, mes e ano
		 * 
		 * Para o dia somente será aceito a qtde de dias
		 * de acordo com o mês (considere fevereiro somente com 29 dias)
		 * 
		 * Para o mês aceite somente valores entre 1 e 12
		 * 
		 * Para o ano aceite somente valores entre 2003 e 1920
		 * 
		 * No final exibir a data completa
		 */
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
