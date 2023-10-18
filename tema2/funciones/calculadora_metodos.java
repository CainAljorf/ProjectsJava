package funciones;
import javax.swing.JOptionPane;
public class calculadora_metodos {
	boolean validar=true;
	public boolean suma (String[]menu,String[]menu2) {
		int num1,num2,suma;
		int menu_sec;
		validar_int V=new validar_int();
		do{
			menu_sec=JOptionPane.showOptionDialog(null, "Está en el programa suma.\n¿Que desea hacer?", "Información",0, JOptionPane.QUESTION_MESSAGE,null ,menu2,menu2[0]);
			switch(menu_sec){
				case 0:
					num1=V.valida_int();
					num2=V.valida_int();
					suma=num1+num2;
					JOptionPane.showMessageDialog(null,"La suma de "+num1+" y "+num2+" es "+suma+".");
					return true;
				case 1:
					return true;
				case 2:
					return false;
				default:	
					return false;
			}//end switch
		}while(menu_sec==0);
	}//end suma
	public void resta (String[]menu,String[]menu2) {
		int num1,num2,suma;
		int menu_sec;
		validar_int V=new validar_int();
		do{
			menu_sec=JOptionPane.showOptionDialog(null, "Está en el programa resta.\n¿Que desea hacer?", "Información",0, JOptionPane.QUESTION_MESSAGE,null ,menu2,menu2[0]);
			switch(menu_sec){
				case 0:
					num1=V.valida_int();
					num2=V.valida_int();
					suma=num1-num2;
					JOptionPane.showMessageDialog(null,"La resta de "+num1+" menos "+num2+" es "+suma+".");
					break;
				case 1:
					validar=true;
					break;
				case 2:
					validar=false;
					break;
				default:	
					validar=false;
			}//end switch
			System.out.println(menu_sec);
		}while(menu_sec==0);
	}//end resta
	public void producto (String[]menu,String[]menu2) {
		int num1,num2,producto=1;
		int menu_sec;
		validar_int V=new validar_int();
		do{
			menu_sec=JOptionPane.showOptionDialog(null, "Está en el programa multiplicación.\n¿Que desea hacer?", "Información",0, JOptionPane.QUESTION_MESSAGE,null ,menu2,menu2[0]);
			switch(menu_sec){
				case 0:
					num1=V.valida_int();
					num2=V.valida_int();
					producto=num1*num2;
					JOptionPane.showMessageDialog(null,"La multiplicación de "+num1+" y "+num2+" es "+producto+".");
					break;
				case 1:
					validar=true;
					break;
				case 2:
					validar=false;
					break;
				default:	
					validar=false;
			}//end switch
			System.out.println(menu_sec);
		}while(menu_sec==0);
	}//end producto
	public void division (String[]menu,String[]menu2) {
		int num1,num2,division=0;
		int menu_sec;
		validar_int V=new validar_int();
		do{
			menu_sec=JOptionPane.showOptionDialog(null, "Está en el programa división.\n¿Que desea hacer?", "Información",0, JOptionPane.QUESTION_MESSAGE,null ,menu2,menu2[0]);
			switch(menu_sec){
				case 0:
					num1=V.valida_int();
					num2=V.valida_int();
					if(num2==0) {
						JOptionPane.showMessageDialog(null,"Fallo en la ejecución. No se puede dividir por cero.","Error",JOptionPane.ERROR_MESSAGE);
						validar=true;
					}else {
						division=num1/num2;
						JOptionPane.showMessageDialog(null,"La División de "+num1+" entre "+num2+" es "+division+".");
					}//end if
					break;
				case 1:
					validar=true;
					break;
				case 2:
					validar=false;
					break;
				default:	
					validar=false;
			}//end switch
			System.out.println(menu_sec);
		}while(menu_sec==0);
	}//end división
}//end class