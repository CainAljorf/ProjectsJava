package exam_templates;

import javax.swing.JOptionPane;

public class n_num_for_divisores {

	public static void main(String[] args) {
		int prod=1;
		int num1=0,num2=0;
		String num_input1,num_input2="";
		String cad="";
		String cad_div,cad_20="";
		boolean conversion = false;
		do{
			try{
				num_input1=JOptionPane.showInputDialog(null, "¿Cuántos números quieres introducir? ","Pregunta",JOptionPane.QUESTION_MESSAGE);
				if(num_input1==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					num1=Integer.parseInt(num_input1);
					conversion=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
				conversion=false;
			}
		}while(conversion==false);
		for(int i=1;i<=num1;i++) {
			do{
				try{
					num_input2=JOptionPane.showInputDialog(null, "Escribe números para sacar los divisores: ","Información",JOptionPane.QUESTION_MESSAGE);
					if(num_input2==null){
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						num2=Integer.parseInt(num_input2);
						conversion=true;
					}//end if
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
					conversion=false;
				}
			}while(conversion==false);
			cad_div = "";
			prod= 1;
			for(int j=1;j<=num2;j++) {
				if((num2%j)==0) {
					prod=prod*j;
					if (cad_div.isEmpty()) {  //Comprueba si la cadena está vacía para colocar el divisor, de esta forma la primera iteración no pondrá la coma.
			            cad_div = cad_div + j;
			        } else {
			            cad_div = cad_div + "," + j;
			        }
				}
			}
			if(prod>=20) {
				cad_20=cad_20+"El producto de los divisores de "+num2+" es mayor a 20.\n";
			}else{
				cad_20=cad_20+"El producto de los divisores de "+num2+" es menor a 20.\n";
			}//end if
			cad="Los divisores de "+num2+" son:"+cad_div+"\n"+cad+"\n";
		}//end for
		
		JOptionPane.showMessageDialog(null, cad+cad_20);
	}
}
