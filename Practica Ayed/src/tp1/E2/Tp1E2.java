package tp1.E2;

import java.util.Scanner;

public class Tp1E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num = s.nextInt();
        int arreglo[] = Multiplos.contar42(num);
        for(int i=0; i<num; i++) {
            System.out.print(arreglo[i] + " | ");
        }
    

	}

}
