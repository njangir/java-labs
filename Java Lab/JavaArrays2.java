// 2 WAP to define two array a and b of size 5  .Add both array elements and store them to third array .

import java.util.Scanner;

class JavaArrays2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[10];
        System.out.println("Enter the elements of 1st array: ");
        for(int i= 0; i<5;i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the elements of 2nd array: ");
        for(int i= 0; i<5;i++){
            arr2[i] = scanner.nextInt();
        }
        int j = 0;
        System.out.println("Elements of new array: ");
        for(int i= 0; i<10;i++){
            if(i<5)
                arr3[i] = arr1[i];
            else{
                arr3[i] = arr2[j];
                j++;
            }
        }
        for (int i : arr3) {
            System.out.println(i);
        }
        scanner.close();
    }
}