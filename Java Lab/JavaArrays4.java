//4 wap to ask 7 names from user in string array and search for particular name in given array using for loop
import java.util.Scanner;
class JavaArrays4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names= new String[7];
        for(int i = 0; i< names.length;i++){
            names[i] = scanner.nextLine();
        }
        System.out.println("enter the name to be searched: ");
        String search = scanner.nextLine();
        for (String string : names) {
            if(string.equals(search))
                System.out.println("Name is in the list");
        }
        scanner.close();
    }
}
