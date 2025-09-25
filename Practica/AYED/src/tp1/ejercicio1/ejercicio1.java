package tp1.ejercicio1;

public class ejercicio1 {

    public static void entreNumeros(int a, int b){
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }
    }

    public static void entreNumerosWhile(int a, int b){
        while(a <= b){
            System.out.println(a);
            a++;
        }
    }

    public static void entreNumerosRecur(int a, int b){
        if(a <= b){
            System.out.println(a);
            entreNumerosRecur(a + 1, b);
        }
    }

    public static void main(String[] args) {
        entreNumeros(3, 7);
        System.out.println("-----");
        entreNumerosWhile(3, 7);
        System.out.println("-----");
        entreNumerosRecur(3, 7);
    }
   
}
