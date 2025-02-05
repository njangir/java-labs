//Create a function that takes an integer and returns the sum of its digits. Use a loop to extract each digit and perform  the sum.

import java.util.Scanner;

public class JavaLab1_3 {
    public static int getSum(int x){
        int sum = 0;
        while(x>0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(getSum(s.nextInt()));
        s.close();
    }
}
