package Parciales.Arboles.Parcial5;

import java.util.LinkedList;
import java.util.List;

import tp2.ejercicio1.BinaryTree;



public class Parcial5 {

    BinaryTree<Integer> ab;

    public Parcial5(BinaryTree<Integer> ab){
        this.ab = ab;
    }


    private void cargarLista(BinaryTree<Integer> ab, List<Integer> list){
        if(ab.isEmpty()) return;
        
        if((ab.hasLeftChild() && ab.hasRightChild()) || ab.isLeaf()){
            list.add(ab.getData());
        }

        if(ab.hasLeftChild()) cargarLista(ab.getLeftChild(), list);
        if(ab.hasRightChild()) cargarLista(ab.getRightChild(), list);



    }

    public List<Integer> resolver(BinaryTree<Integer> ab){
        List<Integer> list = new LinkedList<>();
        cargarLista(ab, list);
        return list;
    }


    public static void main(String[] args) {

        BinaryTree<Integer> node1 = new BinaryTree<>(2);
        BinaryTree<Integer> node2 = new BinaryTree<>(1);
        BinaryTree<Integer> node3 = new BinaryTree<>(5);
        BinaryTree<Integer> node4 = new BinaryTree<>(16);
        BinaryTree<Integer> node5 = new BinaryTree<>(6);
        BinaryTree<Integer> node6 = new BinaryTree<>(8);
        BinaryTree<Integer> node7 = new BinaryTree<>(22);

        node1.addLeftChild(node2);
        node1.addRightChild(node3);

        node2.addLeftChild(node4);
        node2.addRightChild(node5);

        node3.addRightChild(node6); // El nodo 5 (node3) no tiene hijo izquierdo

        node6.addLeftChild(node7); // El nodo 8 (node6) no tiene hijo derecho

        Parcial5 p = new Parcial5(node1);
        System.out.println(p.resolver(node1));
        
    }

}
