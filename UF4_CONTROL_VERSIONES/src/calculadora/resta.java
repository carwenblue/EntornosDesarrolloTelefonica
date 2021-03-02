package calculadora;

/**
 * Esta clase corresponde al bloque 2, referente a la Resta del ejercicio 2 de
 * Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Juan Ram�n Var� N��ez
 * @since 21/01/2021
 * @version 1.0
 * @see Suma
 * @see Producto
 * @see Cociente
 */

public class resta {
	
	
	static double totalAcumulado, resRestaReal;
	static int resRestaEntera;
	
	/**
	 * Este m�todo resta dos numeros reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 es el primer n�mero real que se va a restar
	 * @param n2 es el segundo n�mero real que se va a restar
	 * @return devuelve la resta de los dos numeros reales
	 */
	
	public static double restar(double n1,double n2){
		
		if (n1 < 0 || n2 < 0) 
			System.out.println("No se permiten n�meros negativos");
		 else {
			double resRestaReal2digit = Suma.sumar(n1, n2);
			System.out.println("El resultado de la resta es " + resRestaReal2digit);
		}
		
		return resRestaReal = n1 - n2;
	}
	
	/**
	 * Este m�todo resta dos numeros enteros.<br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero n�mero entero a restar
	 * @param n2 representa el segundo n�mero entero a restar
	 * @return la resta de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */
	
	public static double Resta(int n1,int n2){
		
		if (n1 < 0) 
			System.out.println("No se permiten n�meros negativos");
		else {
			double resRestaEntera = resta.restar(n1, n2);
			System.out.println("El resultado de la resta es " + resRestaEntera);
		}
		
		return n1 - n2;
	}
	
	/**
	 * Este m�todo resta tres numeros Reales.<br>Casos especiales:
	 * <br>Si n1, n2 o n3 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero n�mero a resta
	 * @param n2 representa el segundo n�mero a resta
	 * @param n3 representa el tercer n�mero a resta
	 * @return la resta de los tres n�meros reales
	 */
	
	public static double restar(double n1,double n2,double n3){
		
		if (n1 < 0 || n2 < 0) {
			System.out.println("No se permiten n�meros negativos");
		} else {
			double resRestaReal3digit = resta.restar(n1, n2, n3);
			System.out.println("El resultado de la resta es " + resRestaReal3digit);
		}
		
		return resRestaReal = n1 - n2 - n3;
	}
	
	/**
	 * Este m�todo acumula un resultado total.<br>Casos especiales:
	 * <br>Si n1 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 representa un total acumulado, pero no retorna nada.
	 */
	
	public static double restarAcumulado(double totalAcumulado){
		
		if (totalAcumulado < 0) {
			System.out.println("No se permiten n�meros negativos");
		} else {
			double restaAcumulada = resta.restarAcumulado(totalAcumulado);
			System.out.println("El n�mero guardado es: " + restaAcumulada);
		}
		
		return totalAcumulado;
	}
}
