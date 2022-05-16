package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int numero) {
		//System.out.println("Probando " + numero);		
		if (numero<= 0) // Si es negativo o cero no puede ser un cuadrado perfecto
			return false;
		int unidad= numero % 10; // Extrae la unidad
		switch(unidad){ // Reduccion del número por criterios de divisibilidad
			case 2:
			case 3:
			case 7:
			case 8:
				return false;
			case 4:
			case 6: // Si termina en 4 o 6 debe ser par, el cociente entre 4 tambien debe ser un cuadrado perfecto
				if(numero % 4 == 0)
					return esCuadradoPerfecto(numero/4);
				else
					return false;
			case 5: // Si termina en 5 debe ser multiplo de 5, el cociente entre 25 debe ser un cuadrado perfecto
				if(numero % 25 == 0)
					return esCuadradoPerfecto(numero/25);
				else
					return false;
			case 0: // Si termina en 0 debe ser multiplo de 10, el cociente entre 100 debe ser un cuadrado perfecto
				if(numero % 100 == 0)
					return esCuadradoPerfecto(numero/100);
				else
					return false;
			default : // Resto de casos
				return sumImpares(numero, 1);
		}	
	}

	public static boolean sumImpares(int n, int r){
		// System.out.println("cant:" + n);
		if (n - r == 0) // Si la resta es cero indica que el numero es suma de impares consecutivos,
			return true; // por lo tanto es un cuadrado perfecto
		else if(n - r < 0) //Si llega a ser negativo es porque no es suma de impares consecutivos
			return false; // por lo tanto no es un cuadro perfecto
		else
			return sumImpares(n - r, r + 2); // Resta los impares empezando por uno y va de dos en dos

	}
}
