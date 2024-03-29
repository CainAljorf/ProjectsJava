package library_functions_Cain;
import javax.swing.JOptionPane;
public class validators {
	public static int validator_int (String message,String title) {
		int num1 = 0;
		String num_input="";
		boolean convert = false;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
				if(num_input==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					num1=Integer.parseInt(num_input);
					convert=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
				convert=false;
			}//end try catch
		}while(convert==false);
		return num1;
	}//end validator_int
	public static int validator_range(int range,String message,String title) {
		int opt=0;
		String opt_str="";
		boolean convert=true;
		do{
			do{
				try{
					opt_str=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
					if(opt_str==null){
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else {
						opt=Integer.parseInt(opt_str);
						convert=true;
					}//end if
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Posición no válida, debe de ser del 1 al "+range+".", "Error",JOptionPane.ERROR_MESSAGE);
					convert=false;
				}//end try catch
			}while(convert==false);
			if ((opt<1)||(opt>range)) {
				JOptionPane.showMessageDialog(null,"Posición no válida, debe de ser del 1 al "+range+".","Error",JOptionPane.ERROR_MESSAGE);
			}//end if
			}while(((opt<1)||(opt>range)));
		return opt;
	}//end validator_range
	public static String validator_string(String message,String title) {
		String str="";
		boolean convert=true;
		do{
			try{
				str=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
				convert=true;
				if (str==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}//end if
				if(str.equals("")){
					JOptionPane.showMessageDialog(null, "No has introducido una cadena de texto válida.","Error",JOptionPane.ERROR_MESSAGE);
					convert=false;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una cadena de texto válida.", "Error",JOptionPane.ERROR_MESSAGE);
				convert=false;
			}//end try catch
		}while(convert==false);
		return str;
	}//end validator_string
	public static float validator_float(String message,String title) {
		float num = 0.0f;
		String num_input;
		boolean convert=true;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
				if(num_input==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					num=Float.parseFloat(num_input);
					convert=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un número decimal válido.", "Error",JOptionPane.ERROR_MESSAGE);
				convert=false;
			}//end try catch
		}while(convert==false);
		return num;
	}//end validator_float
	public static char validator_char(String message,String title) {
		char character = 0;
		String char_input;
		boolean convert=true;
		do{
			try{
				char_input=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
				if(char_input==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					character=char_input.charAt(0);
					convert=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una carácter correcto.", "Error",JOptionPane.ERROR_MESSAGE);
				convert=false;
			}//end try catch
		}while(convert==false);
		return character;
	}//end validator_char
}//end class validators