package Java.Self.Study.Constructors.Copy.Constructor;

//class to create student object and print roll number and name of the student
public class Main {
    public static void main(String[] args) {
        Fruit f1 = new Fruit(399, "Ruby Roman Grapes");
        System.out.println("Name of the first fruit: " + f1.showName());
        System.out.println("Price of the first fruit: " + f1.showPrice());
//passing the parameters to the copy constructor
        Fruit f2 = new Fruit(f1);
        System.out.println("Name of the second fruit: " + f2.showName());
        System.out.println("Price of the second fruit: " + f2.showPrice());
    }
}