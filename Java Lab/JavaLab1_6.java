import java.util.Scanner;

public class JavaLab1_6 {
    public static void oddevensum(int[] x){
        int oddsum = 0;
        int evensum = 0;
        for (int i : x) {
            if (i%2==0) {
                evensum += i;
            }
            else
                oddsum += i;
        }
        System.out.println("Odd sum = "+ oddsum + " Even Sum = "+ evensum);
    }

    public static void main(String[] args) {
        int[] arg = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < arg.length; i++) {
            arg[i] = s.nextInt();
        }
        oddevensum(arg);
        s.close();
    }
}
