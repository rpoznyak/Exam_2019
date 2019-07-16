package Exam_2019;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortArraySet {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 5, 5, 1, 0, 2};
        Set<Integer> sortArr = new HashSet<Integer>(Arrays.asList(arr));

        System.out.print("Количество различных элементов массива :" + sortArr.size());
    }
}