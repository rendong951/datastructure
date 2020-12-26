package linearsearch;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayGenerator.generateOrderedArray(20);

        System.out.println(LinearSearch.search(arr, 50));
    }
}
