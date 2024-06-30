package brocode;

public class Main {

    @SuppressWarnings("unused")
	public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.model);
        System.out.println(myCar2.name);
    }
}

class Car {
    String model = "TATA";
    String year = "1990";
    String name = "Baleno";
    String color = "blue";
    double price = 500000;

    void drive() {
        System.out.print("You are driving..");
    }

    void brake() {
        System.out.println("You are stepping on the brakes...");
    }
}
