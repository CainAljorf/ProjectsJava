package objects;
import javax.swing.JOptionPane;
public class CRUD_Products {
	public static product create() {
		product P1 = null;
//		String ID_product=validators.validator_string("Ingresa el ID del producto.", "Ingresar ID");
//		float price=validators.validator_float("Ingresa el precio del producto.", "Ingresar precio");
//		float peso=validators.validator_float("Ingresa el peso del producto.", "Ingresar peso");
//		int stock=validators.validator_int("Ingresa el stock del producto.", "Ingresar stock");
//		String color=validators.validator_string("Ingresa el color del producto.", "Ingresar color");
//		float dimension=validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension");
//		String f_compra=validators.validator_string("Ingresa la fecha de compra del producto.", "Ingresar fecha compra");
//		String f_entrega=validators.validator_string("Ingresa la fecha de entrega del producto.", "Ingresar fecha entrega");
//		int n_dias_entrega=validators.validator_int("Ingresa el número de días que tardará en entregarse.", "Ingresar los días");
//		String f_devolucion=validators.validator_string("Ingresa la fecha de devolución.", "Ingresar fecha devolución");
//		String f_recogida=validators.validator_string("Ingresa la fecha de recogida.", "Ingresar fecha recogida");
//		int n_dias_recogida=validators.validator_int("Ingresa el número de días que tardará en recogerse.", "Ingresar recogida");
//		int n_dias_devolucion=validators.validator_int("Ingresa el número de días que quedan para la devolución.", "Ingresar devolución");
//		P1=new product(ID_product,price,peso,stock,color,dimension,f_compra,f_entrega,n_dias_entrega,
//				f_devolucion,f_recogida,n_dias_recogida,n_dias_devolucion);
		P1=new product("1",1,1,1,"red",5,"5/04/2012","15/04/2012",10,
				"30/04/2012","20/04/2012",10,15);
		JOptionPane.showMessageDialog(null, "Producto creado correctamenmte.","Felicidades", JOptionPane.INFORMATION_MESSAGE);
		return P1;
	}
	public static void read(product P1) {
		int opt=0;
		JOptionPane.showMessageDialog(null,"Elige que atributo quieres ver.","Información",JOptionPane.INFORMATION_MESSAGE);
		if (P1 != null) {
			String[]buttons_sec={"ID","Precio","Peso","Stock","Color","Dimens","FCompra","F Entr","N Entr","F Dev","NRecog","N Dev"};
			opt=JOptionPane.showOptionDialog(
					null,
					"Elige el atributo que quieras mostrar.",
					"Información",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_sec,
					buttons_sec[0]);
			JOptionPane.showMessageDialog(null,P1.toString(opt),"Resultado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static product update(product P1) {
		int menu_sec=0;
		String str="";
		JOptionPane.showMessageDialog(null,"Elige que atributo quieres modificar.","Información",JOptionPane.INFORMATION_MESSAGE);
		if (P1 != null) {
			String[]buttons_sec={"ID","Precio","Peso","Stock","Color","Dimens","FCompra","F Entr","N Entr","F Dev","NRecog","N Dev"};
			menu_sec=JOptionPane.showOptionDialog(
					null,
					"Elige el atributo a editar.",
					"Información",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_sec,
					buttons_sec[0]);
			switch (menu_sec) {
			case 0:
				String ID_product=validators.validator_string("Ingresa el ID del producto.", "Ingresar ID");
				P1.setID_product(ID_product);
				break;
			case 1:
				float price=validators.validator_float("Ingresa el precio del producto.", "Ingresar precio");
				P1.setPrice(price);
				break;
			case 2:
				float peso=validators.validator_float("Ingresa el peso del producto.", "Ingresar peso");
				P1.setPeso(peso);
				break;
			case 3:
				int stock=validators.validator_int("Ingresa el stock del producto.", "Ingresar stock");
				P1.setStock(stock);
				break;
			case 4:
				String color=validators.validator_string("Ingresa el color del producto.", "Ingresar color");
				P1.setColor(color);
				break;
			case 5:
				float dimension=validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension");
				P1.setDimension(dimension);
				break;
			case 6:
				String f_compra=validators.validator_string("Ingresa la fecha de compra del producto.", "Ingresar fecha compra");
				P1.setF_compra(f_compra);
				break;
			case 7:
				String f_entrega=validators.validator_string("Ingresa la fecha de entrega del producto.", "Ingresar fecha entrega");
				P1.setF_entrega(f_entrega);
				break;
			case 8:
				int n_dias_entrega=validators.validator_int("Ingresa el número de días que tardará en entregarse.", "Ingresar los días");
				P1.setN_dias_entrega(n_dias_entrega);
				break;
			case 9:
				String f_devolucion=validators.validator_string("Ingresa la fecha de devolución.", "Ingresar fecha devolución");
				P1.setF_devolucion(f_devolucion);
				break;
			case 10:
				int n_dias_recogida=validators.validator_int("Ingresa el número de días que tardará en recogerse.", "Ingresar recogida");
				P1.setN_dias_recogida(n_dias_recogida);
				break;
			case 11:
				int n_dias_devolucion=validators.validator_int("Ingresa el número de días que quedan para la devolución.", "Ingresar devolución");
				P1.setN_dias_devolucion(n_dias_devolucion);
				break;
			default:
				break;
			}//end switch
		}else {
			JOptionPane.showMessageDialog(null,"No existen productos que se puedan modificar.","Error",JOptionPane.ERROR_MESSAGE);
		}//end if
		if(menu_sec<0 && menu_sec>11) {
			str="Registro actualizado correctamente.";
		}else {
			str="Saliendo al menú principal.";
		}
		JOptionPane.showMessageDialog(null,str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		return P1;
	}
	public static product delete(product P1) {
//		JOptionPane.showConfirmDialog( null, "¿Está seguro de que quiere eliminar el registro?");
		P1=null;
		JOptionPane.showMessageDialog(null,"Registro eliminado correctamente.","Felicidades",JOptionPane.INFORMATION_MESSAGE);
		return P1;
	}
}
