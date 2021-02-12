package calculadora_c;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		System.out.println("--Bienvenido a la aplicacion calculadora--\n *Elige una opcion:\n\t-Sumar(pulsa tecla S)\n\t-Multiplicar(pulsa tecla M)");
		System.out.println();
		
		Scanner op = new Scanner(System.in);
		String opcion = op.next();
		
			
			System.out.println("Elige la operacion que vas a realizar:\n-Sumar dos numeros decimales(pulsa 1)\n-Sumar tres numeros decimales(pulsa 2)\n-Sumar dos numeros enteros(pulsa 3)\n-Mostrar la suma acumulada(pulsa 4)");
			
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
								
								double resultado_2d = Suma.sumar(n1, n2);
								System.out.println("El resultado de la operacion es " + resultado_2d);
								
							} 
							catch (Exception e) {
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
								
								double resultado_3d = Suma.sumar(n1, n2, n3);
								System.out.println("El resultado de la operacion es " + resultado_3d);
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
						
							double resultado_2e = Suma.sumar(n1, n2);
							System.out.println("El resultado de la operacion es " + resultado_2e);
							
						} catch (Exception e) {
							System.out.println("Error en el número");
							}
				
						break;
						}
						
						case 4: {
							try {
								System.out.println("Introduce un numero a sumar (n1)");
								double n1 = sc.nextDouble();
								
								double sumaAcumulada = Suma.sumarAcumulado(n1);
								
								System.out.println("El resultado de la operacion es " + sumaAcumulada);
							} catch (Exception e) {
								System.out.println("Error en el número");
								}
						break;
						}
					}
				}
			}

	}

}
