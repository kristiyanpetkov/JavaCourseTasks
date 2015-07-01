package com.clouway.objects.heterogeneoustree;

/**
 * Created by clouway on 15-6-1.
 */
public class Tree {

    Node root;

    public void addNode(int key, Object object, String name) {
        Node newNode = new Node(key, object, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
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
            System.out.println("Chisloto " + findNode(key).key + " se sudurja v dyrvoto");
        } else {
            System.out.println("Chisloto ne se sudurja v dyrvoto");
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
            System.out.println(focusNode.key + " " + focusNode.name);
            inOrderTraverseTree(focusNode.rightChild);
        }

    }

}
