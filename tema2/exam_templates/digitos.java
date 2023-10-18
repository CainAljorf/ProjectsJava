package exam_templates;

import javax.swing.JOptionPane;

public class digitos {

	public static void main(String[] args) {
		int num1 = 0,num2=0,suma=0;

		int num_copia=0,num=0,digito=0;
		String num_input,num_input2,cad,cad_suma,cad_dig=" ";
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
		num_copia=num;
		while(num!=0) {
			digito = num%10;
			num=num/10;
			cad_dig=cad_dig+"\n"+digito;
		}//end while
		
		cad="Los dígitos de "+num_copia+" son: "+cad_dig+"\n";
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);

	}

}