package funciones;

import javax.swing.JOptionPane;

	public class Ejercicios {
		public int continuar = 0;
		public int continuar2 = 0;
		public int num1 = 0;
		public int cont = 0;
		public int suma = 0;
		public int cont_media=0;
		public int num=0;
		public int num_copia=0;
		public int digito=0;
		int mayor=0;
		int menor=0;
		int prod=1;
		int num2=0;
		float media = 0.0f;
		String cad="";
		String cad_div="";
		String cad_20="";
		String num_input= "";
		boolean interruptor=false;
		
		boolean conversion = false;
		
		public static int validar_rango() {
			int menu=0;
			String menu_str="";
			boolean correcto=true;
			do{
				do{
					try{
						menu_str=JOptionPane.showInputDialog(null,"Elige una opción del menú: \n 1.- Desea Continuar Media Pares \n 2.- Interruptor Digitos Mayor Menor \n 3.- Interruptor Mayor Menor Media \n 4.- N Números Divisores \n 5.- N Primeros Impares \n 6.-Para Cerrar el Menú.","Instrucciones",JOptionPane.QUESTION_MESSAGE);
						
						if(menu_str==null){
							JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}else {
							menu=Integer.parseInt(menu_str);
							correcto=true;
						}
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "Opción de menú no válida, debe de ser del 1 al 5.", "Error",JOptionPane.ERROR_MESSAGE);
						correcto=false;
					}	
				}while(correcto==false);
				if ((menu<1)||(menu>6))
					JOptionPane.showMessageDialog(null,"Opción de menú no válida, debe de ser del 1 al 5.","Error",JOptionPane.ERROR_MESSAGE);
				
			}while(((menu<1)||(menu>6)));
			return menu;
		}
		
		public void DeseaContinuarMediaPares() {
			do{
				do{
					try{
						num_input=JOptionPane.showInputDialog(null, "Escribe números y te mostrará la media de los divisores: ","Instrucciones",JOptionPane.QUESTION_MESSAGE);
						if(num_input==null){
							JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}else{
							num1=Integer.parseInt(num_input);
							conversion=true;
						}//end if
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
						conversion=false;
					}//end try catch
				}while(conversion==false);
				
				suma=0;
				cont=0;
				
				for(int i=1;i<=num1;i++) {
					if(((num1%i)==0)&&((i%2)==0)) {
						suma = suma + num1;
						cont++;
					}//end if
				}//end for
				continuar = JOptionPane.showConfirmDialog(  null, "¿Desea introducir otro número?");
			}while(JOptionPane.OK_OPTION == continuar);
			if(cont==0) {
				media=0.0f;
			}else {
				media=(float)(suma/cont);
			}//end if
			cad="La media de los divisores es: "+media;

			JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
						
						
			
		}
		public void Interruptor_Digitos_Mayor_Menor(){
			
			while(interruptor==false) {
				boolean conversion = false;
				do{
					try{
						num_input=JOptionPane.showInputDialog(null, "Escribe números y mostraré los digitos mayor y menor de cada uno: \n Para salir ingresa el -1.","Introducir número",JOptionPane.QUESTION_MESSAGE);
						if(num_input==null){
							JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}else{
							num=Integer.parseInt(num_input);
							conversion=true;
						}//end if
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
						conversion=false;
					}
				}while(conversion==false);
				if(num== -1) {
					interruptor=true;
				}
				else{
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
		}
		public void Interruptor_Mayor_Menor_Media() {
			while(interruptor==false){
				boolean conversion = false;
				do{
					try{
						num_input=JOptionPane.showInputDialog(null, "Escribe números, se le mostrará la media de todos ellos, el mayor y el menor. Ingrese '-1' para salir : ","Ingresar número",JOptionPane.QUESTION_MESSAGE);
						if(num_input==null){
							JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}else{
							num1=Integer.parseInt(num_input);
							conversion=true;
						}//end if
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
						conversion=false;
					}
				}while(conversion==false);
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
					}
					cad="El numero mayor ingresado es "+ mayor + " y el menor "+ menor + ". \n";
					suma = suma+num1;
					cont_media++;
				}//end if
			}//end while
			if(cont_media==0) {
				cad=cad+"Error 503, no se puede dividir entre 0.";
			}else {
				cad=cad+"La media es "+(float)(suma/cont_media)+". \n";
			}
			JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		}
		public void N_num_Divisores() {
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "¿Cuántos números quieres introducir? ","Pregunta",JOptionPane.QUESTION_MESSAGE);
					if(num_input==null){
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else{
						num1=Integer.parseInt(num_input);
						conversion=true;
					}//end if
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
					conversion=false;
				}
			}while(conversion==false);
			for(int i=1;i<=num1;i++) {
				do{
					try{
						num_input=JOptionPane.showInputDialog(null, "Escribe números para sacar los divisores: ","Información",JOptionPane.QUESTION_MESSAGE);
						if(num_input==null){
							JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}else{
							num2=Integer.parseInt(num_input);
							conversion=true;
						}//end if
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
						conversion=false;
					}
				}while(conversion==false);
				cad_div = "";
				prod= 1;
				for(int j=1;j<=num2;j++) {
					if((num2%j)==0) {
						prod=prod*j;
						if (cad_div.isEmpty()) {  //Comprueba si la cadena está vacía para colocar el divisor, de esta forma la primera iteración no pondrá la coma.
				            cad_div = cad_div + j;
				        } else {
				            cad_div = cad_div + "," + j;
				        }
					}
				}
				if(prod>=20) {
					cad_20=cad_20+"El producto de los divisores de "+num2+" es mayor a 20.\n";
				}else{
					cad_20=cad_20+"El producto de los divisores de "+num2+" es menor a 20.\n";
				}//end if
				cad="Los divisores de "+num2+" son:"+cad_div+"\n"+cad+"\n";
			}//end for
			JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		}
		public void N_Primeros_Impares () {
			while(cont<3) {
				boolean conversion = false;
				do{
					try{
						num_input=JOptionPane.showInputDialog(null, "Escribe números, cuando reciba 3 impares terminará el programa: ","Ingrese número",JOptionPane.QUESTION_MESSAGE);
						if(num_input==null){
							JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
						}else{
							num=Integer.parseInt(num_input);
							conversion=true;
						}//end if
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
						conversion=false;
					}//end try catch
				}while(conversion==false);
				if((num%3)==0) {
					prod=prod*num;
					cont++;
				}//end if
			}//end while
			cad="El producto del los 3 primeros números impares es: "+prod+". \n";
			JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
			
			
		}
}
	
	