package calculadora;
/**
 * Esta clase corresponde al bloque 4, referente al cociente del ejercicio 1 de
 * Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Verónica Bonis Martín
 * @since 17/02/2021
 * @version 2.0
 * @see Suma
 * @see resta
 * @see Producto
 */



	public class Cociente {

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
			
		    //casos especiales
			if (n1==0)
				return 0;
			if (n2==0)
				System.out.println("No se permite 0");
			else {
				return (n1/n2);//divide el primer número real entre el segundo real
			}
			
			return (n1 / n2);// divide el primer número real entre el segundo real
		}
		
		

		/**
		 * Este método divide dos números enteros.<br>Casos especiales:
		 * <br>Si n1 es 0, el resultado sería igual a 0. 
		 * <br>Si el resultado no da un número exacto, solo muestra la parte entera al ser división entera.
		 * @param n1 representa el dividendo
		 * @param n2 representa el divisor
		 * @return la división de ambos números
		 */
		public static int cociente(int n1, int n2) {
			//casos especiales
			if (n1==0)
				return 0;
			if (n1%n2!=0)
				System.out.println("Cociente entero sin decimales");
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
			
		    //casos especiales
			
			if (n1==0) 
				System.out.println("No se permite 0");
			else {
			
				return 1 / n1; // calcula el inverso del número real  n1
			}
			return 1/n1; // calcula el inverso del número real  n1
		}

		/**
		 * Este método calcula la raíz cuadrada de un número.<br>Casos especiales:
		 * <br>Si el argumento es 0 (positivo o negativo), el resultado es el mismo que el argumento
		 * @param n1 representa el número
		 * @return la raíz cuadrada del número			 			 * 
		 * 
		 */

		public static double raiz(double n1) {
			
			//casos especiales
			if (n1==0)
				return n1;
			
			return Math.sqrt(n1); // calcula la raíz cuadrada positiva del número real  n1
		}

	}
	