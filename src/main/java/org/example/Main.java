package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = 0;
        k = in.nextInt();
        AbstractTimer timer;
        timer = new Timer();
        timer.addElems(k);
        System.out.println(timer);
        timer.getElems(k);
        System.out.println(timer);
        timer.deleteElems(k);
        System.out.println(timer);

    }
}