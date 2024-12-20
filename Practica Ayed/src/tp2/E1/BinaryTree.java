package tp2.E1;






import java.util.ArrayList;

import tp1.E8.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		String aux = "";
		if(this.isEmpty()) return "Empty";
		aux +=  this.getData().toString();
		if (this.hasLeftChild()){
			aux += ", " + this.getLeftChild().toString();
		}
		if ( this.hasRightChild()) {
			aux += ", " + this.getRightChild().toString();
		}
		
		return aux;
	}


    public BinaryTree<T> espejo(){
    	BinaryTree<T> arbEspejo = new BinaryTree<T>(this.getData());
    	if(this.hasLeftChild()) {
    		arbEspejo.addRightChild(this.getLeftChild().espejo());
    	}
    	if(this.hasRightChild()) {
    		arbEspejo.addLeftChild(this.getRightChild().espejo());
    	}
 	   return arbEspejo;
    }





    // Por niveles
   	public void ImprimirPorNiveles(){
		Queue<BinaryTree<T>> cola = new Queue<>();
		BinaryTree<T> abTemp = new BinaryTree<>();
		cola.enqueue(this);

		while(!cola.isEmpty()){
			abTemp = cola.dequeue();
			if(abTemp != null){
				System.out.println(abTemp.data);
			}
			if(abTemp.hasLeftChild()){
				cola.enqueue(abTemp.getLeftChild());
			}
			if(abTemp.hasRightChild()){
				cola.enqueue(abTemp.getRightChild());
			}
			
		}
	}

	// Cant Nodos por nivel
	public ArrayList<Integer> CantNodosPorNivel(){	
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		BinaryTree<T> abTemp = null;
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(0);
		int nivel = 0;      // Inicializo el primer nivel de la lista en 0.

		cola.enqueue(this);
		cola.enqueue(null);

		while (!cola.isEmpty()){
			abTemp = cola.dequeue();
			if(abTemp != null){
	
				lista.set(nivel, lista.get(nivel) + 1);    // Sumo 1 a la posicion.

				if(abTemp.hasLeftChild()) cola.enqueue(abTemp.getLeftChild());    // Pregunto por los hijos del nodo.
				if(abTemp.hasRightChild()) cola.enqueue(abTemp.getRightChild());
			}
			else{
				if (!cola.isEmpty()){
					cola.enqueue(null);
					nivel++;					// Aumento en 1 el nivel
					lista.add(0); 			// Inicializo nuevo nivel en 0

				}
			}
		}
		return lista;
	}

	// Cuantos nodos hay en el nivel k
	public int CantNodosPorNivel(int k){
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		BinaryTree<T> abTemp = null;
		int cant = 0;
		int nivel = 0;

		cola.enqueue(this);
		cola.enqueue(null);

		while(!cola.isEmpty()){
			abTemp = cola.dequeue();
			if (abTemp != null){
				System.out.println(abTemp.getData());
				if(nivel == k){
					cant++;
				}
				
				if(abTemp.hasLeftChild()) cola.enqueue(abTemp.getLeftChild());    // Pregunto por los hijos del nodo.
				if(abTemp.hasRightChild()) cola.enqueue(abTemp.getRightChild());

			}
			else if(!cola.isEmpty()){
				cola.enqueue(null);
				nivel++;
			}
			if(nivel > k) break;
		}
		return cant;
	}


	// Cantidad de niveles
	public int CountLevels(){
           
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		BinaryTree<T> abTemp = null;
		int cant= 0;
		cola.enqueue(this);
		cola.enqueue(null);
		while (!cola.isEmpty()){
			abTemp = cola.dequeue();
			if(abTemp != null ) {
				//System.out.println(abTemp.getData());
				if(abTemp.hasLeftChild()){
					cola.enqueue(abTemp.getLeftChild());
				}
				if(abTemp.hasRightChild()){
					cola.enqueue(abTemp.getRightChild());
				}
			}
			else if (!cola.isEmpty()){
				cola.enqueue(null);
				cant++;
			}
		}
		return cant;
	}






	// a) contarHojas():int Devuelve la cantidad de árbol/subárbol hojas del árbol receptor.
	public int ContarHojas() {
		int cantL = 0;
		int cantR = 0;
		if (this.isEmpty()) return 0;
		else if (this.isLeaf()) return 1;
		else {
			
			if (this.hasLeftChild()){
				cantL =  this.getLeftChild().ContarHojas();
			}
			if (this.hasRightChild()) {
				cantR = this.getRightChild().ContarHojas();
			}
			return cantL + cantR;
		}
		
	}
	




	// Imprimir 
	public void imprimirPreOrden() {
		System.out.println(this.getData());
        if(this.hasLeftChild()) this.getLeftChild().imprimirPreOrden();
        if(this.hasRightChild()) this.getRightChild().imprimirPreOrden();
    }
		
	public void imprimirInorden() {
        if(this.hasLeftChild()) this.getLeftChild().imprimirInorden();
        System.out.println(this.getData());
        if(this.hasRightChild()) this.getRightChild().imprimirInorden();
    }

	public void imprimirPostOrden() {
        if(this.hasLeftChild()) this.getLeftChild().imprimirPostOrden();
        if(this.hasRightChild()) this.getRightChild().imprimirPostOrden();
		System.out.println(this.getData());
    }

}

