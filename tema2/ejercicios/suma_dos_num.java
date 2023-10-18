package ejercicios;
import javax.swing.JOptionPane;
public class suma_dos_num {
	public static void main(String[] args) {
		int num1 = 0,num2=0,suma=0;
		String num_input,num_input2,cad,cad_suma=" ";
		boolean conversion = false;
		boolean conversion2 = false;
		JOptionPane.showMessageDialog(null, "Tienes que introducir dos números para hacer la suma y ver cuál es mayor o menor.","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
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
		do{
			try{
				num_input2=JOptionPane.showInputDialog(null, "Escribe el segundo número: ","Segundo número",JOptionPane.QUESTION_MESSAGE);
				if(num_input2==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					num2=Integer.parseInt(num_input2);
					conversion2=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
				conversion2=false;
			}
		}while(conversion2==false);
		suma=num1+num2;
		cad_suma="La suma de "+num1+" y "+num2+" es "+suma+". \n";
		if(num1>num2) {
			cad="El número "+num1+" es mayor al número "+num2+". \n";
		}else if(num2>num1) {
			cad="El número "+num2+" es mayor al número "+num1+". \n";
		}else {
			cad="Los dos números son iguales.";
		}//end if
		JOptionPane.showMessageDialog(null, cad_suma+cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end main
}//end class
