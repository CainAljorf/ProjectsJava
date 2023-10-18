package exam_templates;

import javax.swing.JOptionPane;

public class n_primeros_impares {

	public static void main(String[] args) {

		int cont=0;
		int prod=1;
		int num=0;
		String num_input="";
		String cad="";
		
		while(cont<3) {
			boolean conversion = false;
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Escribe números, cuando reciba 3 impares terminará el programa: ","Ingrese número",JOptionPane.QUESTION_MESSAGE);
					if(num_input==null){
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						num=Integer.parseInt(num_input);
						conversion=true;
					}//end if
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
					conversion=false;
				}//end try catch
			}while(conversion==false);
			if((num%3)==0) {
				prod=prod*num;
				cont++;
			}//end if
		}//end while
		cad="El producto del los 3 primeros números impares es: "+prod+". \n";
		JOptionPane.showMessageDialog(null, cad,"Resultado1",JOptionPane.INFORMATION_MESSAGE);
	}//end main
}//end class
