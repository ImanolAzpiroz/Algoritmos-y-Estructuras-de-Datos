package tp3.E2;


import java.util.*;
import tp3.E1.GeneralTree;
import tp1.E8.Queue;


public class RecorridosAG {
	
	private GeneralTree<Integer> a;
	
	public  RecorridosAG() {
		
	}
	
	public RecorridosAG(GeneralTree<Integer> a) {
		this.a = a;
	}
	

	
	public List<Integer> numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a,Integer n){
		List<Integer> l = new LinkedList<Integer>();
		if(!a.isEmpty()){
			numerosImparesMayoresQuePreOrden(a, n, l);
			return l;
		}
		else	
			return l;   // Si el arbol esta vacio retorna la lista vacia
	}
	
	private void numerosImparesMayoresQuePreOrden(GeneralTree<Integer> a, Integer n, List<Integer> l ){


		if (a.getData() % 2 != 0 && a.getData() > n){
			l.add(a.getData());
		}
		List<GeneralTree<Integer>> children = a.getChildren();
		for (GeneralTree<Integer> child:  children){
			numerosImparesMayoresQuePreOrden(child, n, l);
		}
	}

    
	// INORDEN (FALTA TERMINAR)
	public List<Integer> numerosImparesMayoresQueInOrden(GeneralTree<Integer> a, Integer n){
		List<Integer> l = new LinkedList<Integer>();
		if(!a.isEmpty()){
			numerosImparesMayoresQueInOrden(a, n, l);
			
		}
		return l;
	}


	public void numerosImparesMayoresQueInOrden(GeneralTree<Integer> a, Integer n, List<Integer> l){
		
		List<GeneralTree<Integer>> children = a.getChildren();
		
		if ((a.getData() % 2 != 0) && (a.getData() > n)){
			l.add(a.getData());
		}
	}

	// POST ORDEN
	public List<Integer> numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a, Integer n){
		List<Integer> l = new LinkedList<>();

		if(!a.isEmpty()){
			numerosImparesMayoresQuePostOrden(a, n, l);
		}
		return l;

	}

	private void numerosImparesMayoresQuePostOrden(GeneralTree<Integer> a,Integer n, List<Integer> l){

		// Recorremos los hijos 
		for (GeneralTree<Integer> child : a.getChildren()){
			numerosImparesMayoresQuePostOrden(child, n, l);
		}

		//Luego procesamos el nodo
		if ((a.getData() % 2 != 0) && (a.getData() > n)){
			l.add(a.getData());
		}
	}



	public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree<Integer> a, Integer n){
		List<Integer> l = new LinkedList<>();
		if(!a.isEmpty()){
			numerosImparesMayoresQuePorNiveles(a, n, l);

		}
		return l;
		// Es redundante hacer un if else, si de todas formas se devuelve l en los dos casos.
	}
	private void numerosImparesMayoresQuePorNiveles(GeneralTree<Integer> a, Integer n, List<Integer> l){

		Queue<GeneralTree<Integer>> cola = new Queue<>();
		GeneralTree<Integer> abTemp= new GeneralTree<>();
			
		cola.enqueue(a);
		while(!cola.isEmpty()){
			abTemp= cola.dequeue();
		
			if(abTemp.getData() % 2 != 0 && abTemp.getData() > n){
				l.add(abTemp.getData());
			}

			for(GeneralTree<Integer> child : abTemp.getChildren()){
				cola.enqueue(child);
			}
			
		}

	}
}
