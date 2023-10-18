package funciones;
import javax.swing.JOptionPane;
public class validafloat {
	public static float valida_float() {
		float num = 0.0f;
		String num_input;
		boolean correcto=true;

		do{
			try{
				num_input=JOptionPane.showInputDialog(null, "Escribe un num float","Num float",JOptionPane.QUESTION_MESSAGE);
				if(num_input==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					num=Float.parseFloat(num_input);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num float", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		return num;
	}
}