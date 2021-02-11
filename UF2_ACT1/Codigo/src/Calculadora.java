/**
 * Miembros del equipo
 * 
 * @author Juan Ramón Varó
 * @author Mari Carmen Correa Heras
 * @author Daniel del Rio Perez
 * @author Verónica Bonis Martín
 * @since 23/01/2021
 * @version 1.1
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Cociente
 * 
 */

public class Calculadora {

	/**
	 * Esta clase corresponde al bloque 1, referente a la Suma del ejercicio 1 de
	 * Entornos de desarrollo. Trabajo en grupo
	 * 
	 * @author Juan Ramón Varó
	 * @since 21/01/2021
	 * @version 1.0
	 * @see Calculadora
	 */
	
	public static class Suma{
	/**
	 * Este método suma dos numeros reales.<br>Casos especiales:
	 * <br>Si el primer parámetro es Nan y el segundo parametro es numero real resultado es null.
	 * <br>Si el primer parámetro es numero real y el segundo parametro es Nan resultado es null.
	 * @param n1 es el primer número real que se va a sumar
	 * @param n2 es el segundo número real que se va a sumar
	 * @return devuelve la suma de los dos numeros reales
	 */
	public static double Suma(double n1, double n2) {
		return n1 + n2; // suma los números reales n1 + n2
	}

	/**
	 * Este método suma dos numeros enteros.<br>Casos especiales:
	 * <br>Si el primer parámetro es Nan y el segundo parametro es numero entero resultado es null.
	 * <br>Si el primer parámetro es numero entero y el segundo parametro es Nan resultado es null.
	 * @param n1 represente el primero número entero a sumar
	 * @param n2 representa el segundo número entero a sumar
	 * @return la suma de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */

	public static int Suma(int n1, int n2) {
		return n1 + n2; // suma los números enteros n1 + n2
	}

	/**
	 * Este método suma tres numeros enteros.<br>Casos especiales:
	 * <br>Si el primer parámetro es Nan y el segundo parametro es numero real resultado es null.
	 * <br>Si el primer parámetro es numero real y el segundo parametro es Nan resultado es null.
	 * @param n1 represente el primero número a sumar
	 * @param n2 representa el segundo número a sumar
	 * @param n3 representa el tercer número a sumar
	 * @return la suma de los tres números reales
	 */

	public static double Suma(double n1, double n2, double n3) {

		return n1 + n2 + n3; // suma los números reales n1 + n2 + n3
	}

	/**
	 * Este método acumula el resultado de todas las sumas calculadas.<br>Casos especiales:
	 * <br>Si el cualquiera de los parámetro es Nan el resultado es null.
	 * @param n1 represente el acumulado de todas las sumas calculadas, pero no
	 *           retorna nada.
	 */

	public static void SumaAcumulado(double n1) {
		// suma el acumulado de todas las operaciones de suma previamente calculadas
		double total;
	}
}
	/**
	 * Esta clase corresponde al bloque 2, referente a la resta del ejercicio 1 de
	 * Entornos de desarrollo. Trabajo en grupo
	 * 
	 * @author Mari Carmen Correa Heras
	 * @since 23/01/2021
	 * @version 1.0
	 */

	public static class Resta {

		/**
		 * Este método resta dos numeros reales.<br>Casos especiales:
		 * <br>Si el primer parametro es Nan y el segundo parametro es numero real resultado es null.
		 * <br>Si el primer parametro es numero real y el segundo parametro es Nan resultado es null.
		 * @param n1 es el primer número real que se va a restar
		 * @param n2 es el segundo número real que se va a restar
		 * @return la resta de ambos números, puede ser <u>negativo</u> si n2 mayor n1
		 * @see Calculadora
		 * 
		 */

		public static double Resta(double n1, double n2) {
			return n1 - n2; // resta los números reales n1 - n2
		}

		/**
		 * Este metodo resta dos numeros enteros.<br>Casos especiales:
		 * <br>Si el primer parametro es Nan y el segundo parametro es numero entero resultado es null.
		 * <br>Si el primer parametro es numero entero y el segundo parametro es Nan resultado es null.
		 * @param n1 represente el primero número entero a restar
		 * @param n2 representa el segundo número entero a restar
		 * @return la resta de ambos números, puede ser <u>negativo</u> si n2 mayor n1
		 */

		public static int Resta(int n1, int n2) {
			return n1 - n2; // resta los números enteros n1 - n2
		}

		/**
		 * Este método resta tres numeros reales.<br>Casos especiales:
		 * <br>Si cualquiera de los tres parametros es Nan el resultado es null.
		 * @param n1 represente el primero número real a restar
		 * @param n2 representa el segundo número real a restar
		 * @param n3 representa el tercer número real a restar
		 * @return la resta de los tres números, puede ser <u>negativo</u>
		 */

