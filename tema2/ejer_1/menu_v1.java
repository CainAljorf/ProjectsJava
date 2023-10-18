package ejer_1;
import javax.swing.JOptionPane;
public class menu_v1 {
	public static int menu_main() {
		String[]buttons_main={
				"Mostrar los 4 primeros números perfectos.",
				"Mostrar el dígito de la posición X del número Y.",
				"Mostrar el número más alto y las veces repetidas.",
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
							doubles_v1.Perfecto_Primeros();
							break;
						case 1:
							doubles_v1.Digitos_Posicion();
							break;
						case 2:
							doubles_v1.Interruptor_Mayor_Repeat();
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
