import java.util.Scanner;

public class JavaLab1_4 {
    public static void table(int x){
        for(int i = 1; i<=10; i++)
            System.out.println(x+" x "+i+" = "+x*i);
    }   
    public static void main(String[] args) {
        //Q 4    Write a function that takes an integer n and prints the multiplication table for that number (from 1 to 10) using a loop.  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        table(s.nextInt());
        s.close();
    }
}
