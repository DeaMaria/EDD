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
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		throw  new NotImplementedException();
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
}
