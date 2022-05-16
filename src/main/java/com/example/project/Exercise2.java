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

		if(suma == 0){
			return true;
		}
		if( suma< 0){
			return false;
		}
		if(a.length== 1){
			return a[0] == suma;
		}

		int[] n= new int[a.length-1];
		for(int i= 1; i< a.length; i++){
			//System.out.print(a[i-1] + "  ");
			n[i-1]= a[i];
		}

		//System.out.print(a[a.length-1]+ "   Suma: " + suma + "\n");
		if(a[0] % 7 == 0 && a[1]== 1){
			return esSubconjuntoSumaExt(n,suma);
		}
		else{
			return esSubconjuntoSumaExt(n,suma)||esSubconjuntoSumaExt(n,suma-a[0]);
		}
	}
}
