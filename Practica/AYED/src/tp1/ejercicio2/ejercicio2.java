package tp1.ejercicio2;

import java.util.Arrays;
import java.util.Scanner;


public class ejercicio2 {

    public static int[] arregloDeMultiplos(int n){
        int[] a = new int[n];
        for(int i = 0; i < n; i++){ 
            a[i] = (n * (i + 1));
        }
        return a;
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        while(n != 0){
            System.out.println(Arrays.toString(arregloDeMultiplos(n)));
            n = s.nextInt();
        }

        s.close();
    }
}
