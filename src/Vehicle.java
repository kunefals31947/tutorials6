 abstract class Vehicle {
     public Vehicle(String make, String model, int year) {
         this.make = make;
         this.model = model;
         this.year = year;
     }
     String make;
    String model;
    int year;


        public  abstract double calculateFuelEfficiency();

}
