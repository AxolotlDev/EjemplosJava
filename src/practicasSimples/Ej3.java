//Ingresar una cantidad indefinida de numeros, hasta que se ingrese 0  y sumar los numeros ingresados.
package practicasSimples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		List numeros = new ArrayList();
		Scanner ingreso = new Scanner(System.in);
		int total = 0;
		int numero = 0;
		
		System.out.println("Ingrese numeros a sumar, cuando finalice, ingrese 0");
		do {
			numero = ingreso.nextInt();
			numeros.add(numero);
		} while (numero != 0);
		for(int i = 0; i < numeros.size(); i++)
		{
		    total +=  (int) numeros.get(i);
		}
		System.out.println("La suma total es: "+ total + ".");

	}

}