		public static double Resta(double n1, double n2, double n3) {
			return n1 - n2 - n3; // resta los números reales n1 - n2 - n3
		}

		/**
		 * Este método acumula el resultado de todas las restas calculadas
		 * <br>Si el parámetro es Nan el resultado es null.
		 * @param n1 representa el acumulado de todas las restas calculadas, pero no
		 * retorna nada.
		 * 
		 */

		
		public static void RestaAcumulado(double n1) {
			
			double total;// resta el acumulado de todas las operaciones de resta previamente calculadas
		}

	}
	/**
	 * Esta clase corresponde al bloque 3, referente al producto del ejercicio 1 de
	 * Entornos de desarrollo. Trabajo en grupo
	 * 
	 * @author Daniel del Río Pérez.
	 * @since 23/01/2021
	 * @version 1.0
	 */
	public static class Producto {

		/**
		 * Este metodo multiplica dos numeros reales.<br>Casos especiales:
		 * 
		 * <br>Si el primer argumento  es Nan y el segundo argumento  es numero real resultado es null. 
		 * <br>Si el primer argumento  es numero real y el segundo argumento  es Nan el resultado es null. 
		 * <br>Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.
		 * 
		 * 
		 * @param n1 representa el primer numero real a multiplicar.
		 * @param n2 representa el segundo numero real a multiplicar.
		 * 
		 * @return el resultado de la multiplicacion de ambos numeros reales.
		 * 
		 * @see Calculadora
		 */

		public static double producto(double n1, double n2) {
			return n1 * n2;

		}

		/**
		 * Este metodo multiplica dos numeros enteros.<br>Casos especiales:
		 * 
		 * <br>Si el primer argumento es Nan y el segundo argumento  es numero real resultado es null.  
		 * <br>Si el primer argumento  es numero real y el segundo argumento  es Nan el resultado es null. 
		 * <br>Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.
		 * 
		 * @param n1 representa el primer numero entero a multiplicar.
		 * 
		 * @param n2 representa el segundo numero entero a multiplicar.
		 * 
		 * @return la multiplicación de ambos numeros enteros.
		 */

		public static int producto(int n1, int n2) {
			return n1 * n2;

		}

		/**
		 * Este método multiplica tres numeros reales.<br>Casos especiales:
		 * 
		 * <br>Si el primer argumento  es Nan y el segundo argumento  es real y el tercer argumento real resultado es null.
		 * <br>Si el primer argumento es Nan y el segundo argumento  es Nan y el tercer argumento  real resultado es null.
		 * <br>Si los tres argumentos son NaN es resultado es null. 
		 * <br>Si el algun argumento es cero o negativo, entonces el resultado es 1.0.
		 * 
		 * @param n1 representa el primer numero real a multiplicar.
		 * @param n2 representa el segundo numero real a multiplicar.
		 * @param n3 representa el tercer numero real a multiplicar.
		 * 
		 * @return el resultado de la multiplicacion de los tres números reales.
		 */

		public static double producto(double n1, double n2, double n3) {
			return n1 * n2 * n3;

		}

