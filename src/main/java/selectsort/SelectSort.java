package selectsort;

public class SelectSort {

    private SelectSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minIndex].compareTo(arr[j]) > 0){
                    minIndex = j;
                }
            }
            E temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
