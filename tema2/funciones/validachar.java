package funciones;
import javax.swing.JOptionPane;
public class validachar {
	public static char valida_char() {
		char caracter = 0;
		String letra_input;
		boolean correcto=true;

		do{
			try{
				letra_input=JOptionPane.showInputDialog(null, "Escribe una letra","letra",JOptionPane.QUESTION_MESSAGE);
				if(letra_input==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					caracter=letra_input.charAt(0);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una letra", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		return caracter;
	}
}
