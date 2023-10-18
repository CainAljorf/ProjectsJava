package exam_templates;

import javax.swing.JOptionPane;

import funciones.Ejercicios;

public class switch_case {
	public static void main(String[] args) {
		Ejercicios E = new Ejercicios();
		int menu=0;
		switch(menu) {
			case 1:
				E.DeseaContinuarMediaPares();
				break;
			case 2:
				E.Interruptor_Digitos_Mayor_Menor();
				break;
			case 3:
				E.Interruptor_Mayor_Menor_Media();
				break;
			case 4:
				E.N_num_Divisores();
				break;
			case 5:		
				E.N_Primeros_Impares();
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Salir",JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
				break;
			default:
				break;
		}//end switch
	}//end main
}//end class
