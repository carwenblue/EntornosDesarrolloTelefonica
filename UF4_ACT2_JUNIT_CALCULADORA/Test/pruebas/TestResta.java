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
 * @author Juan Ramón Varó Núñez.
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
	 * Este método se ejecuta antes de todos los test.
	 */

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Este método se ejecuta UNA sola vez, al PRINCIPIO de todos los test de nuestra clase resta");
	}
	
	/**
	 * Este método se ejecuta después de todos los test.
	 */
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Este método se ejecuta UNA sola vez, al FINAL de todos los test de nuestra clase resta");
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
	 * Este método resta dos numeros reales.
	 * <br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 es el primer número real que se va a restar
	 * @param n2 es el segundo número real que se va a restar
	 * @return la resta de los números reales n1 y n2
	 */
	
	@Test
	void testResta1() {
		System.out.println("1_1: Test de sumar dos números reales");
		assertEquals(5.0, Resta.restar(12.0, 7.0), 0);
	}
	
	/**
	 * Este método resta dos numeros enteros.
	 * <br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero número entero a restar
	 * @param n2 representa el segundo número entero a restar
	 * @return la resta de ambos numeros, puede ser <u>negativo</u> si n1 mayor n2
	 */
	
	@Test
	void testResta2() {
		System.out.println("2_1: Test de sumar dos números enteros");
		assertEquals(15, Resta.Resta(25, 10), 0);
	}
	
	/**
	 * Este método resta tres numeros Reales.
	 * <br>Casos especiales:
	 * <br>Si n1 o n2 es un número negativo devuelve que no se permiten negativos.
	 * @param n1 represente el primero número a restar
	 * @param n2 representa el segundo número a restar
	 * @param n3 representa el tercer número a restar
	 * @return la resta de los tres números reales
	 */
	
	@Test
	void testResta3() {
		System.out.println("3_1: Test de sumar tres números reales");
		assertEquals(4, Resta.restar(8, 4), 0);
	}
	
	/**
	 * Este método acumula un resultado.
	 * <br>Casos especiales:
	 * <br>Si n1 es un número negativo devuelve que no se permiten negativos.
	 * @return la resta acumulada.
	 */
	
	@Test
	void testResta4() {
	System.out.println("4_1: Este método acumula un resultado total");
	assertEquals(3, Suma.sumar(3, 0), 0);
	}
	
}
