import java.util.Scanner;

public class JavaLab1_2 {
    private static char getGrades(int x){
        char Grade;
        if (x>89)
            Grade = 'A';
            else if(x>79)
                Grade = 'B';
                else if(x>69)
                    Grade = 'C';
                    else if(x>59)
                        Grade = 'D';
                        else 
                        Grade = 'E';
        return Grade;
    }
    public static void main(String[] args) {
//         90-100: A
// 80-89: B
// 70-79: C
// 60-69: D
// Below 60: F
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        System.out.println(getGrades(s.nextInt()));
        s.close();
    }
}
