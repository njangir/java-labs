//8 Write a program to search element in array using (linear search and binary search) 

import java.util.Scanner;

public class JavaArrays8 {
    public static int linearSearch(int[] x, int s){
        for (int i = 0;i<x.length ;i++) {
            if(x[i]==s)
                return i;
        }
        return -1;
    }
    public static int[] sort(int[] x){
        int swap;
        for (int j = x.length;j>0 ;j--) {
            for (int i = 0;i<j-1;i++) {
                if(x[i]>x[i+1]){
                    swap = x[i];
                    x[i] = x[i+1];
                    x[i+1] = swap;
                }
            }
        }        
        return x;
    }
    public static int binarySearch(int[] x,int s){
        int first = 0;
        int len = x.length;
        int last = len;
        int mid = len/2;
        int pos = -1;
        while (first<last) {
            if (x[mid]==s) {
                return mid;
            }
            else{
                if (s<x[mid]) 
                    last = x[mid]-1;                
                else
                    first = x[mid]+1;
                mid = first + (last-first)/2;
            }   
        }
        return pos;
    }
    public static void main(String[] args) {
        int[] testArr = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no to search: ");
        int s = scanner.nextInt();
        System.out.println("Using linear search: "+linearSearch(testArr,s));
        System.out.println("Using binary search: "+binarySearch(sort(testArr),s));
        scanner.close();
    }
}
