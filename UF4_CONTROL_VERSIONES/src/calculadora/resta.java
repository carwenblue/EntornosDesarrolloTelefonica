package calculadora;

/**
 * Esta clase corresponde al bloque 2, referente a la Resta del ejercicio 2 de
 * Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Juan Ramón Varó Núñez
 * @since 21/01/2021
 * @version 1.0
 * @see suma
 * @see producto
 * @see cociente
 */

public class resta {
	
	
	static double totalAcumulado, resRestaReal;
	static int resRestaEntera;
	
	/**
	 * Este método resta dos numeros reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 es el primer número real que se va a restar
	 * @param n2 es el segundo número real que se va a restar
	 * @return devuelve la resta de los dos numeros reales
	 */
	
	public static double restar(double n1,double n2){
		return resRestaReal = n1 - n2;
	}
	
	/**
	 * Este método resta dos numeros enteros.<br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero número entero a restar
	 * @param n2 representa el segundo número entero a restar
	 * @return la resta de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */
	
	public static double Resta(int n1,int n2){
		return n1 - n2;
	}
	
	/**
	 * Este método resta tres numeros Reales.<br>Casos especiales:
	 * <br>Si n1, n2 o n3 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero número a resta
	 * @param n2 representa el segundo número a resta
	 * @param n3 representa el tercer número a resta
	 * @return la resta de los tres números reales
	 */
	
	public static double restar(double n1,double n2,double n3){
		
		return resRestaReal = n1 - n2 - n3;
	}
	
	/**
	 * Este método acumula un resultado total.<br>Casos especiales:
	 * <br>Si n1 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 representa un total acumulado, pero no retorna nada.
	 */
	
	public static double restarAcumulado(double totalAcumulado){
		return totalAcumulado;
	}
}
