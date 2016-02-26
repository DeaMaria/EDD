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
     * devuelve una lista con los n nÃºmeros de la serie de fibonacci.
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
	 * Escribir todos los nÃºmeros del number al 0 de step en step.
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
	 * MÃ³dulo al que se le pasa un nÃºmero entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		int largo=0;
		if(n>0){
			for(int i=1; i<=n; i++)
				if(n%i==0)
					largo++;
		}else return null;
		int d[] = new int[largo];
		try{
			for (int i = n, j = 0; i > 0; i--) {
				if(n % i == 0){
					d[j] = i;
					j++;
				}
			}
			return d;
		}catch(IndexOutOfBoundsException e){
				return null;
		}
	}

	/*
	 * Toma como parÃ¡metros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palÃ­ndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		if(cadena==null)
			return false;
		String tildes = "áéíóúàèìòùäëïöüÁÉÍÓÚÀÈÌÒÙÄËÏÖÜñÑçÇ";
		String sustituir= "aeiouaeiouaeiouAEIOUAEIOUAEIOUnNcC";
		String simbolos = ",.:;¿?¡!";
		char cad[]=new char[cadena.length()];
		for(int i=0; i<cadena.length(); i++){
			for(int j=0; j<simbolos.length(); j++){
				cad[i]=cadena.charAt(i);
				if(cad[i].isLetter())
					j--;
				cad[j]=cad[i];
			}
			for(int n=0; n<tildes.length(); n++){
				if(cad[i]==tildes.charAt(n))
					cad[i] = sustituir.charAt(n);
				else
					cad[i] = cad[i];
			}
		}
		/*char intermedio;
		int longitud = cadena.length;
		for(int i=0; i<(longitud/2); i++){
			intermedio = cadena[i];
			cadena[i] = cadena[longitud-i-1];
			cadena[longitud-i-1] = intermedio;*/
		return true;
	}
	/*
	 * Pedir un nÃºmero de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}
	/*
	 * este metodo devuelve cierto si el aÃ±o de la fecha es bisiesto fecha
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
	 * este metodo devuelve cierto si la fecha es vÃ¡lida
	 */
	public static boolean isValidDate(String date) {
		int dia, mes, anio;
		try{
			//01-01-2001
			dia=Integer.parseInt(date.substring(0, 2));
			mes=Integer.parseInt(date.substring(3,5));
			anio=Integer.parseInt(date.substring(6));
		}catch (NumberFormatException e) {
			return false;
		}catch(IndexOutOfBoundsException i){
			return false;
		}
		if(anio>0){
			switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(dia<=31 && dia>0)
					return true;
					break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(dia<=30 && dia>0)
					return true;
					break;
			case 2:
				if(dia<=28 && dia>0)
					return true;
					break;
			}
		}
		return false;
	}
}