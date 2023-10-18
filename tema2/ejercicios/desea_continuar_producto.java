package ejercicios;

import javax.swing.JOptionPane;

public class desea_continuar_producto {

	public static void main(String[] args) {
		int confirmado = 0;
		int num1=0;
		int prod=1;
		String cad="";
		do{
			
			String num_input=" ";
			boolean conversion = false;
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Escribe el primer número: ","Primer número",JOptionPane.QUESTION_MESSAGE);
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
			confirmado = JOptionPane.showConfirmDialog(  null, "Desea continuar?");
		}while(JOptionPane.OK_OPTION == confirmado);
		cad="El producto es: "+prod+".";
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
