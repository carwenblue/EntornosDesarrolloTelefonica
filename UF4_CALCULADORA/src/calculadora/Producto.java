package calculadora;
/**
 * Esta clase corresponde al bloque 3, referente al producto del ejercicio 1 de
 * Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Daniel del R�o P�rez.
 * @since 15/02/2021
 * @version 2.0
 * @see Suma
 * @see resta
 * @see Cociente
 */
public class Producto {
	
	
	/**
	 * Este metodo multiplica dos n�meros reales.<br>Casos especiales:
	 * 
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * 
	 * @param n1 representa el primer n�mero real a multiplicar.
	 * @param n2 representa el segundo n�mero real a multiplicar.
	 * 
	 * @return el resultado de la multiplicaci�n de ambos n�meros reales.
	 * 
	 */

	
	
	
	public static double producto(double n1, double n2) {
		 
		// casos especiales
		
	       if (n1 < 0 || n2 < 0) 
   			System.out.println("No se permiten n�meros negativos");
	    
           return n1 * n2;

        
       
  
        
        
	}

	/**
	 * Este m�todo multiplica dos n�meros enteros.<br>Casos especiales:
	 * 
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * 
	 * @param n1 representa el primer n�mero entero a multiplicar.
	 * 
	 * @param n2 representa el segundo n�mero entero a multiplicar.
	 * 
	 * @return la multiplicaci�n de ambos n�meros enteros.
	 */

	public static int producto(int n1, int n2) {
		// casos especiales
		
	       if (n1 < 0 || n2 < 0) 
			System.out.println("No se permiten n�meros negativos");
	    
        return n1 * n2;


	}

	/**
	 * Este m�todo multiplica tres n�meros reales.<br>Casos especiales:
	 * 
     * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos
	 * 
	 * @param n1 representa el primer n�mero real a multiplicar.
	 * @param n2 representa el segundo n�mero real a multiplicar.
	 * @param n3 representa el tercer n�mero real a multiplicar.
	 * 
	 * @return el resultado de la multiplicaci�n de los tres n�meros reales.
	 */

	public static double producto(double n1, double n2, double n3) {
		
		// casos especiales
		
	       if (n1 < 0 || n2 < 0 || n3<0) 
			System.out.println("No se permiten n�meros negativos");
		
		return n1 * n2 * n3;

	}

	/**
	 *  
	 * Este m�todo devuelve la potencia del n1 elevado al n2.<br>Casos especiales:
	 * 
	 * <br>Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.
	 * <br>Si el segundo argumento es 1.0, entonces el resultado es el mismo que el del 
	 * primer argumento.
	 *  
	 * 
	 * @param n1 representa la base entera.
	 * @param n2 representa la potencia.
	 * 
	 * 
	 * 
	 * @return el resultado de elevar n1 a n2.
	 *  
	 * 
	 */
	public static int potencia(int n1, int n2) {
		
		// casos especiales
		if  (n2 <=0 || n2 == 0 )
			return (int)1.0;
		if  (n2 == 1 )
			return n1;
		
		return (int) Math.pow(n1, n2);// se hace un casting para convertir a entero el resultado.

	}

}
