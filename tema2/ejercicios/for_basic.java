package ejercicios;

import javax.swing.JOptionPane;

public class for_basic {

	public static void main(String[] args) {
		//Programa para mostrar del 1 al 10 en una sola pantalla con un for.
		String cad= "";
		for(int i=1;i<=10;i++) {
			cad=cad+(i+"\n");
		}//end for
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		
	}//end main

}//end class
