package org.example._2023_09_13;

import java.util.List;

public class ExEx {
    //Уровень сложности 5 из 10:

    //Найти сумму всех элементов ArrayList<Integer>.
    public int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum;
    }

    //Найти среднее значение элементов LinkedList<Integer>.
}
