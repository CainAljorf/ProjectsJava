package exam_templates;

import javax.swing.JOptionPane;

public class desea_continuar_media_pares {

	public static void main(String[] args) {
		int continuar = 0;
		int num1=0;
		int cont=0;
		float suma=0.0f;
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
			if((num1%2)==0) {
				suma = suma + num1;
				cont++;
			}//end if
			continuar = JOptionPane.showConfirmDialog(  null, "Desea continuar?");
		}while(JOptionPane.OK_OPTION == continuar);
		if(cont==0) {
			cad=cad+"Error 503, no se puede dividir entre 0.";
		}else {
			cad="La media es "+(float)(suma/cont)+". \n";
		}
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
