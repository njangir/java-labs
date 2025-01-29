import java.util.Scanner;

public class JavaArmstrong {    
    public static boolean isArmstrong(int num){
        int digits = String.valueOf(num).length();
        int org = num;
        int sum = 0;
        while(num>0){
            sum+=Math.pow(num%10, digits);
            num/=10;
        }
        return sum==org;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = s.nextInt();
        if (isArmstrong(x)) {
            System.out.println("Number is Armstrong!");
        }
        else{
            System.out.println("Number is not a Armstrong!");
        }
        s.close();
    }
}