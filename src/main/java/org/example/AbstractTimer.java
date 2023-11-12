package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public interface AbstractTimer {

    long getTime_array();

    long getTime_link();

    void addElems(int k);

    void getElems(int k);

    void deleteElems(int k);

    String toString();

}
