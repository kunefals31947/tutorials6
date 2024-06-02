

    public class Main {
        public static void main(String[] args) {
            Car car = new Car("Toyota", "Corolla", 2021, 100, 10);
            Truck truck = new Truck("Volvo", "VNL", 2020, 200, 20, 5);

            System.out.println("Car Fuel Efficiency: " + car.calculateFuelEfficiency());
            System.out.println("Truck Fuel Efficiency: " + truck.calculateFuelEfficiency());
        }
    }
