package com.cydeo.burakExample;

public class Burak {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int burak=0;
        int s=0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(s++);
            burak++;
        }
        System.out.println(burak);
    }

}
