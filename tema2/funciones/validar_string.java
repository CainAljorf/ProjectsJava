package funciones;
import javax.swing.JOptionPane;
public class validar_string {
	public void valida_string() {
		String cad="";
		boolean correcto=true;

		do{
			try{
				cad=JOptionPane.showInputDialog(null, "Escribe a continuación una cadena de texto.","Cadena",JOptionPane.QUESTION_MESSAGE);
				correcto=true;
				if (cad==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaciónn","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}
				if(cad.equals("")){
					JOptionPane.showMessageDialog(null, "No has introducido una cadena válida.","Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una cadena válida.", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
	}
}
