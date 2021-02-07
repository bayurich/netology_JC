package Netology_JC.Lesson1_2.Pack_Task_1_2_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void  main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListResult = new ArrayList<>();

        for (Integer i : intList){
            if (i <= 0 || i % 2 != 0) continue;
            intListResult.add(i);
        }
        intListResult.sort(Integer::compareTo);
        for (Integer i : intListResult){
            System.out.println(i);
        }
    }
}
