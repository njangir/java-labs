// wap to ask password from user and check if it is 123 then print  "allowed access"  else  give 3 total attempt to emter password .
// after 3 attempt print card blocked 

import java.util.Scanner;

class JavaArrays6{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pass = "123";
        boolean login = false;
        int attempts = 0;
        System.out.println("Enter password to login: ");
        while (attempts<3) {
            if (s.nextLine().equals(pass)){
                login = true;
                break;
            }
            attempts++;
        }
        if(login)            
            System.out.println("Access allowed!");
        else
            System.out.println("Attempts over!");
        s.close();
    }
}