package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class Main {

    /**
     * Метод печати таблицы сравнения времени работы методов классов ArrayList и LinkedList
     * @param result_add Параметр времени работы методов добавления элемента в коллекциях
     * @param result_get Параметр времени работы методов получения элемента в коллекциях
     * @param result_delete Параметр времени работы методов удаления элемента в коллекциях
     * @param k Параметр количества элементов в коллекциях
     */
    public static void table (String result_add, String result_get, String result_delete, int k) {
        System.out.printf ("%-10s%-10s%-10s%n", "Method" + "\t", "ArrayList" + "\t\t\t\t\t", "LinkedList");

        System.out.printf("%-10s", "add");
        System.out.printf("%15s", result_add);
        System.out.println();

        System.out.printf("%-10s", "get");
        System.out.printf("%16s", result_get);
        System.out.println();

        System.out.printf("%-10s", "delete");
        System.out.printf("%15s", result_delete);
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = 0;
        k = in.nextInt();
        AbstractTimer timer;
        timer = new Timer();
        timer.addElems(k);
        String add_time = timer.toString();
        timer.getElems(k);
        String get_time = timer.toString();
        timer.deleteElems(k);
        String delete_time = timer.toString();
        table(add_time,get_time,delete_time,k);

    }
}