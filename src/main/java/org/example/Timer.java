package org.example;
import java.util.ArrayList;
import java.util.LinkedList;

public class Timer implements AbstractTimer {

    private long time_array;

    private long time_link;

    private ArrayList<Integer> list_arr;

    private LinkedList<Integer> list_link;

    private long setTime () { return System.currentTimeMillis(); }

    private long interval(long start, long end) { return end - start; }

    public Timer() {
        time_array = 0;
        time_link = 0;
        list_arr = new  ArrayList<Integer>();
        list_link = new LinkedList<Integer>();
    }

    public long getTime_array() {
        return time_array;
    }

    public long getTime_link() {
        return time_link;
    }

    @Override
    public void addElems( int k) {
        long start; int n = 7, i;
        start = setTime();
        for (i = 0; i < k; i++)
            list_arr.add(n);
        time_array = interval(start, setTime());

        start = setTime();
        for (i = 0; i < k; i++)
            list_link.add(n);
        time_link = interval(start, setTime());
    }

    @Override
    public void getElems(int k) {
        long start; int i;
        Object temp;

        start = setTime();
        for (i = 0; i < k; i++)
            temp = list_arr.get(i);
        time_array = interval(start, setTime());

        start = setTime();
        for (i = 0; i < k; i++)
            temp = list_link.get(i);
        time_link = interval(start, setTime());
    }

    @Override
    public void deleteElems(int k) {
        long start; int i;

        start = setTime();
        for (i = k - 1; i >= 0; i--)
            list_arr.remove(i);
        time_array = interval(start, setTime());

        start = setTime();
        for (i = k - 1; i >= 0; i--)
            list_link.remove(i);
        time_link = interval(start, setTime());
    }

    @Override
    public String toString() {
        return "Array list time: " +time_array + "\t\t\t" +"Linked list time: "+ time_link;
    }
}