package funciones;

import javax.swing.JOptionPane;

public class validar_int {

	public static int valida_int () {
		int num1 = 0;
		String num_input="";
		boolean conversion = false;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, "Escribe un número: ","Introducir número",JOptionPane.QUESTION_MESSAGE);
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
		return num1;


	}

}
