public class Vehicle {
    public String brandname;
    public String modelname;
    public java.time.Year yearofmfg;
    public String color;
    public char fueltype; // p=petrol,e=electric,d=diesel,c=cng
    public float mileage;
    public float price;
    public int seats;

    public void start() {
        System.out.println("Start Ignition by pressing the button");
        System.out.println("Your initial Speed is 10kmph");
    }

    public void drive() {
        System.out.println("Let's Go!");
    }

    public int accelarate(int initSp) {
        return initSp + 20;
    }

    public void stop() {
        System.out.println("Stop Ignition by pressing the button");
        System.out.println("Your Vehicle is stopped!");
    }

    public float calcMileage(float fuelAmt, float distance) {
        return distance / fuelAmt;
    }
    public static void printDetails(Vehicle v){
        System.out.println("-----------------------------------------");
        System.out.println("------------Vehicle Details--------------");
        System.out.println("-----------------------------------------");
        System.out.println("Brand Name: " + v.brandname);
        System.out.println("Model: " + v.modelname);
        System.out.println("Year of MFG: " + v.yearofmfg);
        System.out.println("Color of the vehicle: " + v.color);
        System.out.println("Fuel Type: " + v.fueltype);
        System.out.println("Number of seats: " + v.seats);
        System.out.println("Price of the vehicle: " + v.price);
        System.out.println("-----------------------------------------");
    }
    // public static void main(String[] args) {
    //     Vehicle v = new Vehicle();
    //     v.brandname = "MG";
    //     v.modelname = "Hector";
    //     v.yearofmfg = java.time.Year.of(2025);
    //     v.color = "Red";
    //     v.fueltype = 'p';
    //     v.seats = 5;
    //     v.price = 115000.45f;
    //     printDetails(v);
    //     v.start();
    //     v.drive();

    //     int newSp = v.accelarate(40);
    //     System.out.println("New Speed: " + newSp + " kmph");

    //     float mileage = v.calcMileage(40, 500.2f);
    //     System.out.println("The mileage is: " + mileage + " kmpL");
    //     v.stop();
    // }
}