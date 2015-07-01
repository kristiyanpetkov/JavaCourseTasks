package com.clouway.inputoutput.task5;

import java.io.IOException;

/**
 * Created by clouway on 15-6-30.
 */
public class DirectoryBrowserDemo {
    public static void main(String[] args) throws IOException{
        DirectoryBrowser dir = new DirectoryBrowser();
        dir.listContent("src/com/clouway/inputoutput");
    }
}
