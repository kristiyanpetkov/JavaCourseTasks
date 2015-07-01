package com.clouway.objects.heterogeneoustree;

/**
 * Created by clouway on 15-6-1.
 */
public class Node {

    public int key;
    public Node leftChild;
    public Node rightChild;
    public Object object;
    String name;

    public Node(int key) {
        this.key = key;
    }

    public Node(int key, Object object, String name) {
        this.object = object;
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return name + " has the key " + key;
    }

}
