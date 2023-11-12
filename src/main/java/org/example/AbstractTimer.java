package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public interface AbstractTimer {

    /**
     * Метод возвращает время работы метода в ArrayList
     * @return Возвращает значение поля времени работы метода класса ArrayList
     */
    long getTime_array();

    /**
     * Метод возвращает время работы метода в LinkedList
     * @return Возвращает значение поля времени работы метода класса LinkedList
     */
    long getTime_link();

    /**
     * Метод сравнивает время работы метода добавления элемента в ArrayList и LinkedList
     * @param k Параметр количества добавляемых элементов в коллекции
     */
    void addElems(int k);

    /**
     * Метод сравнивает время работы метода получения элемента в ArrayList и LinkedList
     * @param k Параметр количества получаемых элементов в коллекции
     */
    void getElems(int k);

    /**
     * Метод сравнивает время работы метода удаления элемента в ArrayList и LinkedList
     * @param k Параметр количества удаляемых элементов в коллекции
     */
    void deleteElems(int k);

    /**
     * Метод приведения необходимых полей класса к строке
     * @return Возвращает строку с необходимыми полями исходного класса
     */
    String toString();

}
