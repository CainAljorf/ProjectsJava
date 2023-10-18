package ejercicios;

import javax.swing.JOptionPane;

public class intro_num {

	public static void main(String[] args) {
		
		int num1 = 0,suma = 0;
		String num_input,cad=" ";
		boolean interruptor= false;
		
		while(interruptor==false) {
			boolean conversion = false;
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Escribe números para sumarlos, se parará el programa cuando introduzcas un 5.: ","Primer número",JOptionPane.QUESTION_MESSAGE);
					if(num_input==null){
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						num1=Integer.parseInt(num_input);
						conversion=true;
					}//end if
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
					conversion=false;
				}
			}while(conversion==false);
			if(num1==5) {
				interruptor = true;
			}else {
				suma = suma + num1;
			}
		}//end while
		cad = "La suma total es "+suma;
		JOptionPane.showMessageDialog(null, cad, "Error",JOptionPane.INFORMATION_MESSAGE);
	}//end main
}//end class
