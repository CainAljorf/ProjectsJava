package ejer_2;
import javax.swing.JOptionPane;
public class validators_v2 {
	public static int validator_int (String message,String titulo) {
		int num1 = 0;
		String num_input="";
		boolean conversion = false;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, message,titulo,JOptionPane.QUESTION_MESSAGE);
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
			}//end try catch
		}while(conversion==false);
		return num1;
	}//end validator_int
	public static int validator_range(int range,String message,String titulo) {
		int menu=0;
		String menu_str="";
		boolean conversion=true;
		do{
			do{
				try{
					menu_str=JOptionPane.showInputDialog(null, message,titulo,JOptionPane.QUESTION_MESSAGE);
					if(menu_str==null){
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else {
						menu=Integer.parseInt(menu_str);
						conversion=true;
					}//end if
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Posición no válida, debe de ser del 1 al "+range+".", "Error",JOptionPane.ERROR_MESSAGE);
					conversion=false;
				}//end try catch
			}while(conversion==false);
			if ((menu<1)||(menu>range)) {
				JOptionPane.showMessageDialog(null,"Posición no válida, debe de ser del 1 al "+range+".","Error",JOptionPane.ERROR_MESSAGE);
			}//end if
			}while(((menu<1)||(menu>range)));
		return menu;
	}//end validator_range
	public static String validator_string() {
		String cad="";
		boolean conversion=true;
		do{
			try{
				cad=JOptionPane.showInputDialog(null, "Escribe a continuación una cadena de texto.","Cadena",JOptionPane.QUESTION_MESSAGE);
				conversion=true;
				if (cad==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaciónn","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}//end if
				if(cad.equals("")){
					JOptionPane.showMessageDialog(null, "No has introducido una cadena válida.","Error",JOptionPane.ERROR_MESSAGE);
					conversion=false;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una cadena válida.", "Error",JOptionPane.ERROR_MESSAGE);
				conversion=false;
			}//end try catch
		}while(conversion==false);
		return cad;
	}//end validator_string
	public static float validator_float() {
		float num = 0.0f;
		String num_input;
		boolean conversion=true;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, "Escribe un num float","Num float",JOptionPane.QUESTION_MESSAGE);
				if(num_input==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					num=Float.parseFloat(num_input);
					conversion=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num float", "Error",JOptionPane.ERROR_MESSAGE);
				conversion=false;
			}//end try catch
		}while(conversion==false);
		return num;
	}//end validator_float
	public static char validator_char() {
		char caracter = 0;
		String letra_input;
		boolean conversion=true;
		do{
			try{
				letra_input=JOptionPane.showInputDialog(null, "Escribe una letra","letra",JOptionPane.QUESTION_MESSAGE);
				if(letra_input==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					caracter=letra_input.charAt(0);
					conversion=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una letra", "Error",JOptionPane.ERROR_MESSAGE);
				conversion=false;
			}//end try catch
		}while(conversion==false);
		return caracter;
	}//end validator_char
}//end class validators
