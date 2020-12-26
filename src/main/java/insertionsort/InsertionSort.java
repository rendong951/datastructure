package insertionsort;

public class InsertionSort {

    private InsertionSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
//        for(int i = 0; i < arr.length; i ++){
//            for(int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) <= 0; j --){
//                    E temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//            }
//        }

        for(int i = 0; i < arr.length; i ++){
            E temp = arr[i];
            int j;
            for(j = i ; j > 0 && temp.compareTo(arr[j - 1]) <=0; j --){
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }
}
