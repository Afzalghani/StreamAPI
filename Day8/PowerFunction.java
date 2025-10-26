package Day8;

import java.util.Scanner;

public class PowerFunction {
    static int mod = (int) 1e9 + 7;
    public static int power(int a, int n){
        int res;
        if(n==0) return 1;
        res = power(a,n/2);
        if(n%2==0){
            return (res*res)%mod;

        }
        else{
            return (a*res*res)%mod;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(power(10,n));

    }
}
