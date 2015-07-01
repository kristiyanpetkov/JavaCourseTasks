package com.clouway.exceptions.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by clouway on 15-6-19.
 */
public class ListOfElements {
    private final int size = 8;
    private List<Object> list = new ArrayList<Object>();
    private int index = 0;

    public void add(Object obj) {
        try {
            if (index < size) {

                this.list.add(index, obj);
                index++;
            } else if(index>= size) {
                throw new IndexOutOfBoundsException(">10");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }


    public void remove() {
        try {
                list.remove(index-1);
                index--;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println(ex+"+Cannot remove a list! List is empty!");
            ex.getMessage();
        }
    }

    public void printAllElements() {
        for (int i = 0; i < index; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(index);
    }


}
