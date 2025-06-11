package javaassign;

public class car {
    
    String model;
    double price;

    
    static int carCount = 0;

    
    public car(String modelName, double carPrice) {
        model = modelName;
        price = carPrice;
        carCount++; 
    }

    
    public void displayCarInfo() {
        System.out.println("Car Model : " + model);
        System.out.println("Car Price : $" + price);
        System.out.println("----------------------------");
    }

   
    public static void main(String[] args) {
        car c1 = new car("Landrover", 800000.0);
        car c2 = new car("Kia", 950000.0);
        car c3 = new car("Bmw", 700000.0);

       
        c1.displayCarInfo();
        c2.displayCarInfo();
        c3.displayCarInfo();

        
        System.out.println("Total Cars Created: " + car.carCount);
    }
}

