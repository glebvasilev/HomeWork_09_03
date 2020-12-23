package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

abstract class MyProgram {
    /*
     *  Class serves for greetings
     */

    public String any;

}

class Greeting extends MyProgram {

    public String any = "Hello, World!";

    public void sayHello() {
        System.out.println(any);
    }
}

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Greeting g = new Greeting();
        g.sayHello();

        File f = new File("/Users/Hello, World!.txt");
        Scanner s = new Scanner(f);
    }
}