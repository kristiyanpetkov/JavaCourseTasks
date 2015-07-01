package com.clouway.objects.heterogeneoustree;

/**
 * Created by clouway on 15-5-29.
 */
public class Demo {
    public static void main(String[] args){

        Dog elbo = new Dog(14);
        Dog bichmo = new Dog(7);
        Cat angel = new Cat(12);
        Cat roxy = new Cat(9);
        Person michael = new Person(27);
        Person joseph = new Person(12);

        Tree tree = new Tree();
        tree.addNode(elbo.getAge(), elbo,"Elbo");
        tree.addNode(bichmo.getAge(),bichmo,"Bichmo");
        tree.addNode(roxy.getAge(),roxy,"Roxy");
        tree.addNode(angel.getAge(),angel,"Angel");
        tree.addNode(michael.getAge(),michael,"Michael");
        tree.addNode(joseph.getAge(), joseph, "Joseph");

        tree.print();

        System.out.println("");
        System.out.println(tree.findNode(14));









    }

}
