package calculadora;

import java.util.Scanner;

/**
 * Miembros del equipo
 * 
 * @author Juan Ramón Varó
 * @author Mari Carmen Correa Heras
 * @author Daniel del Río Pérez
 * @author Verónica Bonis Martín
 * @since 23/01/2021
 * @version 1.1
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Cociente
 * 
 */

public class Main {

	public static void main(String[] args) {
		System.out.println(
				"--Bienvenido a la aplicacion calculadora--\n *Elige una opcion:\n\t-Sumar(pulsa tecla S)\n\t-Multiplicar(pulsa tecla M)");
		System.out.println();

		Scanner op = new Scanner(System.in);
		String opcion = op.next();

		System.out.println(
				"Elige la operacion que vas a realizar:\n-Sumar dos numeros decimales(pulsa 1)\n-Sumar tres numeros decimales(pulsa 2)\n-Sumar dos numeros enteros(pulsa 3)\n-Mostrar la suma acumulada(pulsa 4)");

		Scanner sc = new Scanner(System.in);
		int opm = sc.nextInt();

		switch (opcion) {

		case "s": {
			switch (opm) {

			case 1: {
				try {
					System.out.println("Introduce primer numero a sumar (n1)");
					double n1 = sc.nextDouble();
					System.out.println("Introduce segundo numero a sumar (n2)");
					double n2 = sc.nextDouble();

					if (n1 < 0 || n2 < 0) {
						System.out.println("No se permiten números negativos");
					} else {
						double resultado_2d = Suma.sumar(n1, n2);
						System.out.println("El resultado de la operacion es " + resultado_2d);
					}

				} catch (Exception e) {
					System.out.println("Error en el número");
				}

			}
				break;

			case (2): {

				try {
					System.out.println("Introduce primer numero a sumar (n1)");
					double n1 = sc.nextDouble();
					System.out.println("Introduce segundo numero a sumar (n2)");
					double n2 = sc.nextDouble();
					System.out.println("Introduce tercer numero a sumar (n3)");
					double n3 = sc.nextDouble();

					if (n1 < 0 || n2 < 0) {
						System.out.println("No se permiten números negativos");
					} else {
						double resultado_3d = Suma.sumar(n1, n2, n3);
						System.out.println("El resultado de la operacion es " + resultado_3d);
					}

				} catch (Exception e) {
					System.out.println("Error en el número");

				}

			}

				break;

			case 3: {

				try {
					System.out.println("Introduce primer numero a sumar (n1)");
					double n1 = sc.nextDouble();
					System.out.println("Introduce segundo numero a sumar (n2)");
					double n2 = sc.nextDouble();

					if (n1 < 0) {
						System.out.println("No se permiten números negativos");
					} else {
						double resultado_2e = Suma.sumar(n1, n2);
						System.out.println("El resultado de la operacion es " + resultado_2e);
					}

				} catch (Exception e) {
					System.out.println("Error en el número");
				}

				break;

			}

			case 4: {
				try {
					System.out.println("Introduce un numero a guardar");
					double numAcum = sc.nextDouble();

					if (numAcum < 0) {
						System.out.println("No se permiten números negativos");
					} else {
						double sumaAcumulada = Suma.sumarAcumulado(numAcum);
						System.out.println("El número guardado es: " + sumaAcumulada);
					}

				} catch (Exception e) {
					System.out.println("Error en el número");
				}

				break;

			}
			}
		}

		case "m": {
			switch (opm) {

			case 1: {
				try {
					System.out.println("Introduce primer numero real a multiplicar (n1)");
					double n1 = sc.nextDouble();
					System.out.println("Introduce segundo numero real multiplicar (n2)");
					double n2 = sc.nextDouble();
					double resultado = Producto.producto(n1, n2);
					System.out.println("El resultado de la operacion es " + resultado);
				}

				catch (Exception e) {
					System.out.println("Error en el número");
				}

			}
				break;

			case 2: {
				try {
					System.out.println("Introduce primer numero entero a multiplicar (n1)");
					int n1 = sc.nextInt();
					System.out.println("Introduce segundo numero entero multiplicar (n2)");
					int n2 = sc.nextInt();
					int resultado = Producto.producto(n1, n2);
					System.out.println("El resultado de la operacion es " + resultado);
				}

				catch (Exception e) {
					System.out.println("Error en el número");
				}

			}
				break;

			case 3: {

				try {
					System.out.println("Introduce primer numero entero a multiplicar (n1)");
					double n1 = sc.nextDouble();
					System.out.println("Introduce segundo numero entero a multiplicar (n2)");
					double n2 = sc.nextDouble();
					System.out.println("Introduce tercer numero entero a multiplicar (n3)");
					double n3 = sc.nextDouble();
					double resultado = Producto.producto(n1, n2, n3);
					System.out.println("El resultado de la operacion es " + resultado);

				} catch (Exception e) {
					System.out.println("Error en el número");

				}

			}

				break;

			case 4: {

				try {
					System.out.println("Introduce la base de la potencia (n1)");
					int n1 = sc.nextInt();
					System.out.println("Introduce el exponente de la potencia (n2)");
					int n2 = sc.nextInt();
					int resultado = Producto.potencia(n1, n2);
					System.out.println("El resultado de la operacion es " + resultado);
				}

				catch (Exception e) {
					System.out.println("Error en el número");
				}

				break;

			}

		    }
		}

        }

   }

}
