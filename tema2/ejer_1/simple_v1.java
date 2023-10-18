package ejer_1;
import javax.swing.JOptionPane;
public class simple_v1 {
	public static void digitos() {
		int num_copia=0,num=0,digito=0;
		String cad,cad_dig="";
		num=validators_v1.validator_int("Introduce un número: ","Introducir número");
		num_copia=num;
		while(num!=0) {
			digito = num%10;
			num=num/10;
			cad_dig=cad_dig+"\n"+digito;
		}//end while
		cad="Los dígitos de "+num_copia+" son: "+cad_dig+"\n";
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end digitos
	public static void divisores() {
		int num=0;
		String cad,cad_div= "";
		num=validators_v1.validator_int("Introduce un número: ","Introducir número");
		for(int i=1;i<=num;i++) {
			if((num%i)==0) {
				cad_div=cad_div+"\n"+i;
			}//end if
		}//end for
		cad= "Los divisores de "+num+" son: ";
		JOptionPane.showMessageDialog(null, cad+cad_div);
	}//end divisores
	public static void media() {
		int num1,cont=0;
		float suma=0.0f;
		String cad="";
		float media=0.0f;
		for(int i=0;i<5;i++) {
			num1=validators_v1.validator_int("Introduce un número: ","Introducir número");
			suma += num1;
			cont++;
		}//end for
		if (cont==0) {
			cad="Error de ejecución.";
		}else {
			media=(float)(suma/cont);
		}//end if
		cad="La media de los números ingresados es: "+media+".";
		JOptionPane.showMessageDialog(null,cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end media
	public static void mayor_menor() {
		int cont=0;
		int cont2=0;
		int num=0;
		int mayor=0;
		int menor=0;
		while(cont==5){
			num=validators_v1.validator_int("Introduce un número: ","Introducir número");
			cont++;
			if (cont2==2){
				num=mayor=menor;
				cont2++;
			}//end if
			if(num<menor) {
				menor=num;
			}//end if
			if(num>mayor) {
				mayor=num;
			}//end if
		}//end while
	}//end mayor_menor
}//end class simple
