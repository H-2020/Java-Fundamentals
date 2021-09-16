import java.util.Scanner;
    class App {
        public static void main(String[] args) {
        String SEPARATER ="***********************************************";
            /* 6- Print all the information about the car. * */ // PRINT
        System.out.println("Welcome to Say Jarahis.. ");
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();

        System.out.println("GENERAL INFO");
        System.out.println("Brand: ");
            // 23234bfsad -> Tesla
        car.brandName = scanner.nextLine();
        System.out.println("Model: ");
            // a31231jsad -> ModelZ
        car.modelName = scanner.nextLine();
        System.out.println("No of doors: ");
            // awe123dbfja -> 2
        car.doors = scanner.nextInt();
        System.out.println("Lights: ");
            // 2039r23asd -> Xenon
        car.lights = scanner.nextLine();
        System.out.println("Color (R = Red, B = Black, Y = Yellow, W = White): ");
            // dfhuweqfq34 -> R
        car.colour = scanner.nextLine().charAt(0); // PRINT


        System.out.println("Would you like to customize engine (y/n) ?"); // INPUT(ANSWER)
        char answer = scanner.nextLine().charAt(0); // answer -> y
        System.out.println("You choice is " + answer);

            // IF(CONDITION)
        boolean condition = (answer == 'y');
            // condition -> TRUE

        if(condition){ // TRUE
        System.out.println("ENGINE INFO");
        System.out.println("Cylinder Block: ");
            // car.engine.cylinderBlock = scanner.nextLine();
            // 2934r332dsad ->
        car.engine.cylinderBlock = scanner.nextLine();
        System.out.println("Cylinder Head: ");
        car.engine.cylinderHead = scanner.nextLine();
        System.out.println("Oil pan: ");
        car.engine.oilPan = scanner.nextLine();
        }
        else{
        System.out.println("We will use default parts..");
        }

            // PRINT
        System.out.println("Would you like to customize sensors (y/n) ?");
            // INPUT(ANSWER)
        answer = scanner.nextLine().charAt(0); // answer -> n
        System.out.println("You choice is " + answer);
        condition = (answer == 'y');

        if(condition){
        System.out.println("SENSORS INFO"); System.out.println("Brake: ");
        car.sensors.brake = scanner.nextLine();
        System.out.println("GPS: ");
        car.sensors.gps = scanner.nextLine();
        System.out.println("Wheel: ");
        car.sensors.wheel = scanner.nextLine();
        System.out.println("Parking: ");
        car.sensors.parking = scanner.nextLine();
        System.out.println("Airbags: ");
        car.sensors.airbags = scanner.nextLine();
        }
        else{
            System.out.println("We will use default parts..");
        }
            System.out.println( SEPARATER );
            System.out.println("Car general info: ");
            System.out.println("YOUR CUSTOMIZED CAR: ");
            System.out.println("Brand: " + car.brandName);
            System.out.println("Model: " + car.modelName);
            System.out.println("No of doors: " + car.doors);
            System.out.println("Lights: " + car.lights);
            System.out.println("Color: " + car.colour);
            System.out.println("Engine Cylinder Block: " + car.engine.cylinderBlock);
            System.out.println("Engine Cylinder Head: " + car.engine.cylinderHead);
            System.out.println("Engine Oil pan: " + car.engine.oilPan);
            System.out.println("Brake Sensor: " + car.sensors.brake);
            System.out.println("GPS Sensor: " + car.sensors.gps);
            System.out.println("Wheel Sensor: " + car.sensors.wheel);
            System.out.println("Parking Sensor: " + car.sensors.parking);
            System.out.println("Airbag Sensors: " + car.sensors.airbags);

            System.out.println("Thank you for choosing our app to customize and order your car..");
    }
}

