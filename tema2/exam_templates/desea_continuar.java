package exam_templates;

import javax.swing.JOptionPane;

public class desea_continuar {
	public static void main(String[] args) {
		
		int confirmado = 0;
		
		do{
			System.out.println("el valor de " + 1);
			confirmado = JOptionPane.showConfirmDialog(  null, "Desea continuar?");
		}while(JOptionPane.OK_OPTION == confirmado);
		
	}//end main
}//end class
