package ejercicios;

import javax.swing.JOptionPane;

public class pedir_num {

	public static void main(String[] args) {
		int num1 = 0;
		int prod=1;
		String num_input,cad=" ";
		boolean conversion = false;
		
		
		for(int i= 0;i<=5;i++) {
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Escribe un número: ","Número",JOptionPane.QUESTION_MESSAGE);
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
			prod=prod*num1;
		}
		cad="El producto de los 5 números es "+prod;
		JOptionPane.showMessageDialog(null, cad);
	
	}

}
