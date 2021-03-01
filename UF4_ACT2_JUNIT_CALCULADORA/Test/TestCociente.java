

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Cociente;


/**
 * Esta clase corresponde a las pruebas unitarias del bloque 4, referente al
 * cociente del ejercicio 2 de Entornos de desarrollo. Trabajo en grupo.
 * 
 * @author Carmen Correa Heras
 * @since 01/03/2021
 * @version 1.0
 * @see Suma
 * @see resta
 * @see Cociente
 * @see Producto
 * @see TestSuma
 * @see TestResta
 * @see TestProducto
 */
class TestCociente {
	/**
	 * Este m�todo se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este m�todo se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase producto");
	}
	/**
	 * Este m�todo se ejecuta despu�s de todos los test.
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este m�todo se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase producto");
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
	 * Este m�todo es una prueba unitaria para el cociente de dos n�meros
	 * reales.
	 * 
	 * <br>Probamos que el m�todo funciona correctamente con dos n�meros reales
	 * cualquiera (10.0,2.0).
	 * <br>Probamos que el m�todo funciona correctamente siendo n1 0(0.0,8.0).
	 * <br>Probamos que el m�todo funciona correctamente siendo n2 0(8.0,0.0).
	 * 
	 */
	@Test
	void testCociente1() {
		System.out.println("1_1: Test de cociente con dos n�meros reales");
		assertEquals(5.0, Cociente.cociente(10.0, 2.0), 0);
		System.out.println("1_2: Test de cociente con n1 0");
		assertEquals(0.0, Cociente.cociente(0.0, 2.0), 0);
		System.out.println("1_2: Test de cociente con n2 0");
		assertEquals("no se permite 0", Cociente.cociente(8.0, 0.0));
	}
	/**
	 * Este m�todo es una prueba unitaria para el cociente de dos n�meros
	 * enteros.
	 * 
	 * <br>Probamos que el m�todo funciona correctamente con dos n�meros enteros
	 * cualquiera (10,2).
	 * <br> Probamos que el m�todo funciona correctamente con n1 igual a 0 (0,2).
	 * <br> Probamos que el m�todo funciona correctamente con n1 igual a 0 (0,2).
	 * <br> Probamos que el m�todo funciona correctamente con resultado no exacto (5,2).
	 */

	@Test
	void testCociente2() {
		System.out.println("2_1: Test de cociente con dos n�meros enteros");
		assertEquals(5, Cociente.cociente(10, 2));
		System.out.println("2_2: Test de cociente con n1 0");
		assertEquals(0, Cociente.cociente(0, 2));
		System.out.println("2_2: Test de cociente con resto distinto de 0 -solo muestra la parte entera-");
		assertEquals(2, Cociente.cociente(5, 2));
	}
	/**
	 * Este m�todo es una prueba unitaria para el c�lculo de un inverso de un n�mero
	 * real.
	 * <br>Probamos que el m�todo funciona correctamente con un n�mero real
	 * cualquiera distinto de 0 (10).
	 * <br>Si n1 es 0, el resultado no se puede mostrar porque tiende a infinito.
	 */
	@Test
	void testCociente3() {
		System.out.println("3_1: Test de inverso");
		assertEquals(-5.0, Cociente.inverso(5.0));
		System.out.println("3_2: Test de inverso siendo n1 igual a 0");
		assertEquals("No se permite 0", 0.0);
	}


}