package ejercicios;

import javax.swing.JOptionPane;

public class switch_letras {
	public static void main(String[] args) {
		int cont_a=0,cont_e=0,cont_i= 0,cont_o = 0, cont_u = 0, otros=0;
		int num1=0;
		String cad="";
		String input="";
		String num_input="";
		boolean conversion = false;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, "¿Cuántas letras quieres introducir? ","Instrucciones",JOptionPane.QUESTION_MESSAGE);
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
		for(int i = 0;i<num1;i++) {
			input=JOptionPane.showInputDialog(null,"Introduce la letra que quieras y te dire cuantas vocales de cada tipo has introducido y el resto:","Instrucciones",JOptionPane.QUESTION_MESSAGE);
			
			switch(input) {
	
				case "a":
					cont_a++;
					cad=cad+"Has introducido "+cont_a+" A. \n";
					break;
				case "e":
					cont_e++;
					cad=cad+"Has introducido "+cont_e+" E. \n";
					break;
				case "i":
					cont_i++;
					cad=cad+"Has introducido "+cont_i+" I. \n";
					break;
				case "o":
					cont_o++;
					cad=cad+"Has introducido "+cont_o+" O. \n";
					break;
				case "u":
					cont_u++;
					cad=cad+"Has introducido "+cont_u+" U. \n";
					break;
				default:
					otros++;
					cad=cad+"Has introducido "+otros+" del resto de carácteres o números. \n";
					break;
			}//end switch
		}
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	
	}//end main
}
