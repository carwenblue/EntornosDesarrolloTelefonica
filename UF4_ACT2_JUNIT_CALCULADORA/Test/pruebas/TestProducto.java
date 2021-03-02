package pruebas;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Producto;
/**
 * Esta clase corresponde a las pruebas unitarias del bloque 3, referente al
 * producto del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Ver�nica Bonis Mart�n.
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

class TestProducto {

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
	 * Este m�todo es una prueba unitaria para la multiplicaci�n de dos n�meros
	 * reales.
	 * 
	 * <br>Probamos que el m�todo funciona correctamente con dos n�meros reales
	 * cualquiera (5.0,2.0).
	 * <br>Probamos que el m�todo funciona correctamente con dos n�meros reales
	 * cualquiera incluyendo un n�mero negativo(5.0,-2.0).
	 * 
	 */

	@Test
	void testProducto1() {
		System.out.println("1_1: Test de producto con dos n�meros reales");
		assertEquals(10.0, Producto.producto(5.0, 2.0), 0);
		System.out.println("1_2: Test de producto con dos n�meros reales -alguno negativo-");
		assertEquals(-10.0, Producto.producto(5.0, -2.0), 0);
	}


	/**
	 * Este m�todo es una prueba unitaria para la multiplicaci�n de dos n�meros
	 * enteros.
	 * 
	 * <br>Probamos que el m�todo funciona correctamente con dos n�meros enteros
	 * cualquiera (5,2).
	 * <br> Probamos que el m�todo funciona correctamente con dos n�meros enteros
	 * cualquiera alguno negativo (5,-2).
	 * 
	 */

	@Test
	void testProducto2() {
		System.out.println("2_1: Test de producto con dos n�meros enteros");
		assertEquals(10, Producto.producto(5, 2));
		System.out.println("2_2: Test de producto con dos n�meros enteros- alguno negativo -");
		assertEquals(-10, Producto.producto(5, -2));
	}


	/**
	 * Este m�todo es una prueba unitaria para la multiplicaci�n de tres n�meros
	 * reales.
	 * 
	 * <br>Probamos que el m�todo funciona correctamente con dos n�meros reales
	 * cualquiera (5.0,2.0,2.0).
	 * <br>Probamos que el m�todo funciona correctamente con dos n�meros reales
	 * cualquiera -alguno negativo- (5.0,-2.0,2.0).
	 */
	@Test
	void testProducto3() {
		System.out.println("3_1: Test de producto con tres n�meros reales");
		assertEquals(20.0, Producto.producto(5.0, 2.0, 2.0), 0);
		System.out.println("3_2: Test de producto con tres n�meros reales -alguno negativo-");
		assertEquals(-20.0, Producto.producto(5.0, -2.0, 2.0), 0);
	}


	/**
	 * 
	 * Este m�todo es una prueba unitaria para el c�lculo de la potencia de dos
	 * n�meros. 
	 * <br>Probamos que el m�todo funciona correctamente con dos n�meros reales cualquiera (5,2).
	 * <br>Probamos que el m�todo funciona correctamente con una base negativa (-5,2).
	 * <br>Probamos que el m�todo funciona correctamente con la potencia de la base igual a cero
	 * <br>Probamos que el m�todo funciona correctamente con una base uno.
	 * 
	 */

	@Test
	void testPotencia4() {
		System.out.println("4_1: Test de c�lculo de la potencia de dos n�meros cualquiera");
		assertEquals(25, Producto.potencia(5, 2), 0);
		System.out.println("4_2: Test de c�lculo de la potencia en el caso en que el exponente sea negativo");
		assertEquals(1, Producto.potencia(5, -2), 0);
		System.out.println("4_3: Test de c�lculo de la potencia en el caso en que la potencia sea cero");
		assertEquals(1, Producto.potencia(5, 0), 0);
		System.out.println("4_4: Test de c�lculo de la potencia en el caso en que la base es uno");
		assertEquals(1, Producto.potencia(1, 2), 0);

	}
	

}
