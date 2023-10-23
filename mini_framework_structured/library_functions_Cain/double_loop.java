package library_functions_Cain;
import javax.swing.JOptionPane;
public class double_loop {
	public static void Continue_AVG_Even() {
		int num1=0;
		int sum=0;
		int cont=0;
		int next=0;
		float avg=0.0f;
		String str="";
		JOptionPane.showMessageDialog(null, "Escribe números hasta que quieras y te hará la media de los pares.","Intrucciones",JOptionPane.INFORMATION_MESSAGE);
		do{
			num1=validators.validator_int("Introduce un número: ","Introducir número");
			if((num1%2)==0) {
				sum = sum + num1;
				cont++;
				System.out.println(sum);
				System.out.println(cont);
			}//end if
			next = JOptionPane.showConfirmDialog( null, "¿Desea introducir otro número?");
		}while(JOptionPane.OK_OPTION == next);
		System.out.println(sum);
		System.out.println(cont);
		avg=single_loop.average(sum, cont);
		str="La media de los divisores es: "+avg;
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Continue_AVG_Even
	public static void Interrupt_Digit_Major_Minor(){
		int cont=0;
		int num_copy=0;
		int num=0;
		int digit=0;
		int major=0;
		int minor=0;
		String str="";
		boolean interrupt=false;
		JOptionPane.showMessageDialog(null, "Escribe números hasta que quieras y te mostrará los dígitos mayor y menor de cada número.","Intrucciones",JOptionPane.INFORMATION_MESSAGE);
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
	}//end Interrupt_Digit_Major_Minor
	public static void Interrupt_Major_Minor_AVG() {
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
	}//end Interrupt_Major_Minor_AVG
	public static void N_num_Div() {
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
			str="Los divisores de "+num2+" son:"+str_div+"\n"+str;
		}//end for
		JOptionPane.showMessageDialog(null, str+str_20,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end N_num_Div
	public static void Digit_Position(){
		int cont=0;
		int cont2=0;
		int num_copy=0;
		int num=0;
		int num2=0;
		int pos=0;
		int digit=0;
		int digit2=0;
		String str="";
		num=validators.validator_int("Introduce un número para divirlo en digitos: ","Introducir número");
		cont=0;
		num_copy=num;
		while(num!=0){
			digit=num%10;
			num=num/10;
			cont++;
		}//end while
		pos=validators.validator_range(cont,"Ahora escribe la posición del dígito que quieres mostrar: ","Introducir posición");
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
	}//end Digit_Position
	public static void Interrupt_Major_Repeat(){
		int num1=0;
		int cont=0;
		int major=0;
		int repeat=0;
		String str="";
		String str2="";
		boolean interruptor=false;
		JOptionPane.showMessageDialog(null, "Introduce números hasta que quieras y te mostrará el mayor ingresado y las veces que se repite.","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
		while(interruptor==false){
			num1=validators.validator_int("Introduce un número:\nPara salir ingresa el '-1' ","Introducir número");	
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
				if (repeat==2) {
					str2=" vez.";
				}else {
					str2=" veces.";
				}//end if
			}//end if
		}//end while
		str="El numero mayor ingresado es "+ major + " y se repite "+ (repeat-1) + str2+ "\n";
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Interrupt_Major_Repeat
	public static void Four_N_Perfects() {
		int cont=0;
		int sum=0;
		String str="";
		JOptionPane.showMessageDialog(null, "Este programa te va a mostrar los 4 primeros números perfectos.","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
		for(int i=1;cont<4;i++){
			sum=0;
			for(int j=1;j<=(i/2);j++){
				if((i%j)==0){
					sum+=j;
				}//end if
			}//end for
			if(sum==i){
				str=str+"Número perfecto "+(cont+1)+": "+i+".\n";
				cont++;
			}//end if
		}//end for
		JOptionPane.showMessageDialog(null, str,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Four_N_Perfects
	public static void Continue_AVG_Div_Odd() {
		int num1=0;
		int sum=0;
		int cont=0;
		int next = 0;
		float avg = 0.0f;
		String str= "";
		JOptionPane.showMessageDialog(null, "Ingresa números hasta que quieras, y te mostrará la media de los divisores impares y que divisor de cada número es mayor o igual a 10.","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
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
	}//end Continue_AVG_Div_Odd
	public static void Interrupt_2_Digits_Odd(){
		int cont=0;
		int num_copy=0;
		int num=0;
		int digit=0;
		int prod=1;
		String str="";
		boolean interrupt=false;
		JOptionPane.showMessageDialog(null, "Introduce números hasta que quieras y te mostrará el producto de los números que tengan dos dígitos impares.","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
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
	}//end Interrupt_2_Digits_Odd
	public static void N_first_Digit_Multiple_AVG(){
		int cont=0;
		int num=0;
		int digit=0;
		int sum=0;
		int cont2=0;
		float avg=0.0f;
		String str="";
		JOptionPane.showMessageDialog(null, "Ingresa 5 números y te mostrará la media de todos los dígitos múltiplos de 4.","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
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
	}//end N_first_Digit_Multiple_AVG
	public static void N_num_Div_Odd_AVG(){
		int num1=0;
		int num2=0;
		int cont=0;
		int cont2=0;
		float sum=0.0f;
		float avg=0.0f;
		String str="";
		JOptionPane.showMessageDialog(null, "Escribe cuantos números quieres introducir y luego de los números ingresados se mostrará la media de los que tienen 3 divisores impares.","Instrucciones",JOptionPane.INFORMATION_MESSAGE);
		num1=validators.validator_int("¿Cúantos números deseas introducir? ","Introduce número");
		for(int i=0;i<num1;i++) {
			num2=validators.validator_int("Recomendación:'Los tres primeros que tienen 3 divisores impares son: 9,25 y 49.'\nIntroduce un número: ","Introducir números");
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
	}//end N_num_Div_Odd_AVG
}//end class double_loop