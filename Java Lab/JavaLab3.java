// Q 3 Write a Java class Car with the following attributes: make, model, year, and color. Implement a constructor that initializes these attributes when an object
//  of the Car class is created. Write a main method to create an instance of Car and display its attributes.Enhance the Car class from the previous question by adding 
//  a parameterized constructor that takes values for make, model, year, and color as arguments. Demonstrate the use of this constructor in the main method

class Car{
    String make;
    String model;
    int year;
    String color;
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
    }
    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Color: " + color);
    }
}

public class JavaLab3{
    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println("Details of car1 (using default constructor): ");
        car1.displayCarDetails();
        System.out.println();

        Car car2 = new Car("VW", "Polo", 2024, "White");
        System.out.println("Details of car2 (using parameterized constructor): ");
        car2.displayCarDetails();
    }
}