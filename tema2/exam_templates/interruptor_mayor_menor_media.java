package exam_templates;

import javax.swing.JOptionPane;

public class interruptor_mayor_menor_media {

	public static void main(String[] args) {
		int num1=0;
		int cont=0;
		int mayor=0;
		int menor=0;
		int cont_media=0;
		float suma = 0;
		String cad="";
		String num_input = "";
		boolean interruptor=false;
		while(interruptor==false){
			boolean conversion = false;
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Escribe números, se le mostrará la media de todos ellos, el mayor y el menor. Ingrese '-1' para salir : ","Ingresar número",JOptionPane.QUESTION_MESSAGE);
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
			if(num1==-1) {
				interruptor=true;
			}else {
				if(cont==0) {
					cont++;
					mayor=menor=num1;
				} //end if
				if(num1>mayor){
					mayor=num1;
				}//end if
				if(num1<menor){
					menor=num1;
				}
				cad="El numero mayor ingresado es "+ mayor + " y el menor "+ menor + ". \n";
				suma = suma+num1;
				cont_media++;
			}//end if
		}//end while
		if(cont_media==0) {
			cad=cad+"Error 503, no se puede dividir entre 0.";
		}else {
			cad=cad+"La media es "+(float)(suma/cont_media)+". \n";
		}
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
