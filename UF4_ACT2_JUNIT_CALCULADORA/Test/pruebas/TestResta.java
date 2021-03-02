package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Resta;
import calculadora.Suma;

/**
 * Esta clase corresponde a las pruebas unitarias del bloque 2, referente a la resta 
 * del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Juan Ram�n Var� N��ez.
 * @since 28/02/2021
 * @version 1.0
 * @see Suma
 * @see resta
 * @see Cociente
 * @see Producto
 * @see TestSuma
 * @see TestResta
 * @see TestCociente
 */

class TestResta {

	/**
	 * Este m�todo se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este m�todo se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase resta");
	}
	
	/**
	 * Este m�todo se ejecuta despu�s de todos los test.
	 */
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este m�todo se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase resta");
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
	 * Este m�todo resta dos numeros reales.
	 * <br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 es el primer n�mero real que se va a restar
	 * @param n2 es el segundo n�mero real que se va a restar
	 * @return la resta de los n�meros reales n1 y n2
	 */
	
	@Test
	void testResta1() {
		System.out.println("1_1: Test de sumar dos n�meros reales");
		assertEquals(5.0, Resta.restar(12.0, 7.0), 0);
	}
	
	/**
	 * Este m�todo resta dos numeros enteros.
	 * <br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero n�mero entero a restar
	 * @param n2 representa el segundo n�mero entero a restar
	 * @return la resta de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */
	
	@Test
	void testResta2() {
		System.out.println("2_1: Test de sumar dos n�meros enteros");
		assertEquals(15, Resta.Resta(25, 10), 0);
	}
	
	/**
	 * Este m�todo resta tres numeros Reales.
	 * <br>Casos especiales:
	 * <br>Si n1 o n2 es un n�mero negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero n�mero a restar
	 * @param n2 representa el segundo n�mero a restar
	 * @param n3 representa el tercer n�mero a restar
	 * @return la resta de los tres n�meros reales
	 */
	
	@Test
	void testResta3() {
		System.out.println("3_1: Test de sumar tres n�meros reales");
		assertEquals(4, Resta.restar(8, 4), 0);
	}
	
	/**
	 * Este m�todo acumula un resultado.
	 * <br>Casos especiales:
	 * <br>Si n1 es un n�mero negativo devuelve que no se permiten negativos.
	 * @return la resta acumulada.
	 */
	
	@Test
	void testResta4() {
	System.out.println("4_1: Este m�todo acumula un resultado total");
	assertEquals(3, Suma.sumar(3, 0), 0);
	}
	
}
