package insertionsort;

import linearsearch.ArrayGenerator;
import selectsort.SortingHelper;

public class Main {
    public static void main(String[] args) {
//        Integer[] integers = ArrayGenerator.generateRandomArray(10000, 10000);
        Integer[] integers = {1,5,8,7,6,9};

        try {
            SortingHelper.sortTest("insertionsort.InsertionSort", integers);
            for (Integer a : integers) {
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
