import java.util.Scanner;

class JavaLab1_1{
    private static boolean testPrime(int x){
        int temp = 1;
        boolean prime = false;
        if(x>1)
            prime = true;
        while(temp<x||prime){
            if(x%temp == 0){
                prime = false;
                break;
            }
            temp++;
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = s.nextInt();
        System.out.println(testPrime(x));
        s.close();
    }
}