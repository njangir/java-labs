// 1 wap to take 10 numbers in an array and print count of even and odd number in given array.
import java.util.Scanner;
class JavaArrays1 {

    static void oddoreven(int[] x){
        for (int i : x) {                
            if(i%2==1)
                System.out.println(i + " is odd");
            else
                System.out.println(i+" is even");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i<10; i++){
            arr[i] = scanner.nextInt();
        }
        oddoreven(arr);
        scanner.close();
    }
}
