package tp1.E4;

/*
4. Pasaje de parámetros en Java

a. Sin ejecutar el programa en su computadora, sólo analizándolo, indique qué imprime el
siguiente código.

b. Ejecute el ejercicio en su computadora, y compare su resultado con lo esperado en el
inciso anterior.

c. Inserte un breakpoint en las líneas donde se indica: y = tmp y ejecute en modo debug
¿los valores que adoptan las variables x, y coinciden con los valores impresos por
consola?


Los pasajes de parametros en java son siempre por valor. No se modifican, las variables de tipo Wrappers son inmutables, no se modifican.
 
*/

public class SwapValores {
    

    public static void swap1 (int x, int y) {
        if (x < y) {
            int tmp = x ;
            x = y ;
            y = tmp;
        }
    }
    
    public static void swap2 (Integer x, Integer y) {
        if (x < y) {
            int tmp = x ;
            x = y ;
            y = tmp;
        }
    }
    
    public static void main(String[] args) {
        int a = 1, b = 2;
        Integer c = 3, d = 4;
        swap1(a,b);
        swap2(c,d);
        System.out.println("a=" + a + " b=" + b) ;
        System.out.println("c=" + c + " d=" + d) ;
    }


}