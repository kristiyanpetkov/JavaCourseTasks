package com.clouway.objects.tree;

/**
 * Created by clouway on 15-5-29.
 */
public class Demo {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(32);
        tree.addNode(9);
        tree.addNode(6);
        tree.addNode(83);
        tree.addNode(1);
        tree.addNode(57);
        tree.addNode(83);
        tree.addNode(12);
        tree.addNode(83);
        tree.addNode(20);
        tree.addNode(88);

        tree.print();

        tree.search(44);


    }
}
