import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println(
				"--Bienvenido a la aplicacion calculadora--\n *Elige una opcion:\n\t-Sumar(pulsa tecla S)\n\t-Multiplicar.(pulsa tecla M)");
		System.out.println();
		Scanner op = new Scanner(System.in);
		String opcion = op.next();
		switch (opcion) {

		case "m": {

			Scanner sc = new Scanner(System.in);

			System.out.println("Elige la operacion que vas a realizar:\n-Multiplicar 2 numeros decimales(pulsa 1)");
			int opm = sc.nextInt();
			switch (opm) {
			case 1: {

				System.out.println("Introduce primer numero que quieres multiplicar (n1)");
				double n1 = sc.nextDouble();
				System.out.println("Introduce segundo numero que quieres multiplicar (n2)");
				double n2 = sc.nextDouble();

				double resultado = Calculadora.Producto.producto(n1, n2);
				System.out.println("El resultado de la operacion es " +resultado);
				break;

			}
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
			
			
			break;
		}
		
		
		
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}

	}

}
