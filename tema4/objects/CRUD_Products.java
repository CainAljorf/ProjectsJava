package objects;

import javax.swing.JOptionPane;

public class CRUD_Products {
		
	public static product create() {
		
		String ID_product=validators.validator_string("Ingresa el ID del producto.", "Ingresar ID");
		float price=validators.validator_float("Ingresa el precio del producto.", "Ingresar precio");
		float peso=validators.validator_float("Ingresa el peso del producto.", "Ingresar peso");
		int stock=validators.validator_int("Ingresa el stock del producto.", "Ingresar stock");
		String color=validators.validator_string("Ingresa el color del producto.", "Ingresar color");
		float dimension=validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension");
		String f_compra=validators.validator_string("Ingresa la fecha de compra del producto.", "Ingresar fecha compra");
		String f_entrega=validators.validator_string("Ingresa la fecha de entrega del producto.", "Ingresar fecha entrega");
		int n_dias_entrega=validators.validator_int("Ingresa el ID del producto.", "Ingresar ID");
		String f_devolucion=validators.validator_string("Ingresa el ID del producto.", "Ingresar ID");
		String f_recogida=validators.validator_string("Ingresa el ID del producto.", "Ingresar ID");
		int n_dias_recogida=validators.validator_int("Ingresa el ID del producto.", "Ingresar ID");
		int n_dias_recogida1=validators.validator_int("Ingresa el ID del producto.", "Ingresar ID");
		int n_dias_devolucion=validators.validator_int("Ingresa el ID del producto.", "Ingresar ID");
		product P1=new product(ID_product,price,peso,stock,color,dimension,f_compra,f_entrega,n_dias_entrega,
				f_devolucion,f_recogida,n_dias_recogida,n_dias_recogida1,n_dias_devolucion);
		
		JOptionPane.showMessageDialog(null,P1.toString());
		JOptionPane.showMessageDialog(null,P1.getID_product());
		P1.setID_product(ID_product);
		P1.setPrice(price);
		P1.setPeso(peso);
		P1.setStock(stock);
		P1.setColor(color);
		P1.setDimension(dimension);
		P1.setF_compra(f_compra);
		P1.setF_entrega(f_entrega);
		P1.setN_dias_entrega(n_dias_entrega);
		P1.setF_devolucion(f_devolucion);
		P1.setF_recogida(f_recogida);
		P1.setN_dias_recogida(n_dias_recogida);
		P1.setN_dias_recogida1(n_dias_recogida1);
		P1.setN_dias_devolucion(n_dias_devolucion);
		
		return P1;
	}
	public static void read(product P1) {
//		menu.menu_sec();

		JOptionPane.showMessageDialog(null,P1.getDimension());
	}
	public static product delete(product P1) {
		P1=null;
		return P1;
	}
}
