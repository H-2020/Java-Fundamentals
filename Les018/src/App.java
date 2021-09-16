import java.util.Scanner;

class App {

    public static void main(String[] args) {

    // CAR Manufacturing: SAY JARAHIS
        //1-We want ot manufacture a car anad we need all the details
        //2-we need to provide customized cars for the clients
        //3- there are always 3 cars

        // PRINT
        System.out.println("Welcome to Say Jarahis");

        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

        System.out.println("GENERAL INFO");

        System.out.println("brand:");
        car.brandName = scanner.nextLine();
        System.out.println("Model:");
        car.modelName = scanner.nextLine();
        System.out.println("No of doors:");
        car.doors = scanner.nextInt();
        System.out.println("Lights:");
        car.lights = scanner.nextLine();
        System.out.println("Color:(R= red, B=black, Y=yellow,W=white)");
        car.colour = scanner.next().charAt(0);


        scanner.nextLine();

        System.out.println("ENGINE INFO");

        System.out.println("Cylinder Block:");
        car.engine.cylinderBlock = scanner.nextLine();
        System.out.println("Cylinder Head:");
        car.engine.cylinderHead = scanner.nextLine();
        System.out.println("Cylinder Oilpan:");
        car.engine.oilPan = scanner.nextLine();


        System.out.println("SENSORS INFO");

        System.out.println("Brake:");
        car.sensors.brake = scanner.nextLine();
        System.out.println("Gps:");
        car.sensors.gps =scanner.nextLine();
        System.out.println("Wheel:");
        car.sensors.wheel=scanner.nextLine();
        System.out.println("Parking:");
        car.sensors.parking = scanner.nextLine();
        System.out.println("Airbag:");
        car.sensors.airbags = scanner.nextLine();




        // PRINT
        System.out.println("Thank you for using Say Jarahis");
    }
}
