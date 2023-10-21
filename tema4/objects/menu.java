package objects;
import javax.swing.JOptionPane;
public class menu {
	public static int menu_main() {
		product P1 = null;
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
					P1=CRUD_Products.create();
					break;
				case 1:
					if(P1!=null) {
						CRUD_Products.read(P1);
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el producto.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					break;
				case 2:
					if(P1!=null) {
						P1=CRUD_Products.update(P1);
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el producto que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					break;
				case 3:
					if(P1!=null) {
						P1=CRUD_Products.delete(null);
					}else {
						JOptionPane.showMessageDialog(null,"No hay ningún registro que puedas eliminar.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
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
}//end class menu