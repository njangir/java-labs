//Q 5  Write a function that takes an array of integers and returns both the maximum and minimum values using a loop. Print the results in the main program.  

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ListIterator;

public class JavaLab1_5 {
    private static int[] maxmin(ArrayList<Integer> inputAr){
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int temp = 0;
        int[] result = new int[2];
        // for(int i =0; i<inputAr.size();i++){
        //     if(inputAr.get(i)>max)
        //         max = inputAr.get(i);
        //     if(inputAr.get(i)<min)
        //         min = inputAr.get(i);
        // }
        ListIterator<Integer> iter = inputAr.listIterator();

        while (iter.hasNext()) {
            temp = iter.next();
            if(temp>max)
                max = temp;
            if (temp<min)
                min = temp;
        }
        result[0] = max;
        result[1] = min;
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> inputAr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int[] result = new int[2];
        int temp = 0;
        while (true) {
            System.out.println("Enter number to add or type -1 to end");
            temp = s.nextInt();
            if(temp!=-1)
                inputAr.add(temp);
            else
                break;
        }
        result = maxmin(inputAr);
        System.out.println(Arrays.toString(result));
        s.close();
    }
}
