
public class AppV2 {

    public static void main(String[] args) {

        //ClassName variableName = new ClassName();
        //ClassName variableName;
        //variableName = new ClassName();

        Car car = new Car();
        //car  75gffgh
        // car lights   5225ghh

        System.out.println(" car is" + car);
        System.out.println(" car engine is" + car.engine);
        System.out.println(" car sensor is" + car.sensors);
        //JVM Cache:for each variable there is a liespan..
        System.out.println("Car engine cylinder:" + car.engine.cylinderHead);
        System.out.println("doors"+ car.doors);
        System.out.println("Car sensors for brake:" + car.sensors.brake);
        System.out.println("Car sensors for Gps:" + car.sensors.gps);


    }



}

