package tp1.E2;

import java.util.Scanner;

public class Multiplos {

	
	public static int[] contar42 (int n) {
		
		int[] arreglo = new int[n];
		int num = 0 ;
		
		for(int i= 0; i < n; i++){
			arreglo[i]= n + num;
			num+= n; 
		}

		return arreglo;
		
	}

	
}
