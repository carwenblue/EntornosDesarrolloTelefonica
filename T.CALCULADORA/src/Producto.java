

 


/** Esta clase realiza la operacion de multiplicar y la potencia mediante diferentes métodos.
* 
* @author Daniel del Río
* @since 20/01/2021
* @version 1.0
*
*/ 
public class Producto {
	
	/**
    * Este metodo multiplica dos numeros reales.Casos especiales:
    * 
    * Si el primer parametro es Nan y el segundo parametro es numero real resultado es null.
    * Si el primer parametro es numero real y el segundo parametro es Nan  resultado es null.
    * Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.
    * 
    * 
    * @param operando1 representa el primer numero real a multiplicar.
    * @param operando2 representa el segundo numero real a multiplicar.
    * 
    * @return el resultado de la multiplicacion  de ambos números reales.
    */
		

	
	public static double multiplicar(double operando1,double operando2){
		double resultado = operando1 * operando2;
		return resultado;
	}
	
	/**
	    * Este metodo multiplica dos numeros enteros.
	    * 
	    * @param operando1 representa el primer numero entero a multiplicar.
	    * @param operando2 representa el segundo numero entero a multiplicar.
	    * 
	    * @return la multiplicacion  de ambos números enteros.
	    */
	
	
	public static int  multiplicar(int operando1, int operando2) {
		int resultado = operando1*operando2;
		return resultado;
		
	}
	
	/**
	    * Este metodo multiplica tres numeros reales.
	    * 
	    * @param operando1 representa el primer numero real a multiplicar.
	    * @param operando2 representa el segundo numero real a multiplicar.
	    * @param operando3 representa el tercer numero real a multiplicar.
	    * 
	    * @return el resultado de la multiplicacion  de los tres números reales.
	    */
	
	public static double multiplicar(double operando1,double operando2,double operando3){
		double resultado = operando1 * operando2 * operando3;
		return resultado;
	
	}
	
	/**
	    * Este metodo devuelve la potencia del operando1 elevado al operando2.Casos especiales:
	    * 
	    * @param operando1 representa la base entera.
	    * @param operando2 representa la potencia.
	    * 
	    * 
	    * 
	    * @return el resultado de elevar el operando1 al operando2.
	    */
	
	
	public static double pow(double a,
            double b)


/*Devuelve el valor del primer argumento elevado al segundo agumento,Casos especiales:

Si el segundo argumento es cero o negativo, entonces el resultado es 1.0.

Si el segundo argumento es 1.0, entonces el resultado es el mismo que el del primer argumento.

Si el segundo argumento es NaN, entonces el resultado es NaN.

Si el primer argumento es NaN y el segundo argumento es distinto de cero, entonces el resultado es NaN.

Si el valor absoluto del primer argumento es mayor que 1 y el segundo argumento es infinito positivo, o
el valor absoluto del primer argumento es menor que 1 y el segundo argumento es infinito negativo,
entonces el resultado es infinito positivo.

Si el valor absoluto del primer argumento es mayor que 1 y el segundo argumento es infinito negativo, o
el valor absoluto del primer argumento es menor que 1 y el segundo argumento es infinito positivo,
entonces el resultado es cero positivo.

Si el valor absoluto del primer argumento es igual a 1 y el segundo argumento es infinito, entonces el resultado es NaN.

Si el primer argumento es cero y el segundo argumento es mayor que cero, o el primer argumento es infinito positivo 
y el segundo argumento es menor que cero,entonces el resultado es cero positivo.

Si el primer argumento es cero positivo y el segundo argumento es menor que cero, o el primer argumento es infinito positivo
y el segundo argumento es mayor que cero,entonces el resultado es infinito positivo.

Si el primer argumento es cero negativo y el segundo argumento es mayor que cero pero no un entero impar finito, o
el primer argumento es infinito negativo y el segundo argumento es menor que cero pero no un entero impar finito,
entonces el resultado es cero positivo.

Si el primer argumento es cero  y el segundo argumento es un entero impar finito positivo, o
el primer argumento es infinito negativo y el segundo argumento es un entero impar finito negativo,
entonces el resultado es cero negativo.

Si el primer argumento es cero y el segundo argumento es menor que cero pero no un entero impar finito, o
el primer argumento es infinito negativo y el segundo argumento es mayor que cero pero no un entero impar finito,
entonces el resultado es infinito positivo.

Si el primer argumento es cero y el segundo argumento es un entero impar finito negativo, o
el primer argumento es infinito negativo y el segundo argumento es un entero impar finito positivo,
entonces el resultado es infinito negativo.

Si el primer argumento es finito y menor que cero y si el segundo argumento es un número entero finito par, 
el resultado es igual al resultado de elevar el valor absoluto del primer argumento a la potencia del segundo argumento
si el segundo argumento es un número entero finito impar, el resultado es igual al negativo del resultado de elevar el 
valor absoluto del primer argumento a la potencia del segundo argumento si el segundo argumento es finito y no un número entero, entonces el resultado es NaN.

Si ambos argumentos son números enteros, entonces el resultado es exactamente igual al resultado matemático de elevar el primer argumento a la potencia del segundo 
argumento si ese resultado puede de hecho ser representado exactamente como un valor doble.

(En las descripciones anteriores, un valor de punto flotante se considera un número entero si y solo si es finito y un punto fijo del método ceil o, 
de manera equivalente, un punto fijo del método floor. Un valor es un punto fijo de un método de un argumento si y solo si el resultado de aplicar el método al valor es igual al valor.)

El resultado calculado debe estar dentro de 1 ulp del resultado exacto. Los resultados deben ser semi-monótonos.*/



	
	
	
	
	
	
	
	public int potencia(int operando1, int operando2 ) {
		int resultado = (int) Math.pow(operando1, operando2);//se hace un casting para convertir en entero el resultado
		return resultado;
		
	}

}
