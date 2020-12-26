package selectsort;

import linearsearch.ArrayGenerator;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = ArrayGenerator.generateRandomArray(10000, 10000);

        try {
            SortingHelper.sortTest("selectsort.SelectSort", integers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
