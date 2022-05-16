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
		if(numero< 0)
			return false;
		if(numero== 1 && numero == 0)
			return true;
		else if (numero % 2==0)
			if(numero % 4 ==0)
				return esCuadradoPerfecto(numero/4);
			else
				return false;
		else
			return esCuadradoPerfecto((numero + 1) * (numero - 1) + 1);
	}
}
