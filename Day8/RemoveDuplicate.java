package Day8;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;


public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,2,1,4,5,6,7,7,9,10}; //For the int it is not working
        //Because this should be working with the help of the Integer, not int

        Set<Integer> result = Arrays.stream(arr).boxed()
                .collect(Collectors.toSet());
        System.out.println(result);
    }

}
