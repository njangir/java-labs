// Q 2  

// Create a class named Student with the following attributes:
// 1)      name (String): to store the name of the student.
// 2)      id (int): to store the student ID.
// 3)      grade (double): to store the grade of the student.
// Implement a constructor to initialize these attributes.
 
// è In the main method, create an array named studentArray that can hold up to 10 Student objects.
// è Initialize the studentArray array with different Student objects. You can use fictional student data for this.
// è Write a method named displayStudents that takes the studentArray array as a parameter and displays the details of each student in the array.

// è Write a method named sortStudents that takes the studentArray array as a parameter and sorts the array based on the grades of the students in ascending order. 
//You can use any sorting algorithm of your choice (e.g., bubble sort )

import java.util.Scanner;

class Student {
    String name;
    int id;
    Double grade;

    Student(String name, int id, Double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

public class JavaLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studentArray = new Student[10];
        
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student(scanner.next(), scanner.nextInt(), scanner.nextDouble());
        }

        System.out.println("Initial student array: ");
        displayStudents(studentArray);

        sortStudents(studentArray);

        System.out.println("After sorting: ");
        displayStudents(studentArray);

        scanner.close();
    }

    public static void displayStudents(Student[] x) {
        for (Student student : x) {
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Grade: " + student.grade);
        }
    }

    public static Student[] sortStudents(Student[] x) {
        // Implement bubble sort
        Student temp;
        for (int i = x.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (x[j].grade > x[j + 1].grade) {
                    // Swap
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        return x;
    }
}
