package calculadora;

import java.util.Scanner;

/**
 * Miembros del equipo
 * 
 * @author M.Carmen Correa Heras
 * @author Juan Ramón Varó
 * @author Daniel del Rio Perez
 * @author Verónica Bonis Martín
 * @since 17/02/2021
 * @version 2.2
 * @see Suma
 * @see Resta
 * @see Producto
 * @see Cociente
 * 
 */

public class Main {

	public static void main(String[] args) {

		System.out.println(
				"--Bienvenido a la aplicacion calculadora--\n *Elige una opcion:\n\t-Sumar (pulsa tecla S)\n\t-Restar (pulsa tecla R)\n\t-Multiplicar (pulsa tecla M)\n\t-Dividir (pulsa tecla D)");
		System.out.println();

		Scanner op = new Scanner(System.in);
		String opcion = op.next();

		switch (opcion) {

		case "s": {
			System.out.println(
					"Elige la operacion que vas a realizar:\n-Sumar dos numeros decimales(pulsa 1)\n-Sumar tres numeros decimales(pulsa 2)\n-Sumar dos numeros enteros(pulsa 3)\n-Mostrar la suma acumulada(pulsa 4)");

			Scanner sc = new Scanner(System.in);
			int opm = sc.nextInt();
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

			case 2: {

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

		case "r": {

			System.out.println(
					"Elige operacion a realizar:\n-Restar dos numeros decimales(pulsa 1)\n-Resta dos numeros enteros(pulsa 2)\n-Resta tres numeros decimales(pulsa 3)\n-Mostrar el acumulado de las restas(pulsa 4)");
			Scanner sc = new Scanner(System.in);

			int opm = sc.nextInt();

			switch (opm) {

			case 1: {
				try {
					System.out.println("Introduce el primer numero a restar (n1)");
					double n1 = sc.nextDouble();
					System.out.println("Introduce el segundo numero a restar (n2)");
					double n2 = sc.nextDouble();

					if (n1 < 0 || n2 < 0) {
						System.out.println("No se permiten números negativos");
					} else {
						double resRestaReal2digit = Suma.sumar(n1, n2);
						System.out.println("El resultado de la resta es " + resRestaReal2digit);
					}

				} catch (Exception e) {
					System.out.println("Error en el número");
				}

			}
				break;

			case 2: {

				try {
					System.out.println("Introduce primer numero entero a restar (n1)");
					int n1 = sc.nextInt();
					System.out.println("Introduce segundo numero entero a restar (n2)");
					int n2 = sc.nextInt();

					if (n1 < 0) {
						System.out.println("No se permiten números negativos");
					} else {
						double resRestaEntera = resta.restar(n1, n2);
						System.out.println("El resultado de la resta es " + resRestaEntera);
					}

				} catch (Exception e) {
					System.out.println("Error en el número");
				}

				break;

			}

			case 3: {

				try {
					System.out.println("Introduce primer numero a restar (n1)");
					double n1 = sc.nextDouble();
					System.out.println("Introduce segundo numero a restar (n2)");
					double n2 = sc.nextDouble();
					System.out.println("Introduce tercer numero a restar (n3)");
					double n3 = sc.nextDouble();

					if (n1 < 0 || n2 < 0) {
						System.out.println("No se permiten números negativos");
					} else {
						double resRestaReal3digit = resta.restar(n1, n2, n3);
						System.out.println("El resultado de la resta es " + resRestaReal3digit);
					}

				} catch (Exception e) {
					System.out.println("Error en el número");

				}

			}

				break;

			case 4: {
				try {
					System.out.println("Introduce un numero a guardar");
					double acumulado = sc.nextDouble();

					if (acumulado < 0) {
						System.out.println("No se permiten números negativos");
					} else {
						double restaAcumulada = resta.restarAcumulado(acumulado);
						System.out.println("El número guardado es: " + restaAcumulada);
					}

				} catch (Exception e) {
					System.out.println("Error en el número");
				}

				break;

			}
			}
		}

		case "m": {
			System.out.println(
					"Elige la operacion que vas a realizar:\n-Multiplicar dos numeros decimales(pulsa 1)\n-Multiplicar tres numeros decimales(pulsa 2)\n-Multiplicar dos numeros enteros(pulsa 3)\n-Mostrar la potencia de un número(pulsa 4)");

			Scanner sc_m = new Scanner(System.in);
			int opm = sc_m.nextInt();
			switch (opm) {

			case 1: {
				try {
					System.out.println("Introduce primer numero real a multiplicar (n1)");
					double n1 = sc_m.nextDouble();
					System.out.println("Introduce segundo numero real multiplicar (n2)");
					double n2 = sc_m.nextDouble();
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
					int n1 = sc_m.nextInt();
					System.out.println("Introduce segundo numero entero multiplicar (n2)");
					int n2 = sc_m.nextInt();
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
					System.out.println("Introduce primer numero real a multiplicar (n1)");
					double n1 = sc_m.nextDouble();
					System.out.println("Introduce segundo numero real a multiplicar (n2)");
					double n2 = sc_m.nextDouble();
					System.out.println("Introduce tercer numero real a multiplicar (n3)");
					double n3 = sc_m.nextDouble();
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
					int n1 = sc_m.nextInt();
					System.out.println("Introduce el exponente de la potencia (n2)");
					int n2 = sc_m.nextInt();
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

		case "d": {
			System.out.println(
					"Elige la operación que vas a realizar:\n-Dividir dos numeros reales(pulsa 1)\n-Dividir dos números enteros(pulsa 2)\n-Calcula el inverso de un número real(pulsa 3)\n-Calcula la raíz cuadrada de un número(pulsa 4)");

			Scanner sc_d = new Scanner(System.in);
			int opm = sc_d.nextInt();
			switch (opm) {

			case 1: {
				try {
					System.out.println("Introduce el dividendo - número real - (n1)");
					double n1 = sc_d.nextDouble();
					System.out.println("Introduce el divisor - número real-  (n2)");
					double n2 = sc_d.nextDouble();
					double resultado = Cociente.cociente(n1, n2);
					System.out.println("El resultado de la operacion es " + resultado);
				}

				catch (Exception e) {
					System.out.println("Error en el número");
				}

			}
				break;

			case 2: {
				try {
					System.out.println("Introduce el dividendo - número entero - (n1)");
					int n1 = sc_d.nextInt();
					System.out.println("Introduce el divisor- número entero - (n2)");
					int n2 = sc_d.nextInt();
					int resultado = Cociente.cociente(n1, n2);
					System.out.println("El resultado de la operacion es " + resultado);
				}

				catch (Exception e) {
					System.out.println("Error en el número");
				}

			}
				break;

			case 3: {

				try {
					System.out.println("Introduce el número real (n1)");
					double n1 = sc_d.nextDouble();
					double resultado = Cociente.inverso(n1);
					System.out.println("El resultado de la operacion es " + resultado);

				} catch (Exception e) {
					System.out.println("Error en el número");

				}

			}

				break;

			case 4: {

				try {
					System.out.println("Introduce el número real (n1)");
					double n1 = sc_d.nextDouble();
					double resultado = Cociente.raiz(n1);
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

/*
 * package calculadora;
 * 
 * import java.util.Scanner;
 * 
 * /** Miembros del equipo
 * 
 * @author Juan Ramón Varó
 * 
 * @author Mari Carmen Correa Heras
 * 
 * @author Daniel del Río Pérez
 * 
 * @author Verónica Bonis Martín
 * 
 * @since 23/01/2021
 * 
 * @version 1.1
 * 
 * @see Suma
 * 
 * @see Resta
 * 
 * @see Producto
 * 
 * @see Cociente
 * 
 */
/*
 * public class Main {
 * 
 * public static void main(String[] args) { System.out.println(
 * "--Bienvenido a la aplicacion calculadora--\n *Elige una opcion:\n\t-Sumar(pulsa tecla S)\n\t-Restar(pulsa tecla R)\n\t-Multiplicar(pulsa tecla M)"
 * ); System.out.println();
 * 
 * Scanner op = new Scanner(System.in); String opcion = op.next();
 * 
 * System.out.
 * println("Elige la operacion que vas a realizar:\n-Sumar dos numeros decimales(pulsa 1)\n-Sumar tres numeros decimales(pulsa 2)\n-Sumar dos numeros enteros(pulsa 3)\n-Mostrar la suma acumulada(pulsa 4)"
 * ); Scanner sc = new Scanner(System.in); int opm = sc.nextInt();
 * 
 * switch (opcion) {
 * 
 * case "s": { switch (opm) {
 * 
 * case 1: { try { System.out.println("Introduce primer numero a sumar (n1)");
 * double n1 = sc.nextDouble();
 * System.out.println("Introduce segundo numero a sumar (n2)"); double n2 =
 * sc.nextDouble();
 * 
 * if (n1 < 0 || n2 < 0) {
 * System.out.println("No se permiten números negativos"); } else { double
 * resultado_2d = Suma.sumar(n1, n2);
 * System.out.println("El resultado de la operacion es " + resultado_2d); }
 * 
 * } catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * } break;
 * 
 * case (2): {
 * 
 * try { System.out.println("Introduce primer numero a sumar (n1)"); double n1 =
 * sc.nextDouble(); System.out.println("Introduce segundo numero a sumar (n2)");
 * double n2 = sc.nextDouble();
 * System.out.println("Introduce tercer numero a sumar (n3)"); double n3 =
 * sc.nextDouble();
 * 
 * if (n1 < 0 || n2 < 0) {
 * System.out.println("No se permiten números negativos"); } else { double
 * resultado_3d = Suma.sumar(n1, n2, n3);
 * System.out.println("El resultado de la operacion es " + resultado_3d); }
 * 
 * } catch (Exception e) { System.out.println("Error en el número");
 * 
 * }
 * 
 * }
 * 
 * break;
 * 
 * case 3: {
 * 
 * try { System.out.println("Introduce primer numero a sumar (n1)"); double n1 =
 * sc.nextDouble(); System.out.println("Introduce segundo numero a sumar (n2)");
 * double n2 = sc.nextDouble();
 * 
 * if (n1 < 0) { System.out.println("No se permiten números negativos"); } else
 * { double resultado_2e = Suma.sumar(n1, n2);
 * System.out.println("El resultado de la operacion es " + resultado_2e); }
 * 
 * } catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * break;
 * 
 * }
 * 
 * case 4: { try { System.out.println("Introduce un numero a guardar"); double
 * numAcum = sc.nextDouble();
 * 
 * if (numAcum < 0) { System.out.println("No se permiten números negativos"); }
 * else { double sumaAcumulada = Suma.sumarAcumulado(numAcum);
 * System.out.println("El número guardado es: " + sumaAcumulada); }
 * 
 * } catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * break;
 * 
 * } } }
 * 
 */
/*
 * System.out.
 * println("Elige operacion a realizar:\n-Restar dos numeros decimales(pulsa 1)\n-Resta doss numeros enteros(pulsa 2)\n-Resta tres numeros decimales(pulsa 3)\n-Mostrar el acumulado de las restas(pulsa 4)"
 * ); Scanner sc = new Scanner(System.in);
 * 
 * int opm = sc.nextInt();
 * 
 * case "r": { switch (opm) {
 * 
 * case 1: { try {
 * System.out.println("Introduce el primer numero a restar (n1)"); double n1 =
 * sc.nextDouble();
 * System.out.println("Introduce el segundo numero a restar (n2)"); double n2 =
 * sc.nextDouble();
 * 
 * if (n1 < 0 || n2 < 0) {
 * System.out.println("No se permiten números negativos"); } else { double
 * resRestaReal2digit = Suma.sumar(n1, n2);
 * System.out.println("El resultado de la resta es " + resRestaReal2digit); }
 * 
 * } catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * } break;
 * 
 * case 2: {
 * 
 * try { System.out.println("Introduce primer numero entero a restar (n1)"); int
 * n1 = sc.nextInt();
 * System.out.println("Introduce segundo numero entero a restar (n2)"); int n2 =
 * sc.nextInt();
 * 
 * if (n1 < 0) { System.out.println("No se permiten números negativos"); } else
 * { double resRestaEntera = resta.restar(n1, n2);
 * System.out.println("El resultado de la resta es " + resRestaEntera); }
 * 
 * } catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * break;
 * 
 * }
 * 
 * case 3: {
 * 
 * try { System.out.println("Introduce primer numero a restar (n1)"); double n1
 * = sc.nextDouble();
 * System.out.println("Introduce segundo numero a restar (n2)"); double n2 =
 * sc.nextDouble(); System.out.println("Introduce tercer numero a restar (n3)");
 * double n3 = sc.nextDouble();
 * 
 * if (n1 < 0 || n2 < 0) {
 * System.out.println("No se permiten números negativos"); } else { double
 * resRestaReal3digit = resta.restar(n1, n2, n3);
 * System.out.println("El resultado de la resta es " + resRestaReal3digit); }
 * 
 * } catch (Exception e) { System.out.println("Error en el número");
 * 
 * }
 * 
 * }
 * 
 * break;
 * 
 * case 4: { try { System.out.println("Introduce un numero a guardar"); double
 * acumulado = sc.nextDouble();
 * 
 * if (acumulado < 0) { System.out.println("No se permiten números negativos");
 * } else { double restaAcumulada = resta.restarAcumulado(acumulado);
 * System.out.println("El número guardado es: " + restaAcumulada); }
 * 
 * } catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * break;
 * 
 * } } }
 * 
 * /* case "m": { switch (opm) {
 * 
 * case 1: { try {
 * System.out.println("Introduce primer numero real a multiplicar (n1)"); double
 * n1 = sc.nextDouble();
 * System.out.println("Introduce segundo numero real multiplicar (n2)"); double
 * n2 = sc.nextDouble(); double resultado = Producto.producto(n1, n2);
 * System.out.println("El resultado de la operacion es " + resultado); }
 * 
 * catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * } break;
 * 
 * case 2: { try {
 * System.out.println("Introduce primer numero entero a multiplicar (n1)"); int
 * n1 = sc.nextInt();
 * System.out.println("Introduce segundo numero entero multiplicar (n2)"); int
 * n2 = sc.nextInt(); int resultado = Producto.producto(n1, n2);
 * System.out.println("El resultado de la operacion es " + resultado); }
 * 
 * catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * } break;
 * 
 * case 3: {
 * 
 * try {
 * System.out.println("Introduce primer numero entero a multiplicar (n1)");
 * double n1 = sc.nextDouble();
 * System.out.println("Introduce segundo numero entero a multiplicar (n2)");
 * double n2 = sc.nextDouble();
 * System.out.println("Introduce tercer numero entero a multiplicar (n3)");
 * double n3 = sc.nextDouble(); double resultado = Producto.producto(n1, n2,
 * n3); System.out.println("El resultado de la operacion es " + resultado);
 * 
 * } catch (Exception e) { System.out.println("Error en el número");
 * 
 * }
 * 
 * }
 * 
 * break;
 * 
 * case 4: {
 * 
 * try { System.out.println("Introduce la base de la potencia (n1)"); int n1 =
 * sc.nextInt();
 * System.out.println("Introduce el exponente de la potencia (n2)"); int n2 =
 * sc.nextInt(); int resultado = Producto.potencia(n1, n2);
 * System.out.println("El resultado de la operacion es " + resultado); }
 * 
 * catch (Exception e) { System.out.println("Error en el número"); }
 * 
 * break;
 * 
 * }
 * 
 * } }
 */
