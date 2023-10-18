package exam_templates;

import javax.swing.JOptionPane;

public class interruptor_digitos_mayor_menor {
	public static void main(String[] args) {
		int num=0,num_copia=0,digito=0;
		int cont=0;
		int mayor=0;
		int menor=0;
		String cad = "";
		String num_input= "";
		boolean interruptor=false;
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
			if(num== -1) {
				interruptor=true;
			}
			else{
				cont=0;
				num_copia=num;
				while(num!=0) {
					digito = num%10;
					num=num/10;
					if(cont==0) {
						cont++;
						mayor=menor=digito;
					} //end if
					if(digito>mayor){
						mayor=digito;
					}//end if
					if(digito<menor){
						menor=digito;
					}//end if
				}//end while
				cad=cad+"El dígito mayor de "+ num_copia+" es "+ mayor + " y el menor "+ menor + ". \n";
			}//end if
		}//end while
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end main
}//end class
