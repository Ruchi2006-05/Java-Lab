public class MainforVehicle
{
    public static void main(String[] a) {
        Vehicle v = new Vehicle();
        Vehicle.printVehicleDetails(v);
        Vehicle v1 = new Vehicle("MG","Hector",115000.45f,"Red");
        Vehicle.printVehicleDetails(v1);
        Vehicle v2 = new Vehicle("Toyota","Camry",2400000.90,"Red");
        Vehicle.printVehicleDetails(v2);
        v.start();
        v.drive();
        float m = v.calcMileage(150, 30);

        float m1 = v1.calcMileage(200, 35.5);
        Vehicle[] fleet = new Vehicle[]{v, v1, v2};
        for(int i = 0; i < 3; i++)
        {
            printVehicleDetails(fleet[i]);
        }
        for (Vehicle v : fleet)
        {
            printVehicleDetails(v);
            v.start();
            v.drive();
            v.accelerate(20);
            float v.calcMileage(450, 40);
            System.out.println("Mileage = " + m);    
        }
    }
}