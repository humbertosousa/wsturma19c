package util;

import javax.swing.JOptionPane;

public class Magica {

	public static boolean b(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION)==0){
				return true;
		}else {
			return false;
		}
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static double d(String msg) {
		return Double.parseDouble(s(msg));
	}

	
	
}
