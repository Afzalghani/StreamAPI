package Day2;

import java.util.List;

public class FistMatchOfGivenCondition {
    public static boolean prime(int n){
       int count=0;
       for(int i=1;i<=n;i++){
           if(n%i==0){
               count++;
           }
       }
       return count==2;
    }
    public static void main(String[] args) {
        List<Integer> listOfInteger = List.of(1,9,3,4,64,23,43,46,23,64);
        //Find the fist even element
        var result = listOfInteger.stream().filter(i-> i%2==0).findFirst();
        System.out.println(result.isEmpty()? "No result found" : result.get());


        //Print first Prime Number
        var firstPrimeNumber= listOfInteger.stream().filter(FistMatchOfGivenCondition::prime).findFirst();
        System.out.println(firstPrimeNumber.isEmpty()? "No result found" : firstPrimeNumber.get());


    }
}
