package objects;
import javax.swing.JOptionPane;
public class menu {
	public static int menu_main() {
		String[]buttons_main={
				"Create",
				"Read",
				"Update",
				"Delete",
				"Cerrar"};
		int menu_main;
		boolean validator=true;
		do{
			menu_main=JOptionPane.showOptionDialog(
					null,
					"Elegir opción",
					"CRUD",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_main,
					buttons_main[0]);
			switch(menu_main){
				case 0:
					CRUD_Products.create();
					break;
				case 1:
					CRUD_Products.read(null);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					validator=false;
					break;
				default:	
					validator=false;
			}//end switch
		}while(validator==true);
		return menu_main;
	}//end menu_main
	public static int menu_sec() {
		int menu_sec;
		boolean validator=true;
		String[]buttons_sec={"Editar ID","Editar Precio"};
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
					switch (menu_sec){
						
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