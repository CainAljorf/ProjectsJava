package ejer_1;
import javax.swing.JOptionPane;

public class doubles_v1 {
	public static void Digitos_Posicion(){
		int cont=0;
		int cont2=0;
		int num_copia=0;
		int num=0;
		int num2=0;
		int pos=0;
		int digito=0;
		int digito2=0;
		String cad="";
		num=validators_v1.validator_int("Introduce un número: ","Introducir número");
		cont=0;
		num_copia=num;
		while(num!=0){
			digito=num%10;
			num=num/10;
			cont++;
		}//end while
		pos=validators_v1.validator_range(cont,"Escribe una posición: ","Introducir posición");
		num2=num_copia;
		cont2=0;
		while(num2!=0){
			digito2=num2%10;
			num2=num2/10;
			cont2++;
			if(pos==cont2){
				cad = "El dígito en la posición " + pos + " es: " + digito2;
			}//end if
		}//end while
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Digitos_Posicion
	public static void Interruptor_Mayor_Repeat(){
		int num1=0;
		int cont=0;
		int mayor=0;
		int repeat=0;
		String cad="";
		String cad2="";
		boolean interruptor=false;
		while(interruptor==false){
			num1=validators_v1.validator_int("Introduce un número: ","Introducir número");	
			if(num1==-1) {
				interruptor=true;
			}else{
				if(cont==0){
					cont++;
					mayor=num1;
				}else {
					if(num1>mayor){
						mayor=num1;
						repeat = 0;
					}//end if
					if(num1==mayor){
						repeat++;
					}//end if
				}//end if
				if (repeat==1) {
					cad2=" vez.";
				}else {
					cad2=" veces.";
				}//end if
			}//end if
		}//end while
		cad="El numero mayor ingresado es "+ mayor + " y se repite "+ (repeat) + cad2+ "\n";
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Interruptor_Mayor_Repeat
	public static void Perfecto_Primeros() {
		int cont=0;
		int suma=0;
		String cad="";
		for(int i=1;cont<4;i++){
			suma=0;
			for(int j=1;j<=(i/2);j++){
				if((i%j)==0){
					suma+=j;
				}//end if
			}//end for
			if(suma==i){
				cad=cad+"Número perfecto encontrado: "+i+"\n";
				cont++;
			}//end if
		}//end for
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end Perfecto_Primeros
}//end class doubles