

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
	 * Este método se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este método se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase producto");
	}
	/**
	 * Este método se ejecuta después de todos los test.
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este método se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase producto");
	}

	/**
	 * Este método se ejecuta antes de cada test.
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Se ejecuta ANTES de cada test");

	}

	/**
	 * Este método se ejecuta después de cada test.
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Se ejecuta DESPUÉS de cada test");

	}

	/**
	 * Este método es una prueba unitaria para el cociente de dos números
	 * reales.
	 * 
	 * <br>Probamos que el método funciona correctamente con dos números reales
	 * cualquiera (10.0,2.0).
	 * <br>Probamos que el método funciona correctamente siendo n1 0(0.0,8.0).
	 * <br>Probamos que el método funciona correctamente siendo n2 0(8.0,0.0).
	 * 
	 */
	@Test
	void testCociente1() {
		System.out.println("1_1: Test de cociente con dos números reales");
		assertEquals(5.0, Cociente.cociente(10.0, 2.0), 0);
		System.out.println("1_2: Test de cociente con n1 0");
		assertEquals(0.0, Cociente.cociente(0.0, 2.0), 0);
		System.out.println("1_2: Test de cociente con n2 0");
		assertEquals("no se permite 0", Cociente.cociente(8.0, 0.0));
	}
	/**
	 * Este método es una prueba unitaria para el cociente de dos números
	 * enteros.
	 * 
	 * <br>Probamos que el método funciona correctamente con dos números enteros
	 * cualquiera (10,2).
	 * <br> Probamos que el método funciona correctamente con n1 igual a 0 (0,2).
	 * <br> Probamos que el método funciona correctamente con n1 igual a 0 (0,2).
	 * <br> Probamos que el método funciona correctamente con resultado no exacto (5,2).
	 */

	@Test
	void testCociente2() {
		System.out.println("2_1: Test de cociente con dos números enteros");
		assertEquals(5, Cociente.cociente(10, 2));
		System.out.println("2_2: Test de cociente con n1 0");
		assertEquals(0, Cociente.cociente(0, 2));
		System.out.println("2_2: Test de cociente con resto distinto de 0 -solo muestra la parte entera-");
		assertEquals(2, Cociente.cociente(5, 2));
	}
	/**
	 * Este método es una prueba unitaria para el cálculo de un inverso de un número
	 * real.
	 * <br>Probamos que el método funciona correctamente con un número real
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