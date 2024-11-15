# Arboles Binarios





## Recorrido por niveles


### Por niveles basico
``` java
    // Por niveles
   	public void ImprimirPorNiveles(){
        if(this.isEmpty()){return}
        else{
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
	}
```


### Cantidad de nodos por nivel
```java
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

```

```java
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
			if(nivel > k) break;         // Esto no se si esta bien, pero deja de recorrer si ya paso el nivel buscado.
		}
		return cant;
	}

```



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