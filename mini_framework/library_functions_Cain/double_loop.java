package library_functions_Cain;
import javax.swing.JOptionPane;
public class double_loop {
	public static void DeseaContinuarMediaPares() {
		int num1=0;
		int sum=0;
		int cont=0;
		int next = 0;
		float avg = 0.0f;
		String str= "";
		JOptionPane.showMessageDialog(null, "Escribe números hasta que quieras y te hará la media de los divisores pares que tenga.","Intrucciones",JOptionPane.INFORMATION_MESSAGE);
		do{
			num1=validators.validator_int("Introduce un número: ","Introducir número");
			sum=0;
			cont=0;
			for(int i=1;i<=num1;i++) {
				if((num1%i)==0){
					if((i%2)==0){
						sum = sum + num1;
						cont++;
					}//end if
				}//end if
			}//end for
			next = JOptionPane.showConfirmDialog( null, "¿Desea introducir otro número?");
		}while(JOptionPane.OK_OPTION == next);
		avg=single_loop.average(sum, cont);
		str="La media de los divisores es: "+avg;
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end DeseaContinuarMediaPares
	public static void Interruptor_Digitos_Mayor_Menor(){
		int cont=0;
		int num_copy=0;
		int num=0;
		int digit=0;
		int major=0;
		int minor=0;
		String str="";
		boolean interrupt=false;
		JOptionPane.showMessageDialog(null, "Escribe números hasta que quieras y te mostrará los digito mayor y menor de cada número.","Intrucciones",JOptionPane.INFORMATION_MESSAGE);
		while(interrupt==false) {
			num=validators.validator_int("Introduce un número:\nPara salir introduce el '-1'. ","Introducir número");
			if(num == -1) {
				interrupt=true;
			}else{
				cont=0;
				num_copy=num;
				while(num!=0) {
					digit = num%10;
					num=num/10;
					if(cont==0) {
						cont++;
						major=minor=digit;
					} //end if
					if(digit > major){
						major=digit;
					}//end if
					if(digit < minor){
						minor = digit;
					}//end if
				}//end while
				str=str+"El dígito mayor de "+ num_copy+" es "+ major + " y el menor "+ minor + ". \n";
			}//end if
		}//end while
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Interruptor_Digitos_Mayor_Menor
	public static void Interruptor_Mayor_Menor_Media() {
		int num1=0;
		int cont=0;
		int major=0;
		int minor=0;
		int cont_avg=0;
		float sum=0.0f;
		float avg=0.0f;
		String str="";
		boolean interrupt=false;
		JOptionPane.showMessageDialog(null, "Escribe números hasta que quieras y te mostrará el mayor y menor además de la media de todos.","Intrucciones",JOptionPane.INFORMATION_MESSAGE);
		while(interrupt==false){
			num1=validators.validator_int("Introduce un número:\nPara salir introduce el '-1'.","Introducir número");	
			if(num1==-1) {
				interrupt=true;
			}else {
				if(cont==0) {
					cont++;
					major=minor=num1;
				} //end if
				if(num1>major){
					major=num1;
				}//end if
				if(num1<minor){
					minor=num1;
				}//end if
				str="El numero mayor ingresado es "+ major + " y el menor "+ minor + ". \n";
				sum += num1;
				cont_avg++;
			}//end if
		}//end while
		avg=single_loop.average(sum, cont_avg);
		str+="La media es "+avg+"."; 
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Interruptor_Mayor_Menor_Media
	public static void N_num_Divisores() {
		int num1=0;
		int num2=0;
		int prod=1;
		String str_div="";
		String str_20="";
		String str="";
		JOptionPane.showMessageDialog(null, "Escribe las veces que quieras introducir números y luego de los números que ingreses sacará el producto de los divisores y si el resultado es mayor a 20 o es menor.","Intrucciones",JOptionPane.INFORMATION_MESSAGE);
		num1=validators.validator_int("¿Cuántos números deseas introducir? ","Introducir número");
		for(int i=1;i<=num1;i++) {
			num2=validators.validator_int("Introduce un número: ","Introducir número");
			str_div = "";
			prod= 1;
			for(int j=1;j<=num2;j++) {
				if((num2%j)==0) {
					prod=prod*j;
					if (str_div.isEmpty()) {
						str_div = str_div + j;
			        }else{
			        	str_div = str_div + "," + j;
			        }//end if
				}//end if
			}//end for
			if(prod>=20) {
				str_20=str_20+"El producto de los divisores de "+num2+" es mayor a 20.\n";
			}else{
				str_20=str_20+"El producto de los divisores de "+num2+" es menor a 20.\n";
			}//end if
			str="Los divisores de "+num2+" son:"+str_div+"\n"+str+"\n";
		}//end for
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_num_Divisores
	public static void N_Primeros_Impares () {
		int cont=0;
		int num=0;
		int prod=1;
		String str="";
		while(cont<3) {
			num=validators.validator_int("Introduce un número: ","Introducir número");
			if((num%3)==0) {
				prod=prod*num;
				cont++;
			}//end if
		}//end while
		str="El producto del los 3 primeros números impares es: "+prod+". \n";
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_Primeros_Impares
	public static void Digitos_Posicion(){
		int cont=0;
		int cont2=0;
		int num_copy=0;
		int num=0;
		int num2=0;
		int pos=0;
		int digit=0;
		int digit2=0;
		String str="";
		num=validators.validator_int("Introduce un número: ","Introducir número");
		cont=0;
		num_copy=num;
		while(num!=0){
			digit=num%10;
			num=num/10;
			cont++;
		}//end while
		pos=validators.validator_range(cont,"Escribe una posición: ","Introducir posición");
		num2=num_copy;
		cont2=0;
		while(num2!=0){
			digit2=num2%10;
			num2=num2/10;
			cont2++;
			if(pos==cont2){
				str = "El dígito en la posición " + pos + " es: " + digit2;
			}//end if
		}//end while
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Digitos_Posicion
	public static void Interruptor_Mayor_Repeat(){
		int num1=0;
		int cont=0;
		int major=0;
		int repeat=0;
		String str="";
		String str2="";
		boolean interruptor=false;
		while(interruptor==false){
			num1=validators.validator_int("Introduce un número: ","Introducir número");	
			if(num1==-1) {
				interruptor=true;
			}else{
				if(cont==0){
					cont++;
					major=num1;
				}else {
					if(num1>major){
						major=num1;
						repeat = 0;
					}//end if
					if(num1==major){
						repeat++;
					}//end if
				}//end if
				if (repeat==1) {
					str2=" vez.";
				}else {
					str2=" veces.";
				}//end if
			}//end if
		}//end while
		str="El numero mayor ingresado es "+ major + " y se repite "+ (repeat) + str2+ "\n";
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Interruptor_Mayor_Repeat
	public static void Perfecto_Primeros() {
		int cont=0;
		int sum=0;
		String str="";
		for(int i=1;cont<4;i++){
			sum=0;
			for(int j=1;j<=(i/2);j++){
				if((i%j)==0){
					sum+=j;
				}//end if
			}//end for
			if(sum==i){
				str=str+"Número perfecto encontrado: "+i+"\n";
				cont++;
			}//end if
		}//end for
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Perfecto_Primeros
	public static void DeseaContinuarMediaDivisoresImpares() {
		int num1=0;
		int sum=0;
		int cont=0;
		int next = 0;
		float avg = 0.0f;
		String str= "";
		do{
			num1=validators.validator_int("Introduce un número: ","Introducir número");
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
		avg=single_loop.average(sum, cont);
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
			num=validators.validator_int("Introduce números: \nPara salir escriba '-5'.","Introducir número");
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
	public static void N_primeros_Digi_Multiplo_media(){
		int cont=0;
		int num=0;
		int digit=0;
		int sum=0;
		int cont2=0;
		float avg=0.0f;
		String str="";
		while(cont<5) {
			cont++;
			num=validators.validator_int("Introduce un número: ","Introducir número");
			if((num%2)!=0) {
				while(num!=0) {
					digit = num%10;
					num=num/10;
					System.out.println(digit);
					if((digit%4)==0) {
						sum+=digit;
						cont2++;
					}//end if
					avg=single_loop.average(sum, cont2);
				}//end while
			}//end if
		}//end while
		str="La media de todos los dígitos múltiplos de 4 de los números ingresados es "+avg;
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_primeros_Digi_Multiplo_media
	public static void N_num_Div_Impar_Media(){
		int num1=0;
		int num2=0;
		int cont=0;
		int cont2=0;
		float sum=0.0f;
		float avg=0.0f;
		String str="";
		num1=validators.validator_int("¿Cúantos números deseas introducir? ","Introduce número");
		for(int i=0;i<num1;i++) {
			num2=validators.validator_int("Introduce un número: ","Introducir números");
			cont=0;
			for(int j=1;j<=num2;j++){
				if((num2%j)==0){
					cont++;
					if((num2%2)!=0) {
						if(cont==3){
							sum+=num2;
							cont2++;
						}//end if
					}//end if
				}//end if
			}//end for
			avg=single_loop.average(sum,cont2);
		}//end for
		str="La media de los números que tienen 3 divisiores impares es "+avg;
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_num_Div_Impar_Media
}//end class doubles
