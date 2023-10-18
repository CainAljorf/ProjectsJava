package ejercicios;

import javax.swing.JOptionPane;

public class while_basic {

	public static void main(String[] args) {
		//Programa para mostrar del 1 al 10 en una sola pantalla con un while.
		int i=1;
		String cad="";
		while(i<=10) {
			cad=cad+(i+"\n");
			i++;
			
		}//end while
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		
	}//end main
	
}//end class
