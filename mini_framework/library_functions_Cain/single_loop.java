package library_functions_Cain;
import javax.swing.JOptionPane;

public class single_loop {
	public static void N_numbers(){
		int num=0;
		String str="";
		num=validators.validator_int("¿Cuántos números quieres introducir? ","Introducir número");
		for(int i=0;i<num;i++) {
			//----------code
		}//end for
		str="";
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_numbers
	public static void digits() {
		int num_copy=0,num=0,digits=0;
		String str,str_dig="";
		num=validators.validator_int("Introduce un número: ","Introducir número");
		num_copy=num;
		while(num!=0) {
			digits = num%10;
			num=num/10;
			str_dig+="\n"+digits;
		}//end while
		str="Los dígitos de "+num_copy+" son: "+str_dig+"\n";
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end digits
	public static void dividers() {
		int num=0;
		String str="";
		String str_div="";
		num=validators.validator_int("Introduce un número: ","Introducir número");
		for(int i=1;i<=num;i++) {
			if((num%i)==0) {
				str_div=str_div+"\n"+i;
			}//end if
		}//end for
		str= "Los divisores de "+num+" son: ";
		JOptionPane.showMessageDialog(null, str+str_div);
	}//end dividers
	public static float average(float sum,int cont) {
		float avg=0.0f;
		if (cont==0) {
			avg=0.0f;
		}else {
			avg=(float)(sum/cont);
		}//end if
		return avg;
	}//end media
	public static int major_minor(int num) {
		int cont=0;
		int major=0;
		int minor=0;
			if(cont==0){
				num=major=minor;
				cont++;
			}//end if
			if(num<minor) {
				minor=num;
			}//end if
			if(num>major) {
				major=num;
			}//end if
			return major;
	}//end major_minor
}//end class single_loop
