package library_functions_Cain;
import javax.swing.JOptionPane;
public class menu {
	public static int menu_main() {
		String[]buttons_main={
				"1",
				"2",
				"3",
				"4",
				"5",
				"6",
				"7",
				"8",
				"9",
				"10",
				"11",
				"12",
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
					menu_sec(menu_main);
					break;
				case 6:
					menu_sec(menu_main);
					break;
				case 7:
					menu_sec(menu_main);
					break;
				case 8:
					menu_sec(menu_main);
					break;
				case 9:
					menu_sec(menu_main);
					break;
				case 10:
					menu_sec(menu_main);
					break;
				case 11:
					menu_sec(menu_main);
					break;
				case 12:
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
							double_loop.DeseaContinuarMediaPares();
							break;
						case 1:
							double_loop.Interruptor_Digitos_Mayor_Menor();
							break;
						case 2:
							double_loop.Interruptor_Mayor_Menor_Media();
							break;
						case 3:
							double_loop.N_num_Divisores();
							break;
						case 4:
							double_loop.N_Primeros_Impares();
							break;
						case 5:
							double_loop.Digitos_Posicion();
							break;
						case 6:
							double_loop.Interruptor_Mayor_Repeat();
							break;
						case 7:
							double_loop.Perfecto_Primeros();
							break;
						case 8:
							double_loop.DeseaContinuarMediaDivisoresImpares();
							break;
						case 9:
							double_loop.Interruptor_2_Digitos_Impares();
							break;
						case 10:
							double_loop.N_primeros_Digi_Multiplo_media();
							break;
						case 11:
							double_loop.N_num_Div_Impar_Media();
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
