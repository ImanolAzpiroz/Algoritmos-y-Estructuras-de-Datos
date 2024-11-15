package tp2.E1;

import java.util.ArrayList;
import tp2.E3.ContadorArbol;

public class tp2E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Armar Arbol
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40); 
		BinaryTree<Integer> hijoIzq = new BinaryTree<>(25);
		
		
		hijoIzq.addLeftChild(new BinaryTree<Integer>(10));
		hijoIzq.addRightChild(new BinaryTree<Integer>(32));
		
		ab.addLeftChild(hijoIzq);
		
		BinaryTree<Integer> hijoDer = new BinaryTree<>(78); 
		hijoDer.addLeftChild(new BinaryTree<>(54));
		hijoDer.addRightChild(new BinaryTree<>(30));
		ab.addRightChild(hijoDer);
		
		
		//BinaryTree<Integer> abEsp = ab.espejo();
		

		//ab.imprimirInorden();


		//ab.porNiveles();

		System.out.println(ab.CantNodosPorNivel());
		

	}

}
