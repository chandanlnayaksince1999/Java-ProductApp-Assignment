package Java.Self.Study.Constructors;

class Car {
    String model;
    int year;

    // Parameterized Constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

