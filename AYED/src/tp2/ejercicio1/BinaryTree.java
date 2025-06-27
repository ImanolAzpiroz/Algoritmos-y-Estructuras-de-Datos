package tp2.ejercicio1;


import tp1.ejercicio8.Queue;

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
		if (this.getData() == null) return "null";
		else return this.getData().toString();	
	}

	public void ImprimirPreOrden(){
		System.out.println(this.data);
		if(this.hasLeftChild()){
			this.getLeftChild().ImprimirPreOrden();	
		}
		if(this.hasRightChild()){
			this.getRightChild().ImprimirPreOrden();
		}
	}

	public void ImprimirInOrden(){
		if(this.hasLeftChild()){
			this.getLeftChild().ImprimirInOrden();	
		}
		System.out.println(this.data);
		if(this.hasRightChild()){
			this.getRightChild().ImprimirInOrden();
		}

	}

	public void ImprimirPostOrden(){
		if(this.hasLeftChild()){
			this.getLeftChild().ImprimirPostOrden();	
		}
		if(this.hasRightChild()){
			this.getRightChild().ImprimirPostOrden();
		}
		System.out.println(this.data);
	}

	// Ejercicio 1)

	public  int contarHojas() {
		int cant = 0;
		if (this.isLeaf()) return 1;
		if(this.hasLeftChild()){
			cant+= this.getLeftChild().contarHojas();
		}
		if(this.hasRightChild()){
			cant+= this.getRightChild().contarHojas();
		}
		return cant;
	}
		
	
    public BinaryTree<T> espejo(){
		if(this.isEmpty()) return null;
		BinaryTree<T> abEsp = new BinaryTree<T>(this.getData());
		if(this.hasLeftChild()){
			abEsp.addRightChild(this.getLeftChild().espejo());
		}
		if(this.hasRightChild()){
			abEsp.addLeftChild(this.getRightChild().espejo());
		}
		return abEsp;
    }


	public void porNiveles(){
		if(this.isEmpty()) return;
		BinaryTree<T> abTemp = null;
		Queue<BinaryTree<T>> cola = new Queue<>();
		cola.enqueue(this);
		cola.enqueue(null);

		while(!cola.isEmpty()){
			abTemp = cola.dequeue();

			if(abTemp != null){
				System.out.println(abTemp.getData());
				if (abTemp.hasLeftChild()) cola.enqueue(abTemp.getLeftChild());
				if (abTemp.hasRightChild()) cola.enqueue(abTemp.getRightChild());
			}
			else if(!cola.isEmpty()){
				cola.enqueue(null);
				System.out.println();
			}
		}
   	}
	
   
   	// 0<=n<=m
	public void entreNiveles(int n, int m){
		if(this.isEmpty() || (n < 0) || (m < n) ) return;

		BinaryTree<T> abTemp = null;
		Queue<BinaryTree<T>> cola = new Queue<>();
		int nivelActual = 0;

		cola.enqueue(this);
		cola.enqueue(null);

		while(!cola.isEmpty()){
			abTemp = cola.dequeue();

			if(abTemp != null){
				if(nivelActual >= n && nivelActual <= m){
					System.out.println(abTemp.getData());
				}
				else if(nivelActual > m) return;
				
				if (abTemp.hasLeftChild()) cola.enqueue(abTemp.getLeftChild());
				if (abTemp.hasRightChild()) cola.enqueue(abTemp.getRightChild());
			}
			else if(!cola.isEmpty()){
				cola.enqueue(null);
				nivelActual++;
				System.out.println();
			}
		}
	
	
	
	}

}

