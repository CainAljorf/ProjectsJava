package ejer_3;
import javax.swing.JOptionPane;
public class menu_v3 {
	public static int menu_main() {
		String[]buttons_main={
				"Desea Continuar Media Pares",
				"Interruptor Digitos Mayor Menor",
				"Interruptor Mayor Menor Media",
				"N Numeros Divisores",
				"N Primeros Impares",
				"Cerrar"};
		int menu_main;
		boolean validator=true;
		do{
			menu_main=JOptionPane.showOptionDialog(
					null,
					"Pulse en los botones siguientes para elegir el ejercicio.",
					"Ejercicios",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_main,
					buttons_main[0]);
			switch(menu_main){
				case 0:
					menu_sec(menu_main);
					break;
				case 1:
					menu_sec(menu_main);
					break;
				case 2:
					menu_sec(menu_main);
					break;
				case 3:
					menu_sec(menu_main);
					break;
				case 4:
					menu_sec(menu_main);
					break;
				case 5:
					validator=false;
					break;
				default:	
					validator=false;
			}//end switch
		}while(validator==true);
		return menu_main;
	}//end menu_main
	public static int menu_sec(int option) {
		int menu_sec;
		boolean validator=true;
		String[]buttons_sec={"Ejecutar el programa","Volver Atrás"};
		do{
			menu_sec=JOptionPane.showOptionDialog(
					null,
					"¿Que desea hacer?",
					"Información",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_sec,
					buttons_sec[0]);
			switch(menu_sec){
				case 0:
					switch (option){
						case 0:
							double_loop_v3.DeseaContinuarMediaPares();
							break;
						case 1:
							double_loop_v3.Interruptor_Digitos_Mayor_Menor();
							break;
						case 2:
							double_loop_v3.Interruptor_Mayor_Menor_Media();
							break;
						case 3:
							double_loop_v3.N_num_Divisores();
							break;
						case 4:
							double_loop_v3.N_Primeros_Impares();
							break;
					}//end switch
					break;
				case 1:
					validator=true;
					break;
				default:	
					validator=false;
					break;
			}//end switch
		}while(menu_sec==0);
		return menu_sec;
	}//end menu_sec
}//end class menu