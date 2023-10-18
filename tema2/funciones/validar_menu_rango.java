package funciones;

import javax.swing.JOptionPane;

public class validar_menu_rango {
	public void valida_rango() {
		int nota=0;
		String nota_str;
		boolean correcto=true;
		do{
			do{
				try{
					nota_str=JOptionPane.showInputDialog(null,"Introduce la nota de los alumnos para valorarlos:","Instrucciones",JOptionPane.QUESTION_MESSAGE);
					
					if(nota_str==null){
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else {
						nota=Integer.parseInt(nota_str);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido una nota válida, debe de ser entre el 0 y el 10.", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}	
			}while(correcto==false);
			if ((nota<0)||(nota>10))
				JOptionPane.showMessageDialog(null,"No has introducido una nota válida, debe de ser entre el 0 y el 10.","Error",JOptionPane.ERROR_MESSAGE);
		}while((nota<0)||(nota>10));
	}
}
