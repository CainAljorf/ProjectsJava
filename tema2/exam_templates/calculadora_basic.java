package exam_templates;
import javax.swing.*;
import funciones.calculadora_metodos;
public class calculadora_basic {
	public static void main(String[] args) {
		calculadora_metodos C = new calculadora_metodos();
		int menu;
		String[]botones_menu={"Suma","Resta","Multiplicación","Dividisión","Cerrar"};
		String[]botones__menu_sec={"Ejecutar","Volver Atrás","Salir"};
		boolean validar=true;
		do{
			menu=JOptionPane.showOptionDialog(null,"Pulse en el botones siguientes para realizar las operaciones.", "Calculadora",0, JOptionPane.QUESTION_MESSAGE,null ,botones_menu,botones_menu[0]);
			switch(menu){
				case 0:
					C.suma(botones_menu, botones__menu_sec);
					break;
				case 1:
					C.resta(botones_menu,botones__menu_sec);
					break;
				case 2:
					C.producto(botones_menu,botones__menu_sec);
					break;
				case 3:
					C.division(botones_menu,botones__menu_sec);
					break;
				case 4:
					validar=false;
					break;
				default:	
					validar=false;
			}//end switch
		}while(validar==true);
	}//end main
}//end class