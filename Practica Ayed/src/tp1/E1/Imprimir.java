package tp1.E1;

public class Imprimir {

	
	public static void For(int a, int b) {
			for(int i = a; i <= b; i++) {
				System.out.println(i);

			}
	}
	
	public static void While(int a, int b) {
		while(a <= b) {
			System.out.println(a);
			a++;
		}
	}

	public static void Recurs(int a, int b) {
		if(a <= b) {
			System.out.println(a);
			Recurs(++a,b);
		}
	}
}





