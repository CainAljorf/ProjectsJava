package library_functions_Cain;
import javax.swing.JOptionPane;

public class double_loop {
	public static void DeseaContinuarMediaPares() {
		int num1=0;
		int suma=0;
		int cont=0;
		int continuar = 0;
		float media = 0.0f;
		String cad= "";
		do{
			num1=validators.validator_int("Introduce un número: ","Introducir número");
			suma=0;
			cont=0;
			for(int i=1;i<=num1;i++) {
				if(((num1%i)==0)&&((i%2)==0)) {
					suma = suma + num1;
					cont++;
				}//end if
			}//end for
			continuar = JOptionPane.showConfirmDialog( null, "¿Desea introducir otro número?");
		}while(JOptionPane.OK_OPTION == continuar);
		media=single_loop.average(suma, cont);
		cad="La media de los divisores es: "+media;
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end DeseaContinuarMediaPares
	public static void Interruptor_Digitos_Mayor_Menor(){
		int cont=0;
		int num_copia=0;
		int num=0;
		int digito=0;
		int mayor=0;
		int menor=0;
		String cad="";
		boolean interruptor=false;
		while(interruptor==false) {
			num=validators.validator_int("Introduce un número: ","Introducir número");
			if(num == -1) {
				interruptor=true;
			}else{
				cont=0;
				num_copia=num;
				while(num!=0) {
					digito = num%10;
					num=num/10;
					if(cont==0) {
						cont++;
						mayor=menor=digito;
					} //end if
					if(digito>mayor){
						mayor=digito;
					}//end if
					if(digito<menor){
						menor=digito;
					}//end if
				}//end while
				cad=cad+"El dígito mayor de "+ num_copia+" es "+ mayor + " y el menor "+ menor + ". \n";
			}//end if
		}//end while
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Interruptor_Digitos_Mayor_Menor
	public static void Interruptor_Mayor_Menor_Media() {
		int num1=0;
		int cont=0;
		int mayor=0;
		int menor=0;
		int cont_media=0;
		float suma=0.0f;
		String cad="";
		boolean interruptor=false;
		while(interruptor==false){
			num1=validators.validator_int("Introduce un número: ","Introducir número");	
			if(num1==-1) {
				interruptor=true;
			}else {
				if(cont==0) {
					cont++;
					mayor=menor=num1;
				} //end if
				if(num1>mayor){
					mayor=num1;
				}//end if
				if(num1<menor){
					menor=num1;
				}//end if
				cad="El numero mayor ingresado es "+ mayor + " y el menor "+ menor + ". \n";
				suma = suma+num1;
				cont_media++;
			}//end if
		}//end while
		if(cont_media==0) {
			cad=cad+"Error 503, no se puede dividir entre 0.";
		}else {
			cad=cad+"La media es "+(float)(suma/cont_media)+". \n";
		}//end if
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Interruptor_Mayor_Menor_Media
	public static void N_num_Divisores() {
		int num1=0;
		int num2=0;
		int prod=1;
		String cad_div="";
		String cad_20="";
		String cad="";
		num1=validators.validator_int("Introduce un número: ","Introducir número");
		for(int i=1;i<=num1;i++) {
			num2=validators.validator_int("Introduce un número: ","Introducir número");
			cad_div = "";
			prod= 1;
			for(int j=1;j<=num2;j++) {
				if((num2%j)==0) {
					prod=prod*j;
					if (cad_div.isEmpty()) {
			            cad_div = cad_div + j;
			        }else{
			            cad_div = cad_div + "," + j;
			        }//end if
				}//end if
			}//end for
			if(prod>=20) {
				cad_20=cad_20+"El producto de los divisores de "+num2+" es mayor a 20.\n";
			}else{
				cad_20=cad_20+"El producto de los divisores de "+num2+" es menor a 20.\n";
			}//end if
			cad="Los divisores de "+num2+" son:"+cad_div+"\n"+cad+"\n";
		}//end for
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_num_Divisores
	public static void N_Primeros_Impares () {
		int cont=0;
		int num=0;
		int prod=1;
		String cad="";
		while(cont<3) {
			num=validators.validator_int("Introduce un número: ","Introducir número");
			if((num%3)==0) {
				prod=prod*num;
				cont++;
			}//end if
		}//end while
		cad="El producto del los 3 primeros números impares es: "+prod+". \n";
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_Primeros_Impares
}//end class doubles