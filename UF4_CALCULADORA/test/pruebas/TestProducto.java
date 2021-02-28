package pruebas;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculadora.Cociente;
import calculadora.Producto;
import calculadora.Suma;
import calculadora.resta;

/**
 * Esta clase corresponde a las pruebas unitarias del bloque 3, referente al
 * producto del ejercicio 1 de Entornos de desarrollo. Trabajo en grupo
 * 
 * @author Verónica Bonis Martín.
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
	 * Este método es una prueba unitaria para la multiplicación de dos números
	 * reales.
	 * 
	 * <br>Probamos que el método funciona correctamente con dos números reales
	 * cualquiera (5.0,2.0).
	 * <br>Probamos que el método funciona correctamente con dos números reales
	 * cualquiera incluyendo un número negativo(5.0,-2.0).
	 * 
	 */

	@Test
	void testProducto1() {
		System.out.println("1_1: Test de producto con dos números reales");
		Assert.assertEquals(10.0, Producto.producto(5.0, 2.0), 0);
		System.out.println("1_2: Test de producto con dos números reales -alguno negativo-");
		Assert.assertEquals(-10.0, Producto.producto(5.0, -2.0), 0);
	}


	/**
	 * Este método es una prueba unitaria para la multiplicación de dos números
	 * enteros.
	 * 
	 * <br>Probamos que el método funciona correctamente con dos números enteros
	 * cualquiera (5,2).
	 * <br> Probamos que el método funciona correctamente con dos números enteros
	 * cualquiera alguno negativo (5,-2).
	 * 
	 */

	@Test
	void testProducto2() {
		System.out.println("2_1: Test de producto con dos números enteros");
		Assert.assertEquals(10, Producto.producto(5, 2));
		System.out.println("2_2: Test de producto con dos números enteros- alguno negativo -");
		Assert.assertEquals(-10, Producto.producto(5, -2));
	}


	/**
	 * Este método es una prueba unitaria para la multiplicación de tres números
	 * reales.
	 * 
	 * <br>Probamos que el método funciona correctamente con dos números reales
	 * cualquiera (5.0,2.0,2.0).
	 * <br>Probamos que el método funciona correctamente con dos números reales
	 * cualquiera -alguno negativo- (5.0,-2.0,2.0).
	 */
	@Test
	void testProducto3() {
		System.out.println("3_1: Test de producto con tres números reales");
		Assert.assertEquals(20.0, Producto.producto(5.0, 2.0, 2.0), 0);
		System.out.println("3_2: Test de producto con tres números reales -alguno negativo-");
		Assert.assertEquals(-20.0, Producto.producto(5.0, -2.0, 2.0), 0);
	}


	/**
	 * 
	 * Este método es una prueba unitaria para el cálculo de la potencia de dos
	 * números. 
	 * <br>Probamos que el método funciona correctamente con dos números reales cualquiera (5,2).
	 * <br>Probamos que el método funciona correctamente con una base negativa (-5,2).
	 * <br>Probamos que el método funciona correctamente con la potencia de la base igual a cero
	 * <br>Probamos que el método funciona correctamente con una base uno.
	 * 
	 */

	@Test
	void testPotencia4() {
		System.out.println("4_1: Test de cálculo de la potencia de dos números cualquiera");
		Assert.assertEquals(25, Producto.potencia(5, 2), 0);
		System.out.println("4_2: Test de cálculo de la potencia en el caso en que el exponente sea negativo");
		Assert.assertEquals(1, Producto.potencia(5, -2), 0);
		System.out.println("4_3: Test de cálculo de la potencia en el caso en que la potencia sea cero");
		Assert.assertEquals(1, Producto.potencia(5, 0), 0);
		System.out.println("4_4: Test de cálculo de la potencia en el caso en que la base es uno");
		Assert.assertEquals(1, Producto.potencia(1, 2), 0);

	}
	
	
	
}
