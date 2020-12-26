package selectsort;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SortingHelper {

    private  SortingHelper(){}

    public static <E extends Comparable<E>> boolean isSorted(E[] arr){
        for(int i = 1; i < arr.length; i ++){
            if(arr[i].compareTo(arr[i-1]) < 0 ){
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortname, E[] arr) throws Exception{

        Class sortMothed = Class.forName(sortname);
        Constructor declaredConstructor = sortMothed.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Method sort = sortMothed.getMethod("sort",  Comparable[].class);

        long startTime = System.nanoTime();
        sort.invoke(declaredConstructor.newInstance(), new Object[]{arr});
//        if(sortname.equals("SelectSort")){
//            SelectSort.sort(arr);
//        }
        long endTime = System.nanoTime();
        Double time = (endTime - startTime) / 1000000000.0;

        if(!SortingHelper.isSorted(arr)){
            throw new RuntimeException("Sorted faild");
        }
        System.out.println(String.format("%s , n = %d : %f s", sortname, arr.length, time));
    }
}
