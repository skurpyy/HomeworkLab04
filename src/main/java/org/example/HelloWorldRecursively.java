package org.example;

public class HelloWorldRecursively {


    public static void main(String[] args) {

        helloWorld(5);
    }

    static void helloWorld(int n){
        //Base case
        if (n == 0){
            return;
        }
        //Recursive
        System.out.println("Hello World");

        helloWorld(n-1);
    }

}