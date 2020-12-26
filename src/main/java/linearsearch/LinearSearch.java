package linearsearch;

public class LinearSearch {

    private LinearSearch(){}

    public static <E> int search(E[] arr, E target){
        for(int i = 0; i < arr.length; i++) {
            if(target.equals(arr[i])){
                return i;
            }
        }
        return -1;
    }
}
