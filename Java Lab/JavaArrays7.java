// Take 20 integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0s.

import java.util.Scanner;

public class JavaArrays7 {
    public static int pos(int[] x){
        int count = 0;
        for(int i = 0; i<x.length;i++){
            if (x[i]>0)
                count++;
        }
        return count;
    }
    public static int odd(int[] x){
        int count = 0;
        for(int i = 0; i<x.length;i++){
            if (x[i]%2!=0)
                count++;
        }
        return count;
    }
    public static int zeros(int[] x){
        int count = 0;
        for(int i = 0; i<x.length;i++){
            if (x[i]==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] inputs = new int[20];
        int len = 0;
        while(len<20){
            inputs[len] = s.nextInt();
            len++;
        }
        int noPos = pos(inputs);
        int noOdd = odd(inputs);
        int noZero = zeros(inputs);
        System.out.println("Number of Positive numbers: " + noPos);
        System.out.println("Number of Negative numbers: " + (20-noPos));
        System.out.println("Number of Odd numbers: " + noOdd);
        System.out.println("Number of Even numbers: " + (20-noOdd-noZero));
        System.out.println("Number of Zeros: " + noZero);
        s.close();
    }
}
