package ejercicios;

import javax.swing.JOptionPane;

public class interruptor_digitos {
	public static void main(String[] args) {
		boolean interruptor=false;
		int num=0,num_copia=0,digito=0;
		int prod = 1;
		String cad = "";
		String cad_50="";
		String num_input= "";
		while(interruptor==false) {
			boolean conversion = false;
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Escribe un número: ","Introducir número",JOptionPane.QUESTION_MESSAGE);
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
				}
			}while(conversion==false);
			if(num== -5) {
				interruptor=true;
			}
			else{
				num_copia=num;
				prod=1;
				while(num!=0) {
					digito = num%10;
					num=num/10;
					if(((digito%2)==0)||(digito%3)==0){
						prod=prod*digito;
					}//end if
				}//end while
				if(prod>=50) {
					cad_50=cad_50+"El producto de los dígitos múltiplos de 2 o de 3 del número "+num_copia+" es mayor a 50.\n";
				}else{
					cad_50=cad_50+"El producto de los dígitos múltiplos de 2 o de 3 del número "+num_copia+" es menor a 50.\n";
				}//end if
				cad="El producto de los dígitos múltiplos de 2 o de 3 del número "+num_copia+" es "+prod+". \n"+cad;
			}//end if
			
		}//end while
		
		JOptionPane.showMessageDialog(null, cad+cad_50,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		
	}//end main
}
