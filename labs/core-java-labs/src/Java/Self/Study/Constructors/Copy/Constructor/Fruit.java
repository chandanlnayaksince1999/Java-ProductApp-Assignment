package Java.Self.Study.Constructors.Copy.Constructor;

public class Fruit {
    private double fprice;
    private String fname;

    //constructor to initialize roll number and name of the student
    Fruit(double fPrice, String fName) {
        fprice = fPrice;
        fname = fName;
    }

    //creating a copy constructor
    Fruit(Fruit fruit) {
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        fprice = fruit.fprice;
        fname = fruit.fname;
    }

    //creating a method that returns the price of the fruit
    double showPrice() {
        return fprice;
    }

    //creating a method that returns the name of the fruit
    String showName() {
        return fname;
    }
}
