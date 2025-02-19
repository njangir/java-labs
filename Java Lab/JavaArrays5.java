//5 wap to define an array of integer .Take input from user .count and print numbers greater than 100 .

import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

class JavaArrays5{
    public static void countAndPrint(ArrayList<Integer> x){
        int count=0;
        int num;
        ListIterator<Integer> iter = x.listIterator();
        while(iter.hasNext()){
            num = iter.next();
            if(num>100){
                System.out.println(num);
                count++;
            }
        }
        System.out.println("Count of numbers greater than 100: " + count);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            System.out.println("Enter a number or type 1 to end: ");
            x = s.nextInt();
            if(x!=1){
                arr.add(x);
            }
            else
                break;
        }
        countAndPrint(arr);
        s.close();
    }
}