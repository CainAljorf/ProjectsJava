package ejer_2;
import javax.swing.JOptionPane;
public class double_loop_v2 {
	public static void N_primeros_Digi_Multiplo_media(){
		int cont=0;
		int num=0;
		int digito=0;
		int suma=0;
		int cont2=0;
		float media=0.0f;
		String cad="";
		while(cont<5) {
			cont++;
			num=validators_v2.validator_int("Introduce un número: ","Introducir número");
			if((num%2)!=0) {
				while(num!=0) {
					digito = num%10;
					num=num/10;
					System.out.println(digito);
					if((digito%4)==0) {
						suma+=digito;
						cont2++;
					}//end if
					media=single_loop_v2.average(suma, cont2);
				}//end while
			}//end if
		}//end while
		cad="La media de todos los dígitos múltiplos de 4 de los números ingresados es "+media;
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_primeros_Digi_Multiplo_media
	public static void N_num_Div_Impar_Media(){
		int num1=0;
		int num2=0;
		int cont=0;
		int cont2=0;
		float suma=0.0f;
		float media=0.0f;
		String cad="";
		num1=validators_v2.validator_int("¿Cúantos números deseas introducir? ","Introduce número");
		for(int i=0;i<num1;i++) {
			num2=validators_v2.validator_int("Introduce un número: ","Introducir números");
			cont=0;
			for(int j=1;j<=num2;j++){
				if((num2%j)==0){
					cont++;
					if((num2%2)!=0) {
						if(cont==3){
							suma+=num2;
							cont2++;
						}//end if
					}//end if
				}//end if
			}//end for
			media=single_loop_v2.average(suma,cont2);
		}//end for
		cad="La media de los números que tienen 3 divisiores impares es "+media;
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_num_Div_Impar_Media
}//end class doubles