		/**
		 *  
		 * Este metodo devuelve la potencia del n1 elevado al n2.<br>Casos especiales:
		 * 
		 * <br>Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.
		 * <br>Si el segundo argumento es 1.0, entonces el resultado es el mismo que el del 
		 * primer argumento.
		 * <br>Si el segundo argumento es NaN, entonces el resultado es NaN.
		 *<br>Si el primer argumento es NaN y el segundo argumento es distinto de cero, 
		 * entonces el resultado es NaN.
		 * <br>Si el valor absoluto del primer argumento es mayor que 1 y el segundo
		 * argumento es infinito positivo, o el valor absoluto del primer argumento es
		 * menor que 1 y el segundo argumento es infinito negativo, entonces el
		 * resultado es infinito positivo.
		 * <br>Si el valor absoluto del primer argumento es mayor que 1 y el segundo
		 * argumento es infinito negativo, o el valor absoluto del primer argumento es
		 * menor que 1 y el segundo argumento es infinito positivo, entonces el
		 * resultado es cero positivo.
		 * <br>Si el valor absoluto del primer argumento es igual a 1 y el segundo argumento
		 * es infinito, entonces el resultado es NaN.
		 * <br>Si el primer argumento es cero y el segundo argumento es mayor que cero, o el
		 * primer argumento es infinito positivo y el segundo argumento es menor que
		 * cero,entonces el resultado es cero positivo.
		 * <br>Si el primer argumento es cero positivo y el segundo argumento es menor que
		 * cero, o el primer argumento es infinito positivo y el segundo argumento es
		 * mayor que cero,entonces el resultado es infinito positivo.
		 * <br>Si el primer argumento es cero negativo y el segundo argumento es mayor que
		 * cero pero no un entero impar finito, o el primer argumento es infinito
		 * negativo y el segundo argumento es menor que cero pero no un entero impar
		 * finito, entonces el resultado es cero positivo.
		 * <br>Si el primer argumento es cero y el segundo argumento es un entero impar
		 * finito positivo, o el primer argumento es infinito negativo y el segundo
		 * argumento es un entero impar finito negativo, entonces el resultado es cero
		 * negativo.
		 * <br>Si el primer argumento es cero y el segundo argumento es menor que cero pero
		 * no un entero impar finito, o el primer argumento es infinito negativo y el
		 * segundo argumento es mayor que cero pero no un entero impar finito, entonces
		 * el resultado es infinito positivo.
		 * <br>Si el primer argumento es cero y el segundo argumento es un entero impar
		 * finito negativo, o el primer argumento es infinito negativo y el segundo
		 * argumento es un entero impar finito positivo, entonces el resultado es
		 * infinito negativo.
		 * <br>Si el primer argumento es finito y menor que cero y si el segundo argumento
		 * es un número entero finito par, el resultado es igual al resultado de elevar
		 * el valor absoluto del primer argumento a la potencia del segundo argumento.
		 * <br>Si el segundo argumento es un número entero finito impar, el resultado es igual
		 * al negativo del resultado de elevar el valor absoluto del primer argumento a
		 * la potencia del segundo argumento. 
		 * <br>Si el segundo argumento es finito y no un numero entero, entonces el resultado es NaN.
		 * <br>Si ambos argumentos son números enteros, entonces el resultado es exactamente
		 * igual al resultado matematico de elevar el primer argumento a la potencia del
		 * segundo argumento si ese resultado puede de hecho ser representado exactamente como un valor doble.
		 * <br>(En las descripciones anteriores, un valor de punto flotante se considera un
		 * número entero si y solo si es finito y un punto fijo del método ceil o, de
		 * manera equivalente, un punto fijo del metodo floor. Un valor es un punto fijo
		 * de un método de un argumento si y solo si el resultado de aplicar el método
		 * al valor es igual al valor.)
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
			return (int) Math.pow(n1, n2);// se hace un casting para convertir a entero el resultado.

		}

	}	
	/**
	 * Esta clase corresponde al bloque 4, referente al cociente del ejercicio 1 de
	 * Entornos de desarrollo. Trabajo en grupo
	 * 
	 * @author Verónica Bonis Martín
	 * @since 20/01/2021
	 * @version 1.0
	 * 
	 * @see Calculadora
	 */

		

		public static class Cociente {

			/**
			 * Este método divide dos números reales.<br>Casos especiales:
			 * <br>Si n1 es 0, el resultado será igual a 0.
			 * <br>Si n2 es 0, el resultado no se puede mostrar porque tiende a infinito.
			 * @param n1 representa el dividendo
			 * @param n2 representa el divisor
			 * @return la división de ambos números, puede ser decimal
			 * 
			 */
			public static double cociente(double n1, double n2) {
				return (n1 / n2);// divide el primer número real entre el segundo real
			}

			/**
			 * Este método divide dos números enteros.<br>Casos especiales:
			 * <br>Si n1 es 0, el resultado sería igual a 0 Si n2 es 0, el resultado no se puede mostrar porque tiende a infinito
			 * <br>Si el resultado no da un número exacto, solo muestra la parte entera al ser división entera.
			 * @param n1 representa el dividendo
			 * @param n2 representa el divisor
			 * @return la división de ambos números
			 */
			public static int cociente(int n1, int n2) {
				return n1 / n2;// divide el primer número entero entre el entero 
			}

			/**
			 * Este método calcula el inverso de un número real.<br>Casos especiales:
			 * <br>Si n1 es 0, el resultado no se puede mostrar porque tiende a infinito
			 * 
			 * @param n1 representa el número real
			 * @return el inverso del numero real<br>
			 * 
			 * 
			 * 
			 */
			public static double inverso(double n1) {
				return 1 / n1; // calcula el inverso del número real  n1
			}

			/**
			 * Este método calcula la raíz cuadrada de un número.<br>Casos especiales:
			 * <br>Si el argumento es NaN o menor que 0, el resultado es NaN
			 * <br>Si el argumento es un infinito positivo, el resultado será un infinito positivo
			 * <br>Si el argumento es 0 (positivo o negativo), el resultado es el mismo que el argumento
			 * @param n1 representa el número
			 * @return la raíz cuadrada del número			 			 * 
			 * 
			 */

			public static double raiz(int n1) {
				return Math.sqrt(n1); // calcula la raíz cuadrada positiva del número real  n1
			}

		}
		
	}	
	
	
	

	




	