# Arboles Binarios





## Recorrido por niveles

### Cantidad de niveles del arbol.
``` java
	// CountLevels
	public int CountLevels(){
		if(this.isEmpty()){        // Si el arbol esta vacio retorno 0
			return 0;
		}
		else{                      // sino ya se que tengo una raiz, sumo 1
			Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
			BinaryTree<T> abTemp = null;
			int cant= 1;
			cola.enqueue(this);
			cola.enqueue(null);
			while (!cola.isEmpty()){
				abTemp = cola.dequeue();
				if(abTemp != null ) {
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
	}




```