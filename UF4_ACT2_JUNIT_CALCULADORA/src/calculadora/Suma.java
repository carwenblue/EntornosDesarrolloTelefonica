package calculadora;

/**
 * Esta clase corresponde al bloque 1, referente a la Suma del ejercicio 1 de
 * Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Carmen Correa Heras
 * @since 07/02/2021
 * @version 2.0
 * @see resta
 * @see Producto
 * @see Cociente
 */
public class Suma {
	
	
	static double numAcum, sumaR;
	static int sumaE;
	
	/**
	 * Este m�todo suma dos numeros reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 es el primer n�mero real que se va a sumar
	 * @param n2 es el segundo n�mero real que se va a sumar
	 * @return la suma de los n�meros reales n1 y n2
	 */
	public static double sumar(double n1,double n2){
		if (n1 < 0 || n2 < 0) 
			System.out.println("No se permiten n�meros negativos");
		else {
			return sumaR= n1 + n2;
		}
		return sumaR;
		
	}
	/**
	 * Este m�todo suma dos numeros enteros.<br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero n�mero entero a sumar
	 * @param n2 representa el segundo n�mero entero a sumar
	 * @return la suma de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */
	public static double sumar(int n1,int n2){
		if (n1 < 0 || n2 < 0) 
			System.out.println("No se permiten n�meros negativos");
		else {
			return sumaE= n1 + n2;
		}
		return sumaE;
		
	}
	/**
	 * Este m�todo suma tres numeros Reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero n�mero a sumar
	 * @param n2 representa el segundo n�mero a sumar
	 * @param n3 representa el tercer n�mero a sumar
	 * @return la suma de los tres n�meros reales
	 */
	public static double sumar(double n1,double n2,double n3){
		if (n1 < 0 || n2 < 0) 
			System.out.println("No se permiten n�meros negativos");
		else 
			return sumaR = n1 + n2 + n3;
		return sumaR;
		
	}
	/**
	 * Este m�todo acumula un resultado.<br>Casos especiales:
	 * <br>Si n1 es un n�mero negativo devuelve que no se permiten negativos.
	 * @return la suma acumulada.
	 */
	public static double sumarAcumulado(double numAcum){

		if (numAcum < 0) 
			System.out.println("No se permiten n�meros negativos");
		else 
			return numAcum;
		return numAcum;
		
	}


}

