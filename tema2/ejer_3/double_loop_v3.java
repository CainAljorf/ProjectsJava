package ejer_3;
import javax.swing.JOptionPane;
public class double_loop_v3 {
	public static void DeseaContinuarMediaDivisoresImpares() {
		int num1=0;
		int sum=0;
		int cont=0;
		int next = 0;
		float avg = 0.0f;
		String str= "";
		do{
			num1=validators_v3.validator_int("Introduce un número: ","Introducir número");
			for(int i=1;i<=num1;i++) {
				if((num1%i)==0) {
					if(i%2!=0) {
						sum+=i;
						cont++;
					}//end if
					if(i>=10) {	
						str+=i+" es mayor igual a 10.\n";
					}//end if
				}//end if
			}//end for
			next = JOptionPane.showConfirmDialog( null, "¿Desea introducir otro número?");
		}while(JOptionPane.OK_OPTION == next);
		avg=single_loop_v3.average(sum, cont);
		str+="\nLa media de los divisores impares es: "+avg;
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end DeseaContinuarMediaPares
	public static void Interruptor_2_Digitos_Impares(){
		int cont=0;
		int num_copy=0;
		int num=0;
		int digit=0;
		int prod=1;
		String str="";
		boolean interrupt=false;
		while(interrupt==false) {
			num=validators_v3.validator_int("Introduce números: \nPara salir escriba '-5'.","Introducir número");
			if(num == -5) {
				interrupt=true;
			}else{
				cont=0;
				num_copy=num;
				while(num!=0) {
					digit = num%10;
					num=num/10;
					if(digit%2!=0) {
						cont++;
						if(cont==2) {
							prod=prod*num_copy;
						}//end if
					}//end if
				}//end while
			}//end if
		}//end while
		str="El producto de los numeros que tienen dos digitos impares es "+ prod+".";
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Interruptor_Digitos_Mayor_Menor
}//end class doubles
