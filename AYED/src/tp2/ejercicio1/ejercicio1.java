package tp2.ejercicio1;

import tp2.ejercicio3.ContadorArbol;

public class ejercicio1 {



    public static void main(String[] args) {
        
        BinaryTree<Integer> ab = new BinaryTree<Integer>(55);

        BinaryTree<Integer> dos = new BinaryTree<Integer>(32);
        BinaryTree<Integer> tres = new BinaryTree<Integer>(70);

        BinaryTree<Integer> cuatro = new BinaryTree<Integer>(15);
        BinaryTree<Integer> cinco = new BinaryTree<Integer>(45);
        BinaryTree<Integer> seis = new BinaryTree<Integer>(64);
        BinaryTree<Integer> siete = new BinaryTree<Integer>(88);
        BinaryTree<Integer> ocho= new BinaryTree<Integer>(7);
        BinaryTree<Integer> nueve= new BinaryTree<Integer>(100);

        ab.addLeftChild(dos);
        ab.addRightChild(tres);

        dos.addLeftChild(cuatro);
        dos.addRightChild(cinco);

        tres.addLeftChild(seis);
        tres.addRightChild(siete);

        cuatro.addLeftChild(ocho);
        siete.addRightChild(nueve);

        //System.out.println(ab.contarHojas());
        ab.entreNiveles(2, 4);

        //System.out.println("--------------");
        //abEsp.ImprimirPreOrden();
        //System.out.println("--------------");
        //abEsp.ImprimirInOrden();
        // System.out.println("--------------");
        // ab.ImprimirPostOrden();

        //System.out.println("Cantidad de hojas: ");
        //System.out.println(ab.contarHojas());

        // BinaryTree<Integer> abEspejo = ab.espejo();
        // abEspejo.ImprimirPreOrden();

        // ab.entreNiveles(1, 2);
        //BinaryTree<Integer> abEsp = ab.espejo();

        //abEsp.ImprimirPreOrden();


    }
}
