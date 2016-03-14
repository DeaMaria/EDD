package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		return x.getClass();
	}


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		List<Integer> v = new ArrayList<Integer>();
		for(int i=0; i<n; i++)
			if(i<2){
				v.add(1);
			}else{
				v.add(v.get(i-1)+v.get(i-2));
			}
		return (v);
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		if(step==0)
			return new int[0];
		int result=(number-1)/step;
		int vector[] = new int[result];
		int j=0;
		while(number>step){
			number-=step;
			vector[j] = number;
			j++;
		}
		return vector;
		}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		int largo=0;
		if(n>0){
			for(int i=1; i<=n; i++){
				if(n%i==0){
					largo++;
				}
			}
		}else return null;
		int d[] = new int[largo];
		for (int i = n, j = 0; i > 0; i--) {
			if(n % i == 0){
				d[j] = i;
				j++;
			}
		}
		return d;
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		return palindrome(cadena);
	}
	public static boolean palindrome(String cadena){
		String tildes = "áéíóúàèìòùäëïöüñãõâêîôûçÁÀÄÃÂÉÈËÊÍÌÏÎÓÒÖÕÔÚÙÜÛÑÇ";
		String sustituir = "aeiouaeiouaeiounaoaeioucaaaaaeeeeiiiiooooouuuunc";
		String nueva = "";
		String inver = "";
		if(cadena==null)
			return false;
		cadena = cadena.toLowerCase();
		for(int i = 0; i < cadena.length(); i++){
			if (Character.isLetter(cadena.charAt(i))) {
				if (tildes.indexOf(cadena.charAt(i)) != -1){
					nueva += sustituir.charAt(tildes.indexOf(cadena.charAt(i)));
				}else{
					nueva += cadena.charAt(i);
				}
			}
		}
		for(int i = nueva.length()-1; i>=0; i--){
			inver += nueva.charAt(i);
		}
		if(nueva.equals(inver)){
				return true;
		}else return false;
	}
	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		String[] d = {"Cero","Diez","Veinte","Treinta","Cuarenta","Cincuenta",
				  "Sesenta","Setenta","Ochenta","Noventa"};

		  String[] u = {"","uno","dos","tres","cuatro","cinco","seis","siete",
				  "ocho","nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis",
				  "Diecisiete","Dieciocho","Diecinueve"};

		  String numero="";

		  if(n==0){
			  numero="";
			  numero=d[0];
			  return numero;
		  }else if(n<20){
			  numero="";
			  numero=u[n];
			  return numero;
		  }else if((n%10)==0){
			  numero="";
			  numero=d[n/10];
			  return numero;
		  }else{
			  numero="";
			  numero=d[n/10]+" y "+u[n%10];
			  return numero;
		  }
	}
	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		int anio;
		try {
			anio = Integer.parseInt(fecha.substring(6));
		}catch (NumberFormatException e) {
			return false;
		}catch(IndexOutOfBoundsException i){
			return false;
		}
		if((anio%100)==0 && (anio%400)!=0)
			return false;
		if((anio%4)==0)
			return true;
		else
			return false;
	}
	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		int dia, mes, anio;
		try{
			dia=Integer.parseInt(date.substring(0, 2));
			mes=Integer.parseInt(date.substring(3,5));
			anio=Integer.parseInt(date.substring(6));
		}catch (NumberFormatException e) {
			return false;
		}catch(IndexOutOfBoundsException i){
			return false;
		}
		if(anio>0){
			if((dia<=31 && dia>0) && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12))
				return true;
			else if((dia<=30 && dia>0) && (mes==4 || mes==6 || mes==9 || mes==11))
				return true;
			else if((dia<=28 && dia>0) && (mes==2))
				return true;
		}
		return false;
	}
}