package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Suma;

/**
 * Esta clase corresponde a las pruebas unitarias del bloque 1, referente a la suma 
 * del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Juan Ram�n Var� N��ez.
 * @since 28/02/2021
 * @version 1.0
 * @see Suma
 * @see Resta
 * @see Cociente
 * @see Producto
 * @see TestSuma
 * @see TestResta
 * @see TestCociente
 */

class TestSuma {

	/**
	 * Este m�todo se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este m�todo se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase suma");
	}
	
	/**
	 * Este m�todo se ejecuta despu�s de todos los test.
	 */
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este m�todo se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase suma");
	}

	/**
	 * Este m�todo se ejecuta antes de cada test.
	 */
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Se ejecuta ANTES de cada test");

	}

	/**
	 * Este m�todo se ejecuta despu�s de cada test.
	 */
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Se ejecuta DESPU�S de cada test");

	}
	
	/**
	 * Este m�todo suma dos numeros reales.
	 * <br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 es el primer n�mero real que se va a sumar
	 * @param n2 es el segundo n�mero real que se va a sumar
	 * @return la suma de los n�meros reales n1 y n2
	 */
	
	@Test
	void testSuma1() {
		System.out.println("1_1: Test de sumar dos n�meros reales");
		assertEquals(12.0, Suma.sumar(5.0, 7.0), 0);
	}
	
	/**
	 * Este m�todo suma dos numeros enteros.
	 * <br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero n�mero entero a sumar
	 * @param n2 representa el segundo n�mero entero a sumar
	 * @return la suma de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */
	
	@Test
	void testSuma2() {
		System.out.println("2_1: Test de sumar dos n�meros enteros");
		assertEquals(8, Suma.sumar(4, 4), 0);
	}
	
	/**
	 * Este m�todo suma tres numeros Reales.<br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero n�mero a sumar
	 * @param n2 representa el segundo n�mero a sumar
	 * @param n3 representa el tercer n�mero a sumar
	 * @return la suma de los tres n�meros reales
	 */
	
	@Test
	void testSuma3() {
		System.out.println("3_1: Test de sumar tres n�meros reales");
		assertEquals(8, Suma.sumar(4, 4), 0);
	}
	
	/**
	 * Este m�todo acumula un resultado.
	 * <br>Casos especiales:
	 * <br>Si n1 es un n�mero negativo devuelve que no se permiten negativos.
	 * @return la suma acumulada.
	 */
	
	@Test
	void testSuma4() {
	System.out.println("4_1: Este m�todo acumula un resultado");
	assertEquals(13, Suma.sumar(13, 0), 0);
	}
	
}
