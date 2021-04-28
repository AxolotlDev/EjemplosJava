// Pedir dos numeros enteros y luego mostrar la suma de ambos.


package practicasSimples;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner ingreso = new Scanner (System.in);
		int numero1 = 0;
		int numero2 = 0;
		
		System.out.println("Ingrese los 2 numeros a sumar");
		
		numero1 = ingreso.nextInt();
		numero2 = ingreso.nextInt();
		
		System.out.println(numero1 + numero2);
	}

}
