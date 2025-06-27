package Parciales.Arboles.Parcial4;

import tp2.ejercicio1.BinaryTree;

public class Parcial4 {
    
    BinaryTree<Integer> ab;


    private boolean esImpar(int n){
        return ((n % 2) == 1);
    }

    public Integer sumaImparesPosOrderMayorA(BinaryTree<Integer> ab, int limite){
        if(ab.isEmpty()) return 0;
        int suma = 0;

        if(ab.hasLeftChild()){
            suma+= sumaImparesPosOrderMayorA(ab.getLeftChild(), limite);
        }
        if(ab.hasRightChild()){
            suma+= sumaImparesPosOrderMayorA(ab.getRightChild(), limite);
        }

        if (esImpar(ab.getData()) && (ab.getData() > limite)){
            suma+= ab.getData();
        }

        return suma;
    }



    public static void main(String[] args) {


        BinaryTree<Integer> node1 = new BinaryTree<>(7);
        BinaryTree<Integer> node2 = new BinaryTree<>(56);
        BinaryTree<Integer> node3 = new BinaryTree<>(25);
        BinaryTree<Integer> node4 = new BinaryTree<>(38);
        BinaryTree<Integer> node5 = new BinaryTree<>(31);
        BinaryTree<Integer> node6 = new BinaryTree<>(5);
        BinaryTree<Integer> node7 = new BinaryTree<>(6);
        BinaryTree<Integer> node8 = new BinaryTree<>(87);
        BinaryTree<Integer> node9 = new BinaryTree<>(77);
        BinaryTree<Integer> node10 = new BinaryTree<>(94);
        BinaryTree<Integer> node11 = new BinaryTree<>(16);
        BinaryTree<Integer> node12 = new BinaryTree<>(2);
        BinaryTree<Integer> node13 = new BinaryTree<>(43);
        BinaryTree<Integer> node14 = new BinaryTree<>(1);
        BinaryTree<Integer> node15 = new BinaryTree<>(9);
        BinaryTree<Integer> node16 = new BinaryTree<>(10);


        node1.addLeftChild(node2);
        node1.addRightChild(node3);

        node2.addLeftChild(node4);
        node2.addRightChild(node5);

        node3.addLeftChild(node6);
        node3.addRightChild(node7);

        node4.addLeftChild(node8);
        node4.addRightChild(node9);

        node5.addRightChild(node10); 

        node9.addRightChild(node11); 

        node10.addRightChild(node12); 

        node11.addRightChild(node13); 

        node12.addLeftChild(node14);

        node13.addLeftChild(node15);
        node13.addRightChild(node16);


        
        Parcial4 p4 = new Parcial4();

        System.out.println(p4.sumaImparesPosOrderMayorA(node1, 30));
        

    }

}
