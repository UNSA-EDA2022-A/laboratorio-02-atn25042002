package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				n = sc.nextInt();
				a[i] = n;
			}

			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSumaExt(a, suma));
		}
	}

	public boolean esSubconjuntoSumaExt(int a[], int suma) {

		//System.out.print("Evaluando ");
		if(suma == 0){ //Si la suma es cero es porque si hay una combinacion
			return true;
		}
		if( suma< 0){ // Si la suma es negativa ya no vale la pena seguir
			return false;
		}
		if(a.length== 1){//Si lo hay uno este debe ser igual a la suma restante
			return a[0] == suma;
		}

		int[] n= new int[a.length-1];
		for(int i= 1; i< a.length; i++){ //Se crea un arreglo quitando el primer elemento
			//System.out.print(a[i-1] + "  ");
			n[i-1]= a[i];
		}

		//System.out.print(a[a.length-1]+ "   Suma: " + suma + "\n");
		if(a[0] % 7 == 0){ //Si es multiplo de 7 debe tenerse en cuenta
			if(a[1]== 1) //Excepto si el siguiente es 1 en ese caso se debe obviar
				return esSubconjuntoSumaExt(n,suma);
			else
				return esSubconjuntoSumaExt(n,suma - a[0]);
		}
		else{
			return esSubconjuntoSumaExt(n,suma)||esSubconjuntoSumaExt(n,suma-a[0]);
		}
	}
}
