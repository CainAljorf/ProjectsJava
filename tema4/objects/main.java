package objects;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		String ID="";
		float price=0.0f;
		ID=validators.validator_string("Ingresa el ID del producto.", "Ingresar ID");
		price=validators.validator_float("Ingresa el precio del producto.", "Ingresar precio");
		product P1=new product(ID,price);
		JOptionPane.showMessageDialog(null,P1.toString());
		JOptionPane.showMessageDialog(null,P1.getID());
		P1.setID(ID);
		JOptionPane.showMessageDialog(null,P1.getID());
		P1=null;
	}
}
