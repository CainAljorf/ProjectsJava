package exam_templates;

import javax.swing.JOptionPane;

public class divisores {

	public static void main(String[] args) {
		int num=0;
		String num_input;
		String cad,cad_div= "";
		boolean conversion = false;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, "Escribe el primer número: ","Primer número",JOptionPane.QUESTION_MESSAGE);
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
		for(int i=1;i<=num;i++) {
			if((num%i)==0) {
				cad_div=cad_div+"\n"+i;
			}
		}
		cad= "Los divisores de "+num+" son: ";
		JOptionPane.showMessageDialog(null, cad+cad_div);
	}

}
