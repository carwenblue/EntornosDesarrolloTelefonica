package calculadora;
/**
 * Esta clase corresponde al bloque 4, referente al cociente del ejercicio 1 de
 * Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Ver�nica Bonis Mart�n
 * @since 17/02/2021
 * @version 2.0
 * @see Suma
 * @see resta
 * @see Producto
 */



	public class Cociente {

		/**
		 * Este m�todo divide dos n�meros reales.<br>Casos especiales:
		 * <br>Si n1 es 0, el resultado ser� igual a 0.
		 * <br>Si n2 es 0, el resultado no se puede mostrar porque tiende a infinito.
		 * @param n1 representa el dividendo
		 * @param n2 representa el divisor
		 * @return la divisi�n de ambos n�meros, puede ser decimal
		 * 
		 */
		public static double cociente(double n1, double n2) {
			
		    //casos especiales
			if (n1==0)
				return 0;
			if (n2==0)
				System.out.println("No se permite 0");
			else {
				return (n1/n2);//divide el primer n�mero real entre el segundo real
			}
			
			return (n1 / n2);// divide el primer n�mero real entre el segundo real
		}
		
		

		/**
		 * Este m�todo divide dos n�meros enteros.<br>Casos especiales:
		 * <br>Si n1 es 0, el resultado ser�a igual a 0. 
		 * <br>Si el resultado no da un n�mero exacto, solo muestra la parte entera al ser divisi�n entera.
		 * @param n1 representa el dividendo
		 * @param n2 representa el divisor
		 * @return la divisi�n de ambos n�meros
		 */
		public static int cociente(int n1, int n2) {
			//casos especiales
			if (n1==0)
				return 0;
			if (n1%n2!=0)
				System.out.println("Cociente entero sin decimales");
			return n1 / n2;// divide el primer n�mero entero entre el entero 
		}

		/**
		 * Este m�todo calcula el inverso de un n�mero real.<br>Casos especiales:
		 * <br>Si n1 es 0, el resultado no se puede mostrar porque tiende a infinito
		 * 
		 * @param n1 representa el n�mero real
		 * @return el inverso del numero real<br>
		 * 
		 * 
		 * 
		 */
		public static double inverso(double n1) {
			
		    //casos especiales
			
			if (n1==0) 
				System.out.println("No se permite 0");
			else {
			
				return 1 / n1; // calcula el inverso del n�mero real  n1
			}
			return 1/n1; // calcula el inverso del n�mero real  n1
		}

		/**
		 * Este m�todo calcula la ra�z cuadrada de un n�mero.<br>Casos especiales:
		 * <br>Si el argumento es 0 (positivo o negativo), el resultado es el mismo que el argumento
		 * @param n1 representa el n�mero
		 * @return la ra�z cuadrada del n�mero			 			 * 
		 * 
		 */

		public static double raiz(double n1) {
			
			//casos especiales
			if (n1==0)
				return n1;
			
			return Math.sqrt(n1); // calcula la ra�z cuadrada positiva del n�mero real  n1
		}

	}
	