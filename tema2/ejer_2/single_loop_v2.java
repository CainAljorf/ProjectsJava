package ejer_2;
import javax.swing.JOptionPane;

public class single_loop_v2 {
	public static void N_numeros(){
		int num=0;
		int cont=0;
		float res=0.0f;
		String cad="";
		num=validators_v2.validator_int("¿Cuántos números quieres introducir? ","Introducir número");
		for(int i=0;i<num;i++) {
		}//end for
		cad=" ";
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_numeros
	public static void digitos() {
		int num_copia=0,num=0,digito=0;
		String cad,cad_dig="";
		num=validators_v2.validator_int("Introduce un número: ","Introducir número");
		num_copia=num;
		while(num!=0) {
			digito = num%10;
			num=num/10;
			cad_dig+="\n"+digito;
		}//end while
		cad="Los dígitos de "+num_copia+" son: "+cad_dig+"\n";
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end digitos
	public static void divisores() {
		int num=0;
		int suma=0;
		String cad="";
		String cad_div="";
		num=validators_v2.validator_int("Introduce un número: ","Introducir número");
		for(int i=1;i<=num;i++) {
			if((num%i)==0) {
				cad_div=cad_div+"\n"+i;
			}//end if
		}//end for
		cad= "Los divisores de "+num+" son: ";
		JOptionPane.showMessageDialog(null, cad+cad_div);
	}//end divisores
	public static float average(float suma,int cont) {
		float media=0.0f;
		if (cont==0) {
			media=0.0f;
		}else {
			media=(float)(suma/cont);
		}//end if
		return media;
	}//end media
	public static int mayor_menor(int num) {
		int cont=0;
		int mayor=0;
		int menor=0;
			if(cont==0){
				num=mayor=menor;
				cont++;
			}//end if
			if(num<menor) {
				menor=num;
			}//end if
			if(num>mayor) {
				mayor=num;
			}//end if
			return mayor;
	}//end mayor_menor
}//end class simple
