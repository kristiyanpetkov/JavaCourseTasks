package com.clouway.objects.tree;

/**
 * Created by clouway on 15-5-29.
 */
public class Tree {

    Node root;

    public void addNode(int key) {
        Node newNode = new Node(key);//32//9//6
        if (root == null) {
            root = newNode; //32
        } else {
            Node focusNode = root;//==32//
            Node parent;
            while (true) {
                parent = focusNode;//32//9
                if (key == focusNode.key) {
                    return;
                }
                if (key < focusNode.key) { //9<32
                    focusNode = focusNode.leftChild;//null//9//null
                    if (focusNode == null) {
                        parent.leftChild = newNode;//9//6
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;
        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    public void search(int key) {
        if (findNode(key) != null) {
            System.out.println("Chisloto " + findNode(key).key + " syshtestvuva v dyrvoto!");
        } else {
            System.out.println("Nyama takova chislo v dyrvoto");
        }

    }

    public void print() {
        if (root != null) {
            inOrderTraverseTree(root);
        }
    }

    public void inOrderTraverseTree(Node focusNode) {

        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode.key);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }


}


