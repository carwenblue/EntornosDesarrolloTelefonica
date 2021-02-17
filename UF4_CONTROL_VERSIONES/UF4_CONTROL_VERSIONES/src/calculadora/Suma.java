package calculadora;

/**
 * Esta clase corresponde al bloque 1, referente a la Suma del ejercicio 1 de
 * Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Carmen Correa Heras
 * @since 07/02/2021
 * @version 2.0
 * @see resta
 * @see producto
 * @see cociente
 */
public class Suma {
	
	
	static double numAcum, sumaR;
	static int sumaE;
	
	/**
	 * Este método suma dos numeros reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 es el primer número real que se va a sumar
	 * @param n2 es el segundo número real que se va a sumar
	 * @return devuelve la suma de los dos numeros reales
	 */
	public static double sumar(double n1,double n2){
		return sumaR = n1 + n2;
	}
	/**
	 * Este método suma dos numeros enteros.<br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero número entero a sumar
	 * @param n2 representa el segundo número entero a sumar
	 * @return la suma de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */
	public static double Suma(int n1,int n2){
		return n1 + n2;
	}
	/**
	 * Este método suma tres numeros Reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero número a sumar
	 * @param n2 representa el segundo número a sumar
	 * @param n3 representa el tercer número a sumar
	 * @return la suma de los tres números reales
	 */
	public static double sumar(double n1,double n2,double n3){
		
		return sumaR = n1 + n2 + n3;
	}
	/**
	 * Este método acumula un resultado.<br>Casos especiales:
	 * <br>Si n1 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente un acumulado, pero no retorna nada.
	 */
	public static double sumarAcumulado(double numAcum){
		return numAcum;
	}


}
