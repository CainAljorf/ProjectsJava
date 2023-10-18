package ejercicios;

import javax.swing.JOptionPane;

public class n_numero {
	public static void main(String[] args) {
		
		int num1=0;
		String num_input1="";
		String cad="";
		boolean conversion = false;
		do{
			try{
				num_input1=JOptionPane.showInputDialog(null, "Escribe un número y te mostraré su tabla de multiplicar. ","Pregunta",JOptionPane.QUESTION_MESSAGE);
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
		for(int i=1;i<=10;i++) {
			cad = cad + (num1+" x "+i+" = "+(i*num1)+"\n");
		}
		JOptionPane.showMessageDialog(null, cad);
	}//end main
}//end class